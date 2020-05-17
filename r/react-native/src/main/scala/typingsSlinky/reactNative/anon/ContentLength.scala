package typingsSlinky.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentLength extends js.Object {
  var contentLength: Double = js.native
  var renderedRows: Double = js.native
  var totalRows: Double = js.native
  var visibleRows: Double = js.native
}

object ContentLength {
  @scala.inline
  def apply(contentLength: Double, renderedRows: Double, totalRows: Double, visibleRows: Double): ContentLength = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], renderedRows = renderedRows.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any], visibleRows = visibleRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentLength]
  }
  @scala.inline
  implicit class ContentLengthOps[Self <: ContentLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

