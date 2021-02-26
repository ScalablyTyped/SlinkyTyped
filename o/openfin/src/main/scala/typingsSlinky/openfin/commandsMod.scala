package typingsSlinky.openfin

import typingsSlinky.openfin.GoldenLayout.Tab
import typingsSlinky.openfin.anon.Command
import typingsSlinky.openfin.openfinLayoutMod.default
import typingsSlinky.openfin.shapesMod.Hotkey
import typingsSlinky.openfin.shapesMod.ShortcutOverride
import typingsSlinky.openfin.shapesPlatformMod.PlatformOptions
import typingsSlinky.openfin.utilsMod.ViewComponent
import typingsSlinky.openfin.viewMod.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("openfin/_v2/api/platform/commands", "detachView")
  @js.native
  def detachView(tab: Tab, context: default): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/commands", "handleViewCommand")
  @js.native
  def handleViewCommand(e: InputEvent, bv: ViewComponent, context: default): js.Promise[Unit] = js.native
  
  @JSImport("openfin/_v2/api/platform/commands", "handleWindowCommand")
  @js.native
  def handleWindowCommand(e: InputEvent, context: default): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/commands", "mergeDefaultCommands")
  @js.native
  def mergeDefaultCommands(providedCommands: js.Array[ShortcutOverride]): js.Array[Command] = js.native
  
  @JSImport("openfin/_v2/api/platform/commands", "setUpKeyboardCommands")
  @js.native
  def setUpKeyboardCommands(hotkeys: js.Array[Hotkey], appOptions: PlatformOptions): js.Array[Hotkey] = js.native
}
