package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
@js.native
trait ASPxClientCustomizeParameterLookUpSourceEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the data source that provides look-up values for the parameter editor.
    */
  var dataSource: js.Any = js.native
  /**
    * Provides access to the collection of look-up parameter values.
    */
  var items: js.Array[ASPxDesignerElementEditorItem] = js.native
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor = js.native
}

object ASPxClientCustomizeParameterLookUpSourceEventArgs {
  @scala.inline
  def apply(
    dataSource: js.Any,
    items: js.Array[ASPxDesignerElementEditorItem],
    parameter: ASPxDesignerElementParameterDescriptor
  ): ASPxClientCustomizeParameterLookUpSourceEventArgs = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeParameterLookUpSourceEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCustomizeParameterLookUpSourceEventArgsOps[Self <: ASPxClientCustomizeParameterLookUpSourceEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ASPxDesignerElementEditorItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
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

