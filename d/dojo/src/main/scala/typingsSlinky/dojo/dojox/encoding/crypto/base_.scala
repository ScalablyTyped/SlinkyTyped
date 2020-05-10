package typingsSlinky.dojo.dojox.encoding.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/crypto/_base.html
  *
  *
  */
@js.native
trait base_ extends js.Object {
  /**
    *
    */
  var Blowfish: js.Object = js.native
  /**
    *
    */
  var SimpleAES: js.Object = js.native
  /**
    * Enumeration for various cipher modes.
    *
    */
  var cipherModes: js.Object = js.native
  /**
    * Enumeration for input and output encodings.
    *
    */
  var outputTypes: js.Object = js.native
  /**
    *
    */
  def RSAKey(): Unit = js.native
}

object base_ {
  @scala.inline
  def apply(
    Blowfish: js.Object,
    RSAKey: () => Unit,
    SimpleAES: js.Object,
    cipherModes: js.Object,
    outputTypes: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(Blowfish = Blowfish.asInstanceOf[js.Any], RSAKey = js.Any.fromFunction0(RSAKey), SimpleAES = SimpleAES.asInstanceOf[js.Any], cipherModes = cipherModes.asInstanceOf[js.Any], outputTypes = outputTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[base_]
  }
  @scala.inline
  implicit class base_Ops[Self <: base_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlowfish(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blowfish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRSAKey(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSAKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSimpleAES(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimpleAES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCipherModes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputTypes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

