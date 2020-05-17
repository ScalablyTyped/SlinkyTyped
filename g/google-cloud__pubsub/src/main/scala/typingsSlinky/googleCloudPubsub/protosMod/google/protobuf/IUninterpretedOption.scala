package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf

import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.INamePart
import typingsSlinky.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UninterpretedOption. */
@js.native
trait IUninterpretedOption extends js.Object {
  /** UninterpretedOption aggregateValue */
  var aggregateValue: js.UndefOr[String | Null] = js.native
  /** UninterpretedOption doubleValue */
  var doubleValue: js.UndefOr[Double | Null] = js.native
  /** UninterpretedOption identifierValue */
  var identifierValue: js.UndefOr[String | Null] = js.native
  /** UninterpretedOption name */
  var name: js.UndefOr[js.Array[INamePart] | Null] = js.native
  /** UninterpretedOption negativeIntValue */
  var negativeIntValue: js.UndefOr[Double | Long | String | Null] = js.native
  /** UninterpretedOption positiveIntValue */
  var positiveIntValue: js.UndefOr[Double | Long | String | Null] = js.native
  /** UninterpretedOption stringValue */
  var stringValue: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.native
}

object IUninterpretedOption {
  @scala.inline
  def apply(): IUninterpretedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUninterpretedOption]
  }
  @scala.inline
  implicit class IUninterpretedOptionOps[Self <: IUninterpretedOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAggregateValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateValue")(null)
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
    def withDoubleValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(null)
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
    def withIdentifierValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierValue")(null)
        ret
    }
    @scala.inline
    def withName(value: js.Array[INamePart]): Self = {
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
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withNegativeIntValue(value: Double | Long | String): Self = {
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
    def withNegativeIntValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeIntValue")(null)
        ret
    }
    @scala.inline
    def withPositiveIntValue(value: Double | Long | String): Self = {
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
    @scala.inline
    def withPositiveIntValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveIntValue")(null)
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
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(null)
        ret
    }
  }
  
}

