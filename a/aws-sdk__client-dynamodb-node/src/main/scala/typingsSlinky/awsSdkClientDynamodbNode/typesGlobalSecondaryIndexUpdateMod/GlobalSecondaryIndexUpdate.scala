package typingsSlinky.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexUpdateMod

import typingsSlinky.awsSdkClientDynamodbNode.typesCreateGlobalSecondaryIndexActionMod.CreateGlobalSecondaryIndexAction
import typingsSlinky.awsSdkClientDynamodbNode.typesDeleteGlobalSecondaryIndexActionMod.DeleteGlobalSecondaryIndexAction
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalSecondaryIndexActionMod.UpdateGlobalSecondaryIndexAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSecondaryIndexUpdate extends js.Object {
  /**
    * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
    */
  var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.native
  /**
    * <p>The name of an existing global secondary index to be removed.</p>
    */
  var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.native
  /**
    * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
    */
  var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.native
}

object GlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(): GlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSecondaryIndexUpdate]
  }
  @scala.inline
  implicit class GlobalSecondaryIndexUpdateOps[Self <: GlobalSecondaryIndexUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CreateGlobalSecondaryIndexAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: DeleteGlobalSecondaryIndexAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: UpdateGlobalSecondaryIndexAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.undefined)
        ret
    }
  }
  
}

