package typingsSlinky.nwJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", JSImport.Namespace)
@js.native
object nwGuiAugmentingMod extends js.Object {
  @js.native
  class Menu ()
    extends typingsSlinky.nwJs.mod._Global_.nw.Menu
  
  @js.native
  class MenuItem ()
    extends typingsSlinky.nwJs.mod._Global_.nw.MenuItem
  
  @js.native
  class Shortcut ()
    extends typingsSlinky.nwJs.mod._Global_.nw.Shortcut
  
  @js.native
  class Tray ()
    extends typingsSlinky.nwJs.mod._Global_.nw.Tray
  
  var App: typingsSlinky.nwJs.mod._Global_.nw.App = js.native
  var Clipboard: typingsSlinky.nwJs.mod._Global_.nw.Clipboard = js.native
  var Screen: typingsSlinky.nwJs.mod._Global_.nw.Screen = js.native
  var Shell: typingsSlinky.nwJs.mod._Global_.nw.Shell = js.native
  var Window: typingsSlinky.nwJs.mod._Global_.nw.Window = js.native
}

