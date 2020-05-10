package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.AnonRowKey[K]
  - typingsSlinky.oracleOraclejet.AnonRowIndexRowKey[K]
*/
trait CurrentRow[K] extends js.Object

object CurrentRow {
  @scala.inline
  def AnonRowKey[K](rowIndex: Double): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  @scala.inline
  def AnonRowIndexRowKey[K](rowKey: K): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
}

