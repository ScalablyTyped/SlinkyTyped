package typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexUpdateMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalSecondaryIndexActionMod.UnmarshalledCreateGlobalSecondaryIndexAction
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteGlobalSecondaryIndexActionMod.UnmarshalledDeleteGlobalSecondaryIndexAction
import typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalSecondaryIndexActionMod.UnmarshalledUpdateGlobalSecondaryIndexAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlobalSecondaryIndexUpdate extends GlobalSecondaryIndexUpdate {
  /**
    * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
    */
  @JSName("Create")
  var Create_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledCreateGlobalSecondaryIndexAction] = js.native
  /**
    * <p>The name of an existing global secondary index to be removed.</p>
    */
  @JSName("Delete")
  var Delete_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledDeleteGlobalSecondaryIndexAction] = js.native
  /**
    * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
    */
  @JSName("Update")
  var Update_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledUpdateGlobalSecondaryIndexAction] = js.native
}

object UnmarshalledGlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(): UnmarshalledGlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexUpdate]
  }
  @scala.inline
  implicit class UnmarshalledGlobalSecondaryIndexUpdateOps[Self <: UnmarshalledGlobalSecondaryIndexUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: UnmarshalledCreateGlobalSecondaryIndexAction): Self = {
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
    def withDelete(value: UnmarshalledDeleteGlobalSecondaryIndexAction): Self = {
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
    def withUpdate(value: UnmarshalledUpdateGlobalSecondaryIndexAction): Self = {
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

