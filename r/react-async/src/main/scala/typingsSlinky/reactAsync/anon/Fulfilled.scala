package typingsSlinky.reactAsync.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.mod.FulfilledProps
import typingsSlinky.reactAsync.mod.InitialProps
import typingsSlinky.reactAsync.mod.PendingProps
import typingsSlinky.reactAsync.mod.RejectedProps
import typingsSlinky.reactAsync.mod.SettledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fulfilled extends js.Object {
  def Fulfilled[T](props: FulfilledProps[T]): ReactElement = js.native
  def Initial[T](props: InitialProps[T]): ReactElement = js.native
  def Loading[T](props: PendingProps[T]): ReactElement = js.native
  def Pending[T](props: PendingProps[T]): ReactElement = js.native
  def Rejected[T](props: RejectedProps[T]): ReactElement = js.native
  def Resolved[T](props: FulfilledProps[T]): ReactElement = js.native
  def Settled[T](props: SettledProps[T]): ReactElement = js.native
}

object Fulfilled {
  @scala.inline
  def apply(
    Fulfilled: FulfilledProps[js.Any] => ReactElement,
    Initial: InitialProps[js.Any] => ReactElement,
    Loading: PendingProps[js.Any] => ReactElement,
    Pending: PendingProps[js.Any] => ReactElement,
    Rejected: RejectedProps[js.Any] => ReactElement,
    Resolved: FulfilledProps[js.Any] => ReactElement,
    Settled: SettledProps[js.Any] => ReactElement
  ): Fulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
    __obj.asInstanceOf[Fulfilled]
  }
  @scala.inline
  implicit class FulfilledOps[Self <: Fulfilled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFulfilled(value: FulfilledProps[js.Any] => ReactElement): Self = this.set("Fulfilled", js.Any.fromFunction1(value))
    @scala.inline
    def setInitial(value: InitialProps[js.Any] => ReactElement): Self = this.set("Initial", js.Any.fromFunction1(value))
    @scala.inline
    def setLoading(value: PendingProps[js.Any] => ReactElement): Self = this.set("Loading", js.Any.fromFunction1(value))
    @scala.inline
    def setPending(value: PendingProps[js.Any] => ReactElement): Self = this.set("Pending", js.Any.fromFunction1(value))
    @scala.inline
    def setRejected(value: RejectedProps[js.Any] => ReactElement): Self = this.set("Rejected", js.Any.fromFunction1(value))
    @scala.inline
    def setResolved(value: FulfilledProps[js.Any] => ReactElement): Self = this.set("Resolved", js.Any.fromFunction1(value))
    @scala.inline
    def setSettled(value: SettledProps[js.Any] => ReactElement): Self = this.set("Settled", js.Any.fromFunction1(value))
  }
  
}

