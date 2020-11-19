package typingsSlinky.babylonjs

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.animationGroupMod.AnimationGroup
import typingsSlinky.babylonjs.anon.AnimationGroups
import typingsSlinky.babylonjs.assetContainerMod.AssetContainer
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPlugin
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPluginAsync
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPluginFactory
import typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.skeletonMod.Skeleton
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Loading/index", JSImport.Namespace)
@js.native
object loadingIndexMod extends js.Object {
  
  @JSName("_BabylonLoaderRegistered")
  var BabylonLoaderRegistered: Boolean = js.native
  
  @js.native
  class BabylonFileLoaderConfiguration ()
    extends typingsSlinky.babylonjs.pluginsIndexMod.BabylonFileLoaderConfiguration
  /* static members */
  @js.native
  object BabylonFileLoaderConfiguration extends js.Object {
    
    /**
      * The loader does not allow injecting custom physix engine into the plugins.
      * Unfortunately in ES6, we need to manually inject them into the plugin.
      * So you could set this variable to your engine import to make it work.
      */
    var LoaderInjectedPhysicsEngine: js.Any = js.native
  }
  
  @js.native
  class DefaultLoadingScreen protected ()
    extends typingsSlinky.babylonjs.loadingScreenMod.DefaultLoadingScreen {
    /**
      * Creates a new default loading screen
      * @param _renderingCanvas defines the canvas used to render the scene
      * @param _loadingText defines the default text to display
      * @param _loadingDivBackgroundColor defines the default background color
      */
    def this(_renderingCanvas: HTMLCanvasElement) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String) = this()
    def this(
      _renderingCanvas: HTMLCanvasElement,
      _loadingText: js.UndefOr[scala.Nothing],
      _loadingDivBackgroundColor: String
    ) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String, _loadingDivBackgroundColor: String) = this()
  }
  /* static members */
  @js.native
  object DefaultLoadingScreen extends js.Object {
    
    /** Gets or sets the logo url to use for the default loading screen */
    var DefaultLogoUrl: String = js.native
    
    /** Gets or sets the spinner url to use for the default loading screen */
    var DefaultSpinnerUrl: String = js.native
  }
  
  @js.native
  class SceneLoader ()
    extends typingsSlinky.babylonjs.sceneLoaderMod.SceneLoader
  /* static members */
  @js.native
  object SceneLoader extends js.Object {
    
    /**
      * Append a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    def Append(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
    /**
      * Append a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The given scene
      */
    def AppendAsync(rootUrl: String): js.Promise[Scene] = js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[Scene] = js.native
    def AppendAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[Scene] = js.native
    def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[Scene] = js.native
    def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[Scene] = js.native
    def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[Scene] = js.native
    def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[Scene] = js.native
    
    /**
      * Gets or set a boolean indicating if matrix weights must be cleaned upon loading
      */
    def CleanBoneMatrixWeights: Boolean = js.native
    def CleanBoneMatrixWeights_=(value: Boolean): Unit = js.native
    
    /**
      * Detailled logging while loading
      */
    val DETAILED_LOGGING: Double = js.native
    
    /**
      * Gets or sets a boolean indicating if entire scene must be loaded even if scene contains incremental data
      */
    def ForceFullSceneLoadingForIncremental: Boolean = js.native
    def ForceFullSceneLoadingForIncremental_=(value: Boolean): Unit = js.native
    
    /**
      * Gets a plugin that can load the given extension
      * @param extension defines the extension to load
      * @returns a plugin or null if none works
      */
    def GetPluginForExtension(extension: String): ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory = js.native
    
    /**
      * Import animations from a file into a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
      * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
      * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
      * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      */
    def ImportAnimations(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      overwriteAnimations: js.UndefOr[Boolean],
      animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
      targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ]
    ): Unit = js.native
    
    /**
      * Import animations from a file into a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
      * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
      * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
      * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @returns the updated scene with imported animations
      */
    def ImportAnimationsAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      overwriteAnimations: js.UndefOr[Boolean],
      animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
      targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ]
    ): js.Promise[Scene] = js.native
    
    /**
      * Import meshes into a scene
      * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene the instance of BABYLON.Scene to append to
      * @param onSuccess a callback with a list of imported meshes, particleSystems, and skeletons when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    def ImportMesh(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[
          Nullable[
            js.Function4[
              /* meshes */ js.Array[AbstractMesh], 
              /* particleSystems */ js.Array[IParticleSystem], 
              /* skeletons */ js.Array[Skeleton], 
              /* animationGroups */ js.Array[AnimationGroup], 
              Unit
            ]
          ]
        ],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
    /**
      * Import meshes into a scene
      * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene the instance of BABYLON.Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
      */
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: Nullable[Scene]
    ): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[AnimationGroups] = js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[AnimationGroups] = js.native
    
    /**
      * Gets a boolean indicating that the given extension can be loaded
      * @param extension defines the extension to load
      * @returns true if the extension is supported
      */
    def IsPluginForExtensionAvailable(extension: String): Boolean = js.native
    
    /**
      * Load a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param engine is the instance of BABYLON.Engine to use to create the scene
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    def Load(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      engine: js.UndefOr[Nullable[Engine]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
    /**
      * Load a scene into an asset container
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    def LoadAssetContainer(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* assets */ AssetContainer, Unit]]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
    /**
      * Load a scene into an asset container
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
      * @param scene is the instance of Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded asset container
      */
    def LoadAssetContainerAsync(rootUrl: String): js.Promise[AssetContainer] = js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[AssetContainer] = js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[AssetContainer] = js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[AssetContainer] = js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[AssetContainer] = js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[AssetContainer] = js.native
    
    /**
      * Load a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param engine is the instance of BABYLON.Engine to use to create the scene
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded scene
      */
    def LoadAsync(rootUrl: String): js.Promise[Scene] = js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[Scene] = js.native
    def LoadAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], engine: Nullable[Engine]): js.Promise[Scene] = js.native
    def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[Scene] = js.native
    def LoadAsync(rootUrl: String, sceneFilename: String, engine: Nullable[Engine]): js.Promise[Scene] = js.native
    def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[
          Nullable[
            js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
          ]
        ],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[
          js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
        ]
    ): js.Promise[Scene] = js.native
    def LoadAsync(rootUrl: String, sceneFilename: File, engine: Nullable[Engine]): js.Promise[Scene] = js.native
    
    /**
      * Minimal logging while loading
      */
    val MINIMAL_LOGGING: Double = js.native
    
    /**
      * No logging while loading
      */
    val NO_LOGGING: Double = js.native
    
    /**
      * Event raised when a plugin is used to load a scene
      */
    var OnPluginActivatedObservable: Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
    /**
      * Adds a new plugin to the list of registered plugins
      * @param plugin defines the plugin to add
      */
    def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = js.native
    def RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = js.native
    
    /**
      * Summary logging while loading
      */
    val SUMMARY_LOGGING: Double = js.native
    
    /**
      * Gets or sets a boolean indicating if loading screen must be displayed while loading a scene
      */
    def ShowLoadingScreen: Boolean = js.native
    def ShowLoadingScreen_=(value: Boolean): Unit = js.native
    
    var _getDefaultPlugin: js.Any = js.native
    
    var _getDirectLoad: js.Any = js.native
    
    var _getFileInfo: js.Any = js.native
    
    var _getPluginForDirectLoad: js.Any = js.native
    
    var _getPluginForExtension: js.Any = js.native
    
    var _getPluginForFilename: js.Any = js.native
    
    var _loadData: js.Any = js.native
    
    var _registeredPlugins: js.Any = js.native
    
    /**
      * Defines the current logging level (while loading the scene)
      * @ignorenaming
      */
    def loggingLevel: Double = js.native
    def loggingLevel_=(value: Double): Unit = js.native
  }
  
  @js.native
  object SceneLoaderAnimationGroupLoadingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode with Double
      ] = js.native
    
    /* 0 */ val Clean: typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Clean with Double = js.native
    
    /* 3 */ val NoSync: typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.NoSync with Double = js.native
    
    /* 1 */ val Stop: typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Stop with Double = js.native
    
    /* 2 */ val Sync: typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Sync with Double = js.native
  }
  
  @js.native
  class SceneLoaderFlags ()
    extends typingsSlinky.babylonjs.sceneLoaderFlagsMod.SceneLoaderFlags
  /* static members */
  @js.native
  object SceneLoaderFlags extends js.Object {
    
    /**
      * Gets or set a boolean indicating if matrix weights must be cleaned upon loading
      */
    def CleanBoneMatrixWeights: Boolean = js.native
    def CleanBoneMatrixWeights_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if entire scene must be loaded even if scene contains incremental data
      */
    def ForceFullSceneLoadingForIncremental: Boolean = js.native
    def ForceFullSceneLoadingForIncremental_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if loading screen must be displayed while loading a scene
      */
    def ShowLoadingScreen: Boolean = js.native
    def ShowLoadingScreen_=(value: Boolean): Unit = js.native
    
    var _CleanBoneMatrixWeights: js.Any = js.native
    
    var _ForceFullSceneLoadingForIncremental: js.Any = js.native
    
    var _ShowLoadingScreen: js.Any = js.native
    
    var _loggingLevel: js.Any = js.native
    
    /**
      * Defines the current logging level (while loading the scene)
      * @ignorenaming
      */
    def loggingLevel: Double = js.native
    def loggingLevel_=(value: Double): Unit = js.native
  }
  
  @js.native
  class SceneLoaderProgressEvent protected ()
    extends typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent {
    /**
      * Create a new progress event
      * @param lengthComputable defines if data length to load can be evaluated
      * @param loaded defines the loaded data length
      * @param total defines the data length to load
      */
    def this(
      /** defines if data length to load can be evaluated */
    lengthComputable: Boolean,
      /** defines the loaded data length */
    loaded: Double,
      /** defines the data length to load */
    total: Double
    ) = this()
  }
  /* static members */
  @js.native
  object SceneLoaderProgressEvent extends js.Object {
    
    /**
      * Creates a new SceneLoaderProgressEvent from a ProgressEvent
      * @param event defines the source event
      * @returns a new SceneLoaderProgressEvent
      */
    def FromProgressEvent(event: ProgressEvent): typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent = js.native
  }
}
