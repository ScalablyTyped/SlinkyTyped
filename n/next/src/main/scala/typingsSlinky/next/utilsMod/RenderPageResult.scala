package typingsSlinky.next.utilsMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageResult extends js.Object {
  var head: js.UndefOr[js.Array[ReactElement | Null]] = js.undefined
  var html: String
}

object RenderPageResult {
  @scala.inline
  def apply(html: String, head: js.Array[ReactElement | Null] = null): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderPageResult]
  }
}

