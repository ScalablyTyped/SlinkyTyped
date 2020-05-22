package typingsSlinky.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var style: typingsSlinky.mapboxMapboxSdk.stylesMod.Style
}

object Style {
  @scala.inline
  def apply(style: typingsSlinky.mapboxMapboxSdk.stylesMod.Style, ownerId: String = null): Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

