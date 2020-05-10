package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "RecastJSCrowd")
@js.native
class RecastJSCrowd protected ()
  extends typingsSlinky.babylonjs.navigationIndexMod.RecastJSCrowd {
  /**
    * Constructor
    * @param plugin recastJS plugin
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  def this(
    plugin: typingsSlinky.babylonjs.recastJSPluginMod.RecastJSPlugin,
    maxAgents: Double,
    maxAgentRadius: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}

