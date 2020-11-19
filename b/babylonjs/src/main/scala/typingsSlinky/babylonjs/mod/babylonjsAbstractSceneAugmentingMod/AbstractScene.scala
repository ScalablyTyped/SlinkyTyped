package typingsSlinky.babylonjs.mod.babylonjsAbstractSceneAugmentingMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
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
    * The list of effect layers (highlights/glow) added to the scene
    * @see http://doc.babylonjs.com/how_to/highlight_layer
    * @see http://doc.babylonjs.com/how_to/glow_layer
    */
  var effectLayers: js.Array[EffectLayer] = js.native
  
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
  
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddEffectLayer(value: EffectLayer => Unit): Self = this.set("addEffectLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddLensFlareSystem(value: LensFlareSystem => Unit): Self = this.set("addLensFlareSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddReflectionProbe(value: ReflectionProbe => Unit): Self = this.set("addReflectionProbe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectLayersVarargs(value: EffectLayer*): Self = this.set("effectLayers", js.Array(value :_*))
    
    @scala.inline
    def setEffectLayers(value: js.Array[EffectLayer]): Self = this.set("effectLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGlowLayerByName(value: String => Nullable[GlowLayer]): Self = this.set("getGlowLayerByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHighlightLayerByName(value: String => Nullable[HighlightLayer]): Self = this.set("getHighlightLayerByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLensFlareSystemByID(value: String => Nullable[LensFlareSystem]): Self = this.set("getLensFlareSystemByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLensFlareSystemByName(value: String => Nullable[LensFlareSystem]): Self = this.set("getLensFlareSystemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLensFlareSystemsVarargs(value: LensFlareSystem*): Self = this.set("lensFlareSystems", js.Array(value :_*))
    
    @scala.inline
    def setLensFlareSystems(value: js.Array[LensFlareSystem]): Self = this.set("lensFlareSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProceduralTexturesVarargs(value: ProceduralTexture*): Self = this.set("proceduralTextures", js.Array(value :_*))
    
    @scala.inline
    def setProceduralTextures(value: js.Array[ProceduralTexture]): Self = this.set("proceduralTextures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflectionProbesVarargs(value: ReflectionProbe*): Self = this.set("reflectionProbes", js.Array(value :_*))
    
    @scala.inline
    def setReflectionProbes(value: js.Array[ReflectionProbe]): Self = this.set("reflectionProbes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEffectLayer(value: EffectLayer => Double): Self = this.set("removeEffectLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLensFlareSystem(value: LensFlareSystem => Double): Self = this.set("removeLensFlareSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveReflectionProbe(value: ReflectionProbe => Double): Self = this.set("removeReflectionProbe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSoundsVarargs(value: Sound*): Self = this.set("sounds", js.Array(value :_*))
    
    @scala.inline
    def setSounds(value: Nullable[js.Array[Sound]]): Self = this.set("sounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundsNull: Self = this.set("sounds", null)
  }
}
