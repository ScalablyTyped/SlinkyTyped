package typingsSlinky.officeUiFabricReact.stackTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackTokens extends js.Object {
  /**
    * Defines the spacing between Stack children.
    * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
    * If 'column gap' is omitted, it's set to the same value as 'row gap'.
    */
  var childrenGap: js.UndefOr[Double | String] = js.native
  /**
    * Defines a maximum height for the Stack.
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  /**
    * Defines a maximum width for the Stack.
    */
  var maxWidth: js.UndefOr[Double | String] = js.native
  /**
    * Defines the padding to be applied to the Stack contents relative to its border.
    */
  var padding: js.UndefOr[Double | String] = js.native
}

object IStackTokens {
  @scala.inline
  def apply(): IStackTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackTokens]
  }
  @scala.inline
  implicit class IStackTokensOps[Self <: IStackTokens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenGap(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenGap")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
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

