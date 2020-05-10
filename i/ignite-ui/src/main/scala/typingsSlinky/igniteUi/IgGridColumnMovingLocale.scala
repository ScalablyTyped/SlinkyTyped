package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnMovingLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies caption for the move first dropdown button.
  	 *
  	 */
  var dropDownMoveFirstText: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for the move last dropdown button.
  	 *
  	 */
  var dropDownMoveLastText: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for the move left dropdown button.
  	 *
  	 */
  var dropDownMoveLeftText: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for the move right dropdown button.
  	 *
  	 */
  var dropDownMoveRightText: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption text for the feature chooser submenu button.
  	 *
  	 */
  var featureChooserSubmenuText: js.UndefOr[String] = js.native
  /**
  	 * Specifies the apply button text.
  	 *
  	 */
  var movingDialogButtonApplyText: js.UndefOr[String] = js.native
  /**
  	 * Specifies the cancel button text.
  	 *
  	 */
  var movingDialogButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for each move up button in the column moving dialog.
  	 *
  	 */
  var movingDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for each move down button in the column moving dialog.
  	 *
  	 */
  var movingDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption text for the column moving dialog.
  	 *
  	 */
  var movingDialogCaptionText: js.UndefOr[String] = js.native
  /**
  	 * Specifies title for close dialog button.
  	 *
  	 */
  var movingDialogCloseButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption text for the feature chooser entry.
  	 *
  	 */
  var movingDialogDisplayText: js.UndefOr[String] = js.native
  /**
  	 * Specifies text for drop tooltip in column moving dialog.
  	 *
  	 */
  var movingDialogDropTooltipText: js.UndefOr[String] = js.native
  /**
  	 * Specifies tooltip text for the move indicator.
  	 *
  	 */
  var movingToolTipMove: js.UndefOr[String] = js.native
}

object IgGridColumnMovingLocale {
  @scala.inline
  def apply(): IgGridColumnMovingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnMovingLocale]
  }
  @scala.inline
  implicit class IgGridColumnMovingLocaleOps[Self <: IgGridColumnMovingLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropDownMoveFirstText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveFirstText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownMoveFirstText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveFirstText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownMoveLastText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveLastText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownMoveLastText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveLastText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownMoveLeftText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveLeftText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownMoveLeftText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveLeftText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownMoveRightText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveRightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownMoveRightText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMoveRightText")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserSubmenuText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSubmenuText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserSubmenuText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSubmenuText")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogButtonApplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogButtonApplyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogButtonApplyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogButtonApplyText")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogCaptionButtonAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCaptionButtonAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogCaptionButtonAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCaptionButtonAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogCaptionButtonDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCaptionButtonDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogCaptionButtonDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCaptionButtonDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCaptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogCaptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCaptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogCloseButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCloseButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogCloseButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogCloseButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogDisplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogDisplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingDialogDropTooltipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogDropTooltipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingDialogDropTooltipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingDialogDropTooltipText")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingToolTipMove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingToolTipMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingToolTipMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingToolTipMove")(js.undefined)
        ret
    }
  }
  
}

