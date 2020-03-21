package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.Anon20
import typingsSlinky.oracleOraclejet.Anon21
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.AnonEndIndex[K]
  - typingsSlinky.oracleOraclejet.AnonEndKey[K]
*/
trait ColumnSelectionEnd[K] extends js.Object

object ColumnSelectionEnd {
  @scala.inline
  def AnonEndIndex[K](endIndex: Anon20, endKey: Anon21[K] = null): ColumnSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionEnd[K]]
  }
  @scala.inline
  def AnonEndKey[K](endKey: Anon21[K], endIndex: Anon20 = null): ColumnSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionEnd[K]]
  }
}

