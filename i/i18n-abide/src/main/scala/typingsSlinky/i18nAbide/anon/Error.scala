package typingsSlinky.i18nAbide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  def error(msg: String): Unit = js.native
  
  def warn(msg: String): Unit = js.native
}
object Error {
  
  @scala.inline
  def apply(error: String => Unit, warn: String => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
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
    def setError(value: String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
