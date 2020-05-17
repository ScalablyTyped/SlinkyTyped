package typingsSlinky.gapiClientDoubleclicksearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteCount extends js.Object {
  /** The size of this report file in bytes. */
  var byteCount: js.UndefOr[String] = js.native
  /** Use this url to download the report file. */
  var url: js.UndefOr[String] = js.native
}

object ByteCount {
  @scala.inline
  def apply(): ByteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteCount]
  }
  @scala.inline
  implicit class ByteCountOps[Self <: ByteCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

