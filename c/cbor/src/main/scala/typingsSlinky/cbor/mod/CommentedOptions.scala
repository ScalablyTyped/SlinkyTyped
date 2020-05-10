package typingsSlinky.cbor.mod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentedOptions extends TransformOptions {
  var max_depth: js.UndefOr[Double] = js.native
}

object CommentedOptions {
  @scala.inline
  def apply(): CommentedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentedOptions]
  }
  @scala.inline
  implicit class CommentedOptionsOps[Self <: CommentedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_depth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_depth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(js.undefined)
        ret
    }
  }
  
}

