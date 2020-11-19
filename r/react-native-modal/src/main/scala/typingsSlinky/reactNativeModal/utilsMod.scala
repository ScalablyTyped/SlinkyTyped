package typingsSlinky.reactNativeModal

import typingsSlinky.reactNativeModal.anon.AnimationOut
import typingsSlinky.reactNativeModal.anon.From
import typingsSlinky.reactNativeModal.typesMod.Animations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-modal/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def buildAnimations(hasAnimationInAnimationOut: AnimationOut): Animations = js.native
  
  def initializeAnimations(): Unit = js.native
  
  def makeSlideTranslation(translationType: String, fromValue: Double, toValue: Double): From = js.native
  
  def reversePercentage(x: Double): Double = js.native
}
