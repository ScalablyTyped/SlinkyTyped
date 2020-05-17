package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearFilter extends js.Object {
  var clearFilter: js.UndefOr[String] = js.native
  var createFilter: js.UndefOr[String] = js.native
  var filterEnabledHint: js.UndefOr[String] = js.native
}

object ClearFilter {
  @scala.inline
  def apply(): ClearFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearFilter]
  }
  @scala.inline
  implicit class ClearFilterOps[Self <: ClearFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterEnabledHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnabledHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterEnabledHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnabledHint")(js.undefined)
        ret
    }
  }
  
}

