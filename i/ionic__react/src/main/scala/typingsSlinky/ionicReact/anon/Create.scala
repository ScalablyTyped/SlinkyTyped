package typingsSlinky.ionicReact.anon

import typingsSlinky.ionicReact.createControllerComponentMod.OverlayBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends StObject {
  
  def create(options: OptionsType): js.Promise[OverlayType] = js.native
}
object Create {
  
  @scala.inline
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](create: OptionsType => js.Promise[OverlayType]): Create[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create[OptionsType, OverlayType]]
  }
  
  @scala.inline
  implicit class CreateMutableBuilder[Self <: Create[_, _], OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] (val x: Self with (Create[OptionsType, OverlayType])) extends AnyVal {
    
    @scala.inline
    def setCreate(value: OptionsType => js.Promise[OverlayType]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
