package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebcamMediaType extends js.Object {
  def Get(index: Double): String = js.native
  def GetCount(): Double = js.native
  def GetCurrent(): String = js.native
}

object WebcamMediaType {
  @scala.inline
  def apply(Get: Double => String, GetCount: () => Double, GetCurrent: () => String): WebcamMediaType = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
    __obj.asInstanceOf[WebcamMediaType]
  }
  @scala.inline
  implicit class WebcamMediaTypeOps[Self <: WebcamMediaType] (val x: Self) extends AnyVal {
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

