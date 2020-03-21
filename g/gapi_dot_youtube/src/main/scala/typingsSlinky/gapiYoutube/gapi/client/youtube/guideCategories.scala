package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonHl
import typingsSlinky.gapiYoutube.GoogleApiYouTubeGuideCategoryResource
import typingsSlinky.gapiYoutube.GoogleApiYouTubePageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait guideCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube channels.
    */
  def list(`object`: AnonHl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]
}

object guideCategories {
  @scala.inline
  def apply(list: AnonHl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]): guideCategories = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[guideCategories]
  }
}

