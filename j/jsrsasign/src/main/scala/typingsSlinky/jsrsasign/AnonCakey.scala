package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCakey extends js.Object {
  var cakey: js.Tuple2[String, String] = js.native
  var ext: js.UndefOr[js.Array[Extension]] = js.native
  var issue: StringParam = js.native
  var notafter: StringParam = js.native
  var sbjpubkey: String = js.native
  var serial: IntegerParam = js.native
  var sigalg: NameParam = js.native
  var sighex: String = js.native
  var subject: StringParam = js.native
}

object AnonCakey {
  @scala.inline
  def apply(
    cakey: js.Tuple2[String, String],
    issue: StringParam,
    notafter: StringParam,
    sbjpubkey: String,
    serial: IntegerParam,
    sigalg: NameParam,
    sighex: String,
    subject: StringParam
  ): AnonCakey = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCakey]
  }
  @scala.inline
  implicit class AnonCakeyOps[Self <: AnonCakey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCakey(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cakey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotafter(value: StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notafter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSbjpubkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sbjpubkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: IntegerParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigalg(value: NameParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigalg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSighex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sighex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
  }
  
}

