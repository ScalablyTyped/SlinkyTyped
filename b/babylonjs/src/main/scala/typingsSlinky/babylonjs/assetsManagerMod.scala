package typingsSlinky.babylonjs

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.animationGroupMod.AnimationGroup
import typingsSlinky.babylonjs.anon.Exception
import typingsSlinky.babylonjs.assetContainerMod.AssetContainer
import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.cubeTextureMod.CubeTexture
import typingsSlinky.babylonjs.equiRectangularCubeTextureMod.EquiRectangularCubeTexture
import typingsSlinky.babylonjs.hdrCubeTextureMod.HDRCubeTexture
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.skeletonMod.Skeleton
import typingsSlinky.babylonjs.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsManagerMod {
  
  @JSImport("babylonjs/Misc/assetsManager", "AbstractAssetTask")
  @js.native
  abstract class AbstractAssetTask protected () extends StObject {
    /**
      * Creates a new AssetsManager
      * @param name defines the name of the task
      */
    def this(/**
      * Task name
      */ name: String) = this()
    
    var _errorObject: js.Any = js.native
    
    var _isCompleted: js.Any = js.native
    
    /**
      * Internal only
      * @hidden
      */
    def _setErrorObject(): Unit = js.native
    def _setErrorObject(message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def _setErrorObject(message: String): Unit = js.native
    def _setErrorObject(message: String, exception: js.Any): Unit = js.native
    
    var _taskState: js.Any = js.native
    
    /**
      * Gets the current error object (if task is in error)
      */
    def errorObject: Exception = js.native
    
    /**
      * Get if the task is completed
      */
    def isCompleted: Boolean = js.native
    
    /**
      * Task name
      */ var name: String = js.native
    
    var onDoneCallback: js.Any = js.native
    
    /**
      * Callback called when the task is not successful
      */
    def onError(task: js.Any): Unit = js.native
    def onError(task: js.Any, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: js.Any, message: String): Unit = js.native
    def onError(task: js.Any, message: String, exception: js.Any): Unit = js.native
    
    var onErrorCallback: js.Any = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: js.Any): Unit = js.native
    
    /**
      * Reset will set the task state back to INIT, so the next load call of the assets manager will execute this task again.
      * This can be used with failed tasks that have the reason for failure fixed.
      */
    def reset(): Unit = js.native
    
    /**
      * Execute the current task
      * @param scene defines the scene where you want your assets to be loaded
      * @param onSuccess is a callback called when the task is successfully executed
      * @param onError is a callback called if an error occurs
      */
    def run(
      scene: Scene,
      onSuccess: js.Function0[Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    /**
      * Execute the current task
      * @param scene defines the scene where you want your assets to be loaded
      * @param onSuccess is a callback called when the task is successfully executed
      * @param onError is a callback called if an error occurs
      */
    def runTask(
      scene: Scene,
      onSuccess: js.Function0[Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    /**
      * Gets the current state of the task
      */
    def taskState: AssetTaskState = js.native
  }
  
  @js.native
  sealed trait AssetTaskState extends StObject
  @JSImport("babylonjs/Misc/assetsManager", "AssetTaskState")
  @js.native
  object AssetTaskState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AssetTaskState with Double] = js.native
    
    /**
      * Done
      */
    @js.native
    sealed trait DONE extends AssetTaskState
    /* 2 */ val DONE: typingsSlinky.babylonjs.assetsManagerMod.AssetTaskState.DONE with Double = js.native
    
    /**
      * Error
      */
    @js.native
    sealed trait ERROR extends AssetTaskState
    /* 3 */ val ERROR: typingsSlinky.babylonjs.assetsManagerMod.AssetTaskState.ERROR with Double = js.native
    
    /**
      * Initialization
      */
    @js.native
    sealed trait INIT extends AssetTaskState
    /* 0 */ val INIT: typingsSlinky.babylonjs.assetsManagerMod.AssetTaskState.INIT with Double = js.native
    
    /**
      * Running
      */
    @js.native
    sealed trait RUNNING extends AssetTaskState
    /* 1 */ val RUNNING: typingsSlinky.babylonjs.assetsManagerMod.AssetTaskState.RUNNING with Double = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "AssetsManager")
  @js.native
  class AssetsManager protected () extends StObject {
    /**
      * Creates a new AssetsManager
      * @param scene defines the scene to work on
      */
    def this(scene: Scene) = this()
    
    var _decreaseWaitingTasksCount: js.Any = js.native
    
    var _isLoading: js.Any = js.native
    
    var _runTask: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _tasks: js.Array[AbstractAssetTask] = js.native
    
    var _totalTasksCount: Double = js.native
    
    var _waitingTasksCount: Double = js.native
    
    /**
      * Add a BinaryFileAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @returns a new BinaryFileAssetTask object
      */
    def addBinaryFileTask(taskName: String, url: String): BinaryFileAssetTask = js.native
    
    /**
      * Add a ContainerAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param meshesNames defines the name of meshes to load
      * @param rootUrl defines the root url to use to locate files
      * @param sceneFilename defines the filename of the scene file
      * @returns a new ContainerAssetTask object
      */
    def addContainerTask(taskName: String, meshesNames: js.Any, rootUrl: String, sceneFilename: String): ContainerAssetTask = js.native
    
    /**
      * Add a CubeTextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param extensions defines the extension to use to load the cube map (can be null)
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param files defines the list of files to load (can be null)
      * @returns a new CubeTextureAssetTask object
      */
    def addCubeTextureTask(taskName: String, url: String): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.UndefOr[scala.Nothing],
      noMipmap: js.UndefOr[scala.Nothing],
      files: js.Array[String]
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: js.UndefOr[scala.Nothing], noMipmap: Boolean): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.UndefOr[scala.Nothing],
      noMipmap: Boolean,
      files: js.Array[String]
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: js.Array[String]): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: js.UndefOr[scala.Nothing],
      files: js.Array[String]
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: js.Array[String], noMipmap: Boolean): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: Boolean,
      files: js.Array[String]
    ): CubeTextureAssetTask = js.native
    
    /**
      *
      * Add a EquiRectangularCubeTextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param size defines the size you want for the cubemap (can be null)
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param gammaSpace Specifies if the texture will be used in gamma or linear space
      * (the PBR material requires those textures in linear space, but the standard material would require them in Gamma space)
      * @returns a new EquiRectangularCubeTextureAssetTask object
      */
    def addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Double): EquiRectangularCubeTextureAssetTask = js.native
    def addEquiRectangularCubeTextureAssetTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      gammaSpace: Boolean
    ): EquiRectangularCubeTextureAssetTask = js.native
    def addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Double, noMipmap: Boolean): EquiRectangularCubeTextureAssetTask = js.native
    def addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Double, noMipmap: Boolean, gammaSpace: Boolean): EquiRectangularCubeTextureAssetTask = js.native
    
    /**
      *
      * Add a HDRCubeTextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param size defines the size you want for the cubemap (can be null)
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param generateHarmonics defines if you want to automatically generate (true by default)
      * @param gammaSpace specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      * @param reserved Internal use only
      * @returns a new HDRCubeTextureAssetTask object
      */
    def addHDRCubeTextureTask(taskName: String, url: String, size: Double): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      generateHarmonics: js.UndefOr[scala.Nothing],
      gammaSpace: js.UndefOr[scala.Nothing],
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      generateHarmonics: js.UndefOr[scala.Nothing],
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      generateHarmonics: js.UndefOr[scala.Nothing],
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      generateHarmonics: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      generateHarmonics: Boolean,
      gammaSpace: js.UndefOr[scala.Nothing],
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      generateHarmonics: Boolean,
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      generateHarmonics: Boolean,
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(taskName: String, url: String, size: Double, noMipmap: Boolean): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: js.UndefOr[scala.Nothing],
      gammaSpace: js.UndefOr[scala.Nothing],
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: js.UndefOr[scala.Nothing],
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: js.UndefOr[scala.Nothing],
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(taskName: String, url: String, size: Double, noMipmap: Boolean, generateHarmonics: Boolean): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Boolean,
      gammaSpace: js.UndefOr[scala.Nothing],
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Boolean,
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Boolean,
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    
    /**
      * Add a ImageAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @returns a new ImageAssetTask object
      */
    def addImageTask(taskName: String, url: String): ImageAssetTask = js.native
    
    /**
      * Add a MeshAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param meshesNames defines the name of meshes to load
      * @param rootUrl defines the root url to use to locate files
      * @param sceneFilename defines the filename of the scene file
      * @returns a new MeshAssetTask object
      */
    def addMeshTask(taskName: String, meshesNames: js.Any, rootUrl: String, sceneFilename: String): MeshAssetTask = js.native
    
    /**
      * Add a TextFileAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @returns a new TextFileAssetTask object
      */
    def addTextFileTask(taskName: String, url: String): TextFileAssetTask = js.native
    
    /**
      * Add a TextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param invertY defines if you want to invert Y axis of the loaded texture (false by default)
      * @param samplingMode defines the sampling mode to use (Texture.TRILINEAR_SAMPLINGMODE by default)
      * @returns a new TextureAssetTask object
      */
    def addTextureTask(taskName: String, url: String): TextureAssetTask = js.native
    def addTextureTask(
      taskName: String,
      url: String,
      noMipmap: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: js.UndefOr[scala.Nothing], invertY: Boolean): TextureAssetTask = js.native
    def addTextureTask(
      taskName: String,
      url: String,
      noMipmap: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Boolean): TextureAssetTask = js.native
    def addTextureTask(
      taskName: String,
      url: String,
      noMipmap: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Boolean, invertY: Boolean): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Boolean, invertY: Boolean, samplingMode: Double): TextureAssetTask = js.native
    
    /**
      * Gets or sets a boolean defining if the AssetsManager should automatically hide the loading screen
      * when all assets have been downloaded.
      * If set to false, you need to manually call in hideLoadingUI() once your scene is ready.
      */
    var autoHideLoadingUI: Boolean = js.native
    
    /**
      * Start the loading process
      * @return the current instance of the AssetsManager
      */
    def load(): AssetsManager = js.native
    
    /**
      * Start the loading process as an async operation
      * @return a promise returning the list of failed tasks
      */
    def loadAsync(): js.Promise[Unit] = js.native
    
    /**
      * Callback called when all tasks are processed
      */
    def onFinish(tasks: js.Array[AbstractAssetTask]): Unit = js.native
    
    /**
      * Callback called when a task is done (whatever the result is)
      */
    def onProgress(remainingCount: Double, totalCount: Double, task: AbstractAssetTask): Unit = js.native
    
    /**
      * Observable called when a task is done (whatever the result is)
      */
    var onProgressObservable: Observable[IAssetsProgressEvent] = js.native
    
    /**
      * Callback called when a task had an error
      */
    def onTaskError(task: AbstractAssetTask): Unit = js.native
    
    /**
      * Observable called when a task had an error
      */
    var onTaskErrorObservable: Observable[AbstractAssetTask] = js.native
    
    /**
      * Callback called when a task is successful
      */
    def onTaskSuccess(task: AbstractAssetTask): Unit = js.native
    
    /**
      * Observable called when all tasks are processed
      */
    var onTaskSuccessObservable: Observable[AbstractAssetTask] = js.native
    
    /**
      * Observable called when all tasks were executed
      */
    var onTasksDoneObservable: Observable[js.Array[AbstractAssetTask]] = js.native
    
    /**
      * Remove a task from the assets manager.
      * @param task the task to remove
      */
    def removeTask(task: AbstractAssetTask): Unit = js.native
    
    /**
      * Reset the AssetsManager and remove all tasks
      * @return the current instance of the AssetsManager
      */
    def reset(): AssetsManager = js.native
    
    /**
      * Gets or sets a boolean defining if the AssetsManager should use the default loading screen
      * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
      */
    var useDefaultLoadingScreen: Boolean = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "AssetsProgressEvent")
  @js.native
  class AssetsProgressEvent protected () extends IAssetsProgressEvent {
    /**
      * Creates a AssetsProgressEvent
      * @param remainingCount defines the number of remaining tasks to process
      * @param totalCount defines the total number of tasks
      * @param task defines the task that was just processed
      */
    def this(remainingCount: Double, totalCount: Double, task: AbstractAssetTask) = this()
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "BinaryFileAssetTask")
  @js.native
  class BinaryFileAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new BinaryFileAssetTask object
      * @param name defines the name of the new task
      * @param url defines the location of the file to load
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String
    ) = this()
    
    /**
      * Gets the lodaded data (as an array buffer)
      */
    var data: js.typedarray.ArrayBuffer = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: BinaryFileAssetTask): Unit = js.native
    def onError(task: BinaryFileAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: BinaryFileAssetTask, message: String): Unit = js.native
    def onError(task: BinaryFileAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: BinaryFileAssetTask): Unit = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "ContainerAssetTask")
  @js.native
  class ContainerAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new ContainerAssetTask
      * @param name defines the name of the task
      * @param meshesNames defines the list of mesh's names you want to load
      * @param rootUrl defines the root url to use as a base to load your meshes and associated resources
      * @param sceneFilename defines the filename or File of the scene to load from
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: js.Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: js.Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: File
    ) = this()
    
    /**
      * Gets the list of loaded animation groups
      */
    var loadedAnimationGroups: js.Array[AnimationGroup] = js.native
    
    /**
      * Get the loaded asset container
      */
    var loadedContainer: AssetContainer = js.native
    
    /**
      * Gets the list of loaded meshes
      */
    var loadedMeshes: js.Array[AbstractMesh] = js.native
    
    /**
      * Gets the list of loaded particle systems
      */
    var loadedParticleSystems: js.Array[IParticleSystem] = js.native
    
    /**
      * Gets the list of loaded skeletons
      */
    var loadedSkeletons: js.Array[Skeleton] = js.native
    
    /**
      * Defines the list of mesh's names you want to load
      */
    var meshesNames: js.Any = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: ContainerAssetTask): Unit = js.native
    def onError(task: ContainerAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: ContainerAssetTask, message: String): Unit = js.native
    def onError(task: ContainerAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: ContainerAssetTask): Unit = js.native
    
    /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    var rootUrl: String = js.native
    
    /**
      * Defines the filename or File of the scene to load from
      */
    var sceneFilename: String | File = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "CubeTextureAssetTask")
  @js.native
  class CubeTextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[CubeTexture] {
    /**
      * Creates a new CubeTextureAssetTask
      * @param name defines the name of the task
      * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      * @param noMipmap defines if mipmaps should not be generated (default is false)
      * @param files defines the explicit list of files (undefined by default)
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.UndefOr[scala.Nothing],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.UndefOr[scala.Nothing],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.UndefOr[scala.Nothing],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    
    /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Defines the explicit list of files (undefined by default)
      */
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Defines if mipmaps should not be generated (default is false)
      */
    var noMipmap: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: CubeTextureAssetTask): Unit = js.native
    def onError(task: CubeTextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: CubeTextureAssetTask, message: String): Unit = js.native
    def onError(task: CubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: CubeTextureAssetTask): Unit = js.native
    
    /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "EquiRectangularCubeTextureAssetTask")
  @js.native
  class EquiRectangularCubeTextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[EquiRectangularCubeTexture] {
    /**
      * Creates a new EquiRectangularCubeTextureAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      * @param size defines the desired size (the more it increases the longer the generation will be)
      * If the size is omitted this implies you are using a preprocessed cubemap.
      * @param noMipmap defines if mipmaps should not be generated (default is false)
      * @param gammaSpace specifies if the texture will be used in gamma or linear space
      * (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
      * (default is true)
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
      * but the standard material would require them in Gamma space) (default is true)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
      * but the standard material would require them in Gamma space) (default is true)
      */
    gammaSpace: Boolean
    ) = this()
    
    /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
      * but the standard material would require them in Gamma space) (default is true)
      */
    var gammaSpace: Boolean = js.native
    
    /**
      * Defines if mipmaps should not be generated (default is false)
      */
    var noMipmap: Boolean = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
    def onError(task: EquiRectangularCubeTextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: EquiRectangularCubeTextureAssetTask, message: String): Unit = js.native
    def onError(task: EquiRectangularCubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
    
    /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    var size: Double = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "HDRCubeTextureAssetTask")
  @js.native
  class HDRCubeTextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[HDRCubeTexture] {
    /**
      * Creates a new HDRCubeTextureAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      * @param size defines the desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
      * @param noMipmap defines if mipmaps should not be generated (default is false)
      * @param generateHarmonics specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      * @param gammaSpace specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      * @param reserved Internal use only
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: js.UndefOr[scala.Nothing],
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: js.UndefOr[scala.Nothing],
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: js.UndefOr[scala.Nothing],
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: js.UndefOr[scala.Nothing],
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: js.UndefOr[scala.Nothing],
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: js.UndefOr[scala.Nothing],
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: js.UndefOr[scala.Nothing],
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: js.UndefOr[scala.Nothing],
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: js.UndefOr[scala.Nothing],
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: js.UndefOr[scala.Nothing],
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    
    /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    var gammaSpace: Boolean = js.native
    
    /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    var generateHarmonics: Boolean = js.native
    
    /**
      * Defines if mipmaps should not be generated (default is false)
      */
    var noMipmap: Boolean = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: HDRCubeTextureAssetTask): Unit = js.native
    def onError(task: HDRCubeTextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: HDRCubeTextureAssetTask, message: String): Unit = js.native
    def onError(task: HDRCubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: HDRCubeTextureAssetTask): Unit = js.native
    
    /**
      * Internal Use Only
      */
    var reserved: Boolean = js.native
    
    /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    var size: Double = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "ImageAssetTask")
  @js.native
  class ImageAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new ImageAssetTask
      * @param name defines the name of the task
      * @param url defines the location of the image to load
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the image to load
      */
    url: String
    ) = this()
    
    /**
      * Gets the loaded images
      */
    var image: HTMLImageElement = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: ImageAssetTask): Unit = js.native
    def onError(task: ImageAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: ImageAssetTask, message: String): Unit = js.native
    def onError(task: ImageAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: ImageAssetTask): Unit = js.native
    
    /**
      * Defines the location of the image to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "MeshAssetTask")
  @js.native
  class MeshAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new MeshAssetTask
      * @param name defines the name of the task
      * @param meshesNames defines the list of mesh's names you want to load
      * @param rootUrl defines the root url to use as a base to load your meshes and associated resources
      * @param sceneFilename defines the filename or File of the scene to load from
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: js.Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: js.Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: File
    ) = this()
    
    /**
      * Gets the list of loaded animation groups
      */
    var loadedAnimationGroups: js.Array[AnimationGroup] = js.native
    
    /**
      * Gets the list of loaded meshes
      */
    var loadedMeshes: js.Array[AbstractMesh] = js.native
    
    /**
      * Gets the list of loaded particle systems
      */
    var loadedParticleSystems: js.Array[IParticleSystem] = js.native
    
    /**
      * Gets the list of loaded skeletons
      */
    var loadedSkeletons: js.Array[Skeleton] = js.native
    
    /**
      * Defines the list of mesh's names you want to load
      */
    var meshesNames: js.Any = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: MeshAssetTask): Unit = js.native
    def onError(task: MeshAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: MeshAssetTask, message: String): Unit = js.native
    def onError(task: MeshAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: MeshAssetTask): Unit = js.native
    
    /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    var rootUrl: String = js.native
    
    /**
      * Defines the filename or File of the scene to load from
      */
    var sceneFilename: String | File = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "TextFileAssetTask")
  @js.native
  class TextFileAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new TextFileAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String
    ) = this()
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: TextFileAssetTask): Unit = js.native
    def onError(task: TextFileAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: TextFileAssetTask, message: String): Unit = js.native
    def onError(task: TextFileAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: TextFileAssetTask): Unit = js.native
    
    /**
      * Gets the loaded text string
      */
    var text: String = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "TextureAssetTask")
  @js.native
  class TextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[Texture] {
    /**
      * Creates a new TextureAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      * @param noMipmap defines if mipmap should not be generated (default is false)
      * @param invertY defines if texture must be inverted on Y axis (default is true)
      * @param samplingMode defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: js.UndefOr[scala.Nothing],
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: js.UndefOr[scala.Nothing],
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean,
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: js.UndefOr[scala.Nothing],
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean,
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    
    /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    var invertY: Boolean = js.native
    
    /**
      * Defines if mipmap should not be generated (default is false)
      */
    var noMipmap: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: TextureAssetTask): Unit = js.native
    def onError(task: TextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
    def onError(task: TextureAssetTask, message: String): Unit = js.native
    def onError(task: TextureAssetTask, message: String, exception: js.Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: TextureAssetTask): Unit = js.native
    
    /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    var samplingMode: Double = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @js.native
  trait IAssetsProgressEvent extends StObject {
    
    /**
      * Defines the number of remaining tasks to process
      */
    var remainingCount: Double = js.native
    
    /**
      * Defines the task that was just processed
      */
    var task: AbstractAssetTask = js.native
    
    /**
      * Defines the total number of tasks
      */
    var totalCount: Double = js.native
  }
  object IAssetsProgressEvent {
    
    @scala.inline
    def apply(remainingCount: Double, task: AbstractAssetTask, totalCount: Double): IAssetsProgressEvent = {
      val __obj = js.Dynamic.literal(remainingCount = remainingCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAssetsProgressEvent]
    }
    
    @scala.inline
    implicit class IAssetsProgressEventMutableBuilder[Self <: IAssetsProgressEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemainingCount(value: Double): Self = StObject.set(x, "remainingCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: AbstractAssetTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITextureAssetTask[TEX /* <: BaseTexture */] extends StObject {
    
    /**
      * Gets the loaded texture
      */
    var texture: TEX = js.native
  }
  object ITextureAssetTask {
    
    @scala.inline
    def apply[TEX /* <: BaseTexture */](texture: TEX): ITextureAssetTask[TEX] = {
      val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextureAssetTask[TEX]]
    }
    
    @scala.inline
    implicit class ITextureAssetTaskMutableBuilder[Self <: ITextureAssetTask[_], TEX /* <: BaseTexture */] (val x: Self with ITextureAssetTask[TEX]) extends AnyVal {
      
      @scala.inline
      def setTexture(value: TEX): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    }
  }
}
