package typingsSlinky.babylonjs.inavigationengineMod

import typingsSlinky.babylonjs.mathMod.Vector3
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICrowd extends js.Object {
  /**
    * Add a new agent to the crowd with the specified parameter a corresponding transformNode.
    * You can attach anything to that node. The node position is updated in the scene update tick.
    * @param pos world position that will be constrained by the navigation mesh
    * @param parameters agent parameters
    * @param transform hooked to the agent that will be update by the scene
    * @returns agent index
    */
  def addAgent(pos: Vector3, parameters: IAgentParameters, transform: TransformNode): Double = js.native
  /**
    * Asks a particular agent to go to a destination. That destination is constrained by the navigation mesh
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  def agentGoto(index: Double, destination: Vector3): Unit = js.native
  /**
    * Teleport the agent to a new position
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  def agentTeleport(index: Double, destination: Vector3): Unit = js.native
  /**
    * Release all resources
    */
  def dispose(): Unit = js.native
  /**
    * Returns the agent position in world space
    * @param index agent index returned by addAgent
    * @returns world space position
    */
  def getAgentPosition(index: Double): Vector3 = js.native
  /**
    * Gets the agent velocity in world space
    * @param index agent index returned by addAgent
    * @returns world space velocity
    */
  def getAgentVelocity(index: Double): Vector3 = js.native
  /**
    * get the list of all agents attached to this crowd
    * @returns list of agent indices
    */
  def getAgents(): js.Array[Double] = js.native
  /**
    * Get the Bounding box extent specified by setDefaultQueryExtent
    * @returns the box extent values
    */
  def getDefaultQueryExtent(): Vector3 = js.native
  /**
    * remove a particular agent previously created
    * @param index agent index returned by addAgent
    */
  def removeAgent(index: Double): Unit = js.native
  /**
    * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
    * The queries will try to find a solution within those bounds
    * default is (1,1,1)
    * @param extent x,y,z value that define the extent around the queries point of reference
    */
  def setDefaultQueryExtent(extent: Vector3): Unit = js.native
  /**
    * Tick update done by the Scene. Agent position/velocity/acceleration is updated by this function
    * @param deltaTime in seconds
    */
  def update(deltaTime: Double): Unit = js.native
  /**
    * Update agent parameters
    * @param index agent index returned by addAgent
    * @param parameters agent parameters
    */
  def updateAgentParameters(index: Double, parameters: IAgentParameters): Unit = js.native
}

object ICrowd {
  @scala.inline
  def apply(
    addAgent: (Vector3, IAgentParameters, TransformNode) => Double,
    agentGoto: (Double, Vector3) => Unit,
    agentTeleport: (Double, Vector3) => Unit,
    dispose: () => Unit,
    getAgentPosition: Double => Vector3,
    getAgentVelocity: Double => Vector3,
    getAgents: () => js.Array[Double],
    getDefaultQueryExtent: () => Vector3,
    removeAgent: Double => Unit,
    setDefaultQueryExtent: Vector3 => Unit,
    update: Double => Unit,
    updateAgentParameters: (Double, IAgentParameters) => Unit
  ): ICrowd = {
    val __obj = js.Dynamic.literal(addAgent = js.Any.fromFunction3(addAgent), agentGoto = js.Any.fromFunction2(agentGoto), agentTeleport = js.Any.fromFunction2(agentTeleport), dispose = js.Any.fromFunction0(dispose), getAgentPosition = js.Any.fromFunction1(getAgentPosition), getAgentVelocity = js.Any.fromFunction1(getAgentVelocity), getAgents = js.Any.fromFunction0(getAgents), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), removeAgent = js.Any.fromFunction1(removeAgent), setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent), update = js.Any.fromFunction1(update), updateAgentParameters = js.Any.fromFunction2(updateAgentParameters))
    __obj.asInstanceOf[ICrowd]
  }
  @scala.inline
  implicit class ICrowdOps[Self <: ICrowd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAgent(value: (Vector3, IAgentParameters, TransformNode) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAgent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAgentGoto(value: (Double, Vector3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentGoto")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAgentTeleport(value: (Double, Vector3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentTeleport")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAgentPosition(value: Double => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAgentPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAgentVelocity(value: Double => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAgentVelocity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAgents(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAgents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultQueryExtent(value: () => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultQueryExtent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAgent(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAgent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaultQueryExtent(value: Vector3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultQueryExtent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateAgentParameters(value: (Double, IAgentParameters) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAgentParameters")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

