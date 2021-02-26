package typingsSlinky.baseui.menuMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedMenuProps extends StObject {
  
  var children: ReactElement = js.native
}
object NestedMenuProps {
  
  @scala.inline
  def apply(): NestedMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedMenuProps]
  }
  
  @scala.inline
  implicit class NestedMenuPropsMutableBuilder[Self <: NestedMenuProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
