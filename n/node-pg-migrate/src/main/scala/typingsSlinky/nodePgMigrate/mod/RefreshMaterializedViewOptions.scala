package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshMaterializedViewOptions extends js.Object {
  var concurrently: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[Boolean] = js.native
}

object RefreshMaterializedViewOptions {
  @scala.inline
  def apply(): RefreshMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshMaterializedViewOptions]
  }
  @scala.inline
  implicit class RefreshMaterializedViewOptionsOps[Self <: RefreshMaterializedViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrently(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrently")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrently: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrently")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

