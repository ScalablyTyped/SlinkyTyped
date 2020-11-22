package typingsSlinky.instagramPrivateApi.insightsOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ALL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.BIO_LINK_CLICK
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.CALL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL_V2
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.COMMENT_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.EMAIL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ENGAGEMENT_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.FOLLOW
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.GET_DIRECTIONS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.IMAGE
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.IMPRESSION_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.LIKE_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_MONTH
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_WEEK
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_YEAR
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.PROFILE_VIEW
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.REACH_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SAVE_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SHARE_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SHOPPING
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SIX_MONTHS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.TEXT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.THREE_MONTHS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.TWO_YEARS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedOptions extends js.Object {
  
  var dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK = js.native
  
  var postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING = js.native
  
  var timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS = js.native
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
  
  @scala.inline
  implicit class PostsInsightsFeedOptionsOps[Self <: PostsInsightsFeedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataOrdering(
      value: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK
    ): Self = this.set("dataOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostType(value: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING): Self = this.set("postType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeframe(value: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS): Self = this.set("timeframe", value.asInstanceOf[js.Any])
  }
}
