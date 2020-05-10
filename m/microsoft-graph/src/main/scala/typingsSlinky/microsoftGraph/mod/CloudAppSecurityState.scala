package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudAppSecurityState extends js.Object {
  // Destination IP Address of the connection to the cloud application/service.
  var destinationServiceIp: js.UndefOr[String] = js.native
  // Cloud application/service name (for example 'Salesforce', 'DropBox', etc.).
  var destinationServiceName: js.UndefOr[String] = js.native
  /**
    * Provider-generated/calculated risk score of the Cloud Application/Service. Recommended value range of 0-1, which
    * equates to a percentage.
    */
  var riskScore: js.UndefOr[String] = js.native
}

object CloudAppSecurityState {
  @scala.inline
  def apply(): CloudAppSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudAppSecurityState]
  }
  @scala.inline
  implicit class CloudAppSecurityStateOps[Self <: CloudAppSecurityState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationServiceIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationServiceIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationServiceIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationServiceIp")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(js.undefined)
        ret
    }
  }
  
}

