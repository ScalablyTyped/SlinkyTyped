package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the transform of a page element.  Updating the transform of a group
  * will change the absolute transform of the page elements in that group,
  * which can change their visual appearance. See the documentation for
  * PageElement.transform for more details.
  */
@js.native
trait SchemaUpdatePageElementTransformRequest extends js.Object {
  /**
    * The apply mode of the transform update.
    */
  var applyMode: js.UndefOr[String] = js.native
  /**
    * The object ID of the page element to update.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The input transform matrix used to update the page element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
}

object SchemaUpdatePageElementTransformRequest {
  @scala.inline
  def apply(): SchemaUpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementTransformRequest]
  }
  @scala.inline
  implicit class SchemaUpdatePageElementTransformRequestOps[Self <: SchemaUpdatePageElementTransformRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMode")(js.undefined)
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
    @scala.inline
    def withTransform(value: SchemaAffineTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

