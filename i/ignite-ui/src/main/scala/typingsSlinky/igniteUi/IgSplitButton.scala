package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSplitButton
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
  	 * Button items.
  	 *
  	 */
  var items: js.UndefOr[js.Array[IgSplitButtonItem]] = js.native
  /**
  	 * Specifies whether the default button will be switched when another button is selected.
  	 *
  	 */
  var swapDefaultEnabled: js.UndefOr[Boolean] = js.native
}

object IgSplitButton {
  @scala.inline
  def apply(): IgSplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitButton]
  }
  @scala.inline
  implicit class IgSplitButtonOps[Self <: IgSplitButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: (/* event */ Event_, /* ui */ ClickEventUIParam) => Unit): Self = {
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
    def withCollapsed(value: (/* event */ Event_, /* ui */ CollapsedEventUIParam) => Unit): Self = {
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
    def withCollapsing(value: (/* event */ Event_, /* ui */ CollapsingEventUIParam) => Unit): Self = {
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
    def withExpanded(value: (/* event */ Event_, /* ui */ ExpandedEventUIParam) => Unit): Self = {
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
    def withExpanding(value: (/* event */ Event_, /* ui */ ExpandingEventUIParam) => Unit): Self = {
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
    def withItems(value: js.Array[IgSplitButtonItem]): Self = {
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

