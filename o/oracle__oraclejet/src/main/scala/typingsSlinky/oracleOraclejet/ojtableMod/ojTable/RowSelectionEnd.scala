package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.anon.RowNumber
import typingsSlinky.oracleOraclejet.anon.`23`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.anon.EndIndexEndKey[K]
  - typingsSlinky.oracleOraclejet.anon.EndIndexRowNumber[K]
*/
trait RowSelectionEnd[K] extends js.Object

object RowSelectionEnd {
  @scala.inline
  def EndIndexEndKey[K](endIndex: RowNumber, endKey: `23`[K] = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
  @scala.inline
  def EndIndexRowNumber[K](endKey: `23`[K], endIndex: RowNumber = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

