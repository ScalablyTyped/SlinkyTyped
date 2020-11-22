package typingsSlinky.babylonjs.miscIndexMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "PivotTools")
@js.native
class PivotTools ()
  extends typingsSlinky.babylonjs.pivotToolsMod.PivotTools
/* static members */
@JSImport("babylonjs/Misc/index", "PivotTools")
@js.native
object PivotTools extends js.Object {
  
  var _OldPivotPoint: js.Any = js.native
  
  var _PivotCached: js.Any = js.native
  
  var _PivotPostMultiplyPivotMatrix: js.Any = js.native
  
  var _PivotTmpVector: js.Any = js.native
  
  var _PivotTranslation: js.Any = js.native
  
  /** @hidden */
  def _RemoveAndStorePivotPoint(mesh: AbstractMesh): Unit = js.native
  
  /** @hidden */
  def _RestorePivotPoint(mesh: AbstractMesh): Unit = js.native
}
