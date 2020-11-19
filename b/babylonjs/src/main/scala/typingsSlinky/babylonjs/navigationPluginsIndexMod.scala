package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Navigation/Plugins/index", JSImport.Namespace)
@js.native
object navigationPluginsIndexMod extends js.Object {
  
  @js.native
  class RecastJSCrowd protected ()
    extends typingsSlinky.babylonjs.recastJSPluginMod.RecastJSCrowd {
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
      scene: Scene
    ) = this()
  }
  
  @js.native
  /**
    * Initializes the recastJS plugin
    * @param recastInjection can be used to inject your own recast reference
    */
  class RecastJSPlugin ()
    extends typingsSlinky.babylonjs.recastJSPluginMod.RecastJSPlugin {
    def this(recastInjection: js.Any) = this()
  }
}
