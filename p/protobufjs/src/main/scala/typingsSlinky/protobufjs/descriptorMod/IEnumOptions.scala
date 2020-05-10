package typingsSlinky.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnumOptions extends js.Object {
  var allowAlias: js.UndefOr[Boolean] = js.native
  var deprecated: js.UndefOr[Boolean] = js.native
}

object IEnumOptions {
  @scala.inline
  def apply(): IEnumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumOptions]
  }
  @scala.inline
  implicit class IEnumOptionsOps[Self <: IEnumOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAlias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
  }
  
}

