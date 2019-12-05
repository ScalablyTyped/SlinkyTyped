package typingsSlinky.reactDashAsync.reactDashAsyncMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashAsync.Anon_Children
import typingsSlinky.reactDashAsync.Anon_ChildrenInitial
import typingsSlinky.reactDashAsync.Anon_ChildrenPersist
import typingsSlinky.reactDashAsync.Anon_ChildrenPersistBoolean
import typingsSlinky.reactDashAsync.Anon_ChildrenPersistBooleanSettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Default)
@js.native
class default[T] ()
  extends Component[AsyncProps[T], AsyncState[T], js.Any]

@JSImport("react-async", JSImport.Default)
@js.native
object default extends js.Object {
  def Fulfilled[T](props: Anon_ChildrenPersist[T]): Element = js.native
  def Initial[T](props: Anon_Children[T]): Element = js.native
  def Loading[T](props: Anon_ChildrenInitial[T]): Element = js.native
  def Pending[T](props: Anon_ChildrenInitial[T]): Element = js.native
  def Rejected[T](props: Anon_ChildrenPersistBoolean[T]): Element = js.native
  def Resolved[T](props: Anon_ChildrenPersist[T]): Element = js.native
  def Settled[T](props: Anon_ChildrenPersistBooleanSettledChildren[T]): Element = js.native
}

