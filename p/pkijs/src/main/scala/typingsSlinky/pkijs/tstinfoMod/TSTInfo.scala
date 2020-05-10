package typingsSlinky.pkijs.tstinfoMod

import typingsSlinky.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTInfo extends js.Object {
  var accuracy: js.UndefOr[typingsSlinky.pkijs.accuracyMod.default] = js.native
  var extensions: js.UndefOr[js.Array[typingsSlinky.pkijs.extensionMod.default]] = js.native
  var genTime: js.Date = js.native
  var messageImprint: typingsSlinky.pkijs.messageImprintMod.default = js.native
  var nonce: js.UndefOr[Integer] = js.native
  var ordering: js.UndefOr[Boolean] = js.native
  var policy: String = js.native
  var serialNumber: Integer = js.native
  var tsa: js.UndefOr[typingsSlinky.pkijs.generalNameMod.default] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  def verify(params: VerifyParams): js.Thenable[Boolean] = js.native
}

object TSTInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    genTime: js.Date,
    messageImprint: typingsSlinky.pkijs.messageImprintMod.default,
    policy: String,
    serialNumber: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    verify: VerifyParams => js.Thenable[Boolean],
    version: Double
  ): TSTInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), verify = js.Any.fromFunction1(verify), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTInfo]
  }
  @scala.inline
  implicit class TSTInfoOps[Self <: TSTInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageImprint(value: typingsSlinky.pkijs.messageImprintMod.default): Self = {
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
    def withSerialNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVerify(value: VerifyParams => js.Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccuracy(value: typingsSlinky.pkijs.accuracyMod.default): Self = {
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
    def withExtensions(value: js.Array[typingsSlinky.pkijs.extensionMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: Integer): Self = {
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
    def withTsa(value: typingsSlinky.pkijs.generalNameMod.default): Self = {
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

