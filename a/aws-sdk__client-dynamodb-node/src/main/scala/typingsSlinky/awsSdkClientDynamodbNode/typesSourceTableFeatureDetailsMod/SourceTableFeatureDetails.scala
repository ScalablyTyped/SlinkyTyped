package typingsSlinky.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.GlobalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.LocalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription
import typingsSlinky.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification
import typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTableFeatureDetails extends js.Object {
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndexInfo] | js.Iterable[GlobalSecondaryIndexInfo]] = js.native
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
    */
  var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndexInfo] | js.Iterable[LocalSecondaryIndexInfo]] = js.native
  /**
    * <p>The description of the server-side encryption status on the table when the backup was created.</p>
    */
  var SSEDescription: js.UndefOr[typingsSlinky.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription] = js.native
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.native
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  var TimeToLiveDescription: js.UndefOr[
    typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
  ] = js.native
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
    def withGlobalSecondaryIndexesIterable(value: js.Iterable[GlobalSecondaryIndexInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexInfo] | js.Iterable[GlobalSecondaryIndexInfo]): Self = {
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
    def withLocalSecondaryIndexesIterable(value: js.Iterable[LocalSecondaryIndexInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexInfo] | js.Iterable[LocalSecondaryIndexInfo]): Self = {
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

