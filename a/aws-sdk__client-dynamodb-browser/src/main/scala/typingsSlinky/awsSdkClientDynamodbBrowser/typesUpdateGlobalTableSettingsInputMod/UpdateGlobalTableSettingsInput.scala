package typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod

import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
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
      typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
    ]) | (js.Iterable[
      typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
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
      typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
    ]) | (js.Iterable[
      typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
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
    def withGlobalTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$abortSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$abortSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(js.undefined)
        ret
    }
    @scala.inline
    def with$httpOptions(value: BrowserHttpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$httpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableGlobalSecondaryIndexSettingsUpdateIterable(value: js.Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalTableGlobalSecondaryIndexSettingsUpdate(
      value: js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate] | js.Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableGlobalSecondaryIndexSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableProvisionedWriteCapacityUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableProvisionedWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaSettingsUpdateIterable(value: js.Iterable[ReplicaSettingsUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicaSettingsUpdate(value: js.Array[ReplicaSettingsUpdate] | js.Iterable[ReplicaSettingsUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaSettingsUpdate")(js.undefined)
        ret
    }
  }
  
}

