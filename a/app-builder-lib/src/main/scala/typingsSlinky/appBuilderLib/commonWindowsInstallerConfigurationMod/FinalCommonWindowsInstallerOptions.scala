package typingsSlinky.appBuilderLib.commonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalCommonWindowsInstallerOptions extends js.Object {
  var isAssisted: Boolean = js.native
  var isCreateDesktopShortcut: DesktopShortcutCreationPolicy = js.native
  var isCreateStartMenuShortcut: Boolean = js.native
  var isPerMachine: Boolean = js.native
  var menuCategory: String | Null = js.native
  var shortcutName: String = js.native
}

object FinalCommonWindowsInstallerOptions {
  @scala.inline
  def apply(
    isAssisted: Boolean,
    isCreateDesktopShortcut: DesktopShortcutCreationPolicy,
    isCreateStartMenuShortcut: Boolean,
    isPerMachine: Boolean,
    shortcutName: String
  ): FinalCommonWindowsInstallerOptions = {
    val __obj = js.Dynamic.literal(isAssisted = isAssisted.asInstanceOf[js.Any], isCreateDesktopShortcut = isCreateDesktopShortcut.asInstanceOf[js.Any], isCreateStartMenuShortcut = isCreateStartMenuShortcut.asInstanceOf[js.Any], isPerMachine = isPerMachine.asInstanceOf[js.Any], shortcutName = shortcutName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalCommonWindowsInstallerOptions]
  }
  @scala.inline
  implicit class FinalCommonWindowsInstallerOptionsOps[Self <: FinalCommonWindowsInstallerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAssisted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCreateDesktopShortcut(value: DesktopShortcutCreationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCreateDesktopShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCreateStartMenuShortcut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCreateStartMenuShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPerMachine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPerMachine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcutName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuCategoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuCategory")(null)
        ret
    }
  }
  
}

