package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_hashtag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedContextualHashtag extends js.Object {
  var hashtag: String = js.native
  var module_name: feed_contextual_hashtag = js.native
}

object FeedContextualHashtag {
  @scala.inline
  def apply(hashtag: String, module_name: feed_contextual_hashtag): FeedContextualHashtag = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedContextualHashtag]
  }
  @scala.inline
  implicit class FeedContextualHashtagOps[Self <: FeedContextualHashtag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule_name(value: feed_contextual_hashtag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

