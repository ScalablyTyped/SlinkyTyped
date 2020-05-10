package typingsSlinky.babylonjs.reflectionProbeMod.babylonjsAbstractSceneAugmentingMod

import typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractScene extends js.Object {
  /**
    * The list of reflection probes added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
    */
  var reflectionProbes: js.Array[ReflectionProbe] = js.native
  /**
    * Adds the given reflection probe to this scene.
    * @param newReflectionProbe The reflection probe to add
    */
  def addReflectionProbe(newReflectionProbe: ReflectionProbe): Unit = js.native
  /**
    * Removes the given reflection probe from this scene.
    * @param toRemove The reflection probe to remove
    * @returns The index of the removed reflection probe
    */
  def removeReflectionProbe(toRemove: ReflectionProbe): Double = js.native
}

object AbstractScene {
  @scala.inline
  def apply(
    addReflectionProbe: ReflectionProbe => Unit,
    reflectionProbes: js.Array[ReflectionProbe],
    removeReflectionProbe: ReflectionProbe => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe))
    __obj.asInstanceOf[AbstractScene]
  }
  @scala.inline
  implicit class AbstractSceneOps[Self <: AbstractScene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddReflectionProbe(value: ReflectionProbe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReflectionProbe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReflectionProbes(value: js.Array[ReflectionProbe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectionProbes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveReflectionProbe(value: ReflectionProbe => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeReflectionProbe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

