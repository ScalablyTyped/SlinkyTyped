package typingsSlinky.reactAsync

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFulfilled extends js.Object {
  def Fulfilled[T](props: AnonPersist[T]): ReactElement
  def Initial[T](props: AnonChildren[T]): ReactElement
  def Loading[T](props: AnonInitial[T]): ReactElement
  def Pending[T](props: AnonInitial[T]): ReactElement
  def Rejected[T](props: AnonChildrenPersist[T]): ReactElement
  def Resolved[T](props: AnonPersist[T]): ReactElement
  def Settled[T](props: AnonChildrenSettledChildren[T]): ReactElement
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
}

