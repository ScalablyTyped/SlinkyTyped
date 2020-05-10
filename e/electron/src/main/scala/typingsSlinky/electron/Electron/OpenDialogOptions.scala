package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.createDirectory
import typingsSlinky.electron.electronStrings.multiSelections
import typingsSlinky.electron.electronStrings.noResolveAliases
import typingsSlinky.electron.electronStrings.openDirectory
import typingsSlinky.electron.electronStrings.openFile
import typingsSlinky.electron.electronStrings.promptToCreate
import typingsSlinky.electron.electronStrings.showHiddenFiles
import typingsSlinky.electron.electronStrings.treatPackageAsDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDialogOptions extends js.Object {
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.native
  var defaultPath: js.UndefOr[String] = js.native
  var filters: js.UndefOr[js.Array[FileFilter]] = js.native
  /**
    * Message to display above input boxes.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Contains which features the dialog should use. The following values are
    * supported:
    */
  var properties: js.UndefOr[
    js.Array[
      openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory
    ]
  ] = js.native
  /**
    * Create when packaged for the Mac App Store.
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object OpenDialogOptions {
  @scala.inline
  def apply(): OpenDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDialogOptions]
  }
  @scala.inline
  implicit class OpenDialogOptionsOps[Self <: OpenDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPath")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[FileFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(
      value: js.Array[
          openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityScopedBookmarks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityScopedBookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityScopedBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityScopedBookmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

