package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationPluginsIndexMod {
  
  @JSImport("babylonjs/Navigation/Plugins/index", "RecastJSCrowd")
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
  
  @JSImport("babylonjs/Navigation/Plugins/index", "RecastJSPlugin")
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
