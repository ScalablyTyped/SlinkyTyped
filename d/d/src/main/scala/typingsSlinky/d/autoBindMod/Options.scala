package typingsSlinky.d.autoBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var overwriteDefinition: js.UndefOr[Boolean] = js.native
  
  var resolveContext: js.UndefOr[js.Function1[/* context */ js.Any, _]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setOverwriteDefinition(value: Boolean): Self = this.set("overwriteDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteDefinition: Self = this.set("overwriteDefinition", js.undefined)
    
    @scala.inline
    def setResolveContext(value: /* context */ js.Any => _): Self = this.set("resolveContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResolveContext: Self = this.set("resolveContext", js.undefined)
  }
}
