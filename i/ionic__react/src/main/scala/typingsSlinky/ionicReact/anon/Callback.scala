package typingsSlinky.ionicReact.anon

import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationCallbackOptions
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationLifecycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends StObject {
  
  var callback: AnimationLifecycle = js.native
  
  var opts: js.UndefOr[AnimationCallbackOptions] = js.native
}
object Callback {
  
  @scala.inline
  def apply(
    callback: (/* currentStep */ typingsSlinky.ionicCore.ionicCoreNumbers.`0` | typingsSlinky.ionicCore.ionicCoreNumbers.`1`, /* animation */ Animation) => Unit
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback))
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(
      value: (/* currentStep */ typingsSlinky.ionicCore.ionicCoreNumbers.`0` | typingsSlinky.ionicCore.ionicCoreNumbers.`1`, /* animation */ Animation) => Unit
    ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpts(value: AnimationCallbackOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
  }
}
