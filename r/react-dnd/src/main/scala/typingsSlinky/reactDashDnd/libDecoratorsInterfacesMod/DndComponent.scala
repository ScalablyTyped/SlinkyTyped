package typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod

import slinky.core.ReactComponentClass
import typingsSlinky.dndDashCore.libInterfacesMod.Identifier
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndComponent[Props]
  extends Component[Props, js.Object, js.Any] {
  def getDecoratedComponentInstance(): ReactComponentClass[Props] | Null = js.native
  def getHandlerId(): Identifier = js.native
}

