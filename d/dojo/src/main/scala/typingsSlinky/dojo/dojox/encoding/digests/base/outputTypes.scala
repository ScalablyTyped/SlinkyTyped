package typingsSlinky.dojo.dojox.encoding.digests.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/_base.outputTypes.html
  *
  * Enumeration for input and output encodings.
  *
  */
@js.native
trait outputTypes extends js.Object {
  /**
    *
    */
  var Base64: Double = js.native
  /**
    *
    */
  var Hex: Double = js.native
  /**
    *
    */
  var Raw: Double = js.native
  /**
    *
    */
  var String: Double = js.native
}

object outputTypes {
  @scala.inline
  def apply(Base64: Double, Hex: Double, Raw: Double, String: Double): outputTypes = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Raw = Raw.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
    __obj.asInstanceOf[outputTypes]
  }
  @scala.inline
  implicit class outputTypesOps[Self <: outputTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

