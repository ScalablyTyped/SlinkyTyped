package typingsSlinky.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseXMLOptions extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
}
object ParseXMLOptions {
  
  @scala.inline
  def apply(): ParseXMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseXMLOptions]
  }
  
  @scala.inline
  implicit class ParseXMLOptionsOps[Self <: ParseXMLOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
  }
}
