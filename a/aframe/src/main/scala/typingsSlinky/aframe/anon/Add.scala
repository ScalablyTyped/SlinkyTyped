package typingsSlinky.aframe.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.aframe.aframeBooleans.`false`
import typingsSlinky.std.Record
import typingsSlinky.tweenjsTweenJs.mod.Group
import typingsSlinky.tweenjsTweenJs.mod.Tween
import typingsSlinky.tweenjsTweenJs.mod.UnknownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends js.Object {
  
  var Easing: typingsSlinky.tweenjsTweenJs.anon.Back = js.native
  
  var Group: Instantiable0[typingsSlinky.tweenjsTweenJs.mod.Group] = js.native
  
  var Interpolation: typingsSlinky.tweenjsTweenJs.anon.Bezier = js.native
  
  var Sequence: typingsSlinky.tweenjsTweenJs.anon.TypeofSequence = js.native
  
  var Tween: Instantiable2[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ js.Any, 
    /* _group */ js.UndefOr[Group | `false`], 
    typingsSlinky.tweenjsTweenJs.mod.Tween[UnknownProps]
  ] = js.native
  
  var VERSION: String = js.native
  
  def add(tween: Tween[Record[String, _]]): Unit = js.native
  
  def getAll(): js.Array[Tween[Record[String, _]]] = js.native
  
  var nextId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sequence.nextId */ js.Any = js.native
  
  def now(): Double = js.native
  
  def remove(tween: Tween[Record[String, _]]): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}
