package typingsSlinky.physijs.Physijs

import typingsSlinky.physijs.anon.Target
import typingsSlinky.three.mod.Object3D
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene
  extends typingsSlinky.three.mod.Scene {
  
  def add(`object`: Object3D): this.type = js.native
  
  def addConstraint(constraint: Constraint): Unit = js.native
  def addConstraint(constraint: Constraint, show_marker: Boolean): Unit = js.native
  
  def dispatchEvent(event_name: String): Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: Target): Unit = js.native
  
  def execute(cmd: String, params: js.Any): Unit = js.native
  
  def onSimulationResume(): Unit = js.native
  
  def remove(`object`: Object3D): this.type = js.native
  
  def removeConstraint(constraint: Constraint): Unit = js.native
  
  def setFixedTimeStep(fixedTimeStep: Double): Unit = js.native
  
  def setGravity(gravity: Vector3): Unit = js.native
  
  def simulate(): Boolean = js.native
  def simulate(timeStep: js.UndefOr[scala.Nothing], maxSubSteps: Double): Boolean = js.native
  def simulate(timeStep: Double): Boolean = js.native
  def simulate(timeStep: Double, maxSubSteps: Double): Boolean = js.native
}
