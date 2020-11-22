package typingsSlinky.jupyterlabMainmenu.labmenuMod

import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoWidgets.menuMod.Menu.IItemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJupyterLabMenu extends IDisposable {
  
  /**
    * Add a group of menu items specific to a particular
    * plugin.
    */
  def addGroup(items: js.Array[IItemOptions]): IDisposable = js.native
  def addGroup(items: js.Array[IItemOptions], rank: Double): IDisposable = js.native
}
