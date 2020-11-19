package typingsSlinky.navigationReact.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.navigationReact.navigationReactStrings.add
import typingsSlinky.navigationReact.navigationReactStrings.none
import typingsSlinky.navigationReact.navigationReactStrings.replace
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps
  extends AnchorHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement] {
  
  /**
    * Determines the effect on browser history
    */
  var historyAction: js.UndefOr[add | replace | none] = js.native
  
  /**
    * Handles Link click events
    */
  var navigating: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[HTMLAnchorElement], /* link */ String, Boolean]
  ] = js.native
}
object LinkProps {
  
  @scala.inline
  def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
    
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
    def setHistoryAction(value: add | replace | none): Self = this.set("historyAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryAction: Self = this.set("historyAction", js.undefined)
    
    @scala.inline
    def setNavigating(value: (/* e */ SyntheticMouseEvent[HTMLAnchorElement], /* link */ String) => Boolean): Self = this.set("navigating", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteNavigating: Self = this.set("navigating", js.undefined)
  }
}
