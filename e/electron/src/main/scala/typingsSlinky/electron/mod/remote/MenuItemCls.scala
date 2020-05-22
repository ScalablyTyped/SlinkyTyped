package typingsSlinky.electron.mod.remote

import typingsSlinky.electron.Electron.Menu
import typingsSlinky.electron.Electron.MenuItem
import typingsSlinky.electron.Electron.MenuItemConstructorOptions
import typingsSlinky.electron.Electron.NativeImage_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "remote.MenuItem")
@js.native
class MenuItemCls protected () extends MenuItem {
  // Docs: http://electronjs.org/docs/api/menu-item
  def this(options: MenuItemConstructorOptions) = this()
  /* CompleteClass */
  override var accelerator: String = js.native
  /* CompleteClass */
  override var checked: Boolean = js.native
  /* CompleteClass */
  override var click: js.Function = js.native
  /* CompleteClass */
  override var commandId: Double = js.native
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /* CompleteClass */
  override var icon: NativeImage_ = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var label: String = js.native
  /* CompleteClass */
  override var menu: Menu = js.native
  /* CompleteClass */
  override var registerAccelerator: Boolean = js.native
  /* CompleteClass */
  override var role: String = js.native
  /* CompleteClass */
  override var sublabel: String = js.native
  /* CompleteClass */
  override var submenu: Menu = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
}

