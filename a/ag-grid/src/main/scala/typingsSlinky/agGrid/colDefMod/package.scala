package typingsSlinky.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colDefMod {
  type ColSpanParams = typingsSlinky.agGrid.colDefMod.BaseColDefParams
  type IAggFunc = js.Function1[/* input */ js.Array[js.Any], js.Any]
  type IsColumnFunc = js.Function1[/* params */ typingsSlinky.agGrid.colDefMod.IsColumnFuncParams, scala.Boolean]
  type RowSpanParams = typingsSlinky.agGrid.colDefMod.BaseColDefParams
  type ValueFormatterParams = typingsSlinky.agGrid.colDefMod.BaseWithValueColDefParams
  type ValueParserParams = typingsSlinky.agGrid.colDefMod.NewValueParams
  type ValueSetterParams = typingsSlinky.agGrid.colDefMod.NewValueParams
}
