package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// parameters type
@js.native
trait ListBucketsQueryType extends js.Object {
   // search buckets using prefix key
  var marker: js.UndefOr[String] = js.native
   // search start from marker, including marker key
  var `max-keys`: js.UndefOr[String | Double] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object ListBucketsQueryType {
  @scala.inline
  def apply(): ListBucketsQueryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsQueryType]
  }
  @scala.inline
  implicit class ListBucketsQueryTypeOps[Self <: ListBucketsQueryType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-keys`(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-keys`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-keys")(js.undefined)
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
  }
  
}

