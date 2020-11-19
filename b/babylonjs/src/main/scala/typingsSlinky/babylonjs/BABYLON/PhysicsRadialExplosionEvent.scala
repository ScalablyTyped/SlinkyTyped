package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics radial explosion event
  */
@js.native
trait PhysicsRadialExplosionEvent extends js.Object {
  
  var _dataFetched: js.Any = js.native
  
  var _intersectsWithSphere: js.Any = js.native
  
  var _options: js.Any = js.native
  
  /*** Helpers ***/
  var _prepareSphere: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _sphere: js.Any = js.native
  
  /**
    * Disposes the sphere.
    * @param force Specifies if the sphere should be disposed by force
    */
  def dispose(): Unit = js.native
  def dispose(force: Boolean): Unit = js.native
  
  /**
    * Returns the data related to the radial explosion event (sphere).
    * @returns The radial explosion event data
    */
  def getData(): PhysicsRadialExplosionEventData = js.native
  
  /**
    * Returns the force and contact point of the impostor or false, if the impostor is not affected by the force/impulse.
    * @param impostor A physics imposter
    * @param origin the origin of the explosion
    * @returns {Nullable<PhysicsHitData>} A physics force and contact point, or null
    */
  def getImpostorHitData(impostor: PhysicsImpostor, origin: Vector3): Nullable[PhysicsHitData] = js.native
  
  /**
    * Triggers affecterd impostors callbacks
    * @param affectedImpostorsWithData defines the list of affected impostors (including associated data)
    */
  def triggerAffectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
}
