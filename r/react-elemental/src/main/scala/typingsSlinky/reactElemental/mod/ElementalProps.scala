package typingsSlinky.reactElemental.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactElemental.anon.Primary
import typingsSlinky.reactElemental.anon.PrimaryDark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementalProps extends StObject {
  
  val children: ReactElement = js.native
  
  val colorOpts: js.UndefOr[PrimaryDark] = js.native
  
  val fontOpts: js.UndefOr[Primary] = js.native
}
object ElementalProps {
  
  @scala.inline
  def apply(): ElementalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementalProps]
  }
  
  @scala.inline
  implicit class ElementalPropsMutableBuilder[Self <: ElementalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColorOpts(value: PrimaryDark): Self = StObject.set(x, "colorOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorOptsUndefined: Self = StObject.set(x, "colorOpts", js.undefined)
    
    @scala.inline
    def setFontOpts(value: Primary): Self = StObject.set(x, "fontOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontOptsUndefined: Self = StObject.set(x, "fontOpts", js.undefined)
  }
}
