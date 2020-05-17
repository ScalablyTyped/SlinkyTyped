package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.DiameterSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsRadialExplosionEventOptions extends js.Object {
  /**
    * The strenght of the force in correspondence to the distance of the affected object
    */
  var falloff: PhysicsRadialImpulseFalloff = js.native
  /**
    * The radius of the sphere for the radial explosion.
    */
  var radius: Double = js.native
  /**
    * Sphere options for the radial explosion.
    */
  var sphere: DiameterSegments = js.native
  /**
    * The strenth of the explosion.
    */
  var strength: Double = js.native
  /**
    * Sphere options for the radial explosion.
    */
  def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
}

object PhysicsRadialExplosionEventOptions {
  @scala.inline
  def apply(
    affectedImpostorsCallback: js.Array[PhysicsAffectedImpostorWithData] => Unit,
    falloff: PhysicsRadialImpulseFalloff,
    radius: Double,
    sphere: DiameterSegments,
    strength: Double
  ): PhysicsRadialExplosionEventOptions = {
    val __obj = js.Dynamic.literal(affectedImpostorsCallback = js.Any.fromFunction1(affectedImpostorsCallback), falloff = falloff.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsRadialExplosionEventOptions]
  }
  @scala.inline
  implicit class PhysicsRadialExplosionEventOptionsOps[Self <: PhysicsRadialExplosionEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedImpostorsCallback(value: js.Array[PhysicsAffectedImpostorWithData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedImpostorsCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFalloff(value: PhysicsRadialImpulseFalloff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falloff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSphere(value: DiameterSegments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

