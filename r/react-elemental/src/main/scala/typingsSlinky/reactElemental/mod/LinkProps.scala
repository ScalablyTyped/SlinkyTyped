package typingsSlinky.reactElemental.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.AnchorHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  
  val activeColor: js.UndefOr[String] = js.native
  
  val ref: js.UndefOr[String] = js.native
  
  @JSName("type")
  val type_LinkProps: js.UndefOr[LinkType] = js.native
}
object LinkProps {
  
  @scala.inline
  def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setType(value: LinkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
