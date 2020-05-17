package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
@js.native
trait ASPxClientCustomizeParameterEditorsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    */
  var info: ASPxDesignerElementSerializationInfo = js.native
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor = js.native
}

object ASPxClientCustomizeParameterEditorsEventArgs {
  @scala.inline
  def apply(info: ASPxDesignerElementSerializationInfo, parameter: ASPxDesignerElementParameterDescriptor): ASPxClientCustomizeParameterEditorsEventArgs = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeParameterEditorsEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCustomizeParameterEditorsEventArgsOps[Self <: ASPxClientCustomizeParameterEditorsEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: ASPxDesignerElementSerializationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameter(value: ASPxDesignerElementParameterDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

