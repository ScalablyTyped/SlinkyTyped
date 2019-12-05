package typingsSlinky.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typingsSlinky.atJupyterlabCoreutils.libSettingregistryMod.SettingRegistry.IOptions
import typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.IShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "SettingRegistry")
@js.native
class SettingRegistry protected ()
  extends typingsSlinky.atJupyterlabCoreutils.libSettingregistryMod.SettingRegistry {
  /**
    * Create a new setting registry.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/coreutils", "SettingRegistry")
@js.native
object SettingRegistry extends js.Object {
  /**
    * Reconcile default and user shortcuts and return the composite list.
    *
    * @param defaults - The list of default shortcuts.
    *
    * @param user - The list of user shortcut overrides and additions.
    *
    * @returns A loadable list of shortcuts (omitting disabled and overridden).
    */
  def reconcileShortcuts(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = js.native
}

