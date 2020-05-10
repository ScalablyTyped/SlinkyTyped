package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRoutersPreviewResponse extends js.Object {
  /**
    * Preview of given router.
    */
  var resource: js.UndefOr[SchemaRouter] = js.native
}

object SchemaRoutersPreviewResponse {
  @scala.inline
  def apply(): SchemaRoutersPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutersPreviewResponse]
  }
  @scala.inline
  implicit class SchemaRoutersPreviewResponseOps[Self <: SchemaRoutersPreviewResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: SchemaRouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

