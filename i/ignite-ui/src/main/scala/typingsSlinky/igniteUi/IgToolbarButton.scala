package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbarButton
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after the toolbar button is activated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var activated: js.UndefOr[ActivatedEvent] = js.native
  /**
  	 * Event fired before the toolbar button is activated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var activating: js.UndefOr[ActivatingEvent] = js.native
  /**
  	 * Enable/Disable the "Toggling" of a button.
  	 *
  	 */
  var allowToggling: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after the toolbar button is deactivated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var deactivated: js.UndefOr[DeactivatedEvent] = js.native
  /**
  	 * Event fired before the toolbar button is deactivated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var deactivating: js.UndefOr[DeactivatingEvent] = js.native
  /**
  	 * Get/Set whether the toolbar button is selected.
  	 *
  	 */
  var isSelected: js.UndefOr[Boolean] = js.native
}

object IgToolbarButton {
  @scala.inline
  def apply(): IgToolbarButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarButton]
  }
  @scala.inline
  implicit class IgToolbarButtonOps[Self <: IgToolbarButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivated(value: (/* event */ Event, /* ui */ ActivatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(js.undefined)
        ret
    }
    @scala.inline
    def withActivating(value: (/* event */ Event, /* ui */ ActivatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activating")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowToggling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToggling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowToggling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToggling")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivated(value: (/* event */ Event, /* ui */ DeactivatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeactivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivating(value: (/* event */ Event, /* ui */ DeactivatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeactivating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
  }
  
}

