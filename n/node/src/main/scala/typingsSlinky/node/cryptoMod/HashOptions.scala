package typingsSlinky.node.cryptoMod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashOptions extends TransformOptions {
  /**
    * For XOF hash functions such as `shake256`, the
    * outputLength option can be used to specify the desired output length in bytes.
    */
  var outputLength: js.UndefOr[Double] = js.native
}

object HashOptions {
  @scala.inline
  def apply(): HashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashOptions]
  }
  @scala.inline
  implicit class HashOptionsOps[Self <: HashOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLength")(js.undefined)
        ret
    }
  }
  
}

