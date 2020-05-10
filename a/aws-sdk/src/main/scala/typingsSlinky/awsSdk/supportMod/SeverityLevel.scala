package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeverityLevel extends js.Object {
  /**
    * The code for case severity level. Valid values: low | normal | high | urgent | critical 
    */
  var code: js.UndefOr[SeverityLevelCode] = js.native
  /**
    * The name of the severity level that corresponds to the severity level code.  The values returned by the API differ from the values that are displayed in the AWS Support Center. For example, for the code "low", the API name is "Low", but the name in the Support Center is "General guidance". These are the Support Center code/name mappings:    low: General guidance    normal: System impaired    high: Production system impaired    urgent: Production system down    critical: Business-critical system down    For more information, see Choosing a Severity 
    */
  var name: js.UndefOr[SeverityLevelName] = js.native
}

object SeverityLevel {
  @scala.inline
  def apply(): SeverityLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeverityLevel]
  }
  @scala.inline
  implicit class SeverityLevelOps[Self <: SeverityLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: SeverityLevelCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SeverityLevelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

