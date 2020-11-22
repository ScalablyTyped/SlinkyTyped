package typingsSlinky.popmotion

import typingsSlinky.popmotion.easingTypesMod.Easing
import typingsSlinky.popmotion.typesMod.Animation
import typingsSlinky.popmotion.typesMod.KeyframeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/generators/keyframes", JSImport.Namespace)
@js.native
object keyframesMod extends js.Object {
  
  def convertOffsetToTimes(offset: js.Array[Double], duration: Double): js.Array[Double] = js.native
  
  def defaultEasing(values: js.Array[_]): js.Array[Easing] = js.native
  def defaultEasing(values: js.Array[_], easing: Easing): js.Array[Easing] = js.native
  
  def defaultOffset(values: js.Array[_]): js.Array[Double] = js.native
  
  def keyframes[V](hasFromToEaseOffsetDuration: KeyframeOptions[Double]): Animation[Double | String] = js.native
}
