package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IPhysicsEnginePlugin
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PhysicsEngine")
@js.native
class PhysicsEngine protected ()
  extends typingsSlinky.babylonjs.BABYLON.PhysicsEngine {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[typingsSlinky.babylonjs.BABYLON.Vector3]) = this()
  def this(gravity: Nullable[typingsSlinky.babylonjs.BABYLON.Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
}

/* static members */
@JSGlobal("BABYLON.PhysicsEngine")
@js.native
object PhysicsEngine extends js.Object {
  /**
    * Global value used to control the smallest number supported by the simulation
    */
  var Epsilon: Double = js.native
  /**
    * Factory used to create the default physics plugin.
    * @returns The default physics plugin
    */
  def DefaultPluginFactory(): IPhysicsEnginePlugin = js.native
}

