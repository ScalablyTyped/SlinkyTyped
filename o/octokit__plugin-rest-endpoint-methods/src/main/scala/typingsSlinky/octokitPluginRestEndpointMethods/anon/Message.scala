package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: Required
  var `object`: Required
  var owner: Required
  var repo: Required
  var tag: Required
  var tagger: Type
  @JSName("tagger.date")
  var taggerDotdate: Type
  @JSName("tagger.email")
  var taggerDotemail: Type
  @JSName("tagger.name")
  var taggerDotname: Type
  var `type`: EnumRequired
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
}

