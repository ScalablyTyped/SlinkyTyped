package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the category of a line.
  */
@js.native
trait SchemaUpdateLineCategoryRequest extends js.Object {
  /**
    * The line category to update to.  The exact line type is determined based
    * on the category to update to and how it&#39;s routed to connect to other
    * page elements.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * The object ID of the line the update is applied to.  Only a line with a
    * category indicating it is a &quot;connector&quot; can be updated.  The
    * line may be rerouted after updating its category.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaUpdateLineCategoryRequest {
  @scala.inline
  def apply(): SchemaUpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateLineCategoryRequest]
  }
  @scala.inline
  implicit class SchemaUpdateLineCategoryRequestOps[Self <: SchemaUpdateLineCategoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
  }
  
}

