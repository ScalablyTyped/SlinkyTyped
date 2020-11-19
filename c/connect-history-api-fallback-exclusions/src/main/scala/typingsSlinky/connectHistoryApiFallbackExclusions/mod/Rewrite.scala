package typingsSlinky.connectHistoryApiFallbackExclusions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rewrite extends js.Object {
  
  var from: js.RegExp = js.native
  
  var to: String | js.RegExp | RewriteTo = js.native
}
object Rewrite {
  
  @scala.inline
  def apply(from: js.RegExp, to: String | js.RegExp | RewriteTo): Rewrite = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rewrite]
  }
  
  @scala.inline
  implicit class RewriteOps[Self <: Rewrite] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: js.RegExp): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFunction1(value: /* context */ Context => String): Self = this.set("to", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToRegExp(value: js.RegExp): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String | js.RegExp | RewriteTo): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
