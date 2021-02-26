package typingsSlinky.reactRouter.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteProps extends StObject {
  
  var children: js.UndefOr[
    (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactElement]) | ReactElement
  ] = js.native
  
  var component: js.UndefOr[ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])]] = js.native
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var location: js.UndefOr[Location[LocationState]] = js.native
  
  var path: js.UndefOr[String | js.Array[String]] = js.native
  
  var render: js.UndefOr[
    js.Function1[/* props */ RouteComponentProps[_, StaticContext, LocationState], ReactElement]
  ] = js.native
  
  var sensitive: js.UndefOr[Boolean] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object RouteProps {
  
  @scala.inline
  def apply(): RouteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteProps]
  }
  
  @scala.inline
  implicit class RoutePropsMutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactElement]) | ReactElement
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ RouteChildrenProps[_, LocationState] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setComponent(value: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRender(value: /* props */ RouteComponentProps[_, StaticContext, LocationState] => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
