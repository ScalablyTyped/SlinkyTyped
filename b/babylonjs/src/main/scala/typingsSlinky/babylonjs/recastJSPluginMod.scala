package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.inavigationengineMod.ICrowd
import typingsSlinky.babylonjs.inavigationengineMod.INavigationEnginePlugin
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Navigation/Plugins/recastJSPlugin", JSImport.Namespace)
@js.native
object recastJSPluginMod extends js.Object {
  
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
  
  @js.native
  /**
    * Initializes the recastJS plugin
    * @param recastInjection can be used to inject your own recast reference
    */
  class RecastJSPlugin () extends INavigationEnginePlugin {
    def this(recastInjection: js.Any) = this()
    
    /**
      * Reference to the Recast library
      */
    var bjsRECAST: js.Any = js.native
    
    /**
      * the first navmesh created. We might extend this to support multiple navmeshes
      */
    var navMesh: js.Any = js.native
  }
}
