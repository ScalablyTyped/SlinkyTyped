package typingsSlinky.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepViewOptions extends js.Object {
  var make_new_link: js.UndefOr[Boolean] = js.native
  var open_app: js.UndefOr[Boolean] = js.native
}

object DeepViewOptions {
  @scala.inline
  def apply(): DeepViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepViewOptions]
  }
  @scala.inline
  implicit class DeepViewOptionsOps[Self <: DeepViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMake_new_link(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make_new_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMake_new_link: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make_new_link")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_app(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_app: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_app")(js.undefined)
        ret
    }
  }
  
}

