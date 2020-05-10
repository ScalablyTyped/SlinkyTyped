package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapAccordionEventMap extends ControlEventMap {
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var expandedChanged: AccordionGroupEventArgs = js.native
  var expandedChanging: AccordionGroupCancelEventArgs = js.native
  var headerClick: AccordionGroupClickEventArgs = js.native
  var itemClick: AccordionItemEventArgs = js.native
}

object BootstrapAccordionEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    endCallback: EndCallbackEventArgs,
    expandedChanged: AccordionGroupEventArgs,
    expandedChanging: AccordionGroupCancelEventArgs,
    headerClick: AccordionGroupClickEventArgs,
    init: EventArgs,
    itemClick: AccordionItemEventArgs
  ): BootstrapAccordionEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], expandedChanging = expandedChanging.asInstanceOf[js.Any], headerClick = headerClick.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemClick = itemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapAccordionEventMap]
  }
  @scala.inline
  implicit class BootstrapAccordionEventMapOps[Self <: BootstrapAccordionEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginCallback(value: BeginCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: CallbackErrorEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: EndCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedChanged(value: AccordionGroupEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedChanging(value: AccordionGroupCancelEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedChanging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderClick(value: AccordionGroupClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemClick(value: AccordionItemEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

