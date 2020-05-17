package typingsSlinky.emberData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundReload extends js.Object {
  var adapterOptions: js.UndefOr[js.Any] = js.native
  var backgroundReload: js.UndefOr[Boolean] = js.native
  var include: js.UndefOr[String] = js.native
  var reload: js.UndefOr[Boolean] = js.native
}

object BackgroundReload {
  @scala.inline
  def apply(): BackgroundReload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundReload]
  }
  @scala.inline
  implicit class BackgroundReloadOps[Self <: BackgroundReload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapterOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundReload")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.undefined)
        ret
    }
  }
  
}

