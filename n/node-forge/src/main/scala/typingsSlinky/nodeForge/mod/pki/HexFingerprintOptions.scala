package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.nodeForgeStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexFingerprintOptions extends ByteBufferFingerprintOptions {
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: hex = js.native
}

object HexFingerprintOptions {
  @scala.inline
  def apply(encoding: hex): HexFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexFingerprintOptions]
  }
  @scala.inline
  implicit class HexFingerprintOptionsOps[Self <: HexFingerprintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: hex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

