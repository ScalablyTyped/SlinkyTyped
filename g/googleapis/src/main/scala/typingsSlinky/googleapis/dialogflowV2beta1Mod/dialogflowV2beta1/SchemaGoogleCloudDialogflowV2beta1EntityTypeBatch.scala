package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is a wrapper around a collection of entity types.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch extends js.Object {
  /**
    * A collection of entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1EntityTypeBatchOps[Self <: SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]): Self = {
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
  }
  
}

