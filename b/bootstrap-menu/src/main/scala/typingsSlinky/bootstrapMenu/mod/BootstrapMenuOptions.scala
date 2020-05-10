package typingsSlinky.bootstrapMenu.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapMenuOptions extends js.Object {
  /**
    * In some weird cases, another plugin may be installing 'click' listeners
    * in the anchors used for each action of the context menu, and stopping
    * the event bubbling before it reachs this plugin's listener.
    *
    * For those cases, _actionSelectEvent can be used to change the event we
    * listen to, for example to 'mousedown'.
    *
    * Unless the context menu is not working due to this and a workaround is
    * needed, this option can be safely ignored.
    */
  var _actionSelectEvent: js.UndefOr[String] = js.native
  /**
    * Array or object containing the list of actions to be rendered in the context menu.
    */
  var actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions] = js.native
  /**
    * Array to group actions to render them next to each other, with a separator between each group.
    */
  var actionsGroups: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    * Container of the context menu, where it will be created and where event listeners will be installed.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * Obtain specific data about the currently opened element, to pass it to the rest of user-defined functions of an action.
    */
  var fetchElementData: js.UndefOr[js.Function1[/* jqueryElement */ JQuery_[HTMLElement], BootstrapMenuRowElement]] = js.native
  /**
    * The event to listen to open the menu. Valid values are *click*, *right-click*, *hover*. Defaults to *right-click*.
    */
  var menuEvent: js.UndefOr[BootstrapMenuEvent] = js.native
  /**
    * How to calculate the position of the context menu based on its source. Valid values are *aboveLeft*, *aboveRight*, *belowLeft*, and *belowRight*. Defaults to *belowLeft*.
    */
  var menuPosition: js.UndefOr[BootstrapMenuPosition] = js.native
  /**
    * What the source of the context menu should be when opened. Valid values are *mouse* and *element*. Defaults to *mouse*.
    */
  var menuSource: js.UndefOr[BootstrapMenuSource] = js.native
  /**
    * Message to show when there are no actions to show in a menu
    * (isShown() returned false on all actions)
    */
  var noActionsMessage: js.UndefOr[String] = js.native
}

object BootstrapMenuOptions {
  @scala.inline
  def apply(actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]): BootstrapMenuOptions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapMenuOptions]
  }
  @scala.inline
  implicit class BootstrapMenuOptionsOps[Self <: BootstrapMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_actionSelectEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_actionSelectEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_actionSelectEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_actionSelectEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withActionsGroups(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchElementData(value: /* jqueryElement */ JQuery_[HTMLElement] => BootstrapMenuRowElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchElementData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetchElementData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchElementData")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuEvent(value: BootstrapMenuEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPosition(value: BootstrapMenuPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuSource(value: BootstrapMenuSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSource")(js.undefined)
        ret
    }
    @scala.inline
    def withNoActionsMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noActionsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoActionsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noActionsMessage")(js.undefined)
        ret
    }
  }
  
}

