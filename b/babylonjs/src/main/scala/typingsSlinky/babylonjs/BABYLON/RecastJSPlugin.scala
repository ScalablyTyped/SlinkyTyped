package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RecastJSPlugin")
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

