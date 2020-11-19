package typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexInfoMod.GlobalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexInfoMod.LocalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.SSEDescription
import typingsSlinky.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.TimeToLiveDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var SSEDescription: js.UndefOr[typingsSlinky.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.SSEDescription] = js.native
  
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.native
  
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  var TimeToLiveDescription: js.UndefOr[
    typingsSlinky.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.TimeToLiveDescription
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = this.set("GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexesIterable(value: js.Iterable[GlobalSecondaryIndexInfo]): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexInfo] | js.Iterable[GlobalSecondaryIndexInfo]): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = this.set("LocalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setLocalSecondaryIndexesIterable(value: js.Iterable[LocalSecondaryIndexInfo]): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexInfo] | js.Iterable[LocalSecondaryIndexInfo]): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("LocalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setSSEDescription(value: SSEDescription): Self = this.set("SSEDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEDescription: Self = this.set("SSEDescription", js.undefined)
    
    @scala.inline
    def setStreamDescription(value: StreamSpecification): Self = this.set("StreamDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamDescription: Self = this.set("StreamDescription", js.undefined)
    
    @scala.inline
    def setTimeToLiveDescription(value: TimeToLiveDescription): Self = this.set("TimeToLiveDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLiveDescription: Self = this.set("TimeToLiveDescription", js.undefined)
  }
}
