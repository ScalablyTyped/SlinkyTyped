package typingsSlinky.nodeObjectHash.mod

import typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding
import typingsSlinky.nodeObjectHash.objectSorterMod.SorterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object hasher options
  */
@js.native
trait HasherOptions extends SorterOptions {
  /**
    * Hash algorithm to use
    * @default 'sha256'
    */
  var alg: js.UndefOr[String] = js.native
  /**
    * String encoding for hash
    * @default 'hex'
    */
  var enc: js.UndefOr[HexBase64Latin1Encoding] = js.native
}

object HasherOptions {
  @scala.inline
  def apply(): HasherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasherOptions]
  }
  @scala.inline
  implicit class HasherOptionsOps[Self <: HasherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
    @scala.inline
    def withEnc(value: HexBase64Latin1Encoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enc")(js.undefined)
        ret
    }
  }
  
}

