package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageResourceTransformResult extends js.Object {
  var error: js.UndefOr[js.Error] = js.undefined
  var resource: ImageResource
  var tmpDest: String
}

object ImageResourceTransformResult {
  @scala.inline
  def apply(resource: ImageResource, tmpDest: String, error: js.Error = null): ImageResourceTransformResult = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tmpDest = tmpDest.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResourceTransformResult]
  }
}

