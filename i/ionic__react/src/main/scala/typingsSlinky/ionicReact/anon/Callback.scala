package typingsSlinky.ionicReact.anon

import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationCallbackOptions
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
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
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    
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
    def setCallback(
      value: (/* currentStep */ typingsSlinky.ionicCore.ionicCoreNumbers.`0` | typingsSlinky.ionicCore.ionicCoreNumbers.`1`, /* animation */ Animation) => Unit
    ): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpts(value: AnimationCallbackOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
  }
}
