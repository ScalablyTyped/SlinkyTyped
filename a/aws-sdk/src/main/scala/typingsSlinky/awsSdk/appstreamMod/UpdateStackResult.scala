package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStackResult extends StObject {
  
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
  implicit class UpdateStackResultMutableBuilder[Self <: UpdateStackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStack(value: Stack): Self = StObject.set(x, "Stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "Stack", js.undefined)
  }
}
