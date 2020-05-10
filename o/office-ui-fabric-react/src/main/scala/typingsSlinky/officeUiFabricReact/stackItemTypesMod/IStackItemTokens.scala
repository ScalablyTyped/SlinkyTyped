package typingsSlinky.officeUiFabricReact.stackItemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackItemTokens extends js.Object {
  /**
    * Defines the margin to be applied to the StackItem relative to its container.
    */
  var margin: js.UndefOr[Double | String] = js.native
  /**
    * Defines the padding to be applied to the StackItem contents relative to its border.
    */
  var padding: js.UndefOr[Double | String] = js.native
}

object IStackItemTokens {
  @scala.inline
  def apply(): IStackItemTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackItemTokens]
  }
  @scala.inline
  implicit class IStackItemTokensOps[Self <: IStackItemTokens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMargin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

