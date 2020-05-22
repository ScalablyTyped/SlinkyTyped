package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
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
  var name: Required
  @JSName("org")
  var org_ : Required
}

object Active {
  @scala.inline
  def apply(
    active: Type,
    config: Required,
    configDotcontent_type: Type,
    configDotinsecure_ssl: Type,
    configDotsecret: Type,
    configDoturl: Required,
    events: Type,
    name: Required,
    org_ : Required
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

