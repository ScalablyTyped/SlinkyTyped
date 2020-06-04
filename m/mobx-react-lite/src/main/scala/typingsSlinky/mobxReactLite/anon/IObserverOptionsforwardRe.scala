package typingsSlinky.mobxReactLite.anon

import typingsSlinky.mobxReactLite.mobxReactLiteBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mobx-react-lite.mobx-react-lite/dist/observer.IObserverOptions & {  forwardRef  :true} */
trait IObserverOptionsforwardRe extends js.Object {
  val forwardRef: js.UndefOr[Boolean with `true`] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForwardRef(value: Boolean with `true`): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardRef: Self = this.set("forwardRef", js.undefined)
  }
  
}

