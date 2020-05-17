package typingsSlinky.googleGax.operationsMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ServiceOptions. */
@js.native
trait IServiceOptions extends js.Object {
  /** ServiceOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  /** ServiceOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}

object IServiceOptions {
  @scala.inline
  def apply(): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceOptions]
  }
  @scala.inline
  implicit class IServiceOptionsOps[Self <: IServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

