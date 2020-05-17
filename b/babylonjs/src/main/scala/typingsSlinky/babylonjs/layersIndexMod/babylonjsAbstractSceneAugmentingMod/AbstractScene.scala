package typingsSlinky.babylonjs.layersIndexMod.babylonjsAbstractSceneAugmentingMod

import typingsSlinky.babylonjs.effectLayerMod.EffectLayer
import typingsSlinky.babylonjs.glowLayerMod.GlowLayer
import typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer
import typingsSlinky.babylonjs.layerMod.Layer
import typingsSlinky.babylonjs.typesMod.Nullable
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
    * The list of layers (background and foreground) of the scene
    */
  var layers: js.Array[Layer] = js.native
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  def addEffectLayer(newEffectLayer: EffectLayer): Unit = js.native
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getGlowLayerByName(name: String): Nullable[GlowLayer] = js.native
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getHighlightLayerByName(name: String): Nullable[HighlightLayer] = js.native
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
    getGlowLayerByName: String => Nullable[GlowLayer],
    getHighlightLayerByName: String => Nullable[HighlightLayer],
    layers: js.Array[Layer],
    removeEffectLayer: EffectLayer => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), effectLayers = effectLayers.asInstanceOf[js.Any], getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), layers = layers.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer))
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
    def withGetGlowLayerByName(value: String => Nullable[GlowLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGlowLayerByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHighlightLayerByName(value: String => Nullable[HighlightLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighlightLayerByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
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

