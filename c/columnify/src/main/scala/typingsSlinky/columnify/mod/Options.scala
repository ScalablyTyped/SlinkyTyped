package typingsSlinky.columnify.mod

import typingsSlinky.columnify.columnifyStrings.center
import typingsSlinky.columnify.columnifyStrings.centre
import typingsSlinky.columnify.columnifyStrings.left
import typingsSlinky.columnify.columnifyStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var align: js.UndefOr[left | center | centre | right] = js.native
  var dataTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  var headingTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var paddingChr: js.UndefOr[String] = js.native
  var preserveNewLines: js.UndefOr[Boolean] = js.native
  var showHeaders: js.UndefOr[Boolean] = js.native
  var truncateMarker: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | center | centre | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTransform(value: /* data */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingTransform(value: /* data */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeadingTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingChr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingChr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingChr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingChr")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveNewLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveNewLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveNewLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveNewLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateMarker")(js.undefined)
        ret
    }
  }
  
}

