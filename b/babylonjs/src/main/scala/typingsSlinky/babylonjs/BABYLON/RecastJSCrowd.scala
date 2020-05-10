package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RecastJSCrowd")
@js.native
class RecastJSCrowd protected () extends ICrowd {
  /**
    * Constructor
    * @param plugin recastJS plugin
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  def this(plugin: RecastJSPlugin, maxAgents: Double, maxAgentRadius: Double, scene: Scene) = this()
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

