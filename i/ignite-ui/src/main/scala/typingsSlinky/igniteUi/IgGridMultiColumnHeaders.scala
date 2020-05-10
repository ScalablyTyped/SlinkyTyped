package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridMultiColumnHeaders
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after the group collapsing has been executed and results are rendered.
  	 */
  var groupCollapsed: js.UndefOr[GroupCollapsedEvent] = js.native
  /**
  	 * Event fired before a group collapsing operation is executed.
  	 */
  var groupCollapsing: js.UndefOr[GroupCollapsingEvent] = js.native
  /**
  	 * Event fired after the group expanding has been executed and results are rendered.
  	 */
  var groupExpanded: js.UndefOr[GroupExpandedEvent] = js.native
  /**
  	 * Event fired before a group expanding operation is executed.
  	 */
  var groupExpanding: js.UndefOr[GroupExpandingEvent] = js.native
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
}

object IgGridMultiColumnHeaders {
  @scala.inline
  def apply(): IgGridMultiColumnHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridMultiColumnHeaders]
  }
  @scala.inline
  implicit class IgGridMultiColumnHeadersOps[Self <: IgGridMultiColumnHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupCollapsed(value: (/* event */ Event_, /* ui */ GroupCollapsedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCollapsing(value: (/* event */ Event_, /* ui */ GroupCollapsingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupExpanded(value: (/* event */ Event_, /* ui */ GroupExpandedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupExpanding(value: (/* event */ Event_, /* ui */ GroupExpandingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpanding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
  }
  
}

