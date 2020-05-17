package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.anon.EndIndexEndKey
import typingsSlinky.oracleOraclejet.anon.EndIndexRowNumber
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
  implicit def apply[K](value: EndIndexEndKey[K]): RowSelectionEnd[K] = value.asInstanceOf[RowSelectionEnd[K]]
  @scala.inline
  implicit def apply[K](value: EndIndexRowNumber[K]): RowSelectionEnd[K] = value.asInstanceOf[RowSelectionEnd[K]]
}

