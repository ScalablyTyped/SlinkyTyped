package typingsSlinky.babylonjs.legacyMod

import org.scalajs.dom.raw.File
import typingsSlinky.babylonjs.anon.AnimationGroups
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPlugin
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPluginAsync
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderPluginFactory
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SceneLoader")
@js.native
class SceneLoader ()
  extends typingsSlinky.babylonjs.indexMod.SceneLoader
/* static members */
@JSImport("babylonjs/Legacy/legacy", "SceneLoader")
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
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
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
  def AppendAsync(rootUrl: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  
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
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
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
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsSlinky.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[_], 
          Unit
        ]
      ]
    ]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  
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
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[
      Nullable[
        js.Function4[
          /* meshes */ js.Array[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh], 
          /* particleSystems */ js.Array[IParticleSystem], 
          /* skeletons */ js.Array[typingsSlinky.babylonjs.skeletonMod.Skeleton], 
          /* animationGroups */ js.Array[typingsSlinky.babylonjs.animationGroupMod.AnimationGroup], 
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
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
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
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
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
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
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
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[AnimationGroups] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[AnimationGroups] = js.native
  
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
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ typingsSlinky.babylonjs.sceneMod.Scene, Unit]]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
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
  def LoadAssetContainer(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[
      Nullable[
        js.Function1[/* assets */ typingsSlinky.babylonjs.assetContainerMod.AssetContainer, Unit]
      ]
    ],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
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
  def LoadAssetContainerAsync(rootUrl: String): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.assetContainerMod.AssetContainer] = js.native
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
  def LoadAsync(rootUrl: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: Nullable[typingsSlinky.babylonjs.engineMod.Engine]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: String, engine: Nullable[typingsSlinky.babylonjs.engineMod.Engine]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: js.UndefOr[
      Nullable[
        js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
      ]
    ],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: js.UndefOr[Nullable[typingsSlinky.babylonjs.engineMod.Engine]],
    onProgress: Nullable[
      js.Function1[/* event */ typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit]
    ]
  ): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: File, engine: Nullable[typingsSlinky.babylonjs.engineMod.Engine]): js.Promise[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  
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
  var OnPluginActivatedObservable: typingsSlinky.babylonjs.observableMod.Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  
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
