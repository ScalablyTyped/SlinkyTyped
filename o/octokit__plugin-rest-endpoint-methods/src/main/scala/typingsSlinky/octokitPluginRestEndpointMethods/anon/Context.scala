package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: Type
  var mode: Enum
  var text: Required
}

object Context {
  @scala.inline
  def apply(context: Type, mode: Enum, text: Required): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

