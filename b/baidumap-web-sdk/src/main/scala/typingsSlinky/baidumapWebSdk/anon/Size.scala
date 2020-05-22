package typingsSlinky.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var size: typingsSlinky.baidumapWebSdk.BMap.Size
  var target: js.Any
  var `type`: String
}

object Size {
  @scala.inline
  def apply(size: typingsSlinky.baidumapWebSdk.BMap.Size, target: js.Any, `type`: String): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

