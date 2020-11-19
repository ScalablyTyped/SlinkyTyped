package typingsSlinky.babylonjs.helpersIndexMod

import typingsSlinky.babylonjs.anon.PartialIEnvironmentHelper
import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelper
import typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelperOptions
import typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience
import typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Helpers/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  
  @js.native
  trait Scene extends js.Object {
    
    /**
      * Creates a default camera for the scene.
      * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has default false, when true replaces the active camera in the scene
      * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCamera(): Unit = js.native
    def createDefaultCamera(
      createArcRotateCamera: js.UndefOr[scala.Nothing],
      replace: js.UndefOr[scala.Nothing],
      attachCameraControls: Boolean
    ): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: js.UndefOr[scala.Nothing], attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a default camera and a default light.
      * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-camera-or-light
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has the default false, when true replaces the active camera/light in the scene
      * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCameraOrLight(): Unit = js.native
    def createDefaultCameraOrLight(
      createArcRotateCamera: js.UndefOr[scala.Nothing],
      replace: js.UndefOr[scala.Nothing],
      attachCameraControls: Boolean
    ): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: js.UndefOr[scala.Nothing], attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a new environment
      * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-environment
      * @param options defines the options you can use to configure the environment
      * @returns the new EnvironmentHelper
      */
    def createDefaultEnvironment(): Nullable[typingsSlinky.babylonjs.environmentHelperMod.EnvironmentHelper] = js.native
    def createDefaultEnvironment(options: PartialIEnvironmentHelper): Nullable[typingsSlinky.babylonjs.environmentHelperMod.EnvironmentHelper] = js.native
    
    /**
      * Creates a default light for the scene.
      * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-light
      * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
      */
    def createDefaultLight(): Unit = js.native
    def createDefaultLight(replace: Boolean): Unit = js.native
    
    /**
      * Creates a new sky box
      * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
      * @param environmentTexture defines the texture to use as environment texture
      * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
      * @param scale defines the overall scale of the skybox
      * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
      * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
      * @returns a new mesh holding the sky box
      */
    def createDefaultSkybox(): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: js.UndefOr[scala.Nothing], scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: Double
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: Double
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: Boolean, scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: Boolean, scale: Double, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: js.UndefOr[scala.Nothing], scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: js.UndefOr[scala.Nothing], scale: Double, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: js.UndefOr[scala.Nothing], blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Double, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    
    /**
      * Creates a new VREXperienceHelper
      * @see http://doc.babylonjs.com/how_to/webvr_helper
      * @param webVROptions defines the options used to create the new VREXperienceHelper
      * @returns a new VREXperienceHelper
      */
    def createDefaultVRExperience(): VRExperienceHelper = js.native
    def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): VRExperienceHelper = js.native
    
    /**
      * Creates a new WebXRDefaultExperience
      * @see http://doc.babylonjs.com/how_to/webxr
      * @param options experience options
      * @returns a promise for a new WebXRDefaultExperience
      */
    def createDefaultXRExperienceAsync(options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = js.native
  }
}
