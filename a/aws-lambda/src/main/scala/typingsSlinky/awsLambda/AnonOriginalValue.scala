package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.lexMod.LexSlotResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOriginalValue extends js.Object {
  var originalValue: String = js.native
  // The following line only works in TypeScript Version: 3.0, The array should have at least 1 and no more than 5 items
  // resolutions: [LexSlotResolution, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?];
  var resolutions: js.Array[LexSlotResolution] = js.native
}

object AnonOriginalValue {
  @scala.inline
  def apply(originalValue: String, resolutions: js.Array[LexSlotResolution]): AnonOriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalValue]
  }
  @scala.inline
  implicit class AnonOriginalValueOps[Self <: AnonOriginalValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutions(value: js.Array[LexSlotResolution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

