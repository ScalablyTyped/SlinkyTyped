package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspenseListCommonProps extends StObject {
  
  /**
    * Note that SuspenseList require more than one child;
    * it is a runtime warning to provide only a single child.
    *
    * It does, however, allow those children to be wrapped inside a single
    * level of `<React.Fragment>`.
    */
  var children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement] = js.native
}
object SuspenseListCommonProps {
  
  @scala.inline
  def apply(children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): SuspenseListCommonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListCommonProps]
  }
  
  @scala.inline
  implicit class SuspenseListCommonPropsMutableBuilder[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenIterable(value: js.Iterable[slinky.core.facade.ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: slinky.core.facade.ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
