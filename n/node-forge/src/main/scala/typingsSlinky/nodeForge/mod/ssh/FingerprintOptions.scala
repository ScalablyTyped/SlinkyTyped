package typingsSlinky.nodeForge.mod.ssh

import typingsSlinky.nodeForge.mod.md.MessageDigest
import typingsSlinky.nodeForge.nodeForgeStrings.binary
import typingsSlinky.nodeForge.nodeForgeStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FingerprintOptions extends js.Object {
  /**
    * @description the delimiter to use between bytes for `hex` encoded output
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: js.UndefOr[hex | binary] = js.native
  /**
    * @description if not specified defaults to `md.md5`
    */
  var md: js.UndefOr[MessageDigest] = js.native
}

object FingerprintOptions {
  @scala.inline
  def apply(): FingerprintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FingerprintOptions]
  }
  @scala.inline
  implicit class FingerprintOptionsOps[Self <: FingerprintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: hex | binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withMd(value: MessageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(js.undefined)
        ret
    }
  }
  
}

