package typingsSlinky.reachRouter.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchProps[TParams] extends StObject {
  
  var children: MatchRenderFn[TParams] = js.native
  
  var path: String = js.native
}
object MatchProps {
  
  @scala.inline
  def apply[TParams](children: /* props */ MatchRenderProps[TParams] => ReactElement, path: String): MatchProps[TParams] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchProps[TParams]]
  }
  
  @scala.inline
  implicit class MatchPropsMutableBuilder[Self <: MatchProps[_], TParams] (val x: Self with MatchProps[TParams]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* props */ MatchRenderProps[TParams] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
