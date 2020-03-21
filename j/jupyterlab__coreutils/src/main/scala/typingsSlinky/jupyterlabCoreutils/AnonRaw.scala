package typingsSlinky.jupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRaw extends js.Object {
  var raw: String
  var rule: js.RegExp
}

object AnonRaw {
  @scala.inline
  def apply(raw: String, rule: js.RegExp): AnonRaw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRaw]
  }
}

