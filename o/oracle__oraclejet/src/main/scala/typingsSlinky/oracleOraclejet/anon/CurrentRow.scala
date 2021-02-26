package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentRow[K]
  extends /* key */ StringDictionary[js.Any] {
  
  var currentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] = js.native
  
  var previousCurrentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] = js.native
}
object CurrentRow {
  
  @scala.inline
  def apply[K](
    currentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    previousCurrentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  ): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  
  @scala.inline
  implicit class CurrentRowMutableBuilder[Self <: CurrentRow[_], K] (val x: Self with CurrentRow[K]) extends AnyVal {
    
    @scala.inline
    def setCurrentRow(value: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = StObject.set(x, "currentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousCurrentRow(value: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = StObject.set(x, "previousCurrentRow", value.asInstanceOf[js.Any])
  }
}
