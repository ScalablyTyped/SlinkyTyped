package typingsSlinky.openseadragon.mod

import typingsSlinky.openseadragon.AnonAnimationTime
import typingsSlinky.openseadragon.AnonTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "Spring")
@js.native
class Spring protected () extends js.Object {
  def this(options: AnonAnimationTime) = this()
  var animationTime: Double = js.native
  var current: AnonTime = js.native
  var springStiffness: Double = js.native
  var start: AnonTime = js.native
  def isAtTargetValue(): Boolean = js.native
  def resetTo(target: Double): Unit = js.native
  def shiftBy(delta: Double): Unit = js.native
  def springTo(target: Double): Unit = js.native
  def update(): Unit = js.native
}

