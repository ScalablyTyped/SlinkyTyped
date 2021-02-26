package typingsSlinky.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "RevoluteConstraint")
@js.native
class RevoluteConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: RevoluteConstraintOptions) = this()
  
  var angle: Double = js.native
  
  def disableMotor(): Unit = js.native
  
  def enableMotor(): Unit = js.native
  
  def getMotorSpeed(): Double = js.native
  
  var lowerLimit: Double = js.native
  
  var lowerLimitEnabled: Boolean = js.native
  
  var motorEnabled: Boolean = js.native
  
  def motorIsEnabled(): Boolean = js.native
  
  var motorMaxForce: Double = js.native
  
  var motorSpeed: Double = js.native
  
  def setLimits(lower: Double, upper: Double): Unit = js.native
  
  def setMotorSpeed(speed: Double): Unit = js.native
  
  var upperLimit: Double = js.native
  
  var upperLimitEnabled: Boolean = js.native
}
