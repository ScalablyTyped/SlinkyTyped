package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import typingsSlinky.oracleOraclejet.Anon23
import typingsSlinky.oracleOraclejet.AnonRowNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.AnonEndIndexEndKey[K]
  - typingsSlinky.oracleOraclejet.AnonEndIndexAnonRowNumber[K]
*/
trait RowSelectionEnd[K] extends js.Object

object RowSelectionEnd {
  @scala.inline
  def AnonEndIndexEndKey[K](endIndex: AnonRowNumber): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
  @scala.inline
  def AnonEndIndexAnonRowNumber[K](endKey: Anon23[K]): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

