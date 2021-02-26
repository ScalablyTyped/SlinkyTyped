package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractActionManagerMod.AbstractActionManager
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.animationGroupMod.AnimationGroup
import typingsSlinky.babylonjs.animationMod.Animation
import typingsSlinky.babylonjs.assetContainerMod.AssetContainer
import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.effectLayerMod.EffectLayer
import typingsSlinky.babylonjs.geometryMod.Geometry
import typingsSlinky.babylonjs.glowLayerMod.GlowLayer
import typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.layerMod.Layer
import typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem
import typingsSlinky.babylonjs.lightMod.Light
import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.morphTargetManagerMod.MorphTargetManager
import typingsSlinky.babylonjs.multiMaterialMod.MultiMaterial
import typingsSlinky.babylonjs.nodeMod.Node
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer
import typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture
import typingsSlinky.babylonjs.reflectionProbeMod.ReflectionProbe
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.skeletonMod.Skeleton
import typingsSlinky.babylonjs.soundMod.Sound
import typingsSlinky.babylonjs.subSurfaceConfigurationMod.SubSurfaceConfiguration
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractSceneMod {
  
  @JSImport("babylonjs/abstractScene", "AbstractScene")
  @js.native
  abstract class AbstractScene () extends StObject {
    
    /** @hidden */
    var _environmentTexture: Nullable[BaseTexture] = js.native
    
    /** @hidden (Backing field) */
    var _prePassRenderer: Nullable[PrePassRenderer] = js.native
    
    /** @hidden (Backing field) */
    var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
    
    /**
      * ActionManagers available on the scene.
      */
    var actionManagers: js.Array[AbstractActionManager] = js.native
    
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
      * All of the animation groups added to this scene
      * @see https://doc.babylonjs.com/how_to/group
      */
    var animationGroups: js.Array[AnimationGroup] = js.native
    
    /**
      * Gets a list of Animations associated with the scene
      */
    var animations: js.Array[Animation] = js.native
    
    /** All of the cameras added to this scene
      * @see https://doc.babylonjs.com/babylon101/cameras
      */
    var cameras: js.Array[Camera] = js.native
    
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
    var effectLayers: js.Array[EffectLayer] = js.native
    
    /**
      * Enables the prepass and associates it with the scene
      * @returns the PrePassRenderer
      */
    def enablePrePassRenderer(): Nullable[PrePassRenderer] = js.native
    
    /**
      * Enables the subsurface effect for prepass
      * @returns the SubSurfaceConfiguration
      */
    def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration] = js.native
    
    /**
      * Texture used in all pbr material as the reflection texture.
      * As in the majority of the scene they are the same (exception for multi room and so on),
      * this is easier to reference from here than from all the materials.
      */
    def environmentTexture: Nullable[BaseTexture] = js.native
    def environmentTexture_=(value: Nullable[BaseTexture]): Unit = js.native
    
    /**
      * The list of geometries used in the scene.
      */
    var geometries: js.Array[Geometry] = js.native
    
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
      * @returns all meshes, lights, cameras, transformNodes and bones
      */
    def getNodes(): js.Array[Node] = js.native
    
    /**
      * The list of layers (background and foreground) of the scene
      */
    var layers: js.Array[Layer] = js.native
    
    /**
      * The list of lens flare system added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      */
    var lensFlareSystems: js.Array[LensFlareSystem] = js.native
    
    /**
      * All of the lights added to this scene
      * @see https://doc.babylonjs.com/babylon101/lights
      */
    var lights: js.Array[Light] = js.native
    
    /**
      * All of the materials added to this scene
      * In the context of a Scene, it is not supposed to be modified manually.
      * Any addition or removal should be done using the addMaterial and removeMaterial Scene methods.
      * Note also that the order of the Material within the array is not significant and might change.
      * @see https://doc.babylonjs.com/babylon101/materials
      */
    var materials: js.Array[Material] = js.native
    
    /**
      * All of the (abstract) meshes added to this scene
      */
    var meshes: js.Array[AbstractMesh] = js.native
    
    /**
      * The list of morph target managers added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh
      */
    var morphTargetManagers: js.Array[MorphTargetManager] = js.native
    
    /**
      * All of the multi-materials added to this scene
      * @see https://doc.babylonjs.com/how_to/multi_materials
      */
    var multiMaterials: js.Array[MultiMaterial] = js.native
    
    /**
      * All of the particle systems added to this scene
      * @see https://doc.babylonjs.com/babylon101/particles
      */
    var particleSystems: js.Array[IParticleSystem] = js.native
    
    /**
      * The list of postprocesses added to the scene
      */
    var postProcesses: js.Array[PostProcess] = js.native
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[PrePassRenderer] = js.native
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      */
    var proceduralTextures: js.Array[ProceduralTexture] = js.native
    
    /**
      * The list of reflection probes added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_reflection_probes
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
      * Gets the list of root nodes (ie. nodes with no parent)
      */
    var rootNodes: js.Array[Node] = js.native
    
    /**
      * The list of skeletons added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
      */
    var skeletons: js.Array[Skeleton] = js.native
    
    /**
      * The list of sounds used in the scene.
      */
    var sounds: Nullable[js.Array[Sound]] = js.native
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
    
    /**
      * Textures to keep.
      */
    var textures: js.Array[BaseTexture] = js.native
    
    /**
      * All of the tranform nodes added to this scene
      * In the context of a Scene, it is not supposed to be modified manually.
      * Any addition or removal should be done using the addTransformNode and removeTransformNode Scene methods.
      * Note also that the order of the TransformNode wihin the array is not significant and might change.
      * @see https://doc.babylonjs.com/how_to/transformnode
      */
    var transformNodes: js.Array[TransformNode] = js.native
  }
  /* static members */
  object AbstractScene {
    
    @JSImport("babylonjs/abstractScene", "AbstractScene")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds n individual parser in the list of available ones
      * @param name Defines the name of the parser
      * @param parser Defines the parser to add
      */
    @JSImport("babylonjs/abstractScene", "AbstractScene.AddIndividualParser")
    @js.native
    def AddIndividualParser(name: String, parser: IndividualBabylonFileParser): Unit = js.native
    
    /**
      * Adds a parser in the list of available ones
      * @param name Defines the name of the parser
      * @param parser Defines the parser to add
      */
    @JSImport("babylonjs/abstractScene", "AbstractScene.AddParser")
    @js.native
    def AddParser(name: String, parser: BabylonFileParser): Unit = js.native
    
    /**
      * Gets an individual parser from the list of avaialble ones
      * @param name Defines the name of the parser
      * @returns the requested parser or null
      */
    @JSImport("babylonjs/abstractScene", "AbstractScene.GetIndividualParser")
    @js.native
    def GetIndividualParser(name: String): Nullable[IndividualBabylonFileParser] = js.native
    
    /**
      * Gets a general parser from the list of avaialble ones
      * @param name Defines the name of the parser
      * @returns the requested parser or null
      */
    @JSImport("babylonjs/abstractScene", "AbstractScene.GetParser")
    @js.native
    def GetParser(name: String): Nullable[BabylonFileParser] = js.native
    
    /**
      * Parser json data and populate both a scene and its associated container object
      * @param jsonData Defines the data to parse
      * @param scene Defines the scene to parse the data for
      * @param container Defines the container attached to the parsing sequence
      * @param rootUrl Defines the root url of the data
      */
    @JSImport("babylonjs/abstractScene", "AbstractScene.Parse")
    @js.native
    def Parse(jsonData: js.Any, scene: Scene, container: AssetContainer, rootUrl: String): Unit = js.native
    
    /**
      * Stores the list of available parsers in the application.
      */
    @JSImport("babylonjs/abstractScene", "AbstractScene._BabylonFileParsers")
    @js.native
    def _BabylonFileParsers: js.Any = js.native
    @scala.inline
    def _BabylonFileParsers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BabylonFileParsers")(x.asInstanceOf[js.Any])
    
    /**
      * Stores the list of available individual parsers in the application.
      */
    @JSImport("babylonjs/abstractScene", "AbstractScene._IndividualBabylonFileParsers")
    @js.native
    def _IndividualBabylonFileParsers: js.Any = js.native
    @scala.inline
    def _IndividualBabylonFileParsers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IndividualBabylonFileParsers")(x.asInstanceOf[js.Any])
  }
  
  type BabylonFileParser = js.Function4[
    /* parsedData */ js.Any, 
    /* scene */ Scene, 
    /* container */ AssetContainer, 
    /* rootUrl */ String, 
    Unit
  ]
  
  type IndividualBabylonFileParser = js.Function3[/* parsedData */ js.Any, /* scene */ Scene, /* rootUrl */ String, js.Any]
}
