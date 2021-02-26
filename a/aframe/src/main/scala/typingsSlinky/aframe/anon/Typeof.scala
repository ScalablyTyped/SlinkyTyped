package typingsSlinky.aframe.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.aframe.aframeBooleans.`false`
import typingsSlinky.std.Record
import typingsSlinky.tweenjsTweenJs.anon.Back
import typingsSlinky.tweenjsTweenJs.anon.Bezier
import typingsSlinky.tweenjsTweenJs.mod.Group
import typingsSlinky.tweenjsTweenJs.mod.Tween
import typingsSlinky.tweenjsTweenJs.mod.UnknownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeof extends StObject {
  
  var Easing: Back = js.native
  
  var Group: Instantiable0[typingsSlinky.tweenjsTweenJs.mod.Group] = js.native
  
  var Interpolation: Bezier = js.native
  
  var Sequence: typingsSlinky.tweenjsTweenJs.anon.TypeofSequence with Instantiable0[typingsSlinky.tweenjsTweenJs.mod.Sequence] = js.native
  
  var Tween: Instantiable2[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ js.Any, 
    /* _group */ js.UndefOr[Group | `false`], 
    typingsSlinky.tweenjsTweenJs.mod.Tween[UnknownProps]
  ] = js.native
  
  var VERSION: String = js.native
  
  def add(tween: Tween[Record[String, _]]): Unit = js.native
  
  def getAll(): js.Array[Tween[Record[String, _]]] = js.native
  
  def nextId(): Double = js.native
  @JSName("nextId")
  var nextId_Original: js.Function0[Double] = js.native
  
  def now(): Double = js.native
  
  def remove(tween: Tween[Record[String, _]]): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}
