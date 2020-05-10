package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing a long running folder operation
  */
@js.native
trait SchemaFolderOperation extends js.Object {
  /**
    * The resource name of the folder or organization we are either creating
    * the folder under or moving the folder to.
    */
  var destinationParent: js.UndefOr[String] = js.native
  /**
    * The display name of the folder.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The type of this operation.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * The resource name of the folder&#39;s parent. Only applicable when the
    * operation_type is MOVE.
    */
  var sourceParent: js.UndefOr[String] = js.native
}

object SchemaFolderOperation {
  @scala.inline
  def apply(): SchemaFolderOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderOperation]
  }
  @scala.inline
  implicit class SchemaFolderOperationOps[Self <: SchemaFolderOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationParent")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceParent")(js.undefined)
        ret
    }
  }
  
}

