package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaImagesDeleteAllResponse extends js.Object {
  var deleted: js.UndefOr[js.Array[SchemaImage]] = js.native
}

object SchemaImagesDeleteAllResponse {
  @scala.inline
  def apply(): SchemaImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesDeleteAllResponse]
  }
  @scala.inline
  implicit class SchemaImagesDeleteAllResponseOps[Self <: SchemaImagesDeleteAllResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: js.Array[SchemaImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
  }
  
}

