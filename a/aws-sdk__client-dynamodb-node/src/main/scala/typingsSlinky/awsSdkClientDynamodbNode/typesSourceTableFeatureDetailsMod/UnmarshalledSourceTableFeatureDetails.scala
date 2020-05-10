package typingsSlinky.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.UnmarshalledGlobalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.UnmarshalledLocalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesSsedescriptionMod.UnmarshalledSSEDescription
import typingsSlinky.awsSdkClientDynamodbNode.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSourceTableFeatureDetails extends SourceTableFeatureDetails {
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexInfo]] = js.native
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexInfo]] = js.native
  /**
    * <p>The description of the server-side encryption status on the table when the backup was created.</p>
    */
  @JSName("SSEDescription")
  var SSEDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledSSEDescription] = js.native
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  @JSName("StreamDescription")
  var StreamDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledStreamSpecification] = js.native
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  @JSName("TimeToLiveDescription")
  var TimeToLiveDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.native
}

object UnmarshalledSourceTableFeatureDetails {
  @scala.inline
  def apply(): UnmarshalledSourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSourceTableFeatureDetails]
  }
  @scala.inline
  implicit class UnmarshalledSourceTableFeatureDetailsOps[Self <: UnmarshalledSourceTableFeatureDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalSecondaryIndexes(value: js.Array[UnmarshalledGlobalSecondaryIndexInfo]): Self = {
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
    def withLocalSecondaryIndexes(value: js.Array[UnmarshalledLocalSecondaryIndexInfo]): Self = {
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
    def withSSEDescription(value: UnmarshalledSSEDescription): Self = {
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
    def withStreamDescription(value: UnmarshalledStreamSpecification): Self = {
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
    def withTimeToLiveDescription(value: UnmarshalledTimeToLiveDescription): Self = {
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

