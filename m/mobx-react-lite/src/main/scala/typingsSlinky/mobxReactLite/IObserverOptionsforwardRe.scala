package typingsSlinky.mobxReactLite

import typingsSlinky.mobxReactLite.mobxReactLiteBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mobx-react-lite.mobx-react-lite/dist/observer.IObserverOptions & {  forwardRef  :true} */
@js.native
trait IObserverOptionsforwardRe extends js.Object {
  val forwardRef: js.UndefOr[Boolean with `true`] = js.native
}

object IObserverOptionsforwardRe {
  @scala.inline
  def apply(): IObserverOptionsforwardRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObserverOptionsforwardRe]
  }
  @scala.inline
  implicit class IObserverOptionsforwardReOps[Self <: IObserverOptionsforwardRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardRef(value: Boolean with `true`): Self = {
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

