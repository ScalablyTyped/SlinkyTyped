package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShouldFadeIn extends js.Object {
  
  var shouldFadeIn: Boolean = js.native
}
object ShouldFadeIn {
  
  @scala.inline
  def apply(shouldFadeIn: Boolean): ShouldFadeIn = {
    val __obj = js.Dynamic.literal(shouldFadeIn = shouldFadeIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldFadeIn]
  }
  
  @scala.inline
  implicit class ShouldFadeInOps[Self <: ShouldFadeIn] (val x: Self) extends AnyVal {
    
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
    def setShouldFadeIn(value: Boolean): Self = this.set("shouldFadeIn", value.asInstanceOf[js.Any])
  }
}
