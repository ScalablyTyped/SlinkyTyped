package typingsSlinky.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :undefined} */
@js.native
trait Responsedataundefined
  extends /* others */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[js.Any] with js.UndefOr[scala.Nothing] = js.native
  
  var message: String = js.native
  
  var status: Boolean = js.native
}
object Responsedataundefined {
  
  @scala.inline
  def apply(data: js.UndefOr[js.Any] with js.UndefOr[scala.Nothing], message: String, status: Boolean): Responsedataundefined = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responsedataundefined]
  }
  
  @scala.inline
  implicit class ResponsedataundefinedOps[Self <: Responsedataundefined] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.UndefOr[js.Any] with js.UndefOr[scala.Nothing]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
