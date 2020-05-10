package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiValueLegacyExtendedProperty extends Entity {
  // A collection of property values.
  var value: js.UndefOr[js.Array[String]] = js.native
}

object MultiValueLegacyExtendedProperty {
  @scala.inline
  def apply(): MultiValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiValueLegacyExtendedProperty]
  }
  @scala.inline
  implicit class MultiValueLegacyExtendedPropertyOps[Self <: MultiValueLegacyExtendedProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

