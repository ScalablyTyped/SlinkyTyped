package typingsSlinky.reactDashDnd.libDecoratorsCreateSourceFactoryMod

import slinky.core.facade.ReactRef
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DragSourceSpec
import typingsSlinky.reactDashDnd.libInterfacesMonitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createSourceFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props, DragObject](spec: DragSourceSpec[Props, DragObject]): js.Function2[/* monitor */ DragSourceMonitor, /* ref */ ReactRef[_], Source] = js.native
}

