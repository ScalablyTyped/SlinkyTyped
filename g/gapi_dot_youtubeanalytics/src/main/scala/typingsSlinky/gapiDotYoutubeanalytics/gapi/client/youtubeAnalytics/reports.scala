package typingsSlinky.gapiDotYoutubeanalytics.gapi.client.youtubeAnalytics

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiDotYoutubeanalytics.Anon_Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reports extends js.Object {
  /**
    * Retrieve your YouTube Analytics reports.
    */
  def query(`object`: Anon_Dimensions): HttpRequest[_]
}

object reports {
  @scala.inline
  def apply(query: Anon_Dimensions => HttpRequest[_]): reports = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[reports]
  }
}

