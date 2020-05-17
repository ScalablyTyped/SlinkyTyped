package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DateParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accuracy extends js.Object {
  var accuracy: js.UndefOr[Micros] = js.native
  var genTime: js.UndefOr[StringParam | HexParam | DateParam | String] = js.native
  var messageImprint: HashMsgHex = js.native
  var nonce: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.native
  var ordering: js.UndefOr[Boolean] = js.native
  var policy: String = js.native
  var serialNumber: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.native
  var tsa: js.UndefOr[StringParam] = js.native
}

object Accuracy {
  @scala.inline
  def apply(messageImprint: HashMsgHex, policy: String): Accuracy = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  @scala.inline
  implicit class AccuracyOps[Self <: Accuracy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageImprint(value: HashMsgHex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageImprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccuracy(value: Micros): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withGenTime(value: StringParam | HexParam | DateParam | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTsa(value: StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsa")(js.undefined)
        ret
    }
  }
  
}

