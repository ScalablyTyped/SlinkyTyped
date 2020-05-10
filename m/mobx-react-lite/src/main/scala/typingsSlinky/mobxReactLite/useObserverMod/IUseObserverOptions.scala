package typingsSlinky.mobxReactLite.useObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUseObserverOptions extends js.Object {
  var useForceUpdate: js.UndefOr[ForceUpdateHook] = js.native
}

object IUseObserverOptions {
  @scala.inline
  def apply(): IUseObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUseObserverOptions]
  }
  @scala.inline
  implicit class IUseObserverOptionsOps[Self <: IUseObserverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseForceUpdate(value: () => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForceUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUseForceUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForceUpdate")(js.undefined)
        ret
    }
  }
  
}

