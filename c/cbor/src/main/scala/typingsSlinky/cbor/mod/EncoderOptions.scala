package typingsSlinky.cbor.mod

import typingsSlinky.cbor.cborStrings.float
import typingsSlinky.cbor.cborStrings.int
import typingsSlinky.cbor.cborStrings.number
import typingsSlinky.cbor.cborStrings.string
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncoderOptions extends TransformOptions {
  var canonical: js.UndefOr[Boolean] = js.native
  var dateType: js.UndefOr[number | float | int | string] = js.native
  var detectLoops: js.UndefOr[Boolean | js.Symbol] = js.native
  var disallowUndefinedKeys: js.UndefOr[Boolean] = js.native
  var encodeUndefined: js.UndefOr[js.Any] = js.native
  var genTypes: js.UndefOr[js.Array[_]] = js.native
}

object EncoderOptions {
  @scala.inline
  def apply(): EncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncoderOptions]
  }
  @scala.inline
  implicit class EncoderOptionsOps[Self <: EncoderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical")(js.undefined)
        ret
    }
    @scala.inline
    def withDateType(value: number | float | int | string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateType")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectLoops(value: Boolean | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectLoops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectLoops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectLoops")(js.undefined)
        ret
    }
    @scala.inline
    def withDisallowUndefinedKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowUndefinedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowUndefinedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowUndefinedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeUndefined(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withGenTypes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genTypes")(js.undefined)
        ret
    }
  }
  
}

