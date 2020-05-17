package typingsSlinky.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightLuminosity extends js.Object {
  var highlightLuminosity: js.UndefOr[Double] = js.native
  var highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.native
  var load: js.UndefOr[Effect] = js.native
  var pullOutSegmentOnClick: js.UndefOr[Size] = js.native
}

object HighlightLuminosity {
  @scala.inline
  def apply(): HighlightLuminosity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightLuminosity]
  }
  @scala.inline
  implicit class HighlightLuminosityOps[Self <: HighlightLuminosity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightLuminosity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightLuminosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightLuminosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightLuminosity")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSegmentOnMouseover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSegmentOnMouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSegmentOnMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSegmentOnMouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withPullOutSegmentOnClick(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullOutSegmentOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullOutSegmentOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullOutSegmentOnClick")(js.undefined)
        ret
    }
  }
  
}

