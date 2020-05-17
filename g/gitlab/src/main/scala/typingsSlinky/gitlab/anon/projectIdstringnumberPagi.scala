package typingsSlinky.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  projectId ? :string | number} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
@js.native
trait projectIdstringnumberPagi
  extends /* key */ StringDictionary[js.Any] {
  var maxPages: js.UndefOr[Double] = js.native
  var page: js.UndefOr[Double] = js.native
  var perPage: js.UndefOr[Double] = js.native
  var projectId: js.UndefOr[String | Double] = js.native
  var showPagination: js.UndefOr[Boolean] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object projectIdstringnumberPagi {
  @scala.inline
  def apply(): projectIdstringnumberPagi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[projectIdstringnumberPagi]
  }
  @scala.inline
  implicit class projectIdstringnumberPagiOps[Self <: projectIdstringnumberPagi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPages")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPage")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPagination")(js.undefined)
        ret
    }
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
  }
  
}

