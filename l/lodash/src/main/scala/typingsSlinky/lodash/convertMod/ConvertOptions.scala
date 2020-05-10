package typingsSlinky.lodash.convertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertOptions extends js.Object {
  var cap: js.UndefOr[Boolean] = js.native
  var curry: js.UndefOr[Boolean] = js.native
  var fixed: js.UndefOr[Boolean] = js.native
  var immutable: js.UndefOr[Boolean] = js.native
  var rearg: js.UndefOr[Boolean] = js.native
}

object ConvertOptions {
  @scala.inline
  def apply(): ConvertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertOptions]
  }
  @scala.inline
  implicit class ConvertOptionsOps[Self <: ConvertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(js.undefined)
        ret
    }
    @scala.inline
    def withCurry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curry")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(js.undefined)
        ret
    }
    @scala.inline
    def withRearg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRearg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearg")(js.undefined)
        ret
    }
  }
  
}

