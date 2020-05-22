package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableToggleAllRows
import typingsSlinky.reactTable.anon.PartialTableToggleRowsSel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowSelectHooks[D /* <: js.Object */] extends js.Object {
  var getToggleAllRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ]
  var getToggleRowSelectedProps: js.Array[
    PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
  ]
}

object UseRowSelectHooks {
  @scala.inline
  def apply[D](
    getToggleAllRowsSelectedProps: js.Array[
      PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
    ],
    getToggleRowSelectedProps: js.Array[
      PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
    ]
  ): UseRowSelectHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllRowsSelectedProps = getToggleAllRowsSelectedProps.asInstanceOf[js.Any], getToggleRowSelectedProps = getToggleRowSelectedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectHooks[D]]
  }
}

