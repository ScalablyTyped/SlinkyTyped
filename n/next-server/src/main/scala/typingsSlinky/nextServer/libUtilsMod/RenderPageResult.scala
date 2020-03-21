package typingsSlinky.nextServer.libUtilsMod

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.nextServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageResult extends js.Object {
  var dataOnly: js.UndefOr[`true`] = js.undefined
  var head: js.UndefOr[js.Array[ReactElement | Null]] = js.undefined
  var html: String
}

object RenderPageResult {
  @scala.inline
  def apply(html: String, dataOnly: `true` = null, head: js.Array[ReactElement | Null] = null): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (dataOnly != null) __obj.updateDynamic("dataOnly")(dataOnly.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderPageResult]
  }
}

