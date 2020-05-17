package typingsSlinky.googleGax.operationsMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OneofOptions. */
@js.native
trait IOneofOptions extends js.Object {
  /** OneofOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}

object IOneofOptions {
  @scala.inline
  def apply(): IOneofOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneofOptions]
  }
  @scala.inline
  implicit class IOneofOptionsOps[Self <: IOneofOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

