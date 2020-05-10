package typingsSlinky.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributeNames extends js.Object {
  var attributeNames: js.Any = js.native
  var attributeValues: js.Any = js.native
}

object AnonAttributeNames {
  @scala.inline
  def apply(attributeNames: js.Any, attributeValues: js.Any): AnonAttributeNames = {
    val __obj = js.Dynamic.literal(attributeNames = attributeNames.asInstanceOf[js.Any], attributeValues = attributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributeNames]
  }
  @scala.inline
  implicit class AnonAttributeNamesOps[Self <: AnonAttributeNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

