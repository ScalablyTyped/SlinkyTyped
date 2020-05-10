package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCreateTagResponse extends js.Object {
  var message: String = js.native
  var node_id: String = js.native
  var `object`: GitCreateTagResponseObject = js.native
  var sha: String = js.native
  var tag: String = js.native
  var tagger: GitCreateTagResponseTagger = js.native
  var url: String = js.native
  var verification: GitCreateTagResponseVerification = js.native
}

object GitCreateTagResponse {
  @scala.inline
  def apply(
    message: String,
    node_id: String,
    `object`: GitCreateTagResponseObject,
    sha: String,
    tag: String,
    tagger: GitCreateTagResponseTagger,
    url: String,
    verification: GitCreateTagResponseVerification
  ): GitCreateTagResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagResponse]
  }
  @scala.inline
  implicit class GitCreateTagResponseOps[Self <: GitCreateTagResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: GitCreateTagResponseObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagger(value: GitCreateTagResponseTagger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerification(value: GitCreateTagResponseVerification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

