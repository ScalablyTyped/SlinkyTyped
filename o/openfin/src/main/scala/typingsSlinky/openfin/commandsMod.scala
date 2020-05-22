package typingsSlinky.openfin

import typingsSlinky.openfin.anon.Command
import typingsSlinky.openfin.openfinLayoutMod.LayoutManager
import typingsSlinky.openfin.platformPlatformMod.PlatformOptions
import typingsSlinky.openfin.shapesMod.Hotkey
import typingsSlinky.openfin.shapesMod.ShortcutOverride
import typingsSlinky.openfin.utilsMod.ViewComponent
import typingsSlinky.openfin.viewMod.InputEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/commands", JSImport.Namespace)
@js.native
object commandsMod extends js.Object {
  def handleViewCommand(e: InputEvent, bv: ViewComponent, context: LayoutManager): js.Promise[Unit] = js.native
  def handleWindowCommand(e: InputEvent, context: LayoutManager): Unit = js.native
  def mergeDefaultCommands(providedCommands: js.Array[ShortcutOverride]): js.Array[Command] = js.native
  def setUpKeyboardCommands(hotkeys: js.Array[Hotkey], appOptions: PlatformOptions): js.Array[Hotkey] = js.native
}

