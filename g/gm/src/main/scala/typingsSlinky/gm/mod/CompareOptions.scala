package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareOptions extends js.Object {
  var file: js.UndefOr[String] = js.native
  var highlightColor: js.UndefOr[String] = js.native
  var highlightStyle: js.UndefOr[HighlightStyle] = js.native
  var tolerance: js.UndefOr[Double] = js.native
}

object CompareOptions {
  @scala.inline
  def apply(): CompareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareOptions]
  }
  @scala.inline
  implicit class CompareOptionsOps[Self <: CompareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightStyle(value: HighlightStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
  }
  
}

