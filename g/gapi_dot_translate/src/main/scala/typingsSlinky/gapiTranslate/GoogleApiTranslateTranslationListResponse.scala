package typingsSlinky.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiTranslateTranslationListResponse extends js.Object {
  var data: AnonTranslations = js.native
}

object GoogleApiTranslateTranslationListResponse {
  @scala.inline
  def apply(data: AnonTranslations): GoogleApiTranslateTranslationListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateTranslationListResponse]
  }
  @scala.inline
  implicit class GoogleApiTranslateTranslationListResponseOps[Self <: GoogleApiTranslateTranslationListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AnonTranslations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

