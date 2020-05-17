package typingsSlinky.reactAsync.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fulfilled extends js.Object {
  def Fulfilled[T](props: Persist[T]): ReactElement = js.native
  def Initial[T](props: Children[T]): ReactElement = js.native
  def Loading[T](props: Initial[T]): ReactElement = js.native
  def Pending[T](props: Initial[T]): ReactElement = js.native
  def Rejected[T](props: ChildrenPersist[T]): ReactElement = js.native
  def Resolved[T](props: Persist[T]): ReactElement = js.native
  def Settled[T](props: ChildrenSettledChildren[T]): ReactElement = js.native
}

object Fulfilled {
  @scala.inline
  def apply(
    Fulfilled: Persist[js.Any] => ReactElement,
    Initial: Children[js.Any] => ReactElement,
    Loading: Initial[js.Any] => ReactElement,
    Pending: Initial[js.Any] => ReactElement,
    Rejected: ChildrenPersist[js.Any] => ReactElement,
    Resolved: Persist[js.Any] => ReactElement,
    Settled: ChildrenSettledChildren[js.Any] => ReactElement
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
    def withFulfilled(value: Persist[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fulfilled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitial(value: Children[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initial")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoading(value: Initial[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPending(value: Initial[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRejected(value: ChildrenPersist[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rejected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolved(value: Persist[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettled(value: ChildrenSettledChildren[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

