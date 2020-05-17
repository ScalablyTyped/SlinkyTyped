package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.anon.EndIndex
import typingsSlinky.oracleOraclejet.anon.EndKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.anon.EndIndex[K]
  - typingsSlinky.oracleOraclejet.anon.EndKey[K]
*/
trait ColumnSelectionEnd[K] extends js.Object

object ColumnSelectionEnd {
  @scala.inline
  implicit def apply[K](value: EndIndex[K]): ColumnSelectionEnd[K] = value.asInstanceOf[ColumnSelectionEnd[K]]
  @scala.inline
  implicit def apply[K](value: EndKey[K]): ColumnSelectionEnd[K] = value.asInstanceOf[ColumnSelectionEnd[K]]
}

