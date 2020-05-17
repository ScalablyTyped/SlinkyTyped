package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single AdjustmentValue */
@js.native
trait EnhancedCustomShapeAdjustmentValue extends js.Object {
  /** optional name, used by pptx import/export for custom shape presets */
  var Name: String = js.native
  var State: PropertyState = js.native
  /** the any can be of type long or double */
  var Value: js.Any = js.native
}

object EnhancedCustomShapeAdjustmentValue {
  @scala.inline
  def apply(Name: String, State: PropertyState, Value: js.Any): EnhancedCustomShapeAdjustmentValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeAdjustmentValue]
  }
  @scala.inline
  implicit class EnhancedCustomShapeAdjustmentValueOps[Self <: EnhancedCustomShapeAdjustmentValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: PropertyState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

