package typingsSlinky.dojo.dojox.encoding.crypto.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/crypto/_base.cipherModes.html
  *
  * Enumeration for various cipher modes.
  *
  */
@js.native
trait cipherModes extends js.Object {
  /**
    *
    */
  var CBC: Double = js.native
  /**
    *
    */
  var CFB: Double = js.native
  /**
    *
    */
  var CTR: Double = js.native
  /**
    *
    */
  var ECB: Double = js.native
  /**
    *
    */
  var OFB: Double = js.native
  /**
    *
    */
  var PCBC: Double = js.native
}

object cipherModes {
  @scala.inline
  def apply(CBC: Double, CFB: Double, CTR: Double, ECB: Double, OFB: Double, PCBC: Double): cipherModes = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any], PCBC = PCBC.asInstanceOf[js.Any])
    __obj.asInstanceOf[cipherModes]
  }
  @scala.inline
  implicit class cipherModesOps[Self <: cipherModes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCBC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CBC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCFB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CFB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCTR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withECB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPCBC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PCBC")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

