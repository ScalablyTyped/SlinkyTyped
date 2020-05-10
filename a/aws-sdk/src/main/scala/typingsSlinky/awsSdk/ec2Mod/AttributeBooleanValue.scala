package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeBooleanValue extends js.Object {
  /**
    * The attribute value. The valid values are true or false.
    */
  var Value: js.UndefOr[Boolean] = js.native
}

object AttributeBooleanValue {
  @scala.inline
  def apply(): AttributeBooleanValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeBooleanValue]
  }
  @scala.inline
  implicit class AttributeBooleanValueOps[Self <: AttributeBooleanValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

