package typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var aggregateValue: js.UndefOr[String] = js.undefined
  var doubleValue: js.UndefOr[Double] = js.undefined
  var identifierValue: js.UndefOr[String] = js.undefined
  var nameList: js.Array[
    typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject
  ]
  var negativeIntValue: js.UndefOr[Double] = js.undefined
  var positiveIntValue: js.UndefOr[Double] = js.undefined
  var stringValue: js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    nameList: js.Array[
      typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject
    ],
    stringValue: js.typedarray.Uint8Array | String,
    aggregateValue: String = null,
    doubleValue: js.UndefOr[Double] = js.undefined,
    identifierValue: String = null,
    negativeIntValue: js.UndefOr[Double] = js.undefined,
    positiveIntValue: js.UndefOr[Double] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal(nameList = nameList.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    if (aggregateValue != null) __obj.updateDynamic("aggregateValue")(aggregateValue.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue.get.asInstanceOf[js.Any])
    if (identifierValue != null) __obj.updateDynamic("identifierValue")(identifierValue.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeIntValue)) __obj.updateDynamic("negativeIntValue")(negativeIntValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positiveIntValue)) __obj.updateDynamic("positiveIntValue")(positiveIntValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

