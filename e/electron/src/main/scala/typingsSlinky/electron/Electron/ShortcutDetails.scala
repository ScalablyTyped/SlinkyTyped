package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcutDetails extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/shortcut-details
  /**
    * The Application User Model ID. Default is empty.
    */
  var appUserModelId: js.UndefOr[String] = js.native
  /**
    * The arguments to be applied to target when launching from this shortcut. Default
    * is empty.
    */
  var args: js.UndefOr[String] = js.native
  /**
    * The working directory. Default is empty.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * The description of the shortcut. Default is empty.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The path to the icon, can be a DLL or EXE. icon and iconIndex have to be set
    * together. Default is empty, which uses the target's icon.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The resource ID of icon when icon is a DLL or EXE. Default is 0.
    */
  var iconIndex: js.UndefOr[Double] = js.native
  /**
    * The target to launch from this shortcut.
    */
  var target: String = js.native
}

object ShortcutDetails {
  @scala.inline
  def apply(target: String): ShortcutDetails = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutDetails]
  }
  @scala.inline
  implicit class ShortcutDetailsOps[Self <: ShortcutDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppUserModelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUserModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUserModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUserModelId")(js.undefined)
        ret
    }
    @scala.inline
    def withArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIndex")(js.undefined)
        ret
    }
  }
  
}

