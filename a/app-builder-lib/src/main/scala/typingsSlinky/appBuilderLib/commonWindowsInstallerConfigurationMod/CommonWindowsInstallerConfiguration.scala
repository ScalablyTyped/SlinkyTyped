package typingsSlinky.appBuilderLib.commonWindowsInstallerConfigurationMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.always
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonWindowsInstallerConfiguration extends js.Object {
  /**
    * Whether to create desktop shortcut. Set to `always` if to recreate also on reinstall (even if removed by user).
    * @default true
    */
  val createDesktopShortcut: js.UndefOr[Boolean | always] = js.native
  /**
    * Whether to create start menu shortcut.
    * @default true
    */
  val createStartMenuShortcut: js.UndefOr[Boolean] = js.native
  /**
    * Whether to create submenu for start menu shortcut and program files directory. If `true`, company name will be used. Or string value.
    * @default false
    */
  val menuCategory: js.UndefOr[Boolean | String] = js.native
  val oneClick: js.UndefOr[Boolean] = js.native
  /**
    * Whether to install per all users (per-machine).
    * @default false
    */
  val perMachine: js.UndefOr[Boolean] = js.native
  /**
    * Whether to run the installed application after finish. For assisted installer corresponding checkbox will be removed.
    * @default true
    */
  val runAfterFinish: js.UndefOr[Boolean] = js.native
  /**
    * The name that will be used for all shortcuts. Defaults to the application name.
    */
  val shortcutName: js.UndefOr[String | Null] = js.native
}

object CommonWindowsInstallerConfiguration {
  @scala.inline
  def apply(): CommonWindowsInstallerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonWindowsInstallerConfiguration]
  }
  @scala.inline
  implicit class CommonWindowsInstallerConfigurationOps[Self <: CommonWindowsInstallerConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDesktopShortcut(value: Boolean | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDesktopShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDesktopShortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDesktopShortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateStartMenuShortcut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStartMenuShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateStartMenuShortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStartMenuShortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuCategory(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withOneClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPerMachine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMachine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerMachine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMachine")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAfterFinish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAfterFinish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAfterFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAfterFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcutName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutName")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcutNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutName")(null)
        ret
    }
  }
  
}

