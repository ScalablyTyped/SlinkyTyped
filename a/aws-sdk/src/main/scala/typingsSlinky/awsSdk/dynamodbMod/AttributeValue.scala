package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * An attribute of type Binary. For example:  "B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk" 
    */
  var B: js.UndefOr[BinaryAttributeValue] = js.native
  /**
    * An attribute of type Boolean. For example:  "BOOL": true 
    */
  var BOOL: js.UndefOr[BooleanAttributeValue] = js.native
  /**
    * An attribute of type Binary Set. For example:  "BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="] 
    */
  var BS: js.UndefOr[BinarySetAttributeValue] = js.native
  /**
    * An attribute of type List. For example:  "L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}] 
    */
  var L: js.UndefOr[ListAttributeValue] = js.native
  /**
    * An attribute of type Map. For example:  "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}} 
    */
  var M: js.UndefOr[MapAttributeValue] = js.native
  /**
    * An attribute of type Number. For example:  "N": "123.45"  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var N: js.UndefOr[NumberAttributeValue] = js.native
  /**
    * An attribute of type Number Set. For example:  "NS": ["42.2", "-19", "7.5", "3.14"]  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var NS: js.UndefOr[NumberSetAttributeValue] = js.native
  /**
    * An attribute of type Null. For example:  "NULL": true 
    */
  var NULL: js.UndefOr[NullAttributeValue] = js.native
  /**
    * An attribute of type String. For example:  "S": "Hello" 
    */
  var S: js.UndefOr[StringAttributeValue] = js.native
  /**
    * An attribute of type String Set. For example:  "SS": ["Giraffe", "Hippo" ,"Zebra"] 
    */
  var SS: js.UndefOr[StringSetAttributeValue] = js.native
}

object AttributeValue {
  @scala.inline
  def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  @scala.inline
  implicit class AttributeValueOps[Self <: AttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("B")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: BinaryAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("B")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("B")(js.undefined)
        ret
    }
    @scala.inline
    def withBOOL(value: BooleanAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBOOL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(js.undefined)
        ret
    }
    @scala.inline
    def withBS(value: BinarySetAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BS")(js.undefined)
        ret
    }
    @scala.inline
    def withL(value: ListAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: MapAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(js.undefined)
        ret
    }
    @scala.inline
    def withN(value: NumberAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("N")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("N")(js.undefined)
        ret
    }
    @scala.inline
    def withNS(value: NumberSetAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NS")(js.undefined)
        ret
    }
    @scala.inline
    def withNULL(value: NullAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NULL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNULL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NULL")(js.undefined)
        ret
    }
    @scala.inline
    def withS(value: StringAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S")(js.undefined)
        ret
    }
    @scala.inline
    def withSS(value: StringSetAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS")(js.undefined)
        ret
    }
  }
  
}

