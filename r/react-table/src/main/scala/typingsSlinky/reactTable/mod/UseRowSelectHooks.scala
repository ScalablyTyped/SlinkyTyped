package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableToggleAllRows
import typingsSlinky.reactTable.anon.PartialTableToggleRowsSel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowSelectHooks[D /* <: js.Object */] extends js.Object {
  var getToggleAllRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ] = js.native
  var getToggleRowSelectedProps: js.Array[
    PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
  ] = js.native
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
  @scala.inline
  implicit class UseRowSelectHooksOps[Self[d] <: UseRowSelectHooks[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withGetToggleAllRowsSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToggleAllRowsSelectedProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetToggleRowSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToggleRowSelectedProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

