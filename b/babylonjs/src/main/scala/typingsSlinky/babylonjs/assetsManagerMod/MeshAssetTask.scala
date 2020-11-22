package typingsSlinky.babylonjs.assetsManagerMod

import org.scalajs.dom.raw.File
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.animationGroupMod.AnimationGroup
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.skeletonMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
