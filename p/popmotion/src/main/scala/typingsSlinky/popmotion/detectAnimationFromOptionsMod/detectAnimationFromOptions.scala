package typingsSlinky.popmotion.detectAnimationFromOptionsMod

import typingsSlinky.popmotion.anon.FnCall
import typingsSlinky.popmotion.anon.Typeofspring
import typingsSlinky.popmotion.typesMod.Animation
import typingsSlinky.popmotion.typesMod.DecayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/utils/detect-animation-from-options", "detectAnimationFromOptions")
@js.native
object detectAnimationFromOptions extends js.Object {
  
  def apply[T /* <: Options */](config: T): Typeofspring | FnCall | (js.Function1[
    /* hasVelocityFromPowerTimeConstantRestDeltaModifyTarget */ DecayOptions, 
    Animation[Double]
  ]) = js.native
}
