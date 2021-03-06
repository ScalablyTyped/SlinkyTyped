package typingsSlinky.graphqlToolsWrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From extends js.Object {
  
  var from: js.Array[String] = js.native
  
  var to: js.Array[String] = js.native
}
object From {
  
  @scala.inline
  def apply(from: js.Array[String], to: js.Array[String]): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
    
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
    def setFromVarargs(value: String*): Self = this.set("from", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: js.Array[String]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
