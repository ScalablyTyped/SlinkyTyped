package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configcontenttype extends js.Object {
  var active: Type
  var config: Required
  @JSName("config.content_type")
  var configDotcontent_type: Type
  @JSName("config.insecure_ssl")
  var configDotinsecure_ssl: Type
  @JSName("config.secret")
  var configDotsecret: Type
  @JSName("config.url")
  var configDoturl: Required
  var events: Type
  var name: Type
  var owner: Required
  var repo: Required
}

object Configcontenttype {
  @scala.inline
  def apply(
    active: Type,
    config: Required,
    configDotcontent_type: Type,
    configDotinsecure_ssl: Type,
    configDotsecret: Type,
    configDoturl: Required,
    events: Type,
    name: Type,
    owner: Required,
    repo: Required
  ): Configcontenttype = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configcontenttype]
  }
}

