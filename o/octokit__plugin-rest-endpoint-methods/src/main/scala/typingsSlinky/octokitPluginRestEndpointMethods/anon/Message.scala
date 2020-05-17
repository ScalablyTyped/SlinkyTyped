package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var message: Required = js.native
  var `object`: Required = js.native
  var owner: Required = js.native
  var repo: Required = js.native
  var tag: Required = js.native
  var tagger: Type = js.native
  @JSName("tagger.date")
  var taggerDotdate: Type = js.native
  @JSName("tagger.email")
  var taggerDotemail: Type = js.native
  @JSName("tagger.name")
  var taggerDotname: Type = js.native
  var `type`: EnumRequired = js.native
}

object Message {
  @scala.inline
  def apply(
    message: Required,
    `object`: Required,
    owner: Required,
    repo: Required,
    tag: Required,
    tagger: Type,
    taggerDotdate: Type,
    taggerDotemail: Type,
    taggerDotname: Type,
    `type`: EnumRequired
  ): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.date")(taggerDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.email")(taggerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.name")(taggerDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagger(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggerDotdate(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger.date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggerDotemail(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggerDotname(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagger.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

