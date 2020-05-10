package typingsSlinky.gapiTranslate.gapi.client.language

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiTranslate.AnonTarget
import typingsSlinky.gapiTranslate.GoogleApiTranslateLanguageListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait languages extends js.Object {
  /**
  		 * List the source/target languages supported by the API
  		 */
  def list(`object`: AnonTarget): HttpRequest[GoogleApiTranslateLanguageListResponse] = js.native
}

object languages {
  @scala.inline
  def apply(list: AnonTarget => HttpRequest[GoogleApiTranslateLanguageListResponse]): languages = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[languages]
  }
  @scala.inline
  implicit class languagesOps[Self <: languages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonTarget => HttpRequest[GoogleApiTranslateLanguageListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

