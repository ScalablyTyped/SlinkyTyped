package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveDialogOptions extends js.Object {
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.native
  /**
    * Absolute directory path, absolute file path, or file name to use by default.
    */
  var defaultPath: js.UndefOr[String] = js.native
  var filters: js.UndefOr[js.Array[FileFilter]] = js.native
  /**
    * Message to display above text fields.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Custom label for the text displayed in front of the filename text field.
    */
  var nameFieldLabel: js.UndefOr[String] = js.native
  /**
    * Create a when packaged for the Mac App Store. If this option is enabled and the
    * file doesn't already exist a blank file will be created at the chosen path.
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.native
  /**
    * Show the tags input box, defaults to true.
    */
  var showsTagField: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object SaveDialogOptions {
  @scala.inline
  def apply(): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveDialogOptions]
  }
  @scala.inline
  implicit class SaveDialogOptionsOps[Self <: SaveDialogOptions] (val x: Self) extends AnyVal {
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
    def withNameFieldLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFieldLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameFieldLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFieldLabel")(js.undefined)
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
    def withShowsTagField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsTagField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsTagField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsTagField")(js.undefined)
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

