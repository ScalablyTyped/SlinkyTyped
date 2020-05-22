package typingsSlinky.gapiTranslate.gapi.client.language

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiTranslate.GoogleApiTranslateTranslationListResponse
import typingsSlinky.gapiTranslate.anon.Cid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait translations extends js.Object {
  /**
    * Returns text translations from one language to another.
    */
  def list(`object`: Cid): HttpRequest[GoogleApiTranslateTranslationListResponse]
}

object translations {
  @scala.inline
  def apply(list: Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): translations = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[translations]
  }
}

