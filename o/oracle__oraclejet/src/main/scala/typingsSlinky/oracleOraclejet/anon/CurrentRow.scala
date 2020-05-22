package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentRow[K]
  extends /* key */ StringDictionary[js.Any] {
  var currentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  var previousCurrentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
}

object CurrentRow {
  @scala.inline
  def apply[K](
    currentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    previousCurrentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CurrentRow[K]]
  }
}

