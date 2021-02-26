package typingsSlinky.muicss.reactMod

import org.scalajs.dom.raw.HTMLLIElement
import typingsSlinky.react.mod.LiHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownItemProps extends LiHTMLAttributes[HTMLLIElement] {
  
  var link: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object DropdownItemProps {
  
  @scala.inline
  def apply(): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownItemProps]
  }
  
  @scala.inline
  implicit class DropdownItemPropsMutableBuilder[Self <: DropdownItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
