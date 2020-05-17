package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.EndDragNode event.
  */
@js.native
trait ASPxClientTreeListEndDragNodeEventArgs extends ASPxClientTreeListNodeEventArgs {
  /**
    * Gets the target element.
    */
  var targetElement: js.Any = js.native
}

object ASPxClientTreeListEndDragNodeEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String, targetElement: js.Any): ASPxClientTreeListEndDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListEndDragNodeEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListEndDragNodeEventArgsOps[Self <: ASPxClientTreeListEndDragNodeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

