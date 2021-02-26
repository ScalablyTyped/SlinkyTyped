package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.AutoPlay
import typingsSlinky.babylonjs.anon.PartialIEnvironmentHelper
import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelper
import typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelperOptions
import typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience
import typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersIndexMod {
  
  @JSImport("babylonjs/Helpers/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Helpers/index", "EnvironmentHelper")
  @js.native
  class EnvironmentHelper protected ()
    extends typingsSlinky.babylonjs.environmentHelperMod.EnvironmentHelper {
    /**
      * constructor
      * @param options Defines the options we want to customize the helper
      * @param scene The scene to add the material to
      */
    def this(options: PartialIEnvironmentHelper, scene: Scene) = this()
  }
  /* static members */
  object EnvironmentHelper {
    
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default environment texture URL.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._environmentTextureCDNUrl")
    @js.native
    def _environmentTextureCDNUrl: js.Any = js.native
    @scala.inline
    def _environmentTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_environmentTextureCDNUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the default options for the helper.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._getDefaultOptions")
    @js.native
    def _getDefaultOptions: js.Any = js.native
    @scala.inline
    def _getDefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getDefaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Default ground texture URL.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._groundTextureCDNUrl")
    @js.native
    def _groundTextureCDNUrl: js.Any = js.native
    @scala.inline
    def _groundTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_groundTextureCDNUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Default skybox texture URL.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._skyboxTextureCDNUrl")
    @js.native
    def _skyboxTextureCDNUrl: js.Any = js.native
    @scala.inline
    def _skyboxTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_skyboxTextureCDNUrl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Helpers/index", "PhotoDome")
  @js.native
  class PhotoDome protected ()
    extends typingsSlinky.babylonjs.photoDomeMod.PhotoDome {
    /**
      * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
      * @param name Element's name, child elements will append suffixes for their own names.
      * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
      * @param options An object containing optional or exposed sub element properties
      */
    def this(name: String, textureUrlOrElement: String, options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: js.Array[String], options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: HTMLVideoElement, options: AutoPlay, scene: Scene) = this()
    def this(
      name: String,
      textureUrlOrElement: String,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: js.Array[String],
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: HTMLVideoElement,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
  }
  /* static members */
  object PhotoDome {
    
    /**
      * Define the image as a Monoscopic panoramic 360 image.
      */
    @JSImport("babylonjs/Helpers/index", "PhotoDome.MODE_MONOSCOPIC")
    @js.native
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the image as a Stereoscopic Side by Side panoramic 360 image.
      */
    @JSImport("babylonjs/Helpers/index", "PhotoDome.MODE_SIDEBYSIDE")
    @js.native
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
      */
    @JSImport("babylonjs/Helpers/index", "PhotoDome.MODE_TOPBOTTOM")
    @js.native
    val MODE_TOPBOTTOM: Double = js.native
  }
  
  @JSImport("babylonjs/Helpers/index", "VideoDome")
  @js.native
  class VideoDome protected ()
    extends typingsSlinky.babylonjs.videoDomeMod.VideoDome {
    /**
      * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
      * @param name Element's name, child elements will append suffixes for their own names.
      * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
      * @param options An object containing optional or exposed sub element properties
      */
    def this(name: String, textureUrlOrElement: String, options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: js.Array[String], options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: HTMLVideoElement, options: AutoPlay, scene: Scene) = this()
    def this(
      name: String,
      textureUrlOrElement: String,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: js.Array[String],
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: HTMLVideoElement,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
  }
  /* static members */
  object VideoDome {
    
    /**
      * Define the video source as a Monoscopic panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/index", "VideoDome.MODE_MONOSCOPIC")
    @js.native
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/index", "VideoDome.MODE_SIDEBYSIDE")
    @js.native
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/index", "VideoDome.MODE_TOPBOTTOM")
    @js.native
    val MODE_TOPBOTTOM: Double = js.native
  }
  
  @JSImport("babylonjs/Helpers/index", "_forceSceneHelpersToBundle")
  @js.native
  def forceSceneHelpersToBundle: Boolean = js.native
  
  @scala.inline
  def forceSceneHelpersToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceSceneHelpersToBundle")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * Creates a default camera for the scene.
        * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
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
        * @see https://doc.babylonjs.com/how_to/Fast_Build#create-default-camera-or-light
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
        * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-environment
        * @param options defines the options you can use to configure the environment
        * @returns the new EnvironmentHelper
        */
      def createDefaultEnvironment(): Nullable[typingsSlinky.babylonjs.environmentHelperMod.EnvironmentHelper] = js.native
      def createDefaultEnvironment(options: PartialIEnvironmentHelper): Nullable[typingsSlinky.babylonjs.environmentHelperMod.EnvironmentHelper] = js.native
      
      /**
        * Creates a default light for the scene.
        * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-light
        * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
        */
      def createDefaultLight(): Unit = js.native
      def createDefaultLight(replace: Boolean): Unit = js.native
      
      /**
        * Creates a new sky box
        * @see https://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
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
        * @see https://doc.babylonjs.com/how_to/webvr_helper
        * @param webVROptions defines the options used to create the new VREXperienceHelper
        * @returns a new VREXperienceHelper
        */
      def createDefaultVRExperience(): VRExperienceHelper = js.native
      def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): VRExperienceHelper = js.native
      
      /**
        * Creates a new WebXRDefaultExperience
        * @see https://doc.babylonjs.com/how_to/introduction_to_webxr
        * @param options experience options
        * @returns a promise for a new WebXRDefaultExperience
        */
      def createDefaultXRExperienceAsync(options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = js.native
    }
  }
}
