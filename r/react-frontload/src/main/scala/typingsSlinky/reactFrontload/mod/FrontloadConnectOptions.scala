package typingsSlinky.reactFrontload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrontloadConnectOptions extends js.Object {
  var noServerRender: js.UndefOr[Boolean] = js.native
  var onMount: js.UndefOr[Boolean] = js.native
  var onUpdate: js.UndefOr[Boolean] = js.native
}

object FrontloadConnectOptions {
  @scala.inline
  def apply(): FrontloadConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrontloadConnectOptions]
  }
  @scala.inline
  implicit class FrontloadConnectOptionsOps[Self <: FrontloadConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoServerRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noServerRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoServerRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noServerRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
  }
  
}

