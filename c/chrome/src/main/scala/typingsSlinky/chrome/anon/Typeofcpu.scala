package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.system.cpu.CpuInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcpu extends js.Object {
  def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = js.native
}

object Typeofcpu {
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ CpuInfo, Unit] => Unit): Typeofcpu = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
    __obj.asInstanceOf[Typeofcpu]
  }
  @scala.inline
  implicit class TypeofcpuOps[Self <: Typeofcpu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInfo(value: js.Function1[/* info */ CpuInfo, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

