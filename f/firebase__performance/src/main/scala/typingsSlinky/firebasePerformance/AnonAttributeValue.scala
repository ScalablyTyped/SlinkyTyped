package typingsSlinky.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributeValue extends js.Object {
  var attributeValue: String = js.native
}

object AnonAttributeValue {
  @scala.inline
  def apply(attributeValue: String): AnonAttributeValue = {
    val __obj = js.Dynamic.literal(attributeValue = attributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributeValue]
  }
  @scala.inline
  implicit class AnonAttributeValueOps[Self <: AnonAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

