package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASNObject extends js.Object {
  var bitstr: DERBitString = js.native
  var bool: DERBoolean = js.native
  var enum: DEREnumerated = js.native
  var gentime: DERGeneralizedTime = js.native
  var ia5str: DERIA5String = js.native
  var int: DERInteger = js.native
  var `null`: DERNull = js.native
  var numstr: DERNumericString = js.native
  var octstr: DEROctetString = js.native
  var oid: DERObjectIdentifier = js.native
  var prnstr: DERPrintableString = js.native
  var seq: DERSequence = js.native
  var set: DERSet = js.native
  var tag: DERTaggedObject = js.native
  var telstr: DERTeletexString = js.native
  var utctime: DERUTCTime = js.native
  var utf8str: DERUTF8String = js.native
}

object ASNObject {
  @scala.inline
  def apply(
    bitstr: DERBitString,
    bool: DERBoolean,
    enum: DEREnumerated,
    gentime: DERGeneralizedTime,
    ia5str: DERIA5String,
    int: DERInteger,
    `null`: DERNull,
    numstr: DERNumericString,
    octstr: DEROctetString,
    oid: DERObjectIdentifier,
    prnstr: DERPrintableString,
    seq: DERSequence,
    set: DERSet,
    tag: DERTaggedObject,
    telstr: DERTeletexString,
    utctime: DERUTCTime,
    utf8str: DERUTF8String
  ): ASNObject = {
    val __obj = js.Dynamic.literal(bitstr = bitstr.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], gentime = gentime.asInstanceOf[js.Any], ia5str = ia5str.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], numstr = numstr.asInstanceOf[js.Any], octstr = octstr.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], prnstr = prnstr.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], telstr = telstr.asInstanceOf[js.Any], utctime = utctime.asInstanceOf[js.Any], utf8str = utf8str.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASNObject]
  }
  @scala.inline
  implicit class ASNObjectOps[Self <: ASNObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitstr(value: DERBitString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitstr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBool(value: DERBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnum(value: DEREnumerated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGentime(value: DERGeneralizedTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gentime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIa5str(value: DERIA5String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ia5str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt(value: DERInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNull(value: DERNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumstr(value: DERNumericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numstr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOctstr(value: DEROctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("octstr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOid(value: DERObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrnstr(value: DERPrintableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prnstr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeq(value: DERSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: DERSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: DERTaggedObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTelstr(value: DERTeletexString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telstr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtctime(value: DERUTCTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utctime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf8str(value: DERUTF8String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8str")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

