package typingsSlinky.ravenForRedux

import typingsSlinky.ravenJs.mod.RavenStatic
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raven-for-redux", JSImport.Namespace)
  @js.native
  def apply(raven: RavenStatic): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("raven-for-redux", JSImport.Namespace)
  @js.native
  def apply(raven: RavenStatic, options: RavenMiddlewareOptions[_]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @js.native
  trait RavenMiddlewareOptions[T] extends StObject {
    
    var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], Action[_]]] = js.native
    
    var breadcrumbCategory: js.UndefOr[String] = js.native
    
    var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
    
    var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.native
    
    var getUserContext: js.UndefOr[js.Function1[/* state */ T, RavenUserContext]] = js.native
    
    var stateTransformer: js.UndefOr[js.Function1[/* state */ T, T]] = js.native
  }
  object RavenMiddlewareOptions {
    
    @scala.inline
    def apply[T](): RavenMiddlewareOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RavenMiddlewareOptions[T]]
    }
    
    @scala.inline
    implicit class RavenMiddlewareOptionsMutableBuilder[Self <: RavenMiddlewareOptions[_], T] (val x: Self with RavenMiddlewareOptions[T]) extends AnyVal {
      
      @scala.inline
      def setActionTransformer(value: /* action */ Action[_] => Action[_]): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      @scala.inline
      def setBreadcrumbCategory(value: String): Self = StObject.set(x, "breadcrumbCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbCategoryUndefined: Self = StObject.set(x, "breadcrumbCategory", js.undefined)
      
      @scala.inline
      def setBreadcrumbDataFromAction(value: /* action */ Action[_] => _): Self = StObject.set(x, "breadcrumbDataFromAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBreadcrumbDataFromActionUndefined: Self = StObject.set(x, "breadcrumbDataFromAction", js.undefined)
      
      @scala.inline
      def setFilterBreadcrumbActions(value: /* action */ Action[_] => Boolean): Self = StObject.set(x, "filterBreadcrumbActions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterBreadcrumbActionsUndefined: Self = StObject.set(x, "filterBreadcrumbActions", js.undefined)
      
      @scala.inline
      def setGetUserContext(value: /* state */ T => RavenUserContext): Self = StObject.set(x, "getUserContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUserContextUndefined: Self = StObject.set(x, "getUserContext", js.undefined)
      
      @scala.inline
      def setStateTransformer(value: /* state */ T => T): Self = StObject.set(x, "stateTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateTransformerUndefined: Self = StObject.set(x, "stateTransformer", js.undefined)
    }
  }
  
  @js.native
  trait RavenUserContext extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object RavenUserContext {
    
    @scala.inline
    def apply(): RavenUserContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RavenUserContext]
    }
    
    @scala.inline
    implicit class RavenUserContextMutableBuilder[Self <: RavenUserContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
