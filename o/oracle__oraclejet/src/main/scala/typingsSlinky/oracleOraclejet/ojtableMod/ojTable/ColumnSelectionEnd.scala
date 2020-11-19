package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.anon.ColumnNumber
import typingsSlinky.oracleOraclejet.anon.`22`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.anon.EndIndex[K]
  - typingsSlinky.oracleOraclejet.anon.EndKey[K]
*/
trait ColumnSelectionEnd[K] extends js.Object
object ColumnSelectionEnd {
  
  @scala.inline
  def EndIndex[K](endIndex: ColumnNumber): ColumnSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionEnd[K]]
  }
  
  @scala.inline
  def EndKey[K](endKey: `22`[K]): ColumnSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionEnd[K]]
  }
}
