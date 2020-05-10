package typingsSlinky.pulumiAws.tableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.dynamodb.TableAttribute
import typingsSlinky.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex
import typingsSlinky.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex
import typingsSlinky.pulumiAws.inputMod.dynamodb.TablePointInTimeRecovery
import typingsSlinky.pulumiAws.inputMod.dynamodb.TableServerSideEncryption
import typingsSlinky.pulumiAws.inputMod.dynamodb.TableTtl
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableState extends js.Object {
  /**
    * The arn of the table
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * List of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. Each attribute has two properties:
    */
  val attributes: js.UndefOr[Input[js.Array[Input[TableAttribute]]]] = js.native
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
    */
  val billingMode: js.UndefOr[Input[String]] = js.native
  /**
    * Describe a GSI for the table;
    * subject to the normal limits on the number of GSIs, projected
    * attributes, etc.
    */
  val globalSecondaryIndexes: js.UndefOr[Input[js.Array[Input[TableGlobalSecondaryIndex]]]] = js.native
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  val hashKey: js.UndefOr[Input[String]] = js.native
  /**
    * Describe an LSI on the table;
    * these can only be allocated *at creation* so you cannot change this
    * definition after you have created the resource.
    */
  val localSecondaryIndexes: js.UndefOr[Input[js.Array[Input[TableLocalSecondaryIndex]]]] = js.native
  /**
    * The name of the index
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Point-in-time recovery options.
    */
  val pointInTimeRecovery: js.UndefOr[Input[TablePointInTimeRecovery]] = js.native
  /**
    * The name of the range key; must be defined
    */
  val rangeKey: js.UndefOr[Input[String]] = js.native
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val readCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
    */
  val serverSideEncryption: js.UndefOr[Input[TableServerSideEncryption]] = js.native
  /**
    * The ARN of the Table Stream. Only available when `streamEnabled = true`
    */
  val streamArn: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether Streams are to be enabled (true) or disabled (false).
    */
  val streamEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
    * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
    * table name and this field is guaranteed to be unique.
    * It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`
    */
  val streamLabel: js.UndefOr[Input[String]] = js.native
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
    */
  val streamViewType: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to populate on the created table.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Defines ttl, has two properties, and can only be specified once:
    */
  val ttl: js.UndefOr[Input[TableTtl]] = js.native
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val writeCapacity: js.UndefOr[Input[Double]] = js.native
}

object TableState {
  @scala.inline
  def apply(): TableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableState]
  }
  @scala.inline
  implicit class TableStateOps[Self <: TableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: Input[js.Array[Input[TableAttribute]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexes(value: Input[js.Array[Input[TableGlobalSecondaryIndex]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withHashKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexes(value: Input[js.Array[Input[TableLocalSecondaryIndex]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPointInTimeRecovery(value: Input[TablePointInTimeRecovery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointInTimeRecovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointInTimeRecovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointInTimeRecovery")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReadCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: Input[TableServerSideEncryption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamLabel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamViewType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamViewType")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Input[TableTtl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCapacity")(js.undefined)
        ret
    }
  }
  
}

