package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveOpacity extends js.Object {
  var activeOpacity: Double = js.native
  var borderless: Boolean = js.native
}

object ActiveOpacity {
  @scala.inline
  def apply(activeOpacity: Double, borderless: Boolean): ActiveOpacity = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], borderless = borderless.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOpacity]
  }
  @scala.inline
  implicit class ActiveOpacityOps[Self <: ActiveOpacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

