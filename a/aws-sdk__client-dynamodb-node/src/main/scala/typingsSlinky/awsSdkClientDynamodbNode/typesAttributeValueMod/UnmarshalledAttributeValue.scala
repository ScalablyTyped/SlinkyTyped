package typingsSlinky.awsSdkClientDynamodbNode.typesAttributeValueMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAttributeValue extends AttributeValue {
  /**
    * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
    */
  @JSName("BS")
  var BS_UnmarshalledAttributeValue: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.native
  /**
    * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
    */
  @JSName("B")
  var B_UnmarshalledAttributeValue: js.UndefOr[js.typedarray.Uint8Array] = js.native
  /**
    * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
    */
  @JSName("L")
  var L_UnmarshalledAttributeValue: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.native
  /**
    * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
    */
  @JSName("M")
  var M_UnmarshalledAttributeValue: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.native
  /**
    * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  @JSName("NS")
  var NS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
    */
  @JSName("SS")
  var SS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledAttributeValue {
  @scala.inline
  def apply(): UnmarshalledAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAttributeValue]
  }
  @scala.inline
  implicit class UnmarshalledAttributeValueOps[Self <: UnmarshalledAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: js.typedarray.Uint8Array): Self = {
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
    def withBS(value: js.Array[js.typedarray.Uint8Array]): Self = {
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
    def withL(value: js.Array[UnmarshalledAttributeValue]): Self = {
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
    def withM(value: StringDictionary[UnmarshalledAttributeValue]): Self = {
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
    def withNS(value: js.Array[String]): Self = {
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
    def withSS(value: js.Array[String]): Self = {
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

