package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecastJSCrowd extends ICrowd {
  /**
    * Observer for crowd updates
    */
  var _onBeforeAnimationsObserver: js.Any = js.native
  /**
    * Link to the scene is kept to unregister the crowd from the scene
    */
  var _scene: js.Any = js.native
  /**
    * All agents created
    */
  var agents: js.Array[Double] = js.native
  /**
    * Recast/detour plugin
    */
  var bjsRECASTPlugin: RecastJSPlugin = js.native
  /**
    * Link to the detour crowd
    */
  var recastCrowd: js.Any = js.native
  /**
    * One transform per agent
    */
  var transforms: js.Array[TransformNode] = js.native
}

object RecastJSCrowd {
  @scala.inline
  def apply(
    _onBeforeAnimationsObserver: js.Any,
    _scene: js.Any,
    addAgent: (Vector3, IAgentParameters, TransformNode) => Double,
    agentGoto: (Double, Vector3) => Unit,
    agentTeleport: (Double, Vector3) => Unit,
    agents: js.Array[Double],
    bjsRECASTPlugin: RecastJSPlugin,
    dispose: () => Unit,
    getAgentPosition: Double => Vector3,
    getAgentVelocity: Double => Vector3,
    getAgents: () => js.Array[Double],
    getDefaultQueryExtent: () => Vector3,
    recastCrowd: js.Any,
    removeAgent: Double => Unit,
    setDefaultQueryExtent: Vector3 => Unit,
    transforms: js.Array[TransformNode],
    update: Double => Unit,
    updateAgentParameters: (Double, IAgentParameters) => Unit
  ): RecastJSCrowd = {
    val __obj = js.Dynamic.literal(_onBeforeAnimationsObserver = _onBeforeAnimationsObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], addAgent = js.Any.fromFunction3(addAgent), agentGoto = js.Any.fromFunction2(agentGoto), agentTeleport = js.Any.fromFunction2(agentTeleport), agents = agents.asInstanceOf[js.Any], bjsRECASTPlugin = bjsRECASTPlugin.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getAgentPosition = js.Any.fromFunction1(getAgentPosition), getAgentVelocity = js.Any.fromFunction1(getAgentVelocity), getAgents = js.Any.fromFunction0(getAgents), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), recastCrowd = recastCrowd.asInstanceOf[js.Any], removeAgent = js.Any.fromFunction1(removeAgent), setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent), transforms = transforms.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateAgentParameters = js.Any.fromFunction2(updateAgentParameters))
    __obj.asInstanceOf[RecastJSCrowd]
  }
  @scala.inline
  implicit class RecastJSCrowdOps[Self <: RecastJSCrowd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_onBeforeAnimationsObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBeforeAnimationsObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgents(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBjsRECASTPlugin(value: RecastJSPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bjsRECASTPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecastCrowd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recastCrowd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[TransformNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

