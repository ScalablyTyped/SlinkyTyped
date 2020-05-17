package typingsSlinky.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  var stripTrailingSlash: js.UndefOr[Boolean] = js.native
}

object IsCaseSensitive {
  @scala.inline
  def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  @scala.inline
  implicit class IsCaseSensitiveOps[Self <: IsCaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withStripTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlash")(js.undefined)
        ret
    }
  }
  
}

