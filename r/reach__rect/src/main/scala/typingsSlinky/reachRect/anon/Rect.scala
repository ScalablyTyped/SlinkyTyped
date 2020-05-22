package typingsSlinky.reachRect.anon

import typingsSlinky.react.mod.Ref
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var rect: DOMRect
  var ref: Ref[_]
}

object Rect {
  @scala.inline
  def apply(rect: DOMRect, ref: Ref[_] = null): Rect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
}

