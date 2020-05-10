package typingsSlinky.reactRouterNavigation

import typingsSlinky.reactRouterNavigation.reactRouterNavigationBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLazy extends js.Object {
  var `lazy`: `true` = js.native
}

object AnonLazy {
  @scala.inline
  def apply(`lazy`: `true`): AnonLazy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLazy]
  }
  @scala.inline
  implicit class AnonLazyOps[Self <: AnonLazy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLazy(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

