package typingsSlinky.phantom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abort extends js.Object {
  
  def abort(): Unit = js.native
  
  def changeUrl(newUrl: String): Unit = js.native
  
  def setHeader(key: String, value: String): Unit = js.native
}
object Abort {
  
  @scala.inline
  def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
    __obj.asInstanceOf[Abort]
  }
  
  @scala.inline
  implicit class AbortOps[Self <: Abort] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeUrl(value: String => Unit): Self = this.set("changeUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = this.set("setHeader", js.Any.fromFunction2(value))
  }
}
