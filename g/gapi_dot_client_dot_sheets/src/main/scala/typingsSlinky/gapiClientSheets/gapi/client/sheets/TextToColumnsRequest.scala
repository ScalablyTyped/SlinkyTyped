package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextToColumnsRequest extends js.Object {
  /**
    * The delimiter to use. Used only if delimiterType is
    * CUSTOM.
    */
  var delimiter: js.UndefOr[String] = js.native
  /** The delimiter type to use. */
  var delimiterType: js.UndefOr[String] = js.native
  /** The source data range.  This must span exactly one column. */
  var source: js.UndefOr[GridRange] = js.native
}

object TextToColumnsRequest {
  @scala.inline
  def apply(): TextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextToColumnsRequest]
  }
  @scala.inline
  implicit class TextToColumnsRequestOps[Self <: TextToColumnsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterType")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

