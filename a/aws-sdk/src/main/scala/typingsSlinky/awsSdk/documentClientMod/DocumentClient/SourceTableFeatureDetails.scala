package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTableFeatureDetails extends js.Object {
  /**
    * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection, and ProvisionedThroughput for the GSIs on the table at the time of backup. 
    */
  var GlobalSecondaryIndexes: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexes] = js.native
  /**
    * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
    */
  var LocalSecondaryIndexes: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexes] = js.native
  /**
    * The description of the server-side encryption status on the table when the backup was created.
    */
  var SSEDescription: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.SSEDescription] = js.native
  /**
    * Stream settings on the table when the backup was created.
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.native
  /**
    * Time to Live settings on the table when the backup was created.
    */
  var TimeToLiveDescription: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TimeToLiveDescription] = js.native
}

object SourceTableFeatureDetails {
  @scala.inline
  def apply(): SourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceTableFeatureDetails]
  }
  @scala.inline
  implicit class SourceTableFeatureDetailsOps[Self <: SourceTableFeatureDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalSecondaryIndexes(value: GlobalSecondaryIndexes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexes(value: LocalSecondaryIndexes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEDescription(value: SSEDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamDescription(value: StreamSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToLiveDescription(value: TimeToLiveDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLiveDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveDescription")(js.undefined)
        ret
    }
  }
  
}

