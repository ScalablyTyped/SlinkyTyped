package typingsSlinky.fullpageJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullPageJSGlobalOptions extends js.Object {
  
  var options: FullPageJsOptions = js.native
}
object FullPageJSGlobalOptions {
  
  @scala.inline
  def apply(options: FullPageJsOptions): FullPageJSGlobalOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullPageJSGlobalOptions]
  }
  
  @scala.inline
  implicit class FullPageJSGlobalOptionsOps[Self <: FullPageJSGlobalOptions] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: FullPageJsOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
