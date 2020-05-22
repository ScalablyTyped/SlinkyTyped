package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainResponse extends js.Object {
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.AcmCertificateArn] = js.native
  /**
    * The time that the domain was added.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The name of the domain.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DomainName] = js.native
  /**
    * The current state for the domain.
    */
  var DomainStatus: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DomainStatus] = js.native
}

object DescribeDomainResponse {
  @scala.inline
  def apply(
    AcmCertificateArn: AcmCertificateArn = null,
    CreatedTime: js.Date = null,
    DisplayName: DisplayName = null,
    DomainName: DomainName = null,
    DomainStatus: DomainStatus = null
  ): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (AcmCertificateArn != null) __obj.updateDynamic("AcmCertificateArn")(AcmCertificateArn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainResponse]
  }
}

