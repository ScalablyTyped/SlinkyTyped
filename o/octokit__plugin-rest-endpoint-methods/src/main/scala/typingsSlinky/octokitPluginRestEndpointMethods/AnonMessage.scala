package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessage extends js.Object {
  var message: AnonRequired = js.native
  var `object`: AnonRequired = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var tag: AnonRequired = js.native
  var tagger: AnonType = js.native
  @JSName("tagger.date")
  var taggerDotdate: AnonType = js.native
  @JSName("tagger.email")
  var taggerDotemail: AnonType = js.native
  @JSName("tagger.name")
  var taggerDotname: AnonType = js.native
  var `type`: AnonEnumRequired = js.native
}

object AnonMessage {
  @scala.inline
  def apply(
    message: AnonRequired,
    `object`: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired,
    tag: AnonRequired,
    tagger: AnonType,
    taggerDotdate: AnonType,
    taggerDotemail: AnonType,
    taggerDotname: AnonType,
    `type`: AnonEnumRequired
  ): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.date")(taggerDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.email")(taggerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.name")(taggerDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
  @scala.inline
  implicit class AnonMessageOps[Self <: AnonMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagger(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggerDotdate(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger.date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggerDotemail(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggerDotname(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AnonEnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

