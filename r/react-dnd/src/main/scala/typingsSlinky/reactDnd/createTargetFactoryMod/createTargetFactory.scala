package typingsSlinky.reactDnd.createTargetFactoryMod

import slinky.core.facade.ReactRef
import typingsSlinky.reactDnd.interfacesMod.DropTargetSpec
import typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createTargetFactory", "createTargetFactory")
@js.native
object createTargetFactory extends js.Object {
  def apply[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ ReactRef[_], Target] = js.native
}

