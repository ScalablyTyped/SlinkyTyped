package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
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
    * @see http://doc.babylonjs.com/how_to/group
    */
  var animationGroups: js.Array[AnimationGroup] = js.native
  
  /**
    * Gets a list of Animations associated with the scene
    */
  var animations: js.Array[Animation] = js.native
  
  /** All of the cameras added to this scene
    * @see http://doc.babylonjs.com/babylon101/cameras
    */
  var cameras: js.Array[Camera] = js.native
  
  /**
    * The list of effect layers (highlights/glow) added to the scene
    * @see http://doc.babylonjs.com/how_to/highlight_layer
    * @see http://doc.babylonjs.com/how_to/glow_layer
    */
  var effectLayers: js.Array[EffectLayer] = js.native
  
  /**
    * Environment texture for the scene
    */
  var environmentTexture: Nullable[BaseTexture] = js.native
  
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
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var lensFlareSystems: js.Array[LensFlareSystem] = js.native
  
  /**
    * All of the lights added to this scene
    * @see http://doc.babylonjs.com/babylon101/lights
    */
  var lights: js.Array[Light] = js.native
  
  /**
    * All of the materials added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addMaterial and removeMaterial Scene methods.
    * Note also that the order of the Material within the array is not significant and might change.
    * @see http://doc.babylonjs.com/babylon101/materials
    */
  var materials: js.Array[Material] = js.native
  
  /**
    * All of the (abstract) meshes added to this scene
    */
  var meshes: js.Array[AbstractMesh] = js.native
  
  /**
    * The list of morph target managers added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh
    */
  var morphTargetManagers: js.Array[MorphTargetManager] = js.native
  
  /**
    * All of the multi-materials added to this scene
    * @see http://doc.babylonjs.com/how_to/multi_materials
    */
  var multiMaterials: js.Array[MultiMaterial] = js.native
  
  /**
    * All of the particle systems added to this scene
    * @see http://doc.babylonjs.com/babylon101/particles
    */
  var particleSystems: js.Array[IParticleSystem] = js.native
  
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
    * Gets the list of root nodes (ie. nodes with no parent)
    */
  var rootNodes: js.Array[Node] = js.native
  
  /**
    * The list of skeletons added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
    */
  var skeletons: js.Array[Skeleton] = js.native
  
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]] = js.native
  
  /**
    * Textures to keep.
    */
  var textures: js.Array[BaseTexture] = js.native
  
  /**
    * All of the tranform nodes added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addTransformNode and removeTransformNode Scene methods.
    * Note also that the order of the TransformNode wihin the array is not significant and might change.
    * @see http://doc.babylonjs.com/how_to/transformnode
    */
  var transformNodes: js.Array[TransformNode] = js.native
}
object AbstractScene {
  
  @scala.inline
  def apply(
    actionManagers: js.Array[AbstractActionManager],
    addEffectLayer: EffectLayer => Unit,
    addLensFlareSystem: LensFlareSystem => Unit,
    addReflectionProbe: ReflectionProbe => Unit,
    animationGroups: js.Array[AnimationGroup],
    animations: js.Array[Animation],
    cameras: js.Array[Camera],
    effectLayers: js.Array[EffectLayer],
    geometries: js.Array[Geometry],
    getGlowLayerByName: String => Nullable[GlowLayer],
    getHighlightLayerByName: String => Nullable[HighlightLayer],
    getLensFlareSystemByID: String => Nullable[LensFlareSystem],
    getLensFlareSystemByName: String => Nullable[LensFlareSystem],
    getNodes: () => js.Array[Node],
    layers: js.Array[Layer],
    lensFlareSystems: js.Array[LensFlareSystem],
    lights: js.Array[Light],
    materials: js.Array[Material],
    meshes: js.Array[AbstractMesh],
    morphTargetManagers: js.Array[MorphTargetManager],
    multiMaterials: js.Array[MultiMaterial],
    particleSystems: js.Array[IParticleSystem],
    proceduralTextures: js.Array[ProceduralTexture],
    reflectionProbes: js.Array[ReflectionProbe],
    removeEffectLayer: EffectLayer => Double,
    removeLensFlareSystem: LensFlareSystem => Double,
    removeReflectionProbe: ReflectionProbe => Double,
    rootNodes: js.Array[Node],
    skeletons: js.Array[Skeleton],
    textures: js.Array[BaseTexture],
    transformNodes: js.Array[TransformNode]
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(actionManagers = actionManagers.asInstanceOf[js.Any], addEffectLayer = js.Any.fromFunction1(addEffectLayer), addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), animationGroups = animationGroups.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], effectLayers = effectLayers.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), getNodes = js.Any.fromFunction0(getNodes), layers = layers.asInstanceOf[js.Any], lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], morphTargetManagers = morphTargetManagers.asInstanceOf[js.Any], multiMaterials = multiMaterials.asInstanceOf[js.Any], particleSystems = particleSystems.asInstanceOf[js.Any], proceduralTextures = proceduralTextures.asInstanceOf[js.Any], reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer), removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem), removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe), rootNodes = rootNodes.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any], transformNodes = transformNodes.asInstanceOf[js.Any])
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
    def setActionManagersVarargs(value: AbstractActionManager*): Self = this.set("actionManagers", js.Array(value :_*))
    
    @scala.inline
    def setActionManagers(value: js.Array[AbstractActionManager]): Self = this.set("actionManagers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEffectLayer(value: EffectLayer => Unit): Self = this.set("addEffectLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddLensFlareSystem(value: LensFlareSystem => Unit): Self = this.set("addLensFlareSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddReflectionProbe(value: ReflectionProbe => Unit): Self = this.set("addReflectionProbe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnimationGroupsVarargs(value: AnimationGroup*): Self = this.set("animationGroups", js.Array(value :_*))
    
    @scala.inline
    def setAnimationGroups(value: js.Array[AnimationGroup]): Self = this.set("animationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: Animation*): Self = this.set("animations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: js.Array[Animation]): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamerasVarargs(value: Camera*): Self = this.set("cameras", js.Array(value :_*))
    
    @scala.inline
    def setCameras(value: js.Array[Camera]): Self = this.set("cameras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectLayersVarargs(value: EffectLayer*): Self = this.set("effectLayers", js.Array(value :_*))
    
    @scala.inline
    def setEffectLayers(value: js.Array[EffectLayer]): Self = this.set("effectLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesVarargs(value: Geometry*): Self = this.set("geometries", js.Array(value :_*))
    
    @scala.inline
    def setGeometries(value: js.Array[Geometry]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGlowLayerByName(value: String => Nullable[GlowLayer]): Self = this.set("getGlowLayerByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHighlightLayerByName(value: String => Nullable[HighlightLayer]): Self = this.set("getHighlightLayerByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLensFlareSystemByID(value: String => Nullable[LensFlareSystem]): Self = this.set("getLensFlareSystemByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLensFlareSystemByName(value: String => Nullable[LensFlareSystem]): Self = this.set("getLensFlareSystemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodes(value: () => js.Array[Node]): Self = this.set("getNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLensFlareSystemsVarargs(value: LensFlareSystem*): Self = this.set("lensFlareSystems", js.Array(value :_*))
    
    @scala.inline
    def setLensFlareSystems(value: js.Array[LensFlareSystem]): Self = this.set("lensFlareSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsVarargs(value: Light*): Self = this.set("lights", js.Array(value :_*))
    
    @scala.inline
    def setLights(value: js.Array[Light]): Self = this.set("lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsVarargs(value: Material*): Self = this.set("materials", js.Array(value :_*))
    
    @scala.inline
    def setMaterials(value: js.Array[Material]): Self = this.set("materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshesVarargs(value: AbstractMesh*): Self = this.set("meshes", js.Array(value :_*))
    
    @scala.inline
    def setMeshes(value: js.Array[AbstractMesh]): Self = this.set("meshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMorphTargetManagersVarargs(value: MorphTargetManager*): Self = this.set("morphTargetManagers", js.Array(value :_*))
    
    @scala.inline
    def setMorphTargetManagers(value: js.Array[MorphTargetManager]): Self = this.set("morphTargetManagers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiMaterialsVarargs(value: MultiMaterial*): Self = this.set("multiMaterials", js.Array(value :_*))
    
    @scala.inline
    def setMultiMaterials(value: js.Array[MultiMaterial]): Self = this.set("multiMaterials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticleSystemsVarargs(value: IParticleSystem*): Self = this.set("particleSystems", js.Array(value :_*))
    
    @scala.inline
    def setParticleSystems(value: js.Array[IParticleSystem]): Self = this.set("particleSystems", value.asInstanceOf[js.Any])
    
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
    def setRootNodesVarargs(value: Node*): Self = this.set("rootNodes", js.Array(value :_*))
    
    @scala.inline
    def setRootNodes(value: js.Array[Node]): Self = this.set("rootNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonsVarargs(value: Skeleton*): Self = this.set("skeletons", js.Array(value :_*))
    
    @scala.inline
    def setSkeletons(value: js.Array[Skeleton]): Self = this.set("skeletons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexturesVarargs(value: BaseTexture*): Self = this.set("textures", js.Array(value :_*))
    
    @scala.inline
    def setTextures(value: js.Array[BaseTexture]): Self = this.set("textures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformNodesVarargs(value: TransformNode*): Self = this.set("transformNodes", js.Array(value :_*))
    
    @scala.inline
    def setTransformNodes(value: js.Array[TransformNode]): Self = this.set("transformNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentTexture(value: Nullable[BaseTexture]): Self = this.set("environmentTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentTextureNull: Self = this.set("environmentTexture", null)
    
    @scala.inline
    def setSoundsVarargs(value: Sound*): Self = this.set("sounds", js.Array(value :_*))
    
    @scala.inline
    def setSounds(value: Nullable[js.Array[Sound]]): Self = this.set("sounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundsNull: Self = this.set("sounds", null)
  }
}
