package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncatableString extends js.Object {
  /**
    * The number of bytes removed from the original string. If this
    * value is 0, then the string was not shortened.
    */
  var truncatedByteCount: js.UndefOr[Double] = js.native
  /**
    * The shortened string. For example, if the original string was 500
    * bytes long and the limit of the string was 128 bytes, then this
    * value contains the first 128 bytes of the 500-byte string. Note that
    * truncation always happens on the character boundary, to ensure that
    * truncated string is still valid UTF8. In case of multi-byte characters,
    * size of truncated string can be less than truncation limit.
    */
  var value: js.UndefOr[String] = js.native
}

object TruncatableString {
  @scala.inline
  def apply(): TruncatableString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncatableString]
  }
  @scala.inline
  implicit class TruncatableStringOps[Self <: TruncatableString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTruncatedByteCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedByteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncatedByteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedByteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

