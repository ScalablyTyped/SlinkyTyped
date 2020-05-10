package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.error
import typingsSlinky.atom.atomStrings.info
import typingsSlinky.atom.atomStrings.none
import typingsSlinky.atom.atomStrings.question
import typingsSlinky.atom.atomStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmationOptions extends js.Object {
  /** The text for the buttons. */
  var buttons: js.UndefOr[js.Array[String]] = js.native
  /**
    *  The index of the button to be used to cancel the dialog, via the `Esc` key.
    *  By default this is assigned to the first button with "cancel" or "no" as the
    *  label. If no such labeled buttons exist and this option is not set, 0 will be
    *  used as the return value or callback response.
    *
    *  This option is ignored on Windows.
    */
  var cancelId: js.UndefOr[Double] = js.native
  /** Initial checked state of the checkbox. false by default. */
  var checkboxChecked: js.UndefOr[Boolean] = js.native
  /** If provided, the message box will include a checkbox with the given label. */
  var checkboxLabel: js.UndefOr[String] = js.native
  /** The index for the button to be selected by default in the prompt. */
  var defaultId: js.UndefOr[Double] = js.native
  /** Additional information regarding the message. */
  var detail: js.UndefOr[String] = js.native
  /** An Electron NativeImage to use as the prompt's icon. */
  var icon: js.UndefOr[js.Object] = js.native
  /** The content of the message box. */
  var message: js.UndefOr[String] = js.native
  /**
    *  On Windows, Electron will try to figure out which one of the buttons are
    *  common buttons (like `Cancel` or `Yes`), and show the others as command links
    *  in the dialog. This can make the dialog appear in the style of modern Windows
    *  apps. If you don't like this behavior, you can set noLink to true.
    */
  var noLink: js.UndefOr[Boolean] = js.native
  /**
    * Normalize the keyboard access keys across platforms.
    * Atom defaults this to true.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.native
  /** The title for the prompt. */
  var title: js.UndefOr[String] = js.native
  /** The type of the confirmation prompt. */
  var `type`: js.UndefOr[none | info | error | question | warning] = js.native
}

object ConfirmationOptions {
  @scala.inline
  def apply(): ConfirmationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmationOptions]
  }
  @scala.inline
  implicit class ConfirmationOptionsOps[Self <: ConfirmationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIcon(value: js.Object): Self = {
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
    def withType(value: none | info | error | question | warning): Self = {
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

