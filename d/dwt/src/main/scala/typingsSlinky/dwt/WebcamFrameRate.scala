package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebcamFrameRate extends js.Object {
  def Get(index: Double): String = js.native
  def GetCount(): Double = js.native
  def GetCurrent(): String = js.native
}

object WebcamFrameRate {
  @scala.inline
  def apply(Get: Double => String, GetCount: () => Double, GetCurrent: () => String): WebcamFrameRate = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
    __obj.asInstanceOf[WebcamFrameRate]
  }
  @scala.inline
  implicit class WebcamFrameRateOps[Self <: WebcamFrameRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCurrent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

