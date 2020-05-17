package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneOptimization extends js.Object {
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  var priority: Double = js.native
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer): Boolean = js.native
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  def getDescription(): String = js.native
}

object SceneOptimization {
  @scala.inline
  def apply(apply: (Scene, SceneOptimizer) => Boolean, getDescription: () => String, priority: Double): SceneOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneOptimization]
  }
  @scala.inline
  implicit class SceneOptimizationOps[Self <: SceneOptimization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: (Scene, SceneOptimizer) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

