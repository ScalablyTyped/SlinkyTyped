package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUploadsQuery extends js.Object {
  var `key-marker`: js.UndefOr[String] = js.native
  var `max-uploads`: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var `upload-id-marker`: js.UndefOr[String] = js.native
}

object ListUploadsQuery {
  @scala.inline
  def apply(): ListUploadsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUploadsQuery]
  }
  @scala.inline
  implicit class ListUploadsQueryOps[Self <: ListUploadsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withKey-marker`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutKey-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key-marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-uploads`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-uploads`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-uploads")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def `withUpload-id-marker`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload-id-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUpload-id-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload-id-marker")(js.undefined)
        ret
    }
  }
  
}

