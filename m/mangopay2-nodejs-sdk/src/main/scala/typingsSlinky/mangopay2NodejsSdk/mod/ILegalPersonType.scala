package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BUSINESS
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ORGANIZATION
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOLETRADER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILegalPersonType extends js.Object {
  var Business: BUSINESS = js.native
  var NotSpecified: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
  var Organization: ORGANIZATION = js.native
  var Soletrader: SOLETRADER = js.native
}

object ILegalPersonType {
  @scala.inline
  def apply(Business: BUSINESS, NotSpecified: NotSpecified, Organization: ORGANIZATION, Soletrader: SOLETRADER): ILegalPersonType = {
    val __obj = js.Dynamic.literal(Business = Business.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], Organization = Organization.asInstanceOf[js.Any], Soletrader = Soletrader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegalPersonType]
  }
  @scala.inline
  implicit class ILegalPersonTypeOps[Self <: ILegalPersonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness(value: BUSINESS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSpecified(value: NotSpecified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotSpecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: ORGANIZATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoletrader(value: SOLETRADER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Soletrader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

