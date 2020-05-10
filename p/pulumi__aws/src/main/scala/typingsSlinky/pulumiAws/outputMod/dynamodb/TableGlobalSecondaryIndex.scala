package typingsSlinky.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableGlobalSecondaryIndex extends js.Object {
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  var hashKey: String = js.native
  /**
    * The name of the index
    */
  var name: String = js.native
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: String = js.native
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: js.UndefOr[String] = js.native
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var readCapacity: js.UndefOr[Double] = js.native
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var writeCapacity: js.UndefOr[Double] = js.native
}

object TableGlobalSecondaryIndex {
  @scala.inline
  def apply(hashKey: String, name: String, projectionType: String): TableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableGlobalSecondaryIndex]
  }
  @scala.inline
  implicit class TableGlobalSecondaryIndexOps[Self <: TableGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonKeyAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonKeyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonKeyAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonKeyAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeKey(value: String): Self = {
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
    def withReadCapacity(value: Double): Self = {
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
    def withWriteCapacity(value: Double): Self = {
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

