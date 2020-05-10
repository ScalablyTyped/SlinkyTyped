package typingsSlinky.pathParser.mod

import typingsSlinky.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuildOptions extends js.Object {
  var ignoreConstraints: js.UndefOr[Boolean] = js.native
  var ignoreSearch: js.UndefOr[Boolean] = js.native
  var queryParams: js.UndefOr[IOptions] = js.native
}

object IBuildOptions {
  @scala.inline
  def apply(): IBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBuildOptions]
  }
  @scala.inline
  implicit class IBuildOptionsOps[Self <: IBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreConstraints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSearch")(js.undefined)
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
  }
  
}

