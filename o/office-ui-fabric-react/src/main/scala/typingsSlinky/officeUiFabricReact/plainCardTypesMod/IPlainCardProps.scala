package typingsSlinky.officeUiFabricReact.plainCardTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlainCardProps extends IBaseCardProps[IPlainCard, IPlainCardStyles, IPlainCardStyleProps] {
  /**
    *  Render function to populate compact content area
    */
  var onRenderPlainCard: js.UndefOr[IRenderFunction[_]] = js.native
}

object IPlainCardProps {
  @scala.inline
  def apply(): IPlainCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlainCardProps]
  }
  @scala.inline
  implicit class IPlainCardPropsOps[Self <: IPlainCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRenderPlainCard(
      value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPlainCard")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPlainCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPlainCard")(js.undefined)
        ret
    }
  }
  
}

