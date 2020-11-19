package typingsSlinky.nwJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nw.gui", JSImport.Namespace)
@js.native
object nwGuiAugmentingMod extends js.Object {
  
  var App: typingsSlinky.nwJs.mod.global.nw.App = js.native
  
  var Clipboard: typingsSlinky.nwJs.mod.global.nw.Clipboard = js.native
  
  var Screen: typingsSlinky.nwJs.mod.global.nw.Screen = js.native
  
  var Shell: typingsSlinky.nwJs.mod.global.nw.Shell = js.native
  
  var Window: typingsSlinky.nwJs.mod.global.nw.Window = js.native
  
  @js.native
  class Menu ()
    extends typingsSlinky.nwJs.mod.global.nw.Menu
  
  @js.native
  class MenuItem ()
    extends typingsSlinky.nwJs.mod.global.nw.MenuItem
  
  @js.native
  class Shortcut ()
    extends typingsSlinky.nwJs.mod.global.nw.Shortcut
  
  @js.native
  class Tray ()
    extends typingsSlinky.nwJs.mod.global.nw.Tray
}
