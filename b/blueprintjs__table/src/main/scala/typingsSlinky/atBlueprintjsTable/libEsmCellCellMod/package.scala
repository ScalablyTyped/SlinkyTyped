package typingsSlinky.atBlueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCellCellMod {
  import slinky.core.facade.ReactElement

  type ICellRenderer = js.Function2[/* rowIndex */ Double, /* columnIndex */ Double, ReactElement]
}
