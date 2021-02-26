package typingsSlinky.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowedComponent extends StObject {
  
  var shadow: js.UndefOr[Double] = js.native
}
object ShadowedComponent {
  
  @scala.inline
  def apply(): ShadowedComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowedComponent]
  }
  
  @scala.inline
  implicit class ShadowedComponentMutableBuilder[Self <: ShadowedComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadow(value: Double): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
