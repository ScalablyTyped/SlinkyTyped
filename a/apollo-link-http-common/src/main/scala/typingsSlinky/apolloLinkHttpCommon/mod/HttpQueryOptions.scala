package typingsSlinky.apolloLinkHttpCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpQueryOptions extends js.Object {
  var includeExtensions: js.UndefOr[Boolean] = js.native
  var includeQuery: js.UndefOr[Boolean] = js.native
}

object HttpQueryOptions {
  @scala.inline
  def apply(): HttpQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpQueryOptions]
  }
  @scala.inline
  implicit class HttpQueryOptionsOps[Self <: HttpQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeQuery")(js.undefined)
        ret
    }
  }
  
}

