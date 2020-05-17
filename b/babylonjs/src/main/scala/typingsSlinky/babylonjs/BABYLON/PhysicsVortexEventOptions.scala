package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsVortexEventOptions extends js.Object {
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the treshold.
    */
  var centrifugalForceMultiplier: Double = js.native
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the treshold.
    */
  var centripetalForceMultiplier: Double = js.native
  /**
    * At which distance, relative to the radius the centripetal forces should kick in? Range: 0-1
    */
  var centripetalForceThreshold: Double = js.native
  /**
    * The height of the cylinder for the vortex.
    */
  var height: Double = js.native
  /**
    * The radius of the cylinder for the vortex
    */
  var radius: Double = js.native
  /**
    * The strenth of the vortex.
    */
  var strength: Double = js.native
  /**
    * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
    */
  var updraftForceMultiplier: Double = js.native
}

object PhysicsVortexEventOptions {
  @scala.inline
  def apply(
    centrifugalForceMultiplier: Double,
    centripetalForceMultiplier: Double,
    centripetalForceThreshold: Double,
    height: Double,
    radius: Double,
    strength: Double,
    updraftForceMultiplier: Double
  ): PhysicsVortexEventOptions = {
    val __obj = js.Dynamic.literal(centrifugalForceMultiplier = centrifugalForceMultiplier.asInstanceOf[js.Any], centripetalForceMultiplier = centripetalForceMultiplier.asInstanceOf[js.Any], centripetalForceThreshold = centripetalForceThreshold.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], updraftForceMultiplier = updraftForceMultiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsVortexEventOptions]
  }
  @scala.inline
  implicit class PhysicsVortexEventOptionsOps[Self <: PhysicsVortexEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentrifugalForceMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centrifugalForceMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCentripetalForceMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centripetalForceMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCentripetalForceThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centripetalForceThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdraftForceMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updraftForceMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

