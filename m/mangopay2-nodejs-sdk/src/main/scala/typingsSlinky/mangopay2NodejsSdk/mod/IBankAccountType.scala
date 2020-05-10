package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountType extends js.Object {
  var CA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = js.native
  var GB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = js.native
  var IBAN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN = js.native
  var NotSpecified: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
  var OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = js.native
  var US: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = js.native
}

object IBankAccountType {
  @scala.inline
  def apply(CA: CA, GB: GB, IBAN: IBAN, NotSpecified: NotSpecified, OTHER: OTHER, US: US): IBankAccountType = {
    val __obj = js.Dynamic.literal(CA = CA.asInstanceOf[js.Any], GB = GB.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], US = US.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountType]
  }
  @scala.inline
  implicit class IBankAccountTypeOps[Self <: IBankAccountType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCA(value: CA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGB(value: GB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIBAN(value: IBAN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IBAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSpecified(value: NotSpecified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotSpecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOTHER(value: OTHER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTHER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUS(value: US): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("US")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

