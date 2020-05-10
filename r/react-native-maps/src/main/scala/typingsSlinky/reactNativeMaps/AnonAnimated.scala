package typingsSlinky.reactNativeMaps

import typingsSlinky.reactNativeMaps.mod.EdgePadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimated extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var edgePadding: js.UndefOr[EdgePadding] = js.native
}

object AnonAnimated {
  @scala.inline
  def apply(): AnonAnimated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnimated]
  }
  @scala.inline
  implicit class AnonAnimatedOps[Self <: AnonAnimated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgePadding(value: EdgePadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgePadding")(js.undefined)
        ret
    }
  }
  
}

