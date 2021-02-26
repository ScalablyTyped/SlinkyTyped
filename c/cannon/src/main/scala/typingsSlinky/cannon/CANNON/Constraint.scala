package typingsSlinky.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constraint extends StObject {
  
  var bodyA: Body = js.native
  
  var bodyB: Body = js.native
  
  var collideConnected: Boolean = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  var equations: js.Array[_] = js.native
  
  var id: Double = js.native
  
  def update(): Unit = js.native
}
object Constraint {
  
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: () => Unit,
    enable: () => Unit,
    equations: js.Array[_],
    id: Double,
    update: () => Unit
  ): Constraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Constraint]
  }
  
  @scala.inline
  implicit class ConstraintMutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyA(value: Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyB(value: Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquations(value: js.Array[_]): Self = StObject.set(x, "equations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquationsVarargs(value: js.Any*): Self = StObject.set(x, "equations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
