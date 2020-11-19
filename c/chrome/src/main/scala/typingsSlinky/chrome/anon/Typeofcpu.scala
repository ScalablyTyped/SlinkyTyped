package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.system.cpu.CpuInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetInfo(value: js.Function1[/* info */ CpuInfo, Unit] => Unit): Self = this.set("getInfo", js.Any.fromFunction1(value))
  }
}
