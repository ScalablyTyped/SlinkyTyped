package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplate extends js.Object {
  var getTemplate: ParamsNameRequired
  var listTemplates: UrlString
}

object GetTemplate {
  @scala.inline
  def apply(getTemplate: ParamsNameRequired, listTemplates: UrlString): GetTemplate = {
    val __obj = js.Dynamic.literal(getTemplate = getTemplate.asInstanceOf[js.Any], listTemplates = listTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplate]
  }
}

