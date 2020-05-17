package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * base class for ASN.1 DER string classes
  * @param params associative array of parameters (ex. {'str': 'aaa'})
  * @description
  *
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@js.native
trait DERAbstractString extends js.Object {
  var s: String = js.native
  def getFreshValueHex(): String = js.native
  /**
    * get string value of this string object
    * @return string value of this string object
    */
  def getString(): String = js.native
  /**
    * set value by a string
    * @param newS value by a string to set
    */
  def setString(newS: String): Unit = js.native
  /**
    * set value by a hexadecimal string
    * @param newHexString value by a hexadecimal string to set
    */
  def setStringHex(newHexString: String): Unit = js.native
}

object DERAbstractString {
  @scala.inline
  def apply(
    getFreshValueHex: () => String,
    getString: () => String,
    s: String,
    setString: String => Unit,
    setStringHex: String => Unit
  ): DERAbstractString = {
    val __obj = js.Dynamic.literal(getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getString = js.Any.fromFunction0(getString), s = s.asInstanceOf[js.Any], setString = js.Any.fromFunction1(setString), setStringHex = js.Any.fromFunction1(setStringHex))
    __obj.asInstanceOf[DERAbstractString]
  }
  @scala.inline
  implicit class DERAbstractStringOps[Self <: DERAbstractString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFreshValueHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFreshValueHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStringHex(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStringHex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

