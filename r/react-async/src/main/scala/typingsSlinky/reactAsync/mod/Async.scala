package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAsync.anon.Children
import typingsSlinky.reactAsync.anon.ChildrenPersist
import typingsSlinky.reactAsync.anon.ChildrenSettledChildren
import typingsSlinky.reactAsync.anon.Initial
import typingsSlinky.reactAsync.anon.Persist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "Async")
@js.native
class Async[T] ()
  extends Component[AsyncProps[T], AsyncState[T], js.Any]

@JSImport("react-async", "Async")
@js.native
object Async extends js.Object {
  def Fulfilled[T](props: Persist[T]): ReactElement = js.native
  def Initial[T](props: Children[T]): ReactElement = js.native
  def Loading[T](props: Initial[T]): ReactElement = js.native
  def Pending[T](props: Initial[T]): ReactElement = js.native
  def Rejected[T](props: ChildrenPersist[T]): ReactElement = js.native
  def Resolved[T](props: Persist[T]): ReactElement = js.native
  def Settled[T](props: ChildrenSettledChildren[T]): ReactElement = js.native
}

