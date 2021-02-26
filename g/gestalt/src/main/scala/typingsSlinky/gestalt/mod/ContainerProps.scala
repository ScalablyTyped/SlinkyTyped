package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
}
object ContainerProps {
  
  @scala.inline
  def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  
  @scala.inline
  implicit class ContainerPropsMutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
