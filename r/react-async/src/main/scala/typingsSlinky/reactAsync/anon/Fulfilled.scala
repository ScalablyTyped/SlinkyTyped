package typingsSlinky.reactAsync.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fulfilled extends js.Object {
  def Fulfilled[T](props: Persist[T]): ReactElement
  def Initial[T](props: Children[T]): ReactElement
  def Loading[T](props: Initial[T]): ReactElement
  def Pending[T](props: Initial[T]): ReactElement
  def Rejected[T](props: ChildrenPersist[T]): ReactElement
  def Resolved[T](props: Persist[T]): ReactElement
  def Settled[T](props: ChildrenSettledChildren[T]): ReactElement
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
}

