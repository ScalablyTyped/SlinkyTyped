package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var aggregateValue: js.UndefOr[String] = js.undefined
  var doubleValue: js.UndefOr[Double] = js.undefined
  var identifierValue: js.UndefOr[String] = js.undefined
  var nameList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.NamePart.AsObject
  ]
  var negativeIntValue: js.UndefOr[Double] = js.undefined
  var positiveIntValue: js.UndefOr[Double] = js.undefined
  var stringValue: scala.scalajs.js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    nameList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.NamePart.AsObject
    ],
    stringValue: scala.scalajs.js.typedarray.Uint8Array | String,
    aggregateValue: String = null,
    doubleValue: Int | Double = null,
    identifierValue: String = null,
    negativeIntValue: Int | Double = null,
    positiveIntValue: Int | Double = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(nameList = nameList.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    if (aggregateValue != null) __obj.updateDynamic("aggregateValue")(aggregateValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (identifierValue != null) __obj.updateDynamic("identifierValue")(identifierValue.asInstanceOf[js.Any])
    if (negativeIntValue != null) __obj.updateDynamic("negativeIntValue")(negativeIntValue.asInstanceOf[js.Any])
    if (positiveIntValue != null) __obj.updateDynamic("positiveIntValue")(positiveIntValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

