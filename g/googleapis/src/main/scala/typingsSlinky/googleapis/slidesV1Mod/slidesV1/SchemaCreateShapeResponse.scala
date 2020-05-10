package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a shape.
  */
@js.native
trait SchemaCreateShapeResponse extends js.Object {
  /**
    * The object ID of the created shape.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateShapeResponse {
  @scala.inline
  def apply(): SchemaCreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShapeResponse]
  }
  @scala.inline
  implicit class SchemaCreateShapeResponseOps[Self <: SchemaCreateShapeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

