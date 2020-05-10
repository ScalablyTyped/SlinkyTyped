package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.Anon20
import typingsSlinky.oracleOraclejet.Anon21
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.AnonStartKey[K]
  - typingsSlinky.oracleOraclejet.AnonStartIndexStartKey[K]
*/
trait ColumnSelectionStart[K] extends js.Object

object ColumnSelectionStart {
  @scala.inline
  def AnonStartKey[K](startIndex: Anon20): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
  @scala.inline
  def AnonStartIndexStartKey[K](startKey: Anon21[K]): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
}

