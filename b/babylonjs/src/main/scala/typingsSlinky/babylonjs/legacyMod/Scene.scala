package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.collisionCoordinatorMod.ICollisionCoordinator
import typingsSlinky.babylonjs.sceneMod.SceneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Scene")
@js.native
class Scene protected ()
  extends typingsSlinky.babylonjs.indexMod.Scene {
  /**
    * Creates a new Scene
    * @param engine defines the engine to use to render this scene
    * @param options defines the scene options
    */
  def this(engine: typingsSlinky.babylonjs.engineMod.Engine) = this()
  def this(engine: typingsSlinky.babylonjs.engineMod.Engine, options: SceneOptions) = this()
}
/* static members */
object Scene {
  
  @JSImport("babylonjs/Legacy/legacy", "Scene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the a collision coordinator.
    * @returns The collision coordinator
    */
  @JSImport("babylonjs/Legacy/legacy", "Scene.CollisionCoordinatorFactory")
  @js.native
  def CollisionCoordinatorFactory(): ICollisionCoordinator = js.native
  
  /**
    * Factory used to create the default material.
    * @param name The name of the material to create
    * @param scene The scene to create the material for
    * @returns The default material
    */
  @JSImport("babylonjs/Legacy/legacy", "Scene.DefaultMaterialFactory")
  @js.native
  def DefaultMaterialFactory(scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.materialMod.Material = js.native
  
  /** The fog density is following an exponential function */
  @JSImport("babylonjs/Legacy/legacy", "Scene.FOGMODE_EXP")
  @js.native
  val FOGMODE_EXP: Double = js.native
  
  /** The fog density is following an exponential function faster than FOGMODE_EXP */
  @JSImport("babylonjs/Legacy/legacy", "Scene.FOGMODE_EXP2")
  @js.native
  val FOGMODE_EXP2: Double = js.native
  
  /** The fog density is following a linear function. */
  @JSImport("babylonjs/Legacy/legacy", "Scene.FOGMODE_LINEAR")
  @js.native
  val FOGMODE_LINEAR: Double = js.native
  
  /** The fog is deactivated */
  @JSImport("babylonjs/Legacy/legacy", "Scene.FOGMODE_NONE")
  @js.native
  val FOGMODE_NONE: Double = js.native
  
  /**
    * Gets or sets the maximum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSImport("babylonjs/Legacy/legacy", "Scene.MaxDeltaTime")
  @js.native
  def MaxDeltaTime: Double = js.native
  @scala.inline
  def MaxDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDeltaTime")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the minimum deltatime when deterministic lock step is enabled
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  @JSImport("babylonjs/Legacy/legacy", "Scene.MinDeltaTime")
  @js.native
  def MinDeltaTime: Double = js.native
  @scala.inline
  def MinDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinDeltaTime")(x.asInstanceOf[js.Any])
}
