package typingsSlinky.mobxReactDevtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHighlightTimeout extends js.Object {
  var highlightTimeout: js.UndefOr[Double] = js.native
}

object AnonHighlightTimeout {
  @scala.inline
  def apply(): AnonHighlightTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHighlightTimeout]
  }
  @scala.inline
  implicit class AnonHighlightTimeoutOps[Self <: AnonHighlightTimeout] (val x: Self) extends AnyVal {
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

