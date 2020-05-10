package typingsSlinky.routeNode.mod

import typingsSlinky.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptions extends js.Object {
  var queryParams: js.UndefOr[IOptions] = js.native
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
}

object BuildOptions {
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  @scala.inline
  implicit class BuildOptionsOps[Self <: BuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryParams(value: IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParamsMode(value: QueryParamsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParamsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingSlashMode(value: TrailingSlashMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlashMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingSlashMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlashMode")(js.undefined)
        ret
    }
  }
  
}

