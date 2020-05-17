package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLEventObj extends js.Object {
  @JSName("MSHTML.IHTMLEventObj_typekey")
  var MSHTMLDotIHTMLEventObj_typekey: IHTMLEventObj = js.native
  val altKey: Boolean = js.native
  val button: Double = js.native
  var cancelBubble: Boolean = js.native
  val clientX: Double = js.native
  val clientY: Double = js.native
  val ctrlKey: Boolean = js.native
  val fromElement: IHTMLElement = js.native
  var keyCode: Double = js.native
  val offsetX: Double = js.native
  val offsetY: Double = js.native
  val qualifier: String = js.native
  val reason: Double = js.native
  var returnValue: js.Any = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val shiftKey: Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val srcFilter: js.Any = js.native
  val toElement: IHTMLElement = js.native
  val `type`: String = js.native
  val x: Double = js.native
  val y: Double = js.native
}

object IHTMLEventObj {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLEventObj_typekey: IHTMLEventObj,
    altKey: Boolean,
    button: Double,
    cancelBubble: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    fromElement: IHTMLElement,
    keyCode: Double,
    offsetX: Double,
    offsetY: Double,
    qualifier: String,
    reason: Double,
    returnValue: js.Any,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    srcElement: IHTMLElement,
    srcFilter: js.Any,
    toElement: IHTMLElement,
    `type`: String,
    x: Double,
    y: Double
  ): IHTMLEventObj = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], srcFilter = srcFilter.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLEventObj_typekey")(MSHTMLDotIHTMLEventObj_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLEventObj]
  }
  @scala.inline
  implicit class IHTMLEventObjOps[Self <: IHTMLEventObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLEventObj_typekey(value: IHTMLEventObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLEventObj_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromElement(value: IHTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShiftKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcElement(value: IHTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToElement(value: IHTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

