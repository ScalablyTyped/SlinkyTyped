package typingsSlinky.instagramDashPrivateDashApi.distTypesInsightsDotOptionsMod

import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ALL
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.BIO_LINK_CLICK
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.CALL
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.CAROUSEL_V2
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.COMMENT_COUNT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.EMAIL
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ENGAGEMENT_COUNT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.FOLLOW
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.GET_DIRECTIONS
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.IMAGE
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.IMPRESSION_COUNT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.LIKE_COUNT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_MONTH
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_WEEK
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_YEAR
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.PROFILE_VIEW
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.REACH_COUNT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SAVE_COUNT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SHARE_COUNT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SHOPPING
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SIX_MONTHS
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.TEXT
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.THREE_MONTHS
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.TWO_YEARS
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedOptions extends js.Object {
  var dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK
  var postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING
  var timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS
}

object PostsInsightsFeedOptions {
  @scala.inline
  def apply(
    dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK,
    postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING,
    timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS
  ): PostsInsightsFeedOptions = {
    val __obj = js.Dynamic.literal(dataOrdering = dataOrdering.asInstanceOf[js.Any], postType = postType.asInstanceOf[js.Any], timeframe = timeframe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostsInsightsFeedOptions]
  }
}

