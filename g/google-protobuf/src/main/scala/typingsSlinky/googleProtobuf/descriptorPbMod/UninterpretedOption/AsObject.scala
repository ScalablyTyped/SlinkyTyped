package typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var aggregateValue: js.UndefOr[String] = js.native
  var doubleValue: js.UndefOr[Double] = js.native
  var identifierValue: js.UndefOr[String] = js.native
  var nameList: js.Array[
    typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject
  ] = js.native
  var negativeIntValue: js.UndefOr[Double] = js.native
  var positiveIntValue: js.UndefOr[Double] = js.native
  var stringValue: js.typedarray.Uint8Array | String = js.native
}

object AsObject {
  @scala.inline
  def apply(
    nameList: js.Array[
      typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject
    ],
    stringValue: js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(nameList = nameList.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameList(
      value: js.Array[
          typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValueUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregateValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifierValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifierValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeIntValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeIntValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeIntValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveIntValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveIntValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveIntValue")(js.undefined)
        ret
    }
  }
  
}

