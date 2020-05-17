package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsUpdraftEventOptions extends js.Object {
  /**
    * The height of the cylinder for the updraft.
    */
  var height: Double = js.native
  /**
    * The radius of the cylinder for the vortex
    */
  var radius: Double = js.native
  /**
    * The strenth of the updraft.
    */
  var strength: Double = js.native
  /**
    * The mode for the the updraft.
    */
  var updraftMode: PhysicsUpdraftMode = js.native
}

object PhysicsUpdraftEventOptions {
  @scala.inline
  def apply(height: Double, radius: Double, strength: Double, updraftMode: PhysicsUpdraftMode): PhysicsUpdraftEventOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], updraftMode = updraftMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsUpdraftEventOptions]
  }
  @scala.inline
  implicit class PhysicsUpdraftEventOptionsOps[Self <: PhysicsUpdraftEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUpdraftMode(value: PhysicsUpdraftMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updraftMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

