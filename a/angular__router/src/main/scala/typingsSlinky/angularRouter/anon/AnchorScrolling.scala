package typingsSlinky.angularRouter.anon

import typingsSlinky.angularRouter.angularRouterStrings.disabled
import typingsSlinky.angularRouter.angularRouterStrings.enabled
import typingsSlinky.angularRouter.angularRouterStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorScrolling extends js.Object {
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.native
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.native
}

object AnchorScrolling {
  @scala.inline
  def apply(): AnchorScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorScrolling]
  }
  @scala.inline
  implicit class AnchorScrollingOps[Self <: AnchorScrolling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorScrolling(value: disabled | enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPositionRestoration(value: disabled | enabled | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPositionRestoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPositionRestoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPositionRestoration")(js.undefined)
        ret
    }
  }
  
}

