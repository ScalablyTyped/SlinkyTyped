package typingsSlinky.antDesignReactNative.checkboxPropsTypeMod

import typingsSlinky.antDesignReactNative.AnonChecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnChangeParams extends js.Object {
  var target: AnonChecked = js.native
}

object OnChangeParams {
  @scala.inline
  def apply(target: AnonChecked): OnChangeParams = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
  @scala.inline
  implicit class OnChangeParamsOps[Self <: OnChangeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: AnonChecked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

