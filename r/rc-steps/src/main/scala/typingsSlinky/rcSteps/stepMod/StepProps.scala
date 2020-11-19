package typingsSlinky.rcSteps.stepMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcSteps.anon.Description
import typingsSlinky.rcSteps.anon.Index
import typingsSlinky.rcSteps.interfaceMod.Icons
import typingsSlinky.rcSteps.interfaceMod.Status
import typingsSlinky.rcSteps.stepsMod.ProgressDotRender
import typingsSlinky.rcSteps.stepsMod.StepIconRender
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepProps extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[ReactElement] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[ReactElement] = js.native
  
  var iconPrefix: js.UndefOr[String] = js.native
  
  var icons: js.UndefOr[Icons] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onStepClick: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var progressDot: js.UndefOr[ProgressDotRender | Boolean] = js.native
  
  var status: js.UndefOr[Status] = js.native
  
  var stepIcon: js.UndefOr[StepIconRender] = js.native
  
  var stepIndex: js.UndefOr[Double] = js.native
  
  var stepNumber: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subTitle: js.UndefOr[ReactElement] = js.native
  
  var tailContent: js.UndefOr[ReactElement] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}
object StepProps {
  
  @scala.inline
  def apply(): StepProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepProps]
  }
  
  @scala.inline
  implicit class StepPropsOps[Self <: StepProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDescriptionReactElement(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconPrefix(value: String): Self = this.set("iconPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPrefix: Self = this.set("iconPrefix", js.undefined)
    
    @scala.inline
    def setIcons(value: Icons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnStepClick(value: /* index */ Double => Unit): Self = this.set("onStepClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStepClick: Self = this.set("onStepClick", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setProgressDotFunction2(value: (/* iconDot */ js.Any, /* info */ Index) => ReactElement): Self = this.set("progressDot", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgressDot(value: ProgressDotRender | Boolean): Self = this.set("progressDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressDot: Self = this.set("progressDot", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStepIcon(value: /* info */ Description => ReactElement): Self = this.set("stepIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStepIcon: Self = this.set("stepIcon", js.undefined)
    
    @scala.inline
    def setStepIndex(value: Double): Self = this.set("stepIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepIndex: Self = this.set("stepIndex", js.undefined)
    
    @scala.inline
    def setStepNumber(value: Double): Self = this.set("stepNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepNumber: Self = this.set("stepNumber", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubTitleReactElement(value: ReactElement): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitle(value: ReactElement): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setTailContentReactElement(value: ReactElement): Self = this.set("tailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTailContent(value: ReactElement): Self = this.set("tailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailContent: Self = this.set("tailContent", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: CSSProperties): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
