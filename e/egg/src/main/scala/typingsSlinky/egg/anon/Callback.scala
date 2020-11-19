package typingsSlinky.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  var callback: String = js.native
  
  var csrf: Boolean = js.native
  
  var limit: Double = js.native
  
  var whiteList: String | js.RegExp | (js.Array[String | js.RegExp]) = js.native
}
object Callback {
  
  @scala.inline
  def apply(
    callback: String,
    csrf: Boolean,
    limit: Double,
    whiteList: String | js.RegExp | (js.Array[String | js.RegExp])
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsrf(value: Boolean): Self = this.set("csrf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteListVarargs(value: (String | js.RegExp)*): Self = this.set("whiteList", js.Array(value :_*))
    
    @scala.inline
    def setWhiteListRegExp(value: js.RegExp): Self = this.set("whiteList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteList(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = this.set("whiteList", value.asInstanceOf[js.Any])
  }
}
