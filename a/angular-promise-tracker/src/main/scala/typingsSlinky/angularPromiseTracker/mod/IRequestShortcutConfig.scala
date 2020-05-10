package typingsSlinky.angularPromiseTracker.mod

import typingsSlinky.angularPromiseTracker.mod.promisetracker.PromiseTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestShortcutConfig extends js.Object {
  var tracker: js.UndefOr[PromiseTracker | js.Array[PromiseTracker]] = js.native
}

object IRequestShortcutConfig {
  @scala.inline
  def apply(): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
  @scala.inline
  implicit class IRequestShortcutConfigOps[Self <: IRequestShortcutConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTracker(value: PromiseTracker | js.Array[PromiseTracker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(js.undefined)
        ret
    }
  }
  
}

