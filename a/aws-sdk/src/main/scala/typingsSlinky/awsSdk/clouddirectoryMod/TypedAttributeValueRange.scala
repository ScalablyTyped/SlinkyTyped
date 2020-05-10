package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedAttributeValueRange extends js.Object {
  /**
    * The inclusive or exclusive range end.
    */
  var EndMode: RangeMode = js.native
  /**
    * The attribute value to terminate the range at.
    */
  var EndValue: js.UndefOr[TypedAttributeValue] = js.native
  /**
    * The inclusive or exclusive range start.
    */
  var StartMode: RangeMode = js.native
  /**
    * The value to start the range at.
    */
  var StartValue: js.UndefOr[TypedAttributeValue] = js.native
}

object TypedAttributeValueRange {
  @scala.inline
  def apply(EndMode: RangeMode, StartMode: RangeMode): TypedAttributeValueRange = {
    val __obj = js.Dynamic.literal(EndMode = EndMode.asInstanceOf[js.Any], StartMode = StartMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedAttributeValueRange]
  }
  @scala.inline
  implicit class TypedAttributeValueRangeOps[Self <: TypedAttributeValueRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndMode(value: RangeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartMode(value: RangeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndValue(value: TypedAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValue(value: TypedAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartValue")(js.undefined)
        ret
    }
  }
  
}

