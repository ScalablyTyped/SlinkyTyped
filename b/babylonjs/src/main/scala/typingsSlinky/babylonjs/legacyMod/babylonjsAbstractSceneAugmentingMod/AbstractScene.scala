package typingsSlinky.babylonjs.legacyMod.babylonjsAbstractSceneAugmentingMod

import typingsSlinky.babylonjs.effectLayerMod.EffectLayer
import typingsSlinky.babylonjs.glowLayerMod.GlowLayer
import typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer
import typingsSlinky.babylonjs.layerMod.Layer
import typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem
import typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture
import typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe
import typingsSlinky.babylonjs.soundMod.Sound
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
    * The list of lens flare system added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var lensFlareSystems: js.Array[LensFlareSystem] = js.native
  /**
    * The list of procedural textures added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures
    */
  var proceduralTextures: js.Array[ProceduralTexture] = js.native
  /**
    * The list of reflection probes added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
    */
  var reflectionProbes: js.Array[ReflectionProbe] = js.native
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]] = js.native
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  def addEffectLayer(newEffectLayer: EffectLayer): Unit = js.native
  /**
    * Adds the given lens flare system to this scene
    * @param newLensFlareSystem The lens flare system to add
    */
  def addLensFlareSystem(newLensFlareSystem: LensFlareSystem): Unit = js.native
  /**
    * Adds the given reflection probe to this scene.
    * @param newReflectionProbe The reflection probe to add
    */
  def addReflectionProbe(newReflectionProbe: ReflectionProbe): Unit = js.native
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
    * Gets a lens flare system using its id
    * @param id defines the id to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByID(id: String): Nullable[LensFlareSystem] = js.native
  /**
    * Gets a lens flare system using its name
    * @param name defines the name to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByName(name: String): Nullable[LensFlareSystem] = js.native
  /**
    * Removes the given effect layer from this scene.
    * @param toRemove defines the effect layer to remove
    * @returns the index of the removed effect layer
    */
  def removeEffectLayer(toRemove: EffectLayer): Double = js.native
  /**
    * Removes the given lens flare system from this scene.
    * @param toRemove The lens flare system to remove
    * @returns The index of the removed lens flare system
    */
  def removeLensFlareSystem(toRemove: LensFlareSystem): Double = js.native
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
    addEffectLayer: EffectLayer => Unit,
    addLensFlareSystem: LensFlareSystem => Unit,
    addReflectionProbe: ReflectionProbe => Unit,
    effectLayers: js.Array[EffectLayer],
    getGlowLayerByName: String => Nullable[GlowLayer],
    getHighlightLayerByName: String => Nullable[HighlightLayer],
    getLensFlareSystemByID: String => Nullable[LensFlareSystem],
    getLensFlareSystemByName: String => Nullable[LensFlareSystem],
    layers: js.Array[Layer],
    lensFlareSystems: js.Array[LensFlareSystem],
    proceduralTextures: js.Array[ProceduralTexture],
    reflectionProbes: js.Array[ReflectionProbe],
    removeEffectLayer: EffectLayer => Double,
    removeLensFlareSystem: LensFlareSystem => Double,
    removeReflectionProbe: ReflectionProbe => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), effectLayers = effectLayers.asInstanceOf[js.Any], getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), layers = layers.asInstanceOf[js.Any], lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], proceduralTextures = proceduralTextures.asInstanceOf[js.Any], reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer), removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem), removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe))
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
    def withAddLensFlareSystem(value: LensFlareSystem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLensFlareSystem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddReflectionProbe(value: ReflectionProbe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReflectionProbe")(js.Any.fromFunction1(value))
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
    def withGetLensFlareSystemByID(value: String => Nullable[LensFlareSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLensFlareSystemByID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLensFlareSystemByName(value: String => Nullable[LensFlareSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLensFlareSystemByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLensFlareSystems(value: js.Array[LensFlareSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensFlareSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProceduralTextures(value: js.Array[ProceduralTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proceduralTextures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflectionProbes(value: js.Array[ReflectionProbe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectionProbes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEffectLayer(value: EffectLayer => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEffectLayer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveLensFlareSystem(value: LensFlareSystem => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLensFlareSystem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveReflectionProbe(value: ReflectionProbe => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeReflectionProbe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSounds(value: Nullable[js.Array[Sound]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sounds")(null)
        ret
    }
  }
  
}

