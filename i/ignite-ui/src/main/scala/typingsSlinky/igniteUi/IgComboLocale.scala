package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgComboLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets title for html element which represent the clear button.
  	 *
  	 */
  var clearButtonTitle: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets title for html element which represent the drop-down button.
  	 *
  	 */
  var dropDownButtonTitle: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
  	 *
  	 */
  var noMatchFoundText: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets value that is displayed when input field is empty.
  	 *
  	 */
  var placeHolder: js.UndefOr[js.Any] = js.native
}

object IgComboLocale {
  @scala.inline
  def apply(): IgComboLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboLocale]
  }
  @scala.inline
  implicit class IgComboLocaleOps[Self <: IgComboLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearButtonTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownButtonTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMatchFoundText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchFoundText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMatchFoundText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchFoundText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
  }
  
}

