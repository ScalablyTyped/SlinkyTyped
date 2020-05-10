package typingsSlinky.instagramPrivateApi.mediaRepositoryCheckOffensiveCommentResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryCheckOffensiveCommentResponseRootObject extends js.Object {
  var bully_classifier: String = js.native
  var hate_classifier: String = js.native
  var is_offensive: Boolean = js.native
  var sexual_classifier: String = js.native
  var spam_classifier: String = js.native
  var status: String = js.native
}

object MediaRepositoryCheckOffensiveCommentResponseRootObject {
  @scala.inline
  def apply(
    bully_classifier: String,
    hate_classifier: String,
    is_offensive: Boolean,
    sexual_classifier: String,
    spam_classifier: String,
    status: String
  ): MediaRepositoryCheckOffensiveCommentResponseRootObject = {
    val __obj = js.Dynamic.literal(bully_classifier = bully_classifier.asInstanceOf[js.Any], hate_classifier = hate_classifier.asInstanceOf[js.Any], is_offensive = is_offensive.asInstanceOf[js.Any], sexual_classifier = sexual_classifier.asInstanceOf[js.Any], spam_classifier = spam_classifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryCheckOffensiveCommentResponseRootObject]
  }
  @scala.inline
  implicit class MediaRepositoryCheckOffensiveCommentResponseRootObjectOps[Self <: MediaRepositoryCheckOffensiveCommentResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBully_classifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bully_classifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHate_classifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hate_classifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_offensive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_offensive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSexual_classifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sexual_classifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpam_classifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spam_classifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

