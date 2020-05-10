package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlgroupOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.native
  var excludeInvisible: js.UndefOr[Boolean] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ControlgroupOptions {
  @scala.inline
  def apply(): ControlgroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlgroupOptions]
  }
  @scala.inline
  implicit class ControlgroupOptionsOps[Self <: ControlgroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeInvisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeInvisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeInvisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeInvisible")(js.undefined)
        ret
    }
    @scala.inline
    def withMini(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMini: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

