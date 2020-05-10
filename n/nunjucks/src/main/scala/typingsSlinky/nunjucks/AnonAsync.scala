package typingsSlinky.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsync extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var useCache: js.UndefOr[Boolean] = js.native
}

object AnonAsync {
  @scala.inline
  def apply(): AnonAsync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAsync]
  }
  @scala.inline
  implicit class AnonAsyncOps[Self <: AnonAsync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(js.undefined)
        ret
    }
  }
  
}

