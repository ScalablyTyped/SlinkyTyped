package typingsSlinky.officeUiFabricReact.baseButtonMod

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseButtonProps extends IButtonProps {
  var baseClassName: js.UndefOr[String] = js.native
  var variantClassName: js.UndefOr[String] = js.native
}

object IBaseButtonProps {
  @scala.inline
  def apply(): IBaseButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseButtonProps]
  }
  @scala.inline
  implicit class IBaseButtonPropsOps[Self <: IBaseButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantClassName")(js.undefined)
        ret
    }
  }
  
}

