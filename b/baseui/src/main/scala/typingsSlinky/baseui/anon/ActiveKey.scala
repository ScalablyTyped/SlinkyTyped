package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveKey extends js.Object {
  var activeKey: typingsSlinky.react.mod.Key
}

object ActiveKey {
  @scala.inline
  def apply(activeKey: typingsSlinky.react.mod.Key): ActiveKey = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveKey]
  }
}

