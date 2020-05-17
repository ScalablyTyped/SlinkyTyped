package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgColorPickerSplitButton
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired when the button is clicked.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.item to get a reference the igSplitButton element.
  	 */
  var click: js.UndefOr[ClickEvent] = js.native
  /**
  	 * Event fired after the button is collapsed.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var collapsed: js.UndefOr[CollapsedEvent] = js.native
  /**
  	 * Event fired before a button item is collapsed.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var collapsing: js.UndefOr[CollapsingEvent] = js.native
  /**
  	 * Gets/sets the button default color value.
  	 *
  	 */
  var defaultColor: js.UndefOr[String] = js.native
  /**
  	 * Default button item name.
  	 *
  	 */
  var defaultItemName: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the button is expanded.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var expanded: js.UndefOr[ExpandedEvent] = js.native
  /**
  	 * Event fired before a button item is expanded.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var expanding: js.UndefOr[ExpandingEvent] = js.native
  /**
  	 * If this option is set to true, the igColorPickerSplitButton will be rendered with an icon.
  	 *
  	 */
  var hasDefaultIcon: js.UndefOr[Boolean] = js.native
  /**
  	 * Button items.
  	 *
  	 */
  var items: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Specifies whether the default button will be switched when another button is selected.
  	 *
  	 */
  var swapDefaultEnabled: js.UndefOr[Boolean] = js.native
}

object IgColorPickerSplitButton {
  @scala.inline
  def apply(): IgColorPickerSplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgColorPickerSplitButton]
  }
  @scala.inline
  implicit class IgColorPickerSplitButtonOps[Self <: IgColorPickerSplitButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: (/* event */ Event, /* ui */ ClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsing(value: (/* event */ Event, /* ui */ CollapsingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultItemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultItemName")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanding(value: (/* event */ Event, /* ui */ ExpandingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDefaultIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDefaultIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDefaultIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDefaultIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapDefaultEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapDefaultEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapDefaultEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapDefaultEnabled")(js.undefined)
        ret
    }
  }
  
}

