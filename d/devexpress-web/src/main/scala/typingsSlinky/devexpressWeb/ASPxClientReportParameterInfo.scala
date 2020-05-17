package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a report parameter on the client side.
  */
@js.native
trait ASPxClientReportParameterInfo extends js.Object {
  /**
    * Specifies the parameter path, relative to its parent container (e.g., "subreport1.subreportParameter1" for a subreport's parameter, or "parameter1" for a report's parameter).
    */
  var Path: String = js.native
  /**
    * Provides access to a parameter value on the client.
    */
  var Value: js.Any = js.native
}

object ASPxClientReportParameterInfo {
  @scala.inline
  def apply(Path: String, Value: js.Any): ASPxClientReportParameterInfo = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportParameterInfo]
  }
  @scala.inline
  implicit class ASPxClientReportParameterInfoOps[Self <: ASPxClientReportParameterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

