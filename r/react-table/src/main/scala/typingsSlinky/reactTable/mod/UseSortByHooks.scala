package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSortByHooks[D /* <: js.Object */] extends js.Object {
  var getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
}

object UseSortByHooks {
  @scala.inline
  def apply[D](
    getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseSortByHooks[D] = {
    val __obj = js.Dynamic.literal(getSortByToggleProps = getSortByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByHooks[D]]
  }
  @scala.inline
  implicit class UseSortByHooksOps[Self[d] <: UseSortByHooks[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withGetSortByToggleProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortByToggleProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

