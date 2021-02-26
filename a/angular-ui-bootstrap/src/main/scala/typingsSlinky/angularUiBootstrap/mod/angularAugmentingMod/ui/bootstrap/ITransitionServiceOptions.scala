package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransitionServiceOptions extends StObject {
  
  var animation: js.UndefOr[Boolean] = js.native
}
object ITransitionServiceOptions {
  
  @scala.inline
  def apply(): ITransitionServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransitionServiceOptions]
  }
  
  @scala.inline
  implicit class ITransitionServiceOptionsMutableBuilder[Self <: ITransitionServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
