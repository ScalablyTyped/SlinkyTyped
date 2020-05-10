package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTileManagerSplitterOptionsEvents
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after collapsing is performed. Not cancellable.
  	 *
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get a reference to the splitter instance.
  	 *                     Use ui.index to get an index of collased panel.
  	 */
  var collapsed: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired after expanding is performed. Not cancellable.
  	 *
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get a reference to the splitter instance.
  	 *                     Use ui.index to get an index of expanded panel.
  	 */
  var expanded: js.UndefOr[js.Any] = js.native
}

object IgTileManagerSplitterOptionsEvents {
  @scala.inline
  def apply(): IgTileManagerSplitterOptionsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManagerSplitterOptionsEvents]
  }
  @scala.inline
  implicit class IgTileManagerSplitterOptionsEventsOps[Self <: IgTileManagerSplitterOptionsEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: js.Any): Self = {
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
    def withExpanded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
  }
  
}

