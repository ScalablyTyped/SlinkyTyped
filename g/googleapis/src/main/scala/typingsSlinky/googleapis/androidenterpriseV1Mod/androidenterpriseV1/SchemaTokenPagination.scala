package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTokenPagination extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var previousPageToken: js.UndefOr[String] = js.native
}

object SchemaTokenPagination {
  @scala.inline
  def apply(): SchemaTokenPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTokenPagination]
  }
  @scala.inline
  implicit class SchemaTokenPaginationOps[Self <: SchemaTokenPagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPageToken")(js.undefined)
        ret
    }
  }
  
}

