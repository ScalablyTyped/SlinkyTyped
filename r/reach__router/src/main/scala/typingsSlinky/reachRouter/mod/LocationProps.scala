package typingsSlinky.reachRouter.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationProps extends StObject {
  
  var children: LocationProviderRenderFn = js.native
}
object LocationProps {
  
  @scala.inline
  def apply(children: /* context */ LocationContext => ReactElement): LocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[LocationProps]
  }
  
  @scala.inline
  implicit class LocationPropsMutableBuilder[Self <: LocationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* context */ LocationContext => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
