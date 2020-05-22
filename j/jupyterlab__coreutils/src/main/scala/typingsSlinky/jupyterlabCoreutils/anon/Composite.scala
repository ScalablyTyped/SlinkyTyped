package typingsSlinky.jupyterlabCoreutils.anon

import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Composite extends js.Object {
  var composite: JSONValue
  var user: JSONValue
}

object Composite {
  @scala.inline
  def apply(composite: JSONValue = null, user: JSONValue = null): Composite = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Composite]
  }
}

