package typingsSlinky.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanOptions extends StObject {
  
  var noAnimation: js.UndefOr[Boolean] = js.native
}
object PanOptions {
  
  @scala.inline
  def apply(): PanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanOptions]
  }
  
  @scala.inline
  implicit class PanOptionsMutableBuilder[Self <: PanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoAnimation(value: Boolean): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
  }
}
