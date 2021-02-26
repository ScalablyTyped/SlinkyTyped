package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.subSurfaceConfigurationMod.SubSurfaceConfiguration
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  @js.native
  trait AbstractScene extends StObject {
    
    /** @hidden (Backing field) */
    var _prePassRenderer: Nullable[typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer] = js.native
    
    /** @hidden (Backing field) */
    var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
    
    /**
      * Adds the given effect layer to this scene
      * @param newEffectLayer defines the effect layer to add
      */
    def addEffectLayer(newEffectLayer: typingsSlinky.babylonjs.effectLayerMod.EffectLayer): Unit = js.native
    
    /**
      * Adds the given lens flare system to this scene
      * @param newLensFlareSystem The lens flare system to add
      */
    def addLensFlareSystem(newLensFlareSystem: typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem): Unit = js.native
    
    /**
      * Adds the given reflection probe to this scene.
      * @param newReflectionProbe The reflection probe to add
      */
    def addReflectionProbe(newReflectionProbe: typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe): Unit = js.native
    
    /**
      * Disables the prepass associated with the scene
      */
    def disablePrePassRenderer(): Unit = js.native
    
    /**
      * Disables the subsurface effect for prepass
      */
    def disableSubSurfaceForPrePass(): Unit = js.native
    
    /**
      * The list of effect layers (highlights/glow) added to the scene
      * @see https://doc.babylonjs.com/how_to/highlight_layer
      * @see https://doc.babylonjs.com/how_to/glow_layer
      */
    var effectLayers: js.Array[typingsSlinky.babylonjs.effectLayerMod.EffectLayer] = js.native
    
    /**
      * Enables the prepass and associates it with the scene
      * @returns the PrePassRenderer
      */
    def enablePrePassRenderer(): Nullable[typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer] = js.native
    
    /**
      * Enables the subsurface effect for prepass
      * @returns the SubSurfaceConfiguration
      */
    def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration] = js.native
    
    /**
      * Return a the first highlight layer of the scene with a given name.
      * @param name The name of the highlight layer to look for.
      * @return The highlight layer if found otherwise null.
      */
    def getGlowLayerByName(name: String): Nullable[typingsSlinky.babylonjs.glowLayerMod.GlowLayer] = js.native
    
    /**
      * Return a the first highlight layer of the scene with a given name.
      * @param name The name of the highlight layer to look for.
      * @return The highlight layer if found otherwise null.
      */
    def getHighlightLayerByName(name: String): Nullable[typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer] = js.native
    
    /**
      * Gets a lens flare system using its id
      * @param id defines the id to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemByID(id: String): Nullable[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem] = js.native
    
    /**
      * Gets a lens flare system using its name
      * @param name defines the name to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemByName(name: String): Nullable[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem] = js.native
    
    /**
      * The list of layers (background and foreground) of the scene
      */
    var layers: js.Array[typingsSlinky.babylonjs.layerMod.Layer] = js.native
    
    /**
      * The list of lens flare system added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      */
    var lensFlareSystems: js.Array[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem] = js.native
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer] = js.native
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      */
    var proceduralTextures: js.Array[typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture] = js.native
    
    /**
      * The list of reflection probes added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_reflection_probes
      */
    var reflectionProbes: js.Array[typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe] = js.native
    
    /**
      * Removes the given effect layer from this scene.
      * @param toRemove defines the effect layer to remove
      * @returns the index of the removed effect layer
      */
    def removeEffectLayer(toRemove: typingsSlinky.babylonjs.effectLayerMod.EffectLayer): Double = js.native
    
    /**
      * Removes the given lens flare system from this scene.
      * @param toRemove The lens flare system to remove
      * @returns The index of the removed lens flare system
      */
    def removeLensFlareSystem(toRemove: typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem): Double = js.native
    
    /**
      * Removes the given reflection probe from this scene.
      * @param toRemove The reflection probe to remove
      * @returns The index of the removed reflection probe
      */
    def removeReflectionProbe(toRemove: typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe): Double = js.native
    
    /**
      * The list of sounds used in the scene.
      */
    var sounds: Nullable[js.Array[typingsSlinky.babylonjs.soundMod.Sound]] = js.native
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
  }
  object AbstractScene {
    
    @scala.inline
    def apply(
      addEffectLayer: typingsSlinky.babylonjs.effectLayerMod.EffectLayer => Unit,
      addLensFlareSystem: typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem => Unit,
      addReflectionProbe: typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe => Unit,
      disablePrePassRenderer: () => Unit,
      disableSubSurfaceForPrePass: () => Unit,
      effectLayers: js.Array[typingsSlinky.babylonjs.effectLayerMod.EffectLayer],
      enablePrePassRenderer: () => Nullable[typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer],
      enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration],
      getGlowLayerByName: String => Nullable[typingsSlinky.babylonjs.glowLayerMod.GlowLayer],
      getHighlightLayerByName: String => Nullable[typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer],
      getLensFlareSystemByID: String => Nullable[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem],
      getLensFlareSystemByName: String => Nullable[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem],
      layers: js.Array[typingsSlinky.babylonjs.layerMod.Layer],
      lensFlareSystems: js.Array[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem],
      proceduralTextures: js.Array[typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture],
      reflectionProbes: js.Array[typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe],
      removeEffectLayer: typingsSlinky.babylonjs.effectLayerMod.EffectLayer => Double,
      removeLensFlareSystem: typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem => Double,
      removeReflectionProbe: typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe => Double
    ): typingsSlinky.babylonjs.indexMod.babylonjsAbstractSceneAugmentingMod.AbstractScene = {
      val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), effectLayers = effectLayers.asInstanceOf[js.Any], enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass), getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), layers = layers.asInstanceOf[js.Any], lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], proceduralTextures = proceduralTextures.asInstanceOf[js.Any], reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer), removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem), removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe))
      __obj.asInstanceOf[typingsSlinky.babylonjs.indexMod.babylonjsAbstractSceneAugmentingMod.AbstractScene]
    }
    
    @scala.inline
    implicit class AbstractSceneMutableBuilder[Self <: typingsSlinky.babylonjs.indexMod.babylonjsAbstractSceneAugmentingMod.AbstractScene] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEffectLayer(value: typingsSlinky.babylonjs.effectLayerMod.EffectLayer => Unit): Self = StObject.set(x, "addEffectLayer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddLensFlareSystem(value: typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem => Unit): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddReflectionProbe(value: typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe => Unit): Self = StObject.set(x, "addReflectionProbe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEffectLayers(value: js.Array[typingsSlinky.babylonjs.effectLayerMod.EffectLayer]): Self = StObject.set(x, "effectLayers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectLayersVarargs(value: typingsSlinky.babylonjs.effectLayerMod.EffectLayer*): Self = StObject.set(x, "effectLayers", js.Array(value :_*))
      
      @scala.inline
      def setEnablePrePassRenderer(value: () => Nullable[typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGlowLayerByName(value: String => Nullable[typingsSlinky.babylonjs.glowLayerMod.GlowLayer]): Self = StObject.set(x, "getGlowLayerByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHighlightLayerByName(value: String => Nullable[typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer]): Self = StObject.set(x, "getHighlightLayerByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLensFlareSystemByID(value: String => Nullable[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLensFlareSystemByName(value: String => Nullable[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayers(value: js.Array[typingsSlinky.babylonjs.layerMod.Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersVarargs(value: typingsSlinky.babylonjs.layerMod.Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setLensFlareSystems(value: js.Array[typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensFlareSystemsVarargs(value: typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value :_*))
      
      @scala.inline
      def setPrePassRenderer(value: Nullable[typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
      
      @scala.inline
      def setProceduralTextures(value: js.Array[typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture]): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProceduralTexturesVarargs(value: typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value :_*))
      
      @scala.inline
      def setReflectionProbes(value: js.Array[typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe]): Self = StObject.set(x, "reflectionProbes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectionProbesVarargs(value: typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe*): Self = StObject.set(x, "reflectionProbes", js.Array(value :_*))
      
      @scala.inline
      def setRemoveEffectLayer(value: typingsSlinky.babylonjs.effectLayerMod.EffectLayer => Double): Self = StObject.set(x, "removeEffectLayer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveLensFlareSystem(value: typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveReflectionProbe(value: typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe => Double): Self = StObject.set(x, "removeReflectionProbe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSounds(value: Nullable[js.Array[typingsSlinky.babylonjs.soundMod.Sound]]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundsNull: Self = StObject.set(x, "sounds", null)
      
      @scala.inline
      def setSoundsVarargs(value: typingsSlinky.babylonjs.soundMod.Sound*): Self = StObject.set(x, "sounds", js.Array(value :_*))
      
      @scala.inline
      def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
      
      @scala.inline
      def set_prePassRenderer(value: Nullable[typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      
      @scala.inline
      def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
    }
  }
}
