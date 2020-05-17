package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.anon.RowIndexRowKey
import typingsSlinky.oracleOraclejet.anon.RowKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.anon.RowKey[K]
  - typingsSlinky.oracleOraclejet.anon.RowIndexRowKey[K]
*/
trait CurrentRow[K] extends js.Object

object CurrentRow {
  @scala.inline
  implicit def apply[K](value: RowIndexRowKey[K]): CurrentRow[K] = value.asInstanceOf[CurrentRow[K]]
  @scala.inline
  implicit def apply[K](value: RowKey[K]): CurrentRow[K] = value.asInstanceOf[CurrentRow[K]]
}

