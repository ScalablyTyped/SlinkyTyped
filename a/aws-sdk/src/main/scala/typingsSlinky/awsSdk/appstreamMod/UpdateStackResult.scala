package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStackResult extends js.Object {
  
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Stack] = js.native
}
object UpdateStackResult {
  
  @scala.inline
  def apply(): UpdateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackResult]
  }
  
  @scala.inline
  implicit class UpdateStackResultOps[Self <: UpdateStackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStack(value: Stack): Self = this.set("Stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("Stack", js.undefined)
  }
}
