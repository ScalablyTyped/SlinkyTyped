package typingsSlinky.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpPointFinderOptions extends Heuristic {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.native
}
object JumpPointFinderOptions {
  
  @scala.inline
  def apply(): JumpPointFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpPointFinderOptions]
  }
  
  @scala.inline
  implicit class JumpPointFinderOptionsOps[Self <: JumpPointFinderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiagonalMovement(value: DiagonalMovement): Self = this.set("diagonalMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagonalMovement: Self = this.set("diagonalMovement", js.undefined)
  }
}
