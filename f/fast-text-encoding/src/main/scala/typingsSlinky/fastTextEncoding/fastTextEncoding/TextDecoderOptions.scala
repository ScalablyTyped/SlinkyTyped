package typingsSlinky.fastTextEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for TextDecoder constructor.
  */
@js.native
trait TextDecoderOptions extends js.Object {
  var fatal: Boolean = js.native
}

object TextDecoderOptions {
  @scala.inline
  def apply(fatal: Boolean): TextDecoderOptions = {
    val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderOptions]
  }
  @scala.inline
  implicit class TextDecoderOptionsOps[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

