package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDialogLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the title/tooltip for the close button in the dialog.
  	 *
  	 */
  var closeButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the title/tooltip for the maximize button in the dialog.
  	 *
  	 */
  var maximizeButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the title/tooltip for the minimize button in the dialog.
  	 *
  	 */
  var minimizeButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the title/tooltip for the pin button in the dialog.
  	 *
  	 */
  var pinButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the title/tooltip for the restore button in the dialog.
  	 *
  	 */
  var restoreButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the title/tooltip for the pin button in the dialog.
  	 *
  	 */
  var unpinButtonTitle: js.UndefOr[String] = js.native
}

object IgDialogLocale {
  @scala.inline
  def apply(): IgDialogLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDialogLocale]
  }
  @scala.inline
  implicit class IgDialogLocaleOps[Self <: IgDialogLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizeButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizeButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizeButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizeButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizeButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizeButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPinButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpinButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpinButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpinButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpinButtonTitle")(js.undefined)
        ret
    }
  }
  
}

