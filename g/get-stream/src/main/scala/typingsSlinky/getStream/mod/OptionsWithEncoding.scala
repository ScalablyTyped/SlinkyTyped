package typingsSlinky.getStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithEncoding[EncodingType] extends Options {
  /**
  		[Encoding](https://nodejs.org/api/buffer.html#buffer_buffer) of the incoming stream.
  		@default 'utf8'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.native
}

object OptionsWithEncoding {
  @scala.inline
  def apply[EncodingType](): OptionsWithEncoding[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsWithEncoding[EncodingType]]
  }
  @scala.inline
  implicit class OptionsWithEncodingOps[Self[encodingtype] <: OptionsWithEncoding[encodingtype], EncodingType] (val x: Self[EncodingType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EncodingType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EncodingType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EncodingType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EncodingType] with Other]
    @scala.inline
    def withEncoding(value: EncodingType): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
  }
  
}

