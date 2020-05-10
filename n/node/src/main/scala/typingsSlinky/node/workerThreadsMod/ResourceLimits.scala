package typingsSlinky.node.workerThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceLimits extends js.Object {
  var codeRangeSizeMb: js.UndefOr[Double] = js.native
  var maxOldGenerationSizeMb: js.UndefOr[Double] = js.native
  var maxYoungGenerationSizeMb: js.UndefOr[Double] = js.native
}

object ResourceLimits {
  @scala.inline
  def apply(): ResourceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLimits]
  }
  @scala.inline
  implicit class ResourceLimitsOps[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeRangeSizeMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeRangeSizeMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeRangeSizeMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeRangeSizeMb")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOldGenerationSizeMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOldGenerationSizeMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOldGenerationSizeMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOldGenerationSizeMb")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxYoungGenerationSizeMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYoungGenerationSizeMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxYoungGenerationSizeMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYoungGenerationSizeMb")(js.undefined)
        ret
    }
  }
  
}

