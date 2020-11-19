package typingsSlinky.introJs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.introJs.introJsStrings.`bottom-left-aligned`
import typingsSlinky.introJs.introJsStrings.`bottom-middle-aligned`
import typingsSlinky.introJs.introJsStrings.`bottom-right-aligned`
import typingsSlinky.introJs.introJsStrings.auto
import typingsSlinky.introJs.introJsStrings.bottom
import typingsSlinky.introJs.introJsStrings.element
import typingsSlinky.introJs.introJsStrings.left
import typingsSlinky.introJs.introJsStrings.off
import typingsSlinky.introJs.introJsStrings.right
import typingsSlinky.introJs.introJsStrings.tooltip
import typingsSlinky.introJs.introJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends js.Object {
  
  var disableInteraction: js.UndefOr[Boolean] = js.native
  
  var element: js.UndefOr[String | HTMLElement | Element] = js.native
  
  var highlightClass: js.UndefOr[String] = js.native
  
  var intro: String = js.native
  
  var position: js.UndefOr[
    top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
  ] = js.native
  
  var scrollTo: js.UndefOr[off | tooltip | element] = js.native
  
  var tooltipClass: js.UndefOr[String] = js.native
}
object Step {
  
  @scala.inline
  def apply(intro: String): Step = {
    val __obj = js.Dynamic.literal(intro = intro.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    
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
    def setIntro(value: String): Self = this.set("intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableInteraction(value: Boolean): Self = this.set("disableInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInteraction: Self = this.set("disableInteraction", js.undefined)
    
    @scala.inline
    def setElementElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementHTMLElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: String | HTMLElement | Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setHighlightClass(value: String): Self = this.set("highlightClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightClass: Self = this.set("highlightClass", js.undefined)
    
    @scala.inline
    def setPosition(
      value: top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setScrollTo(value: off | tooltip | element): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    
    @scala.inline
    def setTooltipClass(value: String): Self = this.set("tooltipClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipClass: Self = this.set("tooltipClass", js.undefined)
  }
}
