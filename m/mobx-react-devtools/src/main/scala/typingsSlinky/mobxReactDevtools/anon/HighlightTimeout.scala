package typingsSlinky.mobxReactDevtools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightTimeout extends js.Object {
  var highlightTimeout: js.UndefOr[Double] = js.native
}

object HighlightTimeout {
  @scala.inline
  def apply(): HighlightTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightTimeout]
  }
  @scala.inline
  implicit class HighlightTimeoutOps[Self <: HighlightTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightTimeout")(js.undefined)
        ret
    }
  }
  
}

