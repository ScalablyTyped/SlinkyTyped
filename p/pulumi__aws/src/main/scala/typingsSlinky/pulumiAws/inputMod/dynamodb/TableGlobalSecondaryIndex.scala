package typingsSlinky.pulumiAws.inputMod.dynamodb

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableGlobalSecondaryIndex extends js.Object {
  
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  var hashKey: Input[String] = js.native
  
  /**
    * The name of the index
    */
  var name: Input[String] = js.native
  
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: Input[String] = js.native
  
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var readCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var writeCapacity: js.UndefOr[Input[Double]] = js.native
}
object TableGlobalSecondaryIndex {
  
  @scala.inline
  def apply(hashKey: Input[String], name: Input[String], projectionType: Input[String]): TableGlobalSecondaryIndex = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHashKey(value: Input[String]): Self = this.set("hashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionType(value: Input[String]): Self = this.set("projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonKeyAttributesVarargs(value: Input[String]*): Self = this.set("nonKeyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNonKeyAttributes(value: Input[js.Array[Input[String]]]): Self = this.set("nonKeyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonKeyAttributes: Self = this.set("nonKeyAttributes", js.undefined)
    
    @scala.inline
    def setRangeKey(value: Input[String]): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeKey: Self = this.set("rangeKey", js.undefined)
    
    @scala.inline
    def setReadCapacity(value: Input[Double]): Self = this.set("readCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadCapacity: Self = this.set("readCapacity", js.undefined)
    
    @scala.inline
    def setWriteCapacity(value: Input[Double]): Self = this.set("writeCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteCapacity: Self = this.set("writeCapacity", js.undefined)
  }
}
