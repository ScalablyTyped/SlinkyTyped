package typingsSlinky.fsExtraPromiseEs6.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoClose extends js.Object {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var fd: js.UndefOr[Double] = js.native
  
  var flags: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object AutoClose {
  
  @scala.inline
  def apply(): AutoClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoClose]
  }
  
  @scala.inline
  implicit class AutoCloseOps[Self <: AutoClose] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFd(value: Double): Self = this.set("fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFd: Self = this.set("fd", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
