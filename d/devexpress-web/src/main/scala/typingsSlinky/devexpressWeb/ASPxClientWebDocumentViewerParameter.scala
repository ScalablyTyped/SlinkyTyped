package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientWebDocumentViewerParameter extends js.Object {
  var isMultiValue: Boolean = js.native
  var `type`: js.Any = js.native
  var value: js.Any = js.native
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor = js.native
}

object ASPxClientWebDocumentViewerParameter {
  @scala.inline
  def apply(
    getParameterDescriptor: () => ASPxDesignerElementParameterDescriptor,
    isMultiValue: Boolean,
    `type`: js.Any,
    value: js.Any
  ): ASPxClientWebDocumentViewerParameter = {
    val __obj = js.Dynamic.literal(getParameterDescriptor = js.Any.fromFunction0(getParameterDescriptor), isMultiValue = isMultiValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerParameter]
  }
  @scala.inline
  implicit class ASPxClientWebDocumentViewerParameterOps[Self <: ASPxClientWebDocumentViewerParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetParameterDescriptor(value: () => ASPxDesignerElementParameterDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameterDescriptor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMultiValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

