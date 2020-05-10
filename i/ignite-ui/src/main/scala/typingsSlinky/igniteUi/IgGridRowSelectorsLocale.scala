package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridRowSelectorsLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Deselect all text for the select/deselect all overlay.
  	 *
  	 */
  var deselectAllText: js.UndefOr[String] = js.native
  /**
  	 * Deselected records text for the select/deselect all overlay.
  	 *
  	 */
  var deselectedRecordsText: js.UndefOr[String] = js.native
  /**
  	 * Select all text for the select/deselect all overlay.
  	 *
  	 */
  var selectAllText: js.UndefOr[String] = js.native
  /**
  	 * Selected records text for the select/deselect all overlay.
  	 *
  	 */
  var selectedRecordsText: js.UndefOr[String] = js.native
}

object IgGridRowSelectorsLocale {
  @scala.inline
  def apply(): IgGridRowSelectorsLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridRowSelectorsLocale]
  }
  @scala.inline
  implicit class IgGridRowSelectorsLocaleOps[Self <: IgGridRowSelectorsLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeselectAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectedRecordsText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectedRecordsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectedRecordsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectedRecordsText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRecordsText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRecordsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRecordsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRecordsText")(js.undefined)
        ret
    }
  }
  
}

