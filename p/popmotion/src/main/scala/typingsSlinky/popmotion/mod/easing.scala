package typingsSlinky.popmotion.mod

import typingsSlinky.popmotionEasing.mod.Easing
import typingsSlinky.popmotionEasing.mod.EasingModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion", "easing")
@js.native
object easing extends js.Object {
  
  val anticipate: Easing = js.native
  
  val backIn: Easing = js.native
  
  val backInOut: Easing = js.native
  
  val backOut: Easing = js.native
  
  def bounceIn(p: Double): Double = js.native
  
  def bounceInOut(p: Double): Double = js.native
  
  def bounceOut(p: Double): Double = js.native
  
  val circIn: Easing = js.native
  
  val circInOut: Easing = js.native
  
  val circOut: Easing = js.native
  
  def createAnticipateEasing(power: Double): Easing = js.native
  
  def createBackIn(power: Double): Easing = js.native
  
  def createExpoIn(power: Double): Easing = js.native
  
  val createMirroredEasing: EasingModifier = js.native
  
  val createReversedEasing: EasingModifier = js.native
  
  def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* aX */ Double, Double] = js.native
  
  val easeIn: Easing = js.native
  
  val easeInOut: Easing = js.native
  
  val easeOut: Easing = js.native
  
  val linear: Easing = js.native
  
  val mirrored: EasingModifier = js.native
  
  val reversed: EasingModifier = js.native
}
