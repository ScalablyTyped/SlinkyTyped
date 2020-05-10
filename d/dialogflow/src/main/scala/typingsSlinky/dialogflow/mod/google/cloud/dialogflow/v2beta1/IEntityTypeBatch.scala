package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EntityTypeBatch. */
@js.native
trait IEntityTypeBatch extends js.Object {
  /** EntityTypeBatch entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.native
}

object IEntityTypeBatch {
  @scala.inline
  def apply(): IEntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntityTypeBatch]
  }
  @scala.inline
  implicit class IEntityTypeBatchOps[Self <: IEntityTypeBatch] (val x: Self) extends AnyVal {
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

