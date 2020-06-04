package typingsSlinky.antd.tooltipMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTooltipProps * / any ]:? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTooltipProps * / any[P]} */ trait AbstractTooltipProps extends js.Object {
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.undefined
  var builtinPlacements: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var openClassName: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[TooltipPlacement] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AbstractTooltipProps {
  @scala.inline
  def apply(): AbstractTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractTooltipProps]
  }
  @scala.inline
  implicit class AbstractTooltipPropsOps[Self <: AbstractTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrowPointAtCenter(value: Boolean): Self = this.set("arrowPointAtCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowPointAtCenter: Self = this.set("arrowPointAtCenter", js.undefined)
    @scala.inline
    def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = this.set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAdjustOverflow: Self = this.set("autoAdjustOverflow", js.undefined)
    @scala.inline
    def setBuiltinPlacements(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
    ): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setOpenClassName(value: String): Self = this.set("openClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenClassName: Self = this.set("openClassName", js.undefined)
    @scala.inline
    def setPlacement(value: TooltipPlacement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

