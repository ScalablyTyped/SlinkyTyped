package typingsSlinky.reactabularTable

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var cell: js.UndefOr[
    String | (js.Function2[/* props */ js.Any, /* column */ Column, ReactElement]) | (js.Function1[/* props */ js.Any, ReactInstance])
  ] = js.undefined
  var row: js.UndefOr[String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance])] = js.undefined
  var wrapper: js.UndefOr[String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance])] = js.undefined
}

object AnonCell {
  @scala.inline
  def apply(
    cell: String | (js.Function2[/* props */ js.Any, /* column */ Column, ReactElement]) | (js.Function1[/* props */ js.Any, ReactInstance]) = null,
    row: String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance]) = null,
    wrapper: String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance]) = null
  ): AnonCell = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell]
  }
}

