package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** base class for ASN.1 DER encoder object */
@js.native
trait ASN1Object extends js.Object {
  /** hexadecimal string of ASN.1 TLV length(L) */
  var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  var hV: String = js.native
  /** flag whether internal data was changed */
  var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  def getEncodedHex(): String = js.native
  def getFreshValueHex(): String = js.native
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  def getLengthHexFromValue(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  def getValueHex(): String = js.native
}

object ASN1Object {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String
  ): ASN1Object = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASN1Object]
  }
  @scala.inline
  implicit class ASN1ObjectOps[Self <: ASN1Object] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEncodedHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEncodedHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFreshValueHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFreshValueHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLengthHexFromValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLengthHexFromValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTLV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hTLV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

