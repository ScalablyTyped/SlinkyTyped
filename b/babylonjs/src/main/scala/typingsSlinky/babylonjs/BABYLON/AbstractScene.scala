package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractScene extends js.Object {
  /**
    * ActionManagers available on the scene.
    */
  var actionManagers: js.Array[AbstractActionManager] = js.native
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
    * @returns all meshes, lights, cameras, transformNodes and bones
    */
  def getNodes(): js.Array[Node] = js.native
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
    def withActionManagers(value: js.Array[AbstractActionManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionManagers")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAnimationGroups(value: js.Array[AnimationGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimations(value: js.Array[Animation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameras(value: js.Array[Camera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectLayers(value: js.Array[EffectLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometries(value: js.Array[Geometry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
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
    def withGetNodes(value: () => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodes")(js.Any.fromFunction0(value))
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
    def withLights(value: js.Array[Light]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterials(value: js.Array[Material]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshes(value: js.Array[AbstractMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMorphTargetManagers(value: js.Array[MorphTargetManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphTargetManagers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiMaterials(value: js.Array[MultiMaterial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiMaterials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticleSystems(value: js.Array[IParticleSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleSystems")(value.asInstanceOf[js.Any])
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
    def withRootNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletons(value: js.Array[Skeleton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeletons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextures(value: js.Array[BaseTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformNodes(value: js.Array[TransformNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentTexture(value: Nullable[BaseTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentTextureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentTexture")(null)
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

