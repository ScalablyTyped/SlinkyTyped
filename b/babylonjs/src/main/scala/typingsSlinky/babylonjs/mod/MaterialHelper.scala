package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.anon.LightmapMode
import typingsSlinky.babylonjs.effectMod.IEffectCreationOptions
import typingsSlinky.babylonjs.prePassConfigurationMod.PrePassConfiguration
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MaterialHelper")
@js.native
class MaterialHelper ()
  extends typingsSlinky.babylonjs.legacyMod.MaterialHelper
/* static members */
@JSImport("babylonjs", "MaterialHelper")
@js.native
object MaterialHelper extends js.Object {
  
  /**
    * Binds the bones information from the mesh to the effect.
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param prePassConfiguration Configuration for the prepass, in case prepass is activated
    */
  def BindBonesParameters(): Unit = js.native
  def BindBonesParameters(
    mesh: js.UndefOr[scala.Nothing],
    effect: js.UndefOr[scala.Nothing],
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  def BindBonesParameters(mesh: js.UndefOr[scala.Nothing], effect: typingsSlinky.babylonjs.effectMod.Effect): Unit = js.native
  def BindBonesParameters(
    mesh: js.UndefOr[scala.Nothing],
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  def BindBonesParameters(mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh): Unit = js.native
  def BindBonesParameters(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: js.UndefOr[scala.Nothing],
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  def BindBonesParameters(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect
  ): Unit = js.native
  def BindBonesParameters(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    prePassConfiguration: PrePassConfiguration
  ): Unit = js.native
  
  /**
    * Binds the clip plane information from the scene to the effect.
    * @param scene The scene the clip plane information are extracted from
    * @param effect The effect we are binding the data to
    */
  def BindClipPlane(effect: typingsSlinky.babylonjs.effectMod.Effect, scene: typingsSlinky.babylonjs.sceneMod.Scene): Unit = js.native
  
  /**
    * Bind the current view position to an effect.
    * @param effect The effect to be bound
    * @param scene The scene the eyes position is used from
    * @param variableName name of the shader variable that will hold the eye position
    */
  def BindEyePosition(effect: typingsSlinky.babylonjs.effectMod.Effect, scene: typingsSlinky.babylonjs.sceneMod.Scene): Unit = js.native
  def BindEyePosition(
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    variableName: String
  ): Unit = js.native
  
  /**
    * Binds the fog information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param linearSpace Defines if the fog effect is applied in linear space
    */
  def BindFogParameters(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect
  ): Unit = js.native
  def BindFogParameters(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    linearSpace: Boolean
  ): Unit = js.native
  
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param light Light to bind
    * @param lightIndex Light index
    * @param scene The scene where the light belongs to
    * @param effect The effect we are binding the data to
    * @param useSpecular Defines if specular is supported
    * @param rebuildInParallel Specifies whether the shader is rebuilding in parallel
    */
  def BindLight(
    light: typingsSlinky.babylonjs.lightMod.Light,
    lightIndex: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    useSpecular: Boolean
  ): Unit = js.native
  def BindLight(
    light: typingsSlinky.babylonjs.lightMod.Light,
    lightIndex: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    useSpecular: Boolean,
    rebuildInParallel: Boolean
  ): Unit = js.native
  
  /**
    * Binds the light information to the effect.
    * @param light The light containing the generator
    * @param effect The effect we are binding the data to
    * @param lightIndex The light index in the effect used to render
    */
  def BindLightProperties(
    light: typingsSlinky.babylonjs.lightMod.Light,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    lightIndex: Double
  ): Unit = js.native
  
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param defines The generated defines for the effect
    * @param maxSimultaneousLights The maximum number of light that can be bound to the effect
    * @param rebuildInParallel Specifies whether the shader is rebuilding in parallel
    */
  def BindLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    defines: js.Any
  ): Unit = js.native
  def BindLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    defines: js.Any,
    maxSimultaneousLights: js.UndefOr[scala.Nothing],
    rebuildInParallel: Boolean
  ): Unit = js.native
  def BindLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  def BindLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    defines: js.Any,
    maxSimultaneousLights: Double,
    rebuildInParallel: Boolean
  ): Unit = js.native
  
  /**
    * Binds the logarithmic depth information from the scene to the effect for the given defines.
    * @param defines The generated defines used in the effect
    * @param effect The effect we are binding the data to
    * @param scene The scene we are willing to render with logarithmic scale for
    */
  def BindLogDepth(
    defines: js.Any,
    effect: typingsSlinky.babylonjs.effectMod.Effect,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): Unit = js.native
  
  /**
    * Binds the morph targets information from the mesh to the effect.
    * @param abstractMesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    */
  def BindMorphTargetParameters(
    abstractMesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    effect: typingsSlinky.babylonjs.effectMod.Effect
  ): Unit = js.native
  
  /**
    * Binds a texture matrix value to its corrsponding uniform
    * @param texture The texture to bind the matrix for
    * @param uniformBuffer The uniform buffer receivin the data
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  def BindTextureMatrix(
    texture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
    uniformBuffer: typingsSlinky.babylonjs.uniformBufferMod.UniformBuffer,
    key: String
  ): Unit = js.native
  
  /**
    * Gets the current status of the fog (should it be enabled?)
    * @param mesh defines the mesh to evaluate for fog support
    * @param scene defines the hosting scene
    * @returns true if fog must be enabled
    */
  def GetFogState(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): Boolean = js.native
  
  /**
    * This helps decreasing rank by rank the shadow quality (0 being the highest rank and quality)
    * @param defines The defines to update while falling back
    * @param fallbacks The authorized effect fallbacks
    * @param maxSimultaneousLights The maximum number of lights allowed
    * @param rank the current rank of the Effect
    * @returns The newly affected rank
    */
  def HandleFallbacksForShadows(defines: js.Any, fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks): Double = js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks,
    maxSimultaneousLights: js.UndefOr[scala.Nothing],
    rank: Double
  ): Double = js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks,
    maxSimultaneousLights: Double
  ): Double = js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks,
    maxSimultaneousLights: Double,
    rank: Double
  ): Double = js.native
  
  /**
    * Prepares the list of attributes required for bones according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the bones attributes for
    * @param defines The current Defines of the effect
    * @param fallbacks The current efffect fallback strategy
    */
  def PrepareAttributesForBones(
    attribs: js.Array[String],
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks
  ): Unit = js.native
  
  /**
    * Check and prepare the list of attributes required for instances according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param defines The current MaterialDefines of the effect
    */
  def PrepareAttributesForInstances(attribs: js.Array[String], defines: typingsSlinky.babylonjs.materialDefinesMod.MaterialDefines): Unit = js.native
  
  /**
    * Prepares the list of attributes required for morph targets according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param defines The current Defines of the effect
    */
  def PrepareAttributesForMorphTargets(
    attribs: js.Array[String],
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any
  ): Unit = js.native
  
  /**
    * Prepares the list of attributes required for morph targets according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param influencers The number of influencers
    */
  def PrepareAttributesForMorphTargetsInfluencers(
    attribs: js.Array[String],
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    influencers: Double
  ): Unit = js.native
  
  /**
    * Prepares the defines used in the shader depending on the attributes data available in the mesh
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    * @param useVertexColor Precise whether vertex colors should be used or not (override mesh info)
    * @param useBones Precise whether bones should be used or not (override mesh info)
    * @param useMorphTargets Precise whether morph targets should be used or not (override mesh info)
    * @param useVertexAlpha Precise whether vertex alpha should be used or not (override mesh info)
    * @returns false if defines are considered not dirty and have not been checked
    */
  def PrepareDefinesForAttributes(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean
  ): Boolean = js.native
  def PrepareDefinesForAttributes(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: js.UndefOr[scala.Nothing],
    useVertexAlpha: Boolean
  ): Boolean = js.native
  def PrepareDefinesForAttributes(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean
  ): Boolean = js.native
  def PrepareDefinesForAttributes(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean,
    useVertexAlpha: Boolean
  ): Boolean = js.native
  
  /**
    * Prepares the defines for bones
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    */
  def PrepareDefinesForBones(mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, defines: js.Any): Unit = js.native
  
  /**
    * Helper used to prepare the list of defines associated with frame values for shader compilation
    * @param scene defines the current scene
    * @param engine defines the current engine
    * @param defines specifies the list of active defines
    * @param useInstances defines if instances have to be turned on
    * @param useClipPlane defines if clip plane have to be turned on
    * @param useInstances defines if instances have to be turned on
    * @param useThinInstances defines if thin instances have to be turned on
    */
  def PrepareDefinesForFrameBoundValues(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    defines: js.Any,
    useInstances: Boolean
  ): Unit = js.native
  def PrepareDefinesForFrameBoundValues(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    defines: js.Any,
    useInstances: Boolean,
    useClipPlane: js.UndefOr[Nullable[Boolean]],
    useThinInstances: Boolean
  ): Unit = js.native
  def PrepareDefinesForFrameBoundValues(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    defines: js.Any,
    useInstances: Boolean,
    useClipPlane: Nullable[Boolean]
  ): Unit = js.native
  
  /**
    * Prepares the defines related to the light information passed in parameter
    * @param scene The scene we are intending to draw
    * @param mesh The mesh the effect is compiling for
    * @param light The light the effect is compiling for
    * @param lightIndex The index of the light
    * @param defines The defines to update
    * @param specularSupported Specifies whether specular is supported or not (override lights data)
    * @param state Defines the current state regarding what is needed (normals, etc...)
    */
  def PrepareDefinesForLight(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    light: typingsSlinky.babylonjs.lightMod.Light,
    lightIndex: Double,
    defines: js.Any,
    specularSupported: Boolean,
    state: LightmapMode
  ): Unit = js.native
  
  /**
    * Prepares the defines related to the light information passed in parameter
    * @param scene The scene we are intending to draw
    * @param mesh The mesh the effect is compiling for
    * @param defines The defines to update
    * @param specularSupported Specifies whether specular is supported or not (override lights data)
    * @param maxSimultaneousLights Specfies how manuy lights can be added to the effect at max
    * @param disableLighting Specifies whether the lighting is disabled (override scene and light)
    * @returns true if normals will be required for the rest of the effect
    */
  def PrepareDefinesForLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean
  ): Boolean = js.native
  def PrepareDefinesForLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean,
    maxSimultaneousLights: js.UndefOr[scala.Nothing],
    disableLighting: Boolean
  ): Boolean = js.native
  def PrepareDefinesForLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean,
    maxSimultaneousLights: Double
  ): Boolean = js.native
  def PrepareDefinesForLights(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    defines: js.Any,
    specularSupported: Boolean,
    maxSimultaneousLights: Double,
    disableLighting: Boolean
  ): Boolean = js.native
  
  /**
    * Helps preparing the defines values about the UVs in used in the effect.
    * UVs are shared as much as we can accross channels in the shaders.
    * @param texture The texture we are preparing the UVs for
    * @param defines The defines to update
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  def PrepareDefinesForMergedUV(texture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture, defines: js.Any, key: String): Unit = js.native
  
  /**
    * Helper used to prepare the list of defines associated with misc. values for shader compilation
    * @param mesh defines the current mesh
    * @param scene defines the current scene
    * @param useLogarithmicDepth defines if logarithmic depth has to be turned on
    * @param pointsCloud defines if point cloud rendering has to be turned on
    * @param fogEnabled defines if fog has to be turned on
    * @param alphaTest defines if alpha testing has to be turned on
    * @param defines defines the current list of defines
    */
  def PrepareDefinesForMisc(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    useLogarithmicDepth: Boolean,
    pointsCloud: Boolean,
    fogEnabled: Boolean,
    alphaTest: Boolean,
    defines: js.Any
  ): Unit = js.native
  
  /**
    * Prepares the defines for morph targets
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    */
  def PrepareDefinesForMorphTargets(mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, defines: js.Any): Unit = js.native
  
  /**
    * Prepares the defines related to multiview
    * @param scene The scene we are intending to draw
    * @param defines The defines to update
    */
  def PrepareDefinesForMultiview(scene: typingsSlinky.babylonjs.sceneMod.Scene, defines: js.Any): Unit = js.native
  
  /**
    * Prepares the defines related to the prepass
    * @param scene The scene we are intending to draw
    * @param defines The defines to update
    * @param canRenderToMRT Indicates if this material renders to several textures in the prepass
    */
  def PrepareDefinesForPrePass(scene: typingsSlinky.babylonjs.sceneMod.Scene, defines: js.Any, canRenderToMRT: Boolean): Unit = js.native
  
  /**
    * Prepares the uniforms and samplers list to be used in the effect (for a specific light)
    * @param lightIndex defines the light index
    * @param uniformsList The uniform list
    * @param samplersList The sampler list
    * @param projectedLightTexture defines if projected texture must be used
    * @param uniformBuffersList defines an optional list of uniform buffers
    * @param updateOnlyBuffersList True to only update the uniformBuffersList array
    */
  def PrepareUniformsAndSamplersForLight(lightIndex: Double, uniformsList: js.Array[String], samplersList: js.Array[String]): Unit = js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.UndefOr[scala.Nothing],
    uniformBuffersList: js.UndefOr[Nullable[js.Array[String]]],
    updateOnlyBuffersList: Boolean
  ): Unit = js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.UndefOr[scala.Nothing],
    uniformBuffersList: Nullable[js.Array[String]]
  ): Unit = js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.Any
  ): Unit = js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.Any,
    uniformBuffersList: js.UndefOr[Nullable[js.Array[String]]],
    updateOnlyBuffersList: Boolean
  ): Unit = js.native
  def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: js.Any,
    uniformBuffersList: Nullable[js.Array[String]]
  ): Unit = js.native
  
  /**
    * Prepares the uniforms and samplers list to be used in the effect
    * @param uniformsListOrOptions The uniform names to prepare or an EffectCreationOptions containing the liist and extra information
    * @param samplersList The sampler list
    * @param defines The defines helping in the list generation
    * @param maxSimultaneousLights The maximum number of simultanous light allowed in the effect
    */
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String]): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.UndefOr[scala.Nothing], defines: js.Any): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.Array[String]): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.Array[String],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.Array[String], defines: js.Any): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.Array[String],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.Any
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.UndefOr[scala.Nothing],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: js.Array[String]): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.Array[String],
    defines: js.UndefOr[scala.Nothing],
    maxSimultaneousLights: Double
  ): Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: js.Array[String], defines: js.Any): Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.Array[String],
    defines: js.Any,
    maxSimultaneousLights: Double
  ): Unit = js.native
  
  /**
    * Add the list of attributes required for instances to the attribs array.
    * @param attribs The current list of supported attribs
    */
  def PushAttributesForInstances(attribs: js.Array[String]): Unit = js.native
  
  var _CopyBonesTransformationMatrices: js.Any = js.native
  
  var _TmpMorphInfluencers: js.Any = js.native
  
  var _tempFogColor: js.Any = js.native
}
