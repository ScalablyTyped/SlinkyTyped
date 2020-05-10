package typingsSlinky.i18nextExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageDetectorAllOptions extends js.Object {
  var fallbackLng: Boolean | String | js.Array[String] = js.native
}

object LanguageDetectorAllOptions {
  @scala.inline
  def apply(fallbackLng: Boolean | String | js.Array[String]): LanguageDetectorAllOptions = {
    val __obj = js.Dynamic.literal(fallbackLng = fallbackLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorAllOptions]
  }
  @scala.inline
  implicit class LanguageDetectorAllOptionsOps[Self <: LanguageDetectorAllOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallbackLng(value: Boolean | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLng")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

