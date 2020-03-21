package typingsSlinky.mapboxMapboxSdk

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: Blob | scala.scalajs.js.typedarray.ArrayBuffer | String
  var iconId: String
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object AnonFile {
  @scala.inline
  def apply(
    file: Blob | scala.scalajs.js.typedarray.ArrayBuffer | String,
    iconId: String,
    styleId: String,
    ownerId: String = null
  ): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

