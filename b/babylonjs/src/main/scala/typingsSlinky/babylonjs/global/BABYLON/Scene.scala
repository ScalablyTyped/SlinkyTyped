package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.ICollisionCoordinator
import typingsSlinky.babylonjs.BABYLON.SceneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Scene")
@js.native
class Scene protected ()
  extends typingsSlinky.babylonjs.BABYLON.Scene {
  /**
    * Creates a new Scene
    * @param engine defines the engine to use to render this scene
    * @param options defines the scene options
    */
  def this(engine: typingsSlinky.babylonjs.BABYLON.Engine) = this()
  def this(engine: typingsSlinky.babylonjs.BABYLON.Engine, options: SceneOptions) = this()
}
/* static members */
object Scene {
  
  @JSGlobal("BABYLON.Scene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the a collision coordinator.
    * @returns The collision coordinator
    */
  @JSGlobal("BABYLON.Scene.CollisionCoordinatorFactory")
  @js.native
  def CollisionCoordinatorFactory(): ICollisionCoordinator = js.native
  
  /**
    * Factory used to create the default material.
    * @param name The name of the material to create
    * @param scene The scene to create the material for
    * @returns The default material
    */
  @JSGlobal("BABYLON.Scene.DefaultMaterialFactory")
  @js.native
  def DefaultMaterialFactory(scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.Material = js.native
  
  /** The fog density is following an exponential function */
  @JSGlobal("BABYLON.Scene.FOGMODE_EXP")
  @js.native
  val FOGMODE_EXP: Double = js.native
  
  /** The fog density is following an exponential function faster than FOGMODE_EXP */
  @JSGlobal("BABYLON.Scene.FOGMODE_EXP2")
  @js.native
  val FOGMODE_EXP2: Double = js.native
  
  /** The fog density is following a linear function. */
  @JSGlobal("BABYLON.Scene.FOGMODE_LINEAR")
  @js.native
  val FOGMODE_LINEAR: Double = js.native
  
  /** The fog is deactivated */
  @JSGlobal("BABYLON.Scene.FOGMODE_NONE")
  @js.native
  val FOGMODE_NONE: Double = js.native
  
  /**
    * Gets or sets the maximum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSGlobal("BABYLON.Scene.MaxDeltaTime")
  @js.native
  def MaxDeltaTime: Double = js.native
  @scala.inline
  def MaxDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDeltaTime")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the minimum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSGlobal("BABYLON.Scene.MinDeltaTime")
  @js.native
  def MinDeltaTime: Double = js.native
  @scala.inline
  def MinDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinDeltaTime")(x.asInstanceOf[js.Any])
}
