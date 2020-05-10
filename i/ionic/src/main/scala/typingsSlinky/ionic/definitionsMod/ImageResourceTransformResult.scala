package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageResourceTransformResult extends js.Object {
  var error: js.UndefOr[js.Error] = js.native
  var resource: ImageResource = js.native
  var tmpDest: String = js.native
}

object ImageResourceTransformResult {
  @scala.inline
  def apply(resource: ImageResource, tmpDest: String): ImageResourceTransformResult = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tmpDest = tmpDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResourceTransformResult]
  }
  @scala.inline
  implicit class ImageResourceTransformResultOps[Self <: ImageResourceTransformResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: ImageResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmpDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpDest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

