package typingsSlinky.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentPropsOptionsArrayValue extends js.Object {
  /**
    * ComponentPropsOptionsArray 设置的 key
    */
  var key: String = js.native
  /**
    * 用户填入的值
    */
  var value: Double | String = js.native
}

object ComponentPropsOptionsArrayValue {
  @scala.inline
  def apply(key: String, value: Double | String): ComponentPropsOptionsArrayValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsOptionsArrayValue]
  }
  @scala.inline
  implicit class ComponentPropsOptionsArrayValueOps[Self <: ComponentPropsOptionsArrayValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

