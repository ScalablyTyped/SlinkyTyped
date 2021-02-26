package typingsSlinky.reactMdl.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FooterSectionProps
  extends MDLHTMLAttributes
     with DOMAttributes[FooterSection] {
  
  var logo: js.UndefOr[ReactElement] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object FooterSectionProps {
  
  @scala.inline
  def apply(): FooterSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterSectionProps]
  }
  
  @scala.inline
  implicit class FooterSectionPropsMutableBuilder[Self <: FooterSectionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogo(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoReactElement(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
