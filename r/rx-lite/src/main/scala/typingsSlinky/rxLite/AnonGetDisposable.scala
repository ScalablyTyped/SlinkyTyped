package typingsSlinky.rxLite

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetDisposable extends js.Object {
  def getDisposable(): IDisposable = js.native
}

object AnonGetDisposable {
  @scala.inline
  def apply(getDisposable: () => IDisposable): AnonGetDisposable = {
    val __obj = js.Dynamic.literal(getDisposable = js.Any.fromFunction0(getDisposable))
    __obj.asInstanceOf[AnonGetDisposable]
  }
  @scala.inline
  implicit class AnonGetDisposableOps[Self <: AnonGetDisposable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDisposable(value: () => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisposable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

