package typingsSlinky.mobxReactLite.observerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObserverOptions extends js.Object {
  val forwardRef: js.UndefOr[Boolean] = js.native
}

object IObserverOptions {
  @scala.inline
  def apply(): IObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObserverOptions]
  }
  @scala.inline
  implicit class IObserverOptionsOps[Self <: IObserverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(js.undefined)
        ret
    }
  }
  
}

