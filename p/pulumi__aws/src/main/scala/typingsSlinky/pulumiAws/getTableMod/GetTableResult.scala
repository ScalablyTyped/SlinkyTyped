package typingsSlinky.pulumiAws.getTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.dynamodb.GetTableAttribute
import typingsSlinky.pulumiAws.outputMod.dynamodb.GetTableGlobalSecondaryIndex
import typingsSlinky.pulumiAws.outputMod.dynamodb.GetTableLocalSecondaryIndex
import typingsSlinky.pulumiAws.outputMod.dynamodb.GetTablePointInTimeRecovery
import typingsSlinky.pulumiAws.outputMod.dynamodb.GetTableServerSideEncryption
import typingsSlinky.pulumiAws.outputMod.dynamodb.GetTableTtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableResult extends js.Object {
  val arn: String = js.native
  val attributes: js.Array[GetTableAttribute] = js.native
  val billingMode: String = js.native
  val globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex] = js.native
  val hashKey: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex] = js.native
  val name: String = js.native
  val pointInTimeRecovery: GetTablePointInTimeRecovery = js.native
  val rangeKey: String = js.native
  val readCapacity: Double = js.native
  val serverSideEncryption: GetTableServerSideEncryption = js.native
  val streamArn: String = js.native
  val streamEnabled: Boolean = js.native
  val streamLabel: String = js.native
  val streamViewType: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val ttl: GetTableTtl = js.native
  val writeCapacity: Double = js.native
}

object GetTableResult {
  @scala.inline
  def apply(
    arn: String,
    attributes: js.Array[GetTableAttribute],
    billingMode: String,
    globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex],
    hashKey: String,
    id: String,
    localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex],
    name: String,
    pointInTimeRecovery: GetTablePointInTimeRecovery,
    rangeKey: String,
    readCapacity: Double,
    serverSideEncryption: GetTableServerSideEncryption,
    streamArn: String,
    streamEnabled: Boolean,
    streamLabel: String,
    streamViewType: String,
    tags: StringDictionary[js.Any],
    ttl: GetTableTtl,
    writeCapacity: Double
  ): GetTableResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], billingMode = billingMode.asInstanceOf[js.Any], globalSecondaryIndexes = globalSecondaryIndexes.asInstanceOf[js.Any], hashKey = hashKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localSecondaryIndexes = localSecondaryIndexes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pointInTimeRecovery = pointInTimeRecovery.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any], readCapacity = readCapacity.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any], streamEnabled = streamEnabled.asInstanceOf[js.Any], streamLabel = streamLabel.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableResult]
  }
  @scala.inline
  implicit class GetTableResultOps[Self <: GetTableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[GetTableAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexes(value: js.Array[GetTableGlobalSecondaryIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexes(value: js.Array[GetTableLocalSecondaryIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointInTimeRecovery(value: GetTablePointInTimeRecovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointInTimeRecovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: GetTableServerSideEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamViewType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: GetTableTtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCapacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

