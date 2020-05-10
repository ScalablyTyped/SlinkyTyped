package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningImageFormat extends js.Object {
  /**
    * The default format of a code signing image.
    */
  var defaultFormat: ImageFormat = js.native
  /**
    * The supported formats of a code signing image.
    */
  var supportedFormats: ImageFormats = js.native
}

object SigningImageFormat {
  @scala.inline
  def apply(defaultFormat: ImageFormat, supportedFormats: ImageFormats): SigningImageFormat = {
    val __obj = js.Dynamic.literal(defaultFormat = defaultFormat.asInstanceOf[js.Any], supportedFormats = supportedFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningImageFormat]
  }
  @scala.inline
  implicit class SigningImageFormatOps[Self <: SigningImageFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFormat(value: ImageFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedFormats(value: ImageFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedFormats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

