package typingsSlinky.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ionicCore.routeInterfaceMod.NavigationHookCallback
import typingsSlinky.ionicCore.routeInterfaceMod.NavigationHookResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRoute extends StObject {
  
  /**
    * A navigation hook that is fired when the route tries to enter. Returning `true` allows the navigation to proceed, while returning `false` causes it to be cancelled. Returning a `NavigationHookOptions` object causes the router to redirect to the path specified.
    */
  var beforeEnter: js.UndefOr[NavigationHookCallback] = js.native
  
  /**
    * A navigation hook that is fired when the route tries to leave. Returning `true` allows the navigation to proceed, while returning `false` causes it to be cancelled. Returning a `NavigationHookOptions` object causes the router to redirect to the path specified.
    */
  var beforeLeave: js.UndefOr[NavigationHookCallback] = js.native
  
  /**
    * Name of the component to load/select in the navigation outlet (`ion-tabs`, `ion-nav`) when the route matches.  The value of this property is not always the tagname of the component to load, in `ion-tabs` it actually refers to the name of the `ion-tab` to select.
    */
  var component: String = js.native
  
  /**
    * A key value `{ 'red': true, 'blue': 'white'}` containing props that should be passed to the defined component when rendered.
    */
  var componentProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Relative path that needs to match in order for this route to apply.  Accepts paths similar to expressjs so that you can define parameters in the url /foo/:bar where bar would be available in incoming props.
    */
  var url: String = js.native
}
object IonRoute {
  
  @scala.inline
  def apply(component: String, url: String): IonRoute = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRoute]
  }
  
  @scala.inline
  implicit class IonRouteMutableBuilder[Self <: IonRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeEnter(value: () => NavigationHookResult | js.Promise[NavigationHookResult]): Self = StObject.set(x, "beforeEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
    
    @scala.inline
    def setBeforeLeave(value: () => NavigationHookResult | js.Promise[NavigationHookResult]): Self = StObject.set(x, "beforeLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeLeaveUndefined: Self = StObject.set(x, "beforeLeave", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
