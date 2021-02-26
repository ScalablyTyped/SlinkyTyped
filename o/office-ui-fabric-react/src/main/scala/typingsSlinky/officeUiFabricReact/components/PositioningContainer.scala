package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainer
import typingsSlinky.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPositionedData
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import typingsSlinky.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PositioningContainer {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.positioningContainerPositioningContainerMod.PositioningContainer
        ] {
    
    @scala.inline
    def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounds(value: IRectangle): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IPositioningContainer]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IPositioningContainer | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IPositioningContainer]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def coverTarget(value: Boolean): this.type = set("coverTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionalHint(value: DirectionalHint): this.type = set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionalHintFixed(value: Boolean): this.type = set("directionalHintFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionalHintForRTL(value: DirectionalHint): this.type = set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def doNotLayer(value: Boolean): this.type = set("doNotLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def finalHeight(value: Double): this.type = set("finalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minPagePadding(value: Double): this.type = set("minPagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetFromTarget(value: Double): this.type = set("offsetFromTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): this.type = set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLayerMounted(value: () => Unit): this.type = set("onLayerMounted", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPositioned(value: /* positions */ js.UndefOr[IPositionedData] => Unit): this.type = set("onPositioned", js.Any.fromFunction1(value))
    
    @scala.inline
    def positioningContainerMaxHeight(value: Double): this.type = set("positioningContainerMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positioningContainerWidth(value: Double): this.type = set("positioningContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventDismissOnScroll(value: Boolean): this.type = set("preventDismissOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialFocus(value: Boolean): this.type = set("setInitialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: HTMLElement | String | MouseEvent | Point): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetMouseEvent(value: MouseEvent): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetNull: this.type = set("target", null)
    
    @scala.inline
    def targetPoint(value: Point): this.type = set("targetPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useTargetPoint(value: Boolean): this.type = set("useTargetPoint", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PositioningContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPositioningContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
