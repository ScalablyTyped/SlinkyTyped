package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseExpandedHooks[D /* <: js.Object */] extends js.Object {
  var getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
  var getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
}

object UseExpandedHooks {
  @scala.inline
  def apply[D](
    getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]],
    getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseExpandedHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllRowsExpandedProps = getToggleAllRowsExpandedProps.asInstanceOf[js.Any], getToggleRowsExpandedProps = getToggleRowsExpandedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedHooks[D]]
  }
  @scala.inline
  implicit class UseExpandedHooksOps[Self[d] <: UseExpandedHooks[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withGetToggleAllRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToggleAllRowsExpandedProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetToggleRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToggleRowsExpandedProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

