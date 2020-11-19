package typingsSlinky.aframe.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tweenJs.TWEEN.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenLib extends js.Object {
  
  var Easing: typingsSlinky.tweenJs.Easing = js.native
  
  var Group: Instantiable0[typingsSlinky.tweenJs.mod.Group] = js.native
  
  var Interpolation: typingsSlinky.tweenJs.Interpolation = js.native
  
  var Tween: Instantiable0[typingsSlinky.tweenJs.mod.Tween] = js.native
  
  def add(tween: Tween): Unit = js.native
  
  def getAll(): js.Array[Tween] = js.native
  
  def now(): Double = js.native
  
  def remove(tween: Tween): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}
