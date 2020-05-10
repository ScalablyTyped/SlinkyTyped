package typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod

import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexUpdateMod.GlobalSecondaryIndexUpdate
import typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesSsespecificationMod.SSESpecification
import typingsSlinky.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableInput extends InputTypesUnion {
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
    * <p>An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.</p>
    */
  var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition] | js.Iterable[AttributeDefinition]] = js.native
  /**
    * <p>An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:</p> <ul> <li> <p> <code>Create</code> - add a new global secondary index to the table.</p> </li> <li> <p> <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.</p> </li> <li> <p> <code>Delete</code> - remove a global secondary index from the table.</p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[js.Array[GlobalSecondaryIndexUpdate] | js.Iterable[GlobalSecondaryIndexUpdate]] = js.native
  /**
    * <p>The new provisioned throughput settings for the specified table or index.</p>
    */
  var ProvisionedThroughput: js.UndefOr[
    typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
  ] = js.native
  /**
    * <p>The new server-side encryption settings for the specified table.</p>
    */
  var SSESpecification: js.UndefOr[
    typingsSlinky.awsSdkClientDynamodbBrowser.typesSsespecificationMod.SSESpecification
  ] = js.native
  /**
    * <p>Represents the DynamoDB Streams configuration for the table.</p> <note> <p>You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream.</p> </note>
    */
  var StreamSpecification: js.UndefOr[
    typingsSlinky.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
  ] = js.native
  /**
    * <p>The name of the table to be updated.</p>
    */
  var TableName: String = js.native
}

object UpdateTableInput {
  @scala.inline
  def apply(TableName: String): UpdateTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableInput]
  }
  @scala.inline
  implicit class UpdateTableInputOps[Self <: UpdateTableInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
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
    def withAttributeDefinitionsIterable(value: js.Iterable[AttributeDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeDefinitions(value: js.Array[AttributeDefinition] | js.Iterable[AttributeDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexUpdatesIterable(value: js.Iterable[GlobalSecondaryIndexUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexUpdates(value: js.Array[GlobalSecondaryIndexUpdate] | js.Iterable[GlobalSecondaryIndexUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedThroughput(value: ProvisionedThroughput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedThroughput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(js.undefined)
        ret
    }
    @scala.inline
    def withSSESpecification(value: SSESpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSESpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSESpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSESpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamSpecification(value: StreamSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSpecification")(js.undefined)
        ret
    }
  }
  
}

