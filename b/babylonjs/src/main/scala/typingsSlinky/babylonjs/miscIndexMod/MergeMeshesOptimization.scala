package typingsSlinky.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "MergeMeshesOptimization")
@js.native
/**
  * Creates the SceneOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param desc defines the description associated with the optimization
  */
class MergeMeshesOptimization ()
  extends typingsSlinky.babylonjs.sceneOptimizerMod.MergeMeshesOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double) = this()
}
/* static members */
object MergeMeshesOptimization {
  
  @JSImport("babylonjs/Misc/index", "MergeMeshesOptimization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Misc/index", "MergeMeshesOptimization._UpdateSelectionTree")
  @js.native
  def _UpdateSelectionTree: js.Any = js.native
  @scala.inline
  def _UpdateSelectionTree_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdateSelectionTree")(x.asInstanceOf[js.Any])
}
