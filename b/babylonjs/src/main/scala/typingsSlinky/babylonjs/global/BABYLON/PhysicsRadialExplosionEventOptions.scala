package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.PhysicsAffectedImpostorWithData
import typingsSlinky.babylonjs.anon.DiameterSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PhysicsRadialExplosionEventOptions")
@js.native
class PhysicsRadialExplosionEventOptions ()
  extends typingsSlinky.babylonjs.BABYLON.PhysicsRadialExplosionEventOptions {
  /**
    * The strenght of the force in correspondence to the distance of the affected object
    */
  /* CompleteClass */
  override var falloff: typingsSlinky.babylonjs.BABYLON.PhysicsRadialImpulseFalloff = js.native
  /**
    * The radius of the sphere for the radial explosion.
    */
  /* CompleteClass */
  override var radius: Double = js.native
  /**
    * Sphere options for the radial explosion.
    */
  /* CompleteClass */
  override var sphere: DiameterSegments = js.native
  /**
    * The strenth of the explosion.
    */
  /* CompleteClass */
  override var strength: Double = js.native
  /**
    * Sphere options for the radial explosion.
    */
  /* CompleteClass */
  override def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
}

