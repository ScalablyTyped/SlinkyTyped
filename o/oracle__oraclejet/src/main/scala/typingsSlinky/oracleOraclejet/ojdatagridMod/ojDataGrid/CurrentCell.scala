package typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid

import typingsSlinky.oracleOraclejet.AnonColumnK
import typingsSlinky.oracleOraclejet.AnonColumnRow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cell
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.column
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.header
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.label
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CurrentCell[K] extends js.Object {
  var axis: js.UndefOr[column | columnEnd | row | rowEnd] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var indexes: js.UndefOr[AnonColumnRow] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var keys: js.UndefOr[AnonColumnK[K]] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var `type`: cell | header | label
}

object CurrentCell {
  @scala.inline
  def apply[K](
    `type`: cell | header | label,
    axis: column | columnEnd | row | rowEnd = null,
    index: Int | Double = null,
    indexes: AnonColumnRow = null,
    key: js.Any = null,
    keys: AnonColumnK[K] = null,
    level: Int | Double = null
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
}

