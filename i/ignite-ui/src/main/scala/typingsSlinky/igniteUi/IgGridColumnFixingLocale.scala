package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnFixingLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Text of the feature chooser button for fixing a currently unfixed column.
  	 *
  	 */
  var featureChooserTextFixedColumn: js.UndefOr[String] = js.native
  /**
  	 * Text of the feature chooser button for unfixing a currently fixed column.
  	 *
  	 */
  var featureChooserTextUnfixedColumn: js.UndefOr[String] = js.native
  /**
  	 * Specifies the tooltip text on the column fixing header icon when column is not fixed.
  	 *
  	 */
  var headerFixButtonText: js.UndefOr[String] = js.native
  /**
  	 * Specifies the tooltip text on the column fixing header icon when column is not fixed.
  	 *
  	 */
  var headerUnfixButtonText: js.UndefOr[String] = js.native
}

object IgGridColumnFixingLocale {
  @scala.inline
  def apply(): IgGridColumnFixingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixingLocale]
  }
  @scala.inline
  implicit class IgGridColumnFixingLocaleOps[Self <: IgGridColumnFixingLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureChooserTextFixedColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextFixedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserTextFixedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextFixedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserTextUnfixedColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextUnfixedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserTextUnfixedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextUnfixedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFixButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFixButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFixButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFixButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderUnfixButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerUnfixButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderUnfixButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerUnfixButtonText")(js.undefined)
        ret
    }
  }
  
}

