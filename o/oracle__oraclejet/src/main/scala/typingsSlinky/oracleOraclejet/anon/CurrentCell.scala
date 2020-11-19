package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentCell[K]
  extends /* key */ StringDictionary[js.Any] {
  
  var currentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K] = js.native
  
  var previousCurrentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K] = js.native
}
object CurrentCell {
  
  @scala.inline
  def apply[K](
    currentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K],
    previousCurrentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell.asInstanceOf[js.Any], previousCurrentCell = previousCurrentCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
  
  @scala.inline
  implicit class CurrentCellOps[Self <: CurrentCell[_], K] (val x: Self with CurrentCell[K]) extends AnyVal {
    
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
    def setCurrentCell(value: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self = this.set("currentCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousCurrentCell(value: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self = this.set("previousCurrentCell", value.asInstanceOf[js.Any])
  }
}
