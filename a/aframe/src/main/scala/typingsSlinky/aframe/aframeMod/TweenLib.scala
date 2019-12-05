package typingsSlinky.aframe.aframeMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tweenDotJs.TWEEN.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenLib extends js.Object {
  var Easing: typingsSlinky.tweenDotJs.Easing = js.native
  var Group: Instantiable0[typingsSlinky.tweenDotJs.atTweenjsTweenDotJsMod.Group] = js.native
  var Interpolation: typingsSlinky.tweenDotJs.Interpolation = js.native
  var Tween: Instantiable0[typingsSlinky.tweenDotJs.atTweenjsTweenDotJsMod.Tween] = js.native
  def add(tween: Tween): Unit = js.native
  def getAll(): js.Array[Tween] = js.native
  def now(): Double = js.native
  def remove(tween: Tween): Unit = js.native
  def removeAll(): Unit = js.native
  def update(): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

