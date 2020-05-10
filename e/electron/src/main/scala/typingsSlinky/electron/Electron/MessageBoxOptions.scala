package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBoxOptions extends js.Object {
  /**
    * Array of texts for buttons. On Windows, an empty array will result in one button
    * labeled "OK".
    */
  var buttons: js.UndefOr[js.Array[String]] = js.native
  /**
    * The index of the button to be used to cancel the dialog, via the Esc key. By
    * default this is assigned to the first button with "cancel" or "no" as the label.
    * If no such labeled buttons exist and this option is not set, 0 will be used as
    * the return value or callback response.
    */
  var cancelId: js.UndefOr[Double] = js.native
  /**
    * Initial checked state of the checkbox. false by default.
    */
  var checkboxChecked: js.UndefOr[Boolean] = js.native
  /**
    * If provided, the message box will include a checkbox with the given label. The
    * checkbox state can be inspected only when using callback.
    */
  var checkboxLabel: js.UndefOr[String] = js.native
  /**
    * Index of the button in the buttons array which will be selected by default when
    * the message box opens.
    */
  var defaultId: js.UndefOr[Double] = js.native
  /**
    * Extra information of the message.
    */
  var detail: js.UndefOr[String] = js.native
  var icon: js.UndefOr[NativeImage_] = js.native
  /**
    * Content of the message box.
    */
  var message: String = js.native
  /**
    * On Windows Electron will try to figure out which one of the buttons are common
    * buttons (like "Cancel" or "Yes"), and show the others as command links in the
    * dialog. This can make the dialog appear in the style of modern Windows apps. If
    * you don't like this behavior, you can set noLink to true.
    */
  var noLink: js.UndefOr[Boolean] = js.native
  /**
    * Normalize the keyboard access keys across platforms. Default is false. Enabling
    * this assumes & is used in the button labels for the placement of the keyboard
    * shortcut access key and labels will be converted so they work correctly on each
    * platform, & characters are removed on macOS, converted to _ on Linux, and left
    * untouched on Windows. For example, a button label of Vie&w will be converted to
    * Vie_w on Linux and View on macOS and can be selected via Alt-W on Windows and
    * Linux.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.native
  /**
    * Title of the message box, some platforms will not show it.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Can be "none", "info", "error", "question" or "warning". On Windows, "question"
    * displays the same icon as "info", unless you set an icon using the "icon"
    * option. On macOS, both "warning" and "error" display the same warning icon.
    */
  var `type`: js.UndefOr[String] = js.native
}

object MessageBoxOptions {
  @scala.inline
  def apply(message: String): MessageBoxOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxOptions]
  }
  @scala.inline
  implicit class MessageBoxOptionsOps[Self <: MessageBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelId")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultId")(js.undefined)
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: NativeImage_): Self = {
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
    def withNoLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLink")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeAccessKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeAccessKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeAccessKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeAccessKeys")(js.undefined)
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

