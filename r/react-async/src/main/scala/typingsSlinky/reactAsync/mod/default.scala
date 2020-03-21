package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAsync.AnonChildren
import typingsSlinky.reactAsync.AnonChildrenPersist
import typingsSlinky.reactAsync.AnonChildrenSettledChildren
import typingsSlinky.reactAsync.AnonInitial
import typingsSlinky.reactAsync.AnonPersist
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
  def Fulfilled[T](props: AnonPersist[T]): ReactElement = js.native
  def Initial[T](props: AnonChildren[T]): ReactElement = js.native
  def Loading[T](props: AnonInitial[T]): ReactElement = js.native
  def Pending[T](props: AnonInitial[T]): ReactElement = js.native
  def Rejected[T](props: AnonChildrenPersist[T]): ReactElement = js.native
  def Resolved[T](props: AnonPersist[T]): ReactElement = js.native
  def Settled[T](props: AnonChildrenSettledChildren[T]): ReactElement = js.native
}

