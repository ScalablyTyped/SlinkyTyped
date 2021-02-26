package typingsSlinky.mjmlReact.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredChildrenProps extends StObject {
  
  var children: ReactElement = js.native
}
object RequiredChildrenProps {
  
  @scala.inline
  def apply(): RequiredChildrenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredChildrenProps]
  }
  
  @scala.inline
  implicit class RequiredChildrenPropsMutableBuilder[Self <: RequiredChildrenProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
