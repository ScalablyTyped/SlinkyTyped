package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPopActionPayload extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  // n: the number of routes to pop of the stack
  var n: js.UndefOr[Double] = js.native
  var prune: js.UndefOr[Boolean] = js.native
}

object NavigationPopActionPayload {
  @scala.inline
  def apply(): NavigationPopActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPopActionPayload]
  }
  @scala.inline
  implicit class NavigationPopActionPayloadOps[Self <: NavigationPopActionPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(js.undefined)
        ret
    }
    @scala.inline
    def withPrune(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(js.undefined)
        ret
    }
  }
  
}

