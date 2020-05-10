package typingsSlinky.awsSdkClientS3Browser.typesRequestPaymentConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketOwner
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentConfiguration extends js.Object {
  /**
    * <p>Specifies who pays for the download and request fees.</p>
    */
  var Payer: Requester | BucketOwner | String = js.native
}

object RequestPaymentConfiguration {
  @scala.inline
  def apply(Payer: Requester | BucketOwner | String): RequestPaymentConfiguration = {
    val __obj = js.Dynamic.literal(Payer = Payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentConfiguration]
  }
  @scala.inline
  implicit class RequestPaymentConfigurationOps[Self <: RequestPaymentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayer(value: Requester | BucketOwner | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

