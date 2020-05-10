package typingsSlinky.cleanCss.mod

import typingsSlinky.cleanCss.AnonAll
import typingsSlinky.cleanCss.AnonMergeAdjacentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring optimizations
  */
@js.native
trait OptimizationsOptions extends js.Object {
  var `1`: js.UndefOr[AnonAll] = js.native
  var `2`: js.UndefOr[AnonMergeAdjacentRules] = js.native
}

object OptimizationsOptions {
  @scala.inline
  def apply(): OptimizationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationsOptions]
  }
  @scala.inline
  implicit class OptimizationsOptionsOps[Self <: OptimizationsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: AnonAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(js.undefined)
        ret
    }
    @scala.inline
    def with2(value: AnonMergeAdjacentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(js.undefined)
        ret
    }
  }
  
}

