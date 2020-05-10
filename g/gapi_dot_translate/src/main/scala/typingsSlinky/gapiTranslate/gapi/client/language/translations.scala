package typingsSlinky.gapiTranslate.gapi.client.language

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiTranslate.AnonCid
import typingsSlinky.gapiTranslate.GoogleApiTranslateTranslationListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait translations extends js.Object {
  /**
  		 * Returns text translations from one language to another.
  		 */
  def list(`object`: AnonCid): HttpRequest[GoogleApiTranslateTranslationListResponse] = js.native
}

object translations {
  @scala.inline
  def apply(list: AnonCid => HttpRequest[GoogleApiTranslateTranslationListResponse]): translations = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[translations]
  }
  @scala.inline
  implicit class translationsOps[Self <: translations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonCid => HttpRequest[GoogleApiTranslateTranslationListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

