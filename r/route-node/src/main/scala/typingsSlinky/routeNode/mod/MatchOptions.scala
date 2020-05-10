package typingsSlinky.routeNode.mod

import typingsSlinky.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var queryParams: js.UndefOr[IOptions] = js.native
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
  var strictTrailingSlash: js.UndefOr[Boolean] = js.native
  var strongMatching: js.UndefOr[Boolean] = js.native
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
}

object MatchOptions {
  @scala.inline
  def apply(): MatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchOptions]
  }
  @scala.inline
  implicit class MatchOptionsOps[Self <: MatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
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
    def withStrictTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withStrongMatching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrongMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongMatching")(js.undefined)
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

