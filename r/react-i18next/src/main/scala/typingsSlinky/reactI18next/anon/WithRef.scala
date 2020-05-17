package typingsSlinky.reactI18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRef extends js.Object {
  var withRef: js.UndefOr[Boolean] = js.native
}

object WithRef {
  @scala.inline
  def apply(): WithRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithRef]
  }
  @scala.inline
  implicit class WithRefOps[Self <: WithRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(js.undefined)
        ret
    }
  }
  
}

