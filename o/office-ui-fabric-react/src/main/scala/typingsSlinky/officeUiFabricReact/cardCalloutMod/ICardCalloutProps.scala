package typingsSlinky.officeUiFabricReact.cardCalloutMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardCalloutProps
  extends IBaseCardProps[js.Object, js.Object, js.Object] {
  var content: js.UndefOr[ReactElement] = js.native
  var finalHeight: js.UndefOr[Double] = js.native
}

object ICardCalloutProps {
  @scala.inline
  def apply(): ICardCalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardCalloutProps]
  }
  @scala.inline
  implicit class ICardCalloutPropsOps[Self <: ICardCalloutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalHeight")(js.undefined)
        ret
    }
  }
  
}

