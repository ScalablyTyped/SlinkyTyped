package typingsSlinky.materialUiLab.paginationItemPaginationItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationItemTypeMap[P, D /* <: ReactElement */] extends js.Object {
  var classKey: PaginationItemClassKey = js.native
  var defaultComponent: D = js.native
  var props: P with AnonColor = js.native
}

object PaginationItemTypeMap {
  @scala.inline
  def apply[P, D](classKey: PaginationItemClassKey, defaultComponent: D, props: P with AnonColor): PaginationItemTypeMap[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
  }
  @scala.inline
  implicit class PaginationItemTypeMapOps[Self[p, d] <: PaginationItemTypeMap[p, d], P, D] (val x: Self[P, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, D]) with Other]
    @scala.inline
    def withClassKey(value: PaginationItemClassKey): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultComponent(value: D): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: P with AnonColor): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

