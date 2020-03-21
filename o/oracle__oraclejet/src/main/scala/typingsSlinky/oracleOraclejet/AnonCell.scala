package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var cell: none | single | multiple
  var row: none | single | multiple
}

object AnonCell {
  @scala.inline
  def apply(cell: none | single | multiple, row: none | single | multiple): AnonCell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCell]
  }
}

