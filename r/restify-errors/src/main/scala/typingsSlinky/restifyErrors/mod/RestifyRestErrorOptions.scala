package typingsSlinky.restifyErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestifyRestErrorOptions extends RestifyHttpErrorOptions {
  
  var restCode: js.UndefOr[String] = js.native
}
object RestifyRestErrorOptions {
  
  @scala.inline
  def apply(): RestifyRestErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestifyRestErrorOptions]
  }
  
  @scala.inline
  implicit class RestifyRestErrorOptionsOps[Self <: RestifyRestErrorOptions] (val x: Self) extends AnyVal {
    
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
    def setRestCode(value: String): Self = this.set("restCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestCode: Self = this.set("restCode", js.undefined)
  }
}
