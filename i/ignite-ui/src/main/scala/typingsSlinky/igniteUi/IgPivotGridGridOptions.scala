package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotGridGridOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables/disables rendering of alternating row styles (odd and even rows receive different styling). Note that if a custom jQuery template is set, this has no effect and CSS for the row should be adjusted manually in the template contents.
  	 */
  var alternateRowStyles: js.UndefOr[Boolean] = js.native
  /**
  	 * Caption text that will be shown above the pivot grid header.
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * Default column width that will be set for all columns.
  	 */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Enables/disables rendering of ui-state-hover classes when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
  	 */
  var enableHoverStyles: js.UndefOr[Boolean] = js.native
  /**
  	 * A list of grid features definitions. The supported features are Resizing and Tooltips. Each feature goes with its separate options that are documented for the feature accordingly.
  	 *
  	 */
  var features: js.UndefOr[IgPivotGridGridOptionsFeatures] = js.native
  /**
  	 * Headers will be fixed if this option is set to true, and only the grid data will be scrollable.
  	 *
  	 */
  var fixedHeaders: js.UndefOr[Boolean] = js.native
  /**
  	 * Initial tabIndex attribute that will be set on the container element.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.native
}

object IgPivotGridGridOptions {
  @scala.inline
  def apply(): IgPivotGridGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridGridOptions]
  }
  @scala.inline
  implicit class IgPivotGridGridOptionsOps[Self <: IgPivotGridGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateRowStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRowStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateRowStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRowStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHoverStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHoverStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: IgPivotGridGridOptionsFeatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

