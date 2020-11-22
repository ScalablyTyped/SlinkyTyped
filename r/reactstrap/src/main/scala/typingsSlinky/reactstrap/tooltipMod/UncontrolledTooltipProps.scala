package typingsSlinky.reactstrap.tooltipMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.anon.Hide
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UncontrolledTooltipProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var autohide: js.UndefOr[Boolean] = js.native
  
  @JSName("children")
  var children_UncontrolledTooltipProps: js.UndefOr[TooltipChildren] = js.native
  
  var container: js.UndefOr[String | HTMLElement | ReactRef[HTMLElement]] = js.native
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var delay: js.UndefOr[Double | Hide] = js.native
  
  var fade: js.UndefOr[Boolean] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var innerClassName: js.UndefOr[String] = js.native
  
  var modifiers: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
  ] = js.native
  
  var placement: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
  ] = js.native
  
  var popperClassName: js.UndefOr[String] = js.native
  
  var target: String | HTMLElement | ReactRef[HTMLElement] = js.native
}
object UncontrolledTooltipProps {
  
  @scala.inline
  def apply(target: String | HTMLElement | ReactRef[HTMLElement]): UncontrolledTooltipProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledTooltipProps]
  }
  
  @scala.inline
  implicit class UncontrolledTooltipPropsOps[Self <: UncontrolledTooltipProps] (val x: Self) extends AnyVal {
    
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
    def setTargetRefObject(value: ReactRef[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHTMLElement(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String | HTMLElement | ReactRef[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ TooltipChildrenRenderProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: TooltipChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContainerRefObject(value: ReactRef[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHTMLElement(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String | HTMLElement | ReactRef[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setInnerClassName(value: String): Self = this.set("innerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerClassName: Self = this.set("innerClassName", js.undefined)
    
    @scala.inline
    def setModifiers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
    ): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopperClassName(value: String): Self = this.set("popperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperClassName: Self = this.set("popperClassName", js.undefined)
  }
}
