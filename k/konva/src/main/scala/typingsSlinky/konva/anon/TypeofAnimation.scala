package typingsSlinky.konva.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.konva.animationMod.Animation
import typingsSlinky.konva.typesMod.AnimationFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimation
  extends Instantiable1[/* func */ AnimationFn, Animation]
     with Instantiable2[/* func */ AnimationFn, /* layers */ js.Any, Animation] {
  
  def _addAnimation(anim: js.Any): Unit = js.native
  
  def _animationLoop(): Unit = js.native
  
  def _handleAnimation(): Unit = js.native
  
  def _removeAnimation(anim: js.Any): Unit = js.native
  
  def _runFrames(): Unit = js.native
  
  var animIdCounter: Double = js.native
  
  var animRunning: Boolean = js.native
  
  var animations: js.Array[_] = js.native
}
