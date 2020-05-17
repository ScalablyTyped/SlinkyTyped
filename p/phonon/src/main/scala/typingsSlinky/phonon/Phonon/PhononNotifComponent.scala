package typingsSlinky.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononNotifComponent extends js.Object {
  def hide(): PhononNotifComponent = js.native
  def setColor(color: PhononColor): PhononNotifComponent = js.native
  def show(): PhononNotifComponent = js.native
}

object PhononNotifComponent {
  @scala.inline
  def apply(
    hide: () => PhononNotifComponent,
    setColor: PhononColor => PhononNotifComponent,
    show: () => PhononNotifComponent
  ): PhononNotifComponent = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), setColor = js.Any.fromFunction1(setColor), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PhononNotifComponent]
  }
  @scala.inline
  implicit class PhononNotifComponentOps[Self <: PhononNotifComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => PhononNotifComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetColor(value: PhononColor => PhononNotifComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => PhononNotifComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

