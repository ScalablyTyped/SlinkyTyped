package typingsSlinky.babylonjs.physicsIndexMod

import typingsSlinky.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsEngine")
@js.native
class PhysicsEngine protected ()
  extends typingsSlinky.babylonjs.physicsEngineMod.PhysicsEngine {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[Vector3]) = this()
  def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
}
/* static members */
@JSImport("babylonjs/Physics/index", "PhysicsEngine")
@js.native
object PhysicsEngine extends js.Object {
  
  /**
    * Factory used to create the default physics plugin.
    * @returns The default physics plugin
    */
  def DefaultPluginFactory(): IPhysicsEnginePlugin = js.native
  
  /**
    * Global value used to control the smallest number supported by the simulation
    */
  var Epsilon: Double = js.native
}
