package typingsSlinky.reactDnd.createSourceFactoryMod

import slinky.core.facade.ReactRef
import typingsSlinky.reactDnd.interfacesMod.DragSourceSpec
import typingsSlinky.reactDnd.monitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createSourceFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props, DragObject](spec: DragSourceSpec[Props, DragObject]): js.Function2[/* monitor */ DragSourceMonitor, /* ref */ ReactRef[_], Source] = js.native
}

