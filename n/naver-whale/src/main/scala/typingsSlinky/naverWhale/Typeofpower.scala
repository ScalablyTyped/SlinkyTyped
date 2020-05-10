package typingsSlinky.naverWhale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpower extends js.Object {
  def releaseKeepAwake(): Unit = js.native
  def requestKeepAwake(level: String): Unit = js.native
}

object Typeofpower {
  @scala.inline
  def apply(releaseKeepAwake: () => Unit, requestKeepAwake: String => Unit): Typeofpower = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
    __obj.asInstanceOf[Typeofpower]
  }
  @scala.inline
  implicit class TypeofpowerOps[Self <: Typeofpower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReleaseKeepAwake(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseKeepAwake")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestKeepAwake(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestKeepAwake")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

