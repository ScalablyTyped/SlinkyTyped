package typingsSlinky.mirrorx.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.AnchorHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var to: LocationDescriptor[LocationState] = js.native
}
object LinkProps {
  
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
