package typingsSlinky.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRouteRedirect extends StObject {
  
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "from" URL. It needs to be an exact match of the navigated URL in order to apply.  The path specified in this value is always an absolute path, even if the initial `/` slash is not specified.
    */
  var from: String = js.native
  
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "to" URL. When the defined `ion-route-redirect` rule matches, the router will redirect to the path specified in this property.  The value of this property is always an absolute path inside the scope of routes defined in `ion-router` it can't be used with another router or to perform a redirection to a different domain.  Note that this is a virtual redirect, it will not cause a real browser refresh, again, it's a redirect inside the context of ion-router.  When this property is not specified or his value is `undefined` the whole redirect route is noop, even if the "from" value matches.
    */
  var to: js.UndefOr[String | Null] = js.native
}
object IonRouteRedirect {
  
  @scala.inline
  def apply(from: String): IonRouteRedirect = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouteRedirect]
  }
  
  @scala.inline
  implicit class IonRouteRedirectMutableBuilder[Self <: IonRouteRedirect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToNull: Self = StObject.set(x, "to", null)
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
