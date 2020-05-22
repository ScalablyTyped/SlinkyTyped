package typingsSlinky.electron.mod

import typingsSlinky.electron.Electron.MenuItemConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "MenuItem")
@js.native
class MenuItem protected ()
  extends typingsSlinky.electron.Electron.MenuItem {
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
  override var icon: typingsSlinky.electron.Electron.NativeImage_ = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var label: String = js.native
  /* CompleteClass */
  override var menu: typingsSlinky.electron.Electron.Menu = js.native
  /* CompleteClass */
  override var registerAccelerator: Boolean = js.native
  /* CompleteClass */
  override var role: String = js.native
  /* CompleteClass */
  override var sublabel: String = js.native
  /* CompleteClass */
  override var submenu: typingsSlinky.electron.Electron.Menu = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
}

