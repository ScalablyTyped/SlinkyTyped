package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetProperties extends js.Object {
  var hairlineWidth: Double = js.native
  def flatten[T /* <: String */](style: T): T = js.native
}

object StyleSheetProperties {
  @scala.inline
  def apply(flatten: js.Any => js.Any, hairlineWidth: Double): StyleSheetProperties = {
    val __obj = js.Dynamic.literal(flatten = js.Any.fromFunction1(flatten), hairlineWidth = hairlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetProperties]
  }
  @scala.inline
  implicit class StyleSheetPropertiesOps[Self <: StyleSheetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatten(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHairlineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hairlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

