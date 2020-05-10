package typingsSlinky.babylonjs.effectLayerSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typingsSlinky.babylonjs.effectLayerMod.EffectLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractScene extends js.Object {
  /**
    * The list of effect layers (highlights/glow) added to the scene
    * @see http://doc.babylonjs.com/how_to/highlight_layer
    * @see http://doc.babylonjs.com/how_to/glow_layer
    */
  var effectLayers: js.Array[EffectLayer] = js.native
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  def addEffectLayer(newEffectLayer: EffectLayer): Unit = js.native
  /**
    * Removes the given effect layer from this scene.
    * @param toRemove defines the effect layer to remove
    * @returns the index of the removed effect layer
    */
  def removeEffectLayer(toRemove: EffectLayer): Double = js.native
}

object AbstractScene {
  @scala.inline
  def apply(
    addEffectLayer: EffectLayer => Unit,
    effectLayers: js.Array[EffectLayer],
    removeEffectLayer: EffectLayer => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), effectLayers = effectLayers.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer))
    __obj.asInstanceOf[AbstractScene]
  }
  @scala.inline
  implicit class AbstractSceneOps[Self <: AbstractScene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEffectLayer(value: EffectLayer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEffectLayer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEffectLayers(value: js.Array[EffectLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEffectLayer(value: EffectLayer => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEffectLayer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

