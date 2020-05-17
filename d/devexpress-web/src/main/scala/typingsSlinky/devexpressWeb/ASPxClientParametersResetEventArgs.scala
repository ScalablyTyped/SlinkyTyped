package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersReset and ASPxClientReportDesigner.PreviewParametersReset events.
  */
@js.native
trait ASPxClientParametersResetEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to report parameters whose values have been reset.
    */
  var Parameters: js.Array[ASPxClientWebDocumentViewerParameter] = js.native
  /**
    * Provides access to a View Model for report parameters.
    */
  var ParametersViewModel: js.Any = js.native
}

object ASPxClientParametersResetEventArgs {
  @scala.inline
  def apply(Parameters: js.Array[ASPxClientWebDocumentViewerParameter], ParametersViewModel: js.Any): ASPxClientParametersResetEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersResetEventArgs]
  }
  @scala.inline
  implicit class ASPxClientParametersResetEventArgsOps[Self <: ASPxClientParametersResetEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: js.Array[ASPxClientWebDocumentViewerParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParametersViewModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParametersViewModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

