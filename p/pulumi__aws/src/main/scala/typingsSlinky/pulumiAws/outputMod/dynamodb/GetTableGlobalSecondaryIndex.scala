package typingsSlinky.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableGlobalSecondaryIndex extends js.Object {
  var hashKey: String = js.native
  /**
    * The name of the DynamoDB table.
    */
  var name: String = js.native
  var nonKeyAttributes: js.Array[String] = js.native
  var projectionType: String = js.native
  var rangeKey: String = js.native
  var readCapacity: Double = js.native
  var writeCapacity: Double = js.native
}

object GetTableGlobalSecondaryIndex {
  @scala.inline
  def apply(
    hashKey: String,
    name: String,
    nonKeyAttributes: js.Array[String],
    projectionType: String,
    rangeKey: String,
    readCapacity: Double,
    writeCapacity: Double
  ): GetTableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonKeyAttributes = nonKeyAttributes.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any], readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableGlobalSecondaryIndex]
  }
  @scala.inline
  implicit class GetTableGlobalSecondaryIndexOps[Self <: GetTableGlobalSecondaryIndex] (val x: Self) extends AnyVal {
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
    def withNonKeyAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonKeyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionType")(value.asInstanceOf[js.Any])
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
    def withWriteCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCapacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

