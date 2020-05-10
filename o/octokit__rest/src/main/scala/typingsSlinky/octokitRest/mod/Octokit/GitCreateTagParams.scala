package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.blob
import typingsSlinky.octokitRest.octokitRestStrings.commit
import typingsSlinky.octokitRest.octokitRestStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCreateTagParams extends js.Object {
  /**
    * The tag message.
    */
  var message: String = js.native
  /**
    * The SHA of the git object this is tagging.
    */
  var `object`: String = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The tag's name. This is typically a version (e.g., "v0.0.1").
    */
  var tag: String = js.native
  /**
    * An object with information about the individual creating the tag.
    */
  var tagger: js.UndefOr[GitCreateTagParamsTagger] = js.native
  /**
    * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
    */
  var `type`: commit | tree | blob = js.native
}

object GitCreateTagParams {
  @scala.inline
  def apply(
    message: String,
    `object`: String,
    owner: String,
    repo: String,
    tag: String,
    `type`: commit | tree | blob
  ): GitCreateTagParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagParams]
  }
  @scala.inline
  implicit class GitCreateTagParamsOps[Self <: GitCreateTagParams] (val x: Self) extends AnyVal {
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
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: commit | tree | blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagger(value: GitCreateTagParamsTagger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger")(js.undefined)
        ret
    }
  }
  
}

