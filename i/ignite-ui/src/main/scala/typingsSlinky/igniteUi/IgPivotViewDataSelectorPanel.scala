package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotViewDataSelectorPanel
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Determines if the panel containing the igPivotDataSelector will initially collapsed.
  	 */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
  	 * Determines if the panel containing the igPivotDataSelector will be collapsible.
  	 */
  var collapsible: js.UndefOr[Boolean] = js.native
  /**
  	 * Determines the position of the data selector panel inside the igPivotView widget.
  	 */
  var location: js.UndefOr[js.Any] = js.native
  /**
  	 * Determines if the panel containing the igPivotDataSelector will be resizable.
  	 */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
  	 * Determines the size of the igPivotDataSelector  panel. The recommended value is 250px.
  	 *
  	 * Valid values:
  	 * "string" The panel size can be set in pixels (px).
  	 * "number" The size can be set as a number.
  	 * "null" will automatically size the panel.
  	 */
  var size: js.UndefOr[String | Double] = js.native
}

object IgPivotViewDataSelectorPanel {
  @scala.inline
  def apply(): IgPivotViewDataSelectorPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSelectorPanel]
  }
  @scala.inline
  implicit class IgPivotViewDataSelectorPanelOps[Self <: IgPivotViewDataSelectorPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

