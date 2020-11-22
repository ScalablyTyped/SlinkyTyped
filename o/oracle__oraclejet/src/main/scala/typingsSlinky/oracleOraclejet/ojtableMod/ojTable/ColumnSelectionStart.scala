package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.anon.ColumnNumber
import typingsSlinky.oracleOraclejet.anon.`22`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.anon.StartKey[K]
  - typingsSlinky.oracleOraclejet.anon.StartIndexStartKey[K]
*/
trait ColumnSelectionStart[K] extends js.Object
object ColumnSelectionStart {
  
  @scala.inline
  def StartKey[K](startIndex: ColumnNumber): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
  
  @scala.inline
  def StartIndexStartKey[K](startKey: `22`[K]): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
}
