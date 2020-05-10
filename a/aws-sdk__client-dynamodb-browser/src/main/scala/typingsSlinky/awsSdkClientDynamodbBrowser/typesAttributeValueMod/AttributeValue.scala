package typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeValueMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
    */
  var B: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.native
  /**
    * <p>An attribute of type Boolean. For example:</p> <p> <code>"BOOL": true</code> </p>
    */
  var BOOL: js.UndefOr[Boolean] = js.native
  /**
    * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
    */
  var BS: js.UndefOr[
    (js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String]) | (js.Iterable[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String])
  ] = js.native
  /**
    * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
    */
  var L: js.UndefOr[js.Array[AttributeValue] | js.Iterable[AttributeValue]] = js.native
  /**
    * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
    */
  var M: js.UndefOr[
    StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  ] = js.native
  /**
    * <p>An attribute of type Number. For example:</p> <p> <code>"N": "123.45"</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  var N: js.UndefOr[String] = js.native
  /**
    * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  var NS: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>An attribute of type Null. For example:</p> <p> <code>"NULL": true</code> </p>
    */
  var NULL: js.UndefOr[Boolean] = js.native
  /**
    * <p>An attribute of type String. For example:</p> <p> <code>"S": "Hello"</code> </p>
    */
  var S: js.UndefOr[String] = js.native
  /**
    * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
    */
  var SS: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
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
    def withBArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("B")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("B")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = {
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
    def withBOOL(value: Boolean): Self = {
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
    def withBSIterable(value: js.Iterable[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBS(
      value: (js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String]) | (js.Iterable[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String])
    ): Self = {
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
    def withLIterable(value: js.Iterable[AttributeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: js.Array[AttributeValue] | js.Iterable[AttributeValue]): Self = {
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
    def withMIterable(value: js.Iterable[js.Tuple2[String, AttributeValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): Self = {
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
    def withN(value: String): Self = {
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
    def withNSIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNS(value: js.Array[String] | js.Iterable[String]): Self = {
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
    def withNULL(value: Boolean): Self = {
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
    def withS(value: String): Self = {
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
    def withSSIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS(value: js.Array[String] | js.Iterable[String]): Self = {
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

