package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsipdump extends js.Object {
  
  def send(stag: String): Double = js.native
}
object Typeofsipdump {
  
  @scala.inline
  def apply(send: String => Double): Typeofsipdump = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Typeofsipdump]
  }
  
  @scala.inline
  implicit class TypeofsipdumpOps[Self <: Typeofsipdump] (val x: Self) extends AnyVal {
    
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
    def setSend(value: String => Double): Self = this.set("send", js.Any.fromFunction1(value))
  }
}
