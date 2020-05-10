package typingsSlinky.reactAsync

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFulfilled extends js.Object {
  def Fulfilled[T](props: AnonPersist[T]): ReactElement = js.native
  def Initial[T](props: AnonChildren[T]): ReactElement = js.native
  def Loading[T](props: AnonInitial[T]): ReactElement = js.native
  def Pending[T](props: AnonInitial[T]): ReactElement = js.native
  def Rejected[T](props: AnonChildrenPersist[T]): ReactElement = js.native
  def Resolved[T](props: AnonPersist[T]): ReactElement = js.native
  def Settled[T](props: AnonChildrenSettledChildren[T]): ReactElement = js.native
}

object AnonFulfilled {
  @scala.inline
  def apply(
    Fulfilled: AnonPersist[js.Any] => ReactElement,
    Initial: AnonChildren[js.Any] => ReactElement,
    Loading: AnonInitial[js.Any] => ReactElement,
    Pending: AnonInitial[js.Any] => ReactElement,
    Rejected: AnonChildrenPersist[js.Any] => ReactElement,
    Resolved: AnonPersist[js.Any] => ReactElement,
    Settled: AnonChildrenSettledChildren[js.Any] => ReactElement
  ): AnonFulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
    __obj.asInstanceOf[AnonFulfilled]
  }
  @scala.inline
  implicit class AnonFulfilledOps[Self <: AnonFulfilled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFulfilled(value: AnonPersist[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fulfilled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitial(value: AnonChildren[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initial")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoading(value: AnonInitial[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPending(value: AnonInitial[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRejected(value: AnonChildrenPersist[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rejected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolved(value: AnonPersist[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettled(value: AnonChildrenSettledChildren[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

