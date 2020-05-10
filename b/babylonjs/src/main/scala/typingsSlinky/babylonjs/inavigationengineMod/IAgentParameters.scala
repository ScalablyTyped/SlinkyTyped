package typingsSlinky.babylonjs.inavigationengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAgentParameters extends js.Object {
  /**
    * Defines how close a collision element must be before it is considered for steering behaviors. [Limits: > 0]
    */
  var collisionQueryRange: Double = js.native
  /**
    * Agent height. [Limit: > 0]
    */
  var height: Double = js.native
  /**
    *  Maximum allowed acceleration. [Limit: >= 0]
    */
  var maxAcceleration: Double = js.native
  /**
    * Maximum allowed speed. [Limit: >= 0]
    */
  var maxSpeed: Double = js.native
  /**
    * The path visibility optimization range. [Limit: > 0]
    */
  var pathOptimizationRange: Double = js.native
  /**
    *  Agent radius. [Limit: >= 0]
    */
  var radius: Double = js.native
  /**
    * How aggresive the agent manager should be at avoiding collisions with this agent. [Limit: >= 0]
    */
  var separationWeight: Double = js.native
}

object IAgentParameters {
  @scala.inline
  def apply(
    collisionQueryRange: Double,
    height: Double,
    maxAcceleration: Double,
    maxSpeed: Double,
    pathOptimizationRange: Double,
    radius: Double,
    separationWeight: Double
  ): IAgentParameters = {
    val __obj = js.Dynamic.literal(collisionQueryRange = collisionQueryRange.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxAcceleration = maxAcceleration.asInstanceOf[js.Any], maxSpeed = maxSpeed.asInstanceOf[js.Any], pathOptimizationRange = pathOptimizationRange.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], separationWeight = separationWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAgentParameters]
  }
  @scala.inline
  implicit class IAgentParametersOps[Self <: IAgentParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollisionQueryRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionQueryRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAcceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathOptimizationRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathOptimizationRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparationWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separationWeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

