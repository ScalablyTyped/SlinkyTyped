package typingsSlinky.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pathfinding", "Util")
@js.native
object Util extends js.Object {
  
  def compressPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  
  def expandPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  
  def smoothenPath(grid: Grid, path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
}
