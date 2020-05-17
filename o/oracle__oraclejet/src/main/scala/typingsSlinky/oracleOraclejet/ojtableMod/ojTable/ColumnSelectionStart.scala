package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.anon.StartIndexStartKey
import typingsSlinky.oracleOraclejet.anon.StartKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.anon.StartKey[K]
  - typingsSlinky.oracleOraclejet.anon.StartIndexStartKey[K]
*/
trait ColumnSelectionStart[K] extends js.Object

object ColumnSelectionStart {
  @scala.inline
  implicit def apply[K](value: StartIndexStartKey[K]): ColumnSelectionStart[K] = value.asInstanceOf[ColumnSelectionStart[K]]
  @scala.inline
  implicit def apply[K](value: StartKey[K]): ColumnSelectionStart[K] = value.asInstanceOf[ColumnSelectionStart[K]]
}

