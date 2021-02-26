package typingsSlinky.reduxAuthWrapper

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AuthBaseConfig[OwnProps, State] extends AuthConfig {
    
    var authenticatedSelector: StateSelector[State, OwnProps, Boolean] = js.native
    
    var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, Boolean]] = js.native
  }
  object AuthBaseConfig {
    
    @scala.inline
    def apply[OwnProps, State](authenticatedSelector: (State, OwnProps) => Boolean): AuthBaseConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector))
      __obj.asInstanceOf[AuthBaseConfig[OwnProps, State]]
    }
    
    @scala.inline
    implicit class AuthBaseConfigMutableBuilder[Self <: AuthBaseConfig[_, _], OwnProps, State] (val x: Self with (AuthBaseConfig[OwnProps, State])) extends AnyVal {
      
      @scala.inline
      def setAuthenticatedSelector(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "authenticatedSelector", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthenticatingSelector(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "authenticatingSelector", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthenticatingSelectorUndefined: Self = StObject.set(x, "authenticatingSelector", js.undefined)
    }
  }
  
  @js.native
  trait AuthConfig extends StObject {
    
    var AuthenticatingComponent: js.UndefOr[ReactType[_]] = js.native
    
    var wrapperDisplayName: js.UndefOr[String] = js.native
  }
  object AuthConfig {
    
    @scala.inline
    def apply(): AuthConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthConfig]
    }
    
    @scala.inline
    implicit class AuthConfigMutableBuilder[Self <: AuthConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticatingComponent(value: ReactType[_]): Self = StObject.set(x, "AuthenticatingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticatingComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "AuthenticatingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticatingComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "AuthenticatingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticatingComponentUndefined: Self = StObject.set(x, "AuthenticatingComponent", js.undefined)
      
      @scala.inline
      def setWrapperDisplayName(value: String): Self = StObject.set(x, "wrapperDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperDisplayNameUndefined: Self = StObject.set(x, "wrapperDisplayName", js.undefined)
    }
  }
  
  type AuthWrapperDecorator[Props] = js.Function1[/* component */ ReactComponentClass[Props], ReactComponentClass[Props]]
  
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
