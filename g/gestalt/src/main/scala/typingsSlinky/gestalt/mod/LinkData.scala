package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.gestalt.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkData extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var href: String = js.native
  
  var label: String = js.native
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (SyntheticMouseEvent[HTMLAnchorElement | HTMLButtonElement]) | (SyntheticKeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      js.Object
    ]
  ] = js.native
}
object LinkData {
  
  @scala.inline
  def apply(href: String, label: String): LinkData = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkData]
  }
  
  @scala.inline
  implicit class LinkDataMutableBuilder[Self <: LinkData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(
      value: /* arg */ js.Object with (Event[
          (SyntheticMouseEvent[HTMLAnchorElement | HTMLButtonElement]) | (SyntheticKeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
