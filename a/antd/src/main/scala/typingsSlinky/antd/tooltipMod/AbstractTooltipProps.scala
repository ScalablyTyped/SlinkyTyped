package typingsSlinky.antd.tooltipMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTooltipProps * / any ]:? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTooltipProps * / any[P]} */ @js.native
trait AbstractTooltipProps extends js.Object {
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
  var builtinPlacements: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var openClassName: js.UndefOr[String] = js.native
  var placement: js.UndefOr[TooltipPlacement] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
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
    def withArrowPointAtCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPointAtCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowPointAtCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPointAtCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjustOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withBuiltinPlacements(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltinPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: TooltipPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

