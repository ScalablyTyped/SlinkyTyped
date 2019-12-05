package typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotLikeDotOptionsMod

import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_contextual_newsfeed_multi_media_liked
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_contextual_post
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_timeline
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.newsfeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedTimeline extends js.Object {
  var module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
}

object FeedTimeline {
  @scala.inline
  def apply(
    module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
  ): FeedTimeline = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeedTimeline]
  }
}

