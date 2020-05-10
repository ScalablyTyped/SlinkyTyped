package typingsSlinky.babylonjs.iphysicsengineMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import typingsSlinky.babylonjs.physicsJointMod.PhysicsJoint
import typingsSlinky.babylonjs.physicsRaycastResultMod.PhysicsRaycastResult
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPhysicsEngine extends js.Object {
  /**
    * Gets the gravity vector used by the simulation
    */
  var gravity: Vector3 = js.native
  /**
    * Called by the scene. No need to call it.
    * @param delta defines the timespam between frames
    */
  def _step(delta: Double): Unit = js.native
  /**
    * Adding a new impostor for the impostor tracking.
    * This will be done by the impostor itself.
    * @param impostor the impostor to add
    */
  def addImpostor(impostor: PhysicsImpostor): Unit = js.native
  /**
    * Add a joint to the physics engine
    * @param mainImpostor defines the main impostor to which the joint is added.
    * @param connectedImpostor defines the impostor that is connected to the main impostor using this joint
    * @param joint defines the joint that will connect both impostors.
    */
  def addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
  /**
    * Release all resources
    */
  def dispose(): Unit = js.native
  /**
    * Gets the impostor for a physics enabled object
    * @param object defines the object impersonated by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  def getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): Nullable[PhysicsImpostor] = js.native
  /**
    * Gets the impostor for a physics body object
    * @param body defines physics body used by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  def getImpostorWithPhysicsBody(body: js.Any): Nullable[PhysicsImpostor] = js.native
  /**
    * Gets the list of physic impostors
    * @returns an array of PhysicsImpostor
    */
  def getImpostors(): js.Array[PhysicsImpostor] = js.native
  /**
    * Gets the current plugin used to run the simulation
    * @returns current plugin
    */
  def getPhysicsPlugin(): IPhysicsEnginePlugin = js.native
  /**
    * Gets the name of the current physics plugin
    * @returns the name of the plugin
    */
  def getPhysicsPluginName(): String = js.native
  /**
    * Get the sub time step of the physics engine.
    * @returns the current sub time step
    */
  def getSubTimeStep(): Double = js.native
  /**
    * Get the time step of the physics engine.
    * @returns the current time step
    */
  def getTimeStep(): Double = js.native
  /**
    * Does a raycast in the physics world
    * @param from when should the ray start?
    * @param to when should the ray end?
    * @returns PhysicsRaycastResult
    */
  def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult = js.native
  /**
    * Remove an impostor from the engine.
    * This impostor and its mesh will not longer be updated by the physics engine.
    * @param impostor the impostor to remove
    */
  def removeImpostor(impostor: PhysicsImpostor): Unit = js.native
  /**
    * Removes a joint from the simulation
    * @param mainImpostor defines the impostor used with the joint
    * @param connectedImpostor defines the other impostor connected to the main one by the joint
    * @param joint defines the joint to remove
    */
  def removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
  /**
    * Sets the gravity vector used by the simulation
    * @param gravity defines the gravity vector to use
    */
  def setGravity(gravity: Vector3): Unit = js.native
  /**
    * Set the sub time step of the physics engine.
    * Default is 0 meaning there is no sub steps
    * To increase physics resolution precision, set a small value (like 1 ms)
    * @param subTimeStep defines the new sub timestep used for physics resolution.
    */
  def setSubTimeStep(subTimeStep: Double): Unit = js.native
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep the new timestep to apply to this world.
    */
  def setTimeStep(newTimeStep: Double): Unit = js.native
}

object IPhysicsEngine {
  @scala.inline
  def apply(
    _step: Double => Unit,
    addImpostor: PhysicsImpostor => Unit,
    addJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit,
    dispose: () => Unit,
    getImpostorForPhysicsObject: IPhysicsEnabledObject => Nullable[PhysicsImpostor],
    getImpostorWithPhysicsBody: js.Any => Nullable[PhysicsImpostor],
    getImpostors: () => js.Array[PhysicsImpostor],
    getPhysicsPlugin: () => IPhysicsEnginePlugin,
    getPhysicsPluginName: () => String,
    getSubTimeStep: () => Double,
    getTimeStep: () => Double,
    gravity: Vector3,
    raycast: (Vector3, Vector3) => PhysicsRaycastResult,
    removeImpostor: PhysicsImpostor => Unit,
    removeJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit,
    setGravity: Vector3 => Unit,
    setSubTimeStep: Double => Unit,
    setTimeStep: Double => Unit
  ): IPhysicsEngine = {
    val __obj = js.Dynamic.literal(_step = js.Any.fromFunction1(_step), addImpostor = js.Any.fromFunction1(addImpostor), addJoint = js.Any.fromFunction3(addJoint), dispose = js.Any.fromFunction0(dispose), getImpostorForPhysicsObject = js.Any.fromFunction1(getImpostorForPhysicsObject), getImpostorWithPhysicsBody = js.Any.fromFunction1(getImpostorWithPhysicsBody), getImpostors = js.Any.fromFunction0(getImpostors), getPhysicsPlugin = js.Any.fromFunction0(getPhysicsPlugin), getPhysicsPluginName = js.Any.fromFunction0(getPhysicsPluginName), getSubTimeStep = js.Any.fromFunction0(getSubTimeStep), getTimeStep = js.Any.fromFunction0(getTimeStep), gravity = gravity.asInstanceOf[js.Any], raycast = js.Any.fromFunction2(raycast), removeImpostor = js.Any.fromFunction1(removeImpostor), removeJoint = js.Any.fromFunction3(removeJoint), setGravity = js.Any.fromFunction1(setGravity), setSubTimeStep = js.Any.fromFunction1(setSubTimeStep), setTimeStep = js.Any.fromFunction1(setTimeStep))
    __obj.asInstanceOf[IPhysicsEngine]
  }
  @scala.inline
  implicit class IPhysicsEngineOps[Self <: IPhysicsEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_step(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_step")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddImpostor(value: PhysicsImpostor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addImpostor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddJoint(value: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addJoint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImpostorForPhysicsObject(value: IPhysicsEnabledObject => Nullable[PhysicsImpostor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImpostorForPhysicsObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImpostorWithPhysicsBody(value: js.Any => Nullable[PhysicsImpostor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImpostorWithPhysicsBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImpostors(value: () => js.Array[PhysicsImpostor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImpostors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPhysicsPlugin(value: () => IPhysicsEnginePlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPhysicsPlugin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPhysicsPluginName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPhysicsPluginName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubTimeStep(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubTimeStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeStep(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGravity(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaycast(value: (Vector3, Vector3) => PhysicsRaycastResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raycast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveImpostor(value: PhysicsImpostor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeImpostor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveJoint(value: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeJoint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetGravity(value: Vector3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGravity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubTimeStep(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubTimeStep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTimeStep(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeStep")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

