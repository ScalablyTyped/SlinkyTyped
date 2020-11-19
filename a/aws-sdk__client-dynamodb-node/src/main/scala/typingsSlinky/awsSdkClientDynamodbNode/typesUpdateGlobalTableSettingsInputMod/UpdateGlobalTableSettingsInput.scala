package typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod

import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGlobalTableSettingsInput extends InputTypesUnion {
  
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
    (js.Array[
      typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
    ]) | (js.Iterable[
      typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
    ])
  ] = js.native
  
  /**
    * <p>The name of the global table</p>
    */
  var GlobalTableName: String = js.native
  
  /**
    * <p>AutoScaling settings for managing provisioned write capacity for the global table.</p>
    */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
    */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
  
  /**
    * <p>Represents the settings for a global table in a region that will be modified.</p>
    */
  var ReplicaSettingsUpdate: js.UndefOr[
    (js.Array[
      typingsSlinky.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
    ]) | (js.Iterable[
      typingsSlinky.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
    ])
  ] = js.native
}
object UpdateGlobalTableSettingsInput {
  
  @scala.inline
  def apply(GlobalTableName: String): UpdateGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
  }
  
  @scala.inline
  implicit class UpdateGlobalTableSettingsInputOps[Self <: UpdateGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    
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
    def setGlobalTableName(value: String): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = this.set("GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdateIterable(value: js.Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate]): Self = this.set("GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdate(
      value: js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate] | js.Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate]
    ): Self = this.set("GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableGlobalSecondaryIndexSettingsUpdate: Self = this.set("GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
    
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = this.set("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = this.set("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
    
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityUnits(value: Double): Self = this.set("GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableProvisionedWriteCapacityUnits: Self = this.set("GlobalTableProvisionedWriteCapacityUnits", js.undefined)
    
    @scala.inline
    def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = this.set("ReplicaSettingsUpdate", js.Array(value :_*))
    
    @scala.inline
    def setReplicaSettingsUpdateIterable(value: js.Iterable[ReplicaSettingsUpdate]): Self = this.set("ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaSettingsUpdate(value: js.Array[ReplicaSettingsUpdate] | js.Iterable[ReplicaSettingsUpdate]): Self = this.set("ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaSettingsUpdate: Self = this.set("ReplicaSettingsUpdate", js.undefined)
  }
}
