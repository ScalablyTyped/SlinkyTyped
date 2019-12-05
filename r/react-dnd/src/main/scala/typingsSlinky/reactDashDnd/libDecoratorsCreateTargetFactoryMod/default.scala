package typingsSlinky.reactDashDnd.libDecoratorsCreateTargetFactoryMod

import slinky.core.facade.ReactRef
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DropTargetSpec
import typingsSlinky.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createTargetFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ ReactRef[_], Target] = js.native
}

