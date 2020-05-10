package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateEntityTypesResponse. */
@js.native
trait IBatchUpdateEntityTypesResponse extends js.Object {
  /** BatchUpdateEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.native
}

object IBatchUpdateEntityTypesResponse {
  @scala.inline
  def apply(): IBatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateEntityTypesResponse]
  }
  @scala.inline
  implicit class IBatchUpdateEntityTypesResponseOps[Self <: IBatchUpdateEntityTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypes(value: js.Array[IEntityType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypes")(null)
        ret
    }
  }
  
}

