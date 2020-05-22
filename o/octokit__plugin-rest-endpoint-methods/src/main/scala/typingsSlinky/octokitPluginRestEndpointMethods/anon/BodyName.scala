package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyName extends js.Object {
  var body: Type
  var name: Required
}

object BodyName {
  @scala.inline
  def apply(body: Type, name: Required): BodyName = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyName]
  }
}

