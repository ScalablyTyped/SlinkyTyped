package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOption extends js.Object {
  var item: typingsSlinky.baseui.selectMod.Option
}

object ItemOption {
  @scala.inline
  def apply(item: typingsSlinky.baseui.selectMod.Option): ItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOption]
  }
}

