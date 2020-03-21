package typingsSlinky.antDesignPro

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var tab: TagMod[Any]
}

object AnonKey {
  @scala.inline
  def apply(key: String, tab: TagMod[Any]): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

