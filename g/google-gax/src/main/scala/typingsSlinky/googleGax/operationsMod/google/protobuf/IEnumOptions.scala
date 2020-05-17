package typingsSlinky.googleGax.operationsMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EnumOptions. */
@js.native
trait IEnumOptions extends js.Object {
  /** EnumOptions allowAlias */
  var allowAlias: js.UndefOr[Boolean | Null] = js.native
  /** EnumOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  /** EnumOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
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
    def withAllowAliasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAlias")(null)
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
    @scala.inline
    def withDeprecatedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(null)
        ret
    }
    @scala.inline
    def withUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninterpretedOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(js.undefined)
        ret
    }
    @scala.inline
    def withUninterpretedOptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(null)
        ret
    }
  }
  
}

