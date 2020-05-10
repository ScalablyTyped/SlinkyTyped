package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueSuggestion extends js.Object {
  val IsFact: Boolean = js.native
  val Quality: Double = js.native
  val TypedValue: ITypedValue = js.native
  def Clone(): IPropertyValueSuggestion = js.native
}

object IPropertyValueSuggestion {
  @scala.inline
  def apply(Clone: () => IPropertyValueSuggestion, IsFact: Boolean, Quality: Double, TypedValue: ITypedValue): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsFact = IsFact.asInstanceOf[js.Any], Quality = Quality.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
  @scala.inline
  implicit class IPropertyValueSuggestionOps[Self <: IPropertyValueSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IPropertyValueSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypedValue(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

