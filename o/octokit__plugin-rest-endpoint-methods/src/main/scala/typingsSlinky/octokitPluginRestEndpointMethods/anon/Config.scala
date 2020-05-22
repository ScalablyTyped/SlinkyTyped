package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var active: Type
  var config: Type
  @JSName("config.content_type")
  var configDotcontent_type: Type
  @JSName("config.insecure_ssl")
  var configDotinsecure_ssl: Type
  @JSName("config.secret")
  var configDotsecret: Type
  @JSName("config.url")
  var configDoturl: Required
  var events: Type
  var hook_id: Required
  @JSName("org")
  var org_ : Required
}

object Config {
  @scala.inline
  def apply(
    active: Type,
    config: Type,
    configDotcontent_type: Type,
    configDotinsecure_ssl: Type,
    configDotsecret: Type,
    configDoturl: Required,
    events: Type,
    hook_id: Required,
    org_ : Required
  ): Config = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

