package typingsSlinky.falcorRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var maxPaths: js.UndefOr[Double] = js.native
  var maxRefFollow: js.UndefOr[Double] = js.native
}

object RouterOptions {
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPaths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRefFollow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRefFollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRefFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRefFollow")(js.undefined)
        ret
    }
  }
  
}

