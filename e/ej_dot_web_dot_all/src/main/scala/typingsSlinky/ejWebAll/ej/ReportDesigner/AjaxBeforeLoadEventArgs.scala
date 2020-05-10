package typingsSlinky.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Action type of AJAX call back.
    */
  var actionType: js.UndefOr[String] = js.native
  /** To pass the custom data while AJAX post back.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** AJAX headers, we can pass any custom header through this property.
    */
  var headers: js.UndefOr[js.Array[_]] = js.native
  /** Token of report designer.
    */
  var reportDesignerToken: js.UndefOr[String] = js.native
  /** Token of ReportingService.
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.native
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
  @scala.inline
  implicit class AjaxBeforeLoadEventArgsOps[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDesignerToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDesignerToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDesignerToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDesignerToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAuthorizationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAuthorizationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAuthorizationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAuthorizationToken")(js.undefined)
        ret
    }
  }
  
}

