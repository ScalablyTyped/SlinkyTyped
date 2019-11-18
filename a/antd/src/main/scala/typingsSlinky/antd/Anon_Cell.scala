package typingsSlinky.antd

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cell extends js.Object {
  var cell: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var row: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var wrapper: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object Anon_Cell {
  @scala.inline
  def apply(
    cell: ReactComponentClass[_] = null,
    row: ReactComponentClass[_] = null,
    wrapper: ReactComponentClass[_] = null
  ): Anon_Cell = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cell]
  }
}

