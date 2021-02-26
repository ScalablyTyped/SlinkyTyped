package typingsSlinky.babylonjs.legacyMod

import org.scalajs.dom.raw.File
import typingsSlinky.babylonjs.sceneLoaderMod.IRegisteredPlugin
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderAsyncResult
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPlugin
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPluginAsync
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPluginFactory
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderProgressEvent
import typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderSuccessCallback
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SceneLoader")
@js.native
class SceneLoader ()
  extends typingsSlinky.babylonjs.indexMod.SceneLoader
/* static members */
object SceneLoader {
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader")
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.Append")
  @js.native
  def Append(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
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
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(rootUrl: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.AppendAsync")
  @js.native
  def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  
  /**
    * Detailled logging while loading
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.DETAILED_LOGGING")
  @js.native
  val DETAILED_LOGGING: Double = js.native
  
  /**
    * Gets the default plugin (used to load Babylon files)
    * @returns the .babylon plugin
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.GetDefaultPlugin")
  @js.native
  def GetDefaultPlugin(): IRegisteredPlugin = js.native
  
  /**
    * Gets a plugin that can load the given extension
    * @param extension defines the extension to load
    * @returns a plugin or null if none works
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.GetPluginForExtension")
  @js.native
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
    * @param pluginExtension the extension used to determine the plugin
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportAnimations")
  @js.native
  def ImportAnimations(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
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
    * @param pluginExtension the extension used to determine the plugin
    * @returns the updated scene with imported animations
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportAnimationsAsync")
  @js.native
  def ImportAnimationsAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  
  /**
    * Import meshes into a scene
    * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene the instance of BABYLON.Scene to append to
    * @param onSuccess a callback with a list of imported meshes, particleSystems, skeletons, and animationGroups when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMesh")
  @js.native
  def ImportMesh(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[Nullable[SceneLoaderSuccessCallback]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
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
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.ImportMeshAsync")
  @js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  
  /**
    * Gets a boolean indicating that the given extension can be loaded
    * @param extension defines the extension to load
    * @returns true if the extension is supported
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.IsPluginForExtensionAvailable")
  @js.native
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
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.Load")
  @js.native
  def Load(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
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
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainer")
  @js.native
  def LoadAssetContainer(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[
      Nullable[
        js.Function1[/* assets */ typingsSlinky.babylonjs.assetContainerMod.AssetContainer, Unit]
      ]
    ],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
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
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(rootUrl: String): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAssetContainerAsync")
  @js.native
  def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  
  /**
    * Load a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param engine is the instance of BABYLON.Engine to use to create the scene
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded scene
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(rootUrl: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: Nullable[typingsSlinky.babylonjs.engineMod.Engine]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(rootUrl: String, sceneFilename: String, engine: Nullable[typingsSlinky.babylonjs.engineMod.Engine]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.LoadAsync")
  @js.native
  def LoadAsync(rootUrl: String, sceneFilename: File, engine: Nullable[typingsSlinky.babylonjs.engineMod.Engine]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  
  /**
    * Minimal logging while loading
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.MINIMAL_LOGGING")
  @js.native
  val MINIMAL_LOGGING: Double = js.native
  
  /**
    * No logging while loading
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.NO_LOGGING")
  @js.native
  val NO_LOGGING: Double = js.native
  
  /**
    * Event raised when a plugin is used to load a scene
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.OnPluginActivatedObservable")
  @js.native
  def OnPluginActivatedObservable: typingsSlinky.babylonjs.observableMod.Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  @scala.inline
  def OnPluginActivatedObservable_=(x: typingsSlinky.babylonjs.observableMod.Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnPluginActivatedObservable")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a new plugin to the list of registered plugins
    * @param plugin defines the plugin to add
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.RegisterPlugin")
  @js.native
  def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.RegisterPlugin")
  @js.native
  def RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = js.native
  
  /**
    * Summary logging while loading
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader.SUMMARY_LOGGING")
  @js.native
  val SUMMARY_LOGGING: Double = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._GetDirectLoad")
  @js.native
  def _GetDirectLoad: js.Any = js.native
  @scala.inline
  def _GetDirectLoad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDirectLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._GetFileInfo")
  @js.native
  def _GetFileInfo: js.Any = js.native
  @scala.inline
  def _GetFileInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFileInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._GetPluginForDirectLoad")
  @js.native
  def _GetPluginForDirectLoad: js.Any = js.native
  @scala.inline
  def _GetPluginForDirectLoad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForDirectLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._GetPluginForExtension")
  @js.native
  def _GetPluginForExtension: js.Any = js.native
  @scala.inline
  def _GetPluginForExtension_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForExtension")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._GetPluginForFilename")
  @js.native
  def _GetPluginForFilename: js.Any = js.native
  @scala.inline
  def _GetPluginForFilename_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForFilename")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._LoadData")
  @js.native
  def _LoadData: js.Any = js.native
  @scala.inline
  def _LoadData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadData")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._registeredPlugins")
  @js.native
  def _registeredPlugins: js.Any = js.native
  @scala.inline
  def _registeredPlugins_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_registeredPlugins")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneLoader._showingLoadingScreen")
  @js.native
  def _showingLoadingScreen: js.Any = js.native
  @scala.inline
  def _showingLoadingScreen_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_showingLoadingScreen")(x.asInstanceOf[js.Any])
}
