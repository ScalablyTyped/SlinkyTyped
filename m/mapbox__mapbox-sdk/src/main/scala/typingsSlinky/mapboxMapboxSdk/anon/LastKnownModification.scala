package typingsSlinky.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastKnownModification extends js.Object {
  var lastKnownModification: js.UndefOr[String | Double | js.Date] = js.undefined
  var ownerId: js.UndefOr[String] = js.undefined
  var style: typingsSlinky.mapboxMapboxSdk.stylesMod.Style
  var styleId: String
}

object LastKnownModification {
  @scala.inline
  def apply(
    style: typingsSlinky.mapboxMapboxSdk.stylesMod.Style,
    styleId: String,
    lastKnownModification: String | Double | js.Date = null,
    ownerId: String = null
  ): LastKnownModification = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (lastKnownModification != null) __obj.updateDynamic("lastKnownModification")(lastKnownModification.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastKnownModification]
  }
}

