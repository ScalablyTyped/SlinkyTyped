package typingsSlinky.byline.mod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStreamOptions extends TransformOptions {
  var keepEmptyLines: js.UndefOr[Boolean] = js.native
}

object LineStreamOptions {
  @scala.inline
  def apply(): LineStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStreamOptions]
  }
  @scala.inline
  implicit class LineStreamOptionsOps[Self <: LineStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepEmptyLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEmptyLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepEmptyLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEmptyLines")(js.undefined)
        ret
    }
  }
  
}

