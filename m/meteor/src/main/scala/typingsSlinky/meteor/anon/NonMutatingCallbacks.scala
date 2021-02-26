package typingsSlinky.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonMutatingCallbacks extends StObject {
  
  var nonMutatingCallbacks: js.UndefOr[Boolean] = js.native
}
object NonMutatingCallbacks {
  
  @scala.inline
  def apply(): NonMutatingCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMutatingCallbacks]
  }
  
  @scala.inline
  implicit class NonMutatingCallbacksMutableBuilder[Self <: NonMutatingCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonMutatingCallbacks(value: Boolean): Self = StObject.set(x, "nonMutatingCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonMutatingCallbacksUndefined: Self = StObject.set(x, "nonMutatingCallbacks", js.undefined)
  }
}
