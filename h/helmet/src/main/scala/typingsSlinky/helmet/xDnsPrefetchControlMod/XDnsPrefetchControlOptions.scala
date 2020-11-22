package typingsSlinky.helmet.xDnsPrefetchControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDnsPrefetchControlOptions extends js.Object {
  
  var allow: js.UndefOr[Boolean] = js.native
}
object XDnsPrefetchControlOptions {
  
  @scala.inline
  def apply(): XDnsPrefetchControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XDnsPrefetchControlOptions]
  }
  
  @scala.inline
  implicit class XDnsPrefetchControlOptionsOps[Self <: XDnsPrefetchControlOptions] (val x: Self) extends AnyVal {
    
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
    def setAllow(value: Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
  }
}
