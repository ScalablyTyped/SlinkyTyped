package typingsSlinky.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositorOption extends js.Object {
  var compressionLevel: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[CompositorFilters] = js.native
}

object CompositorOption {
  @scala.inline
  def apply(): CompositorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositorOption]
  }
  @scala.inline
  implicit class CompositorOptionOps[Self <: CompositorOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompressionLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: CompositorFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

