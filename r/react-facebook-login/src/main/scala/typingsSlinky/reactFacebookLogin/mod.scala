package typingsSlinky.reactFacebookLogin

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactFacebookLogin.anon.Data
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.medium
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.metro
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-facebook-login", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactFacebookLoginProps, ReactFacebookLoginState, js.Any]
  
  @js.native
  trait ReactFacebookFailureResponse extends StObject {
    
    var status: js.UndefOr[String] = js.native
  }
  object ReactFacebookFailureResponse {
    
    @scala.inline
    def apply(): ReactFacebookFailureResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactFacebookFailureResponse]
    }
    
    @scala.inline
    implicit class ReactFacebookFailureResponseMutableBuilder[Self <: ReactFacebookFailureResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type ReactFacebookLogin = ReactComponentClass[ReactFacebookLoginProps]
  
  @js.native
  trait ReactFacebookLoginInfo extends StObject {
    
    var accessToken: String = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var picture: js.UndefOr[Data] = js.native
  }
  object ReactFacebookLoginInfo {
    
    @scala.inline
    def apply(accessToken: String, id: String): ReactFacebookLoginInfo = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFacebookLoginInfo]
    }
    
    @scala.inline
    implicit class ReactFacebookLoginInfoMutableBuilder[Self <: ReactFacebookLoginInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPicture(value: Data): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    }
  }
  
  @js.native
  trait ReactFacebookLoginProps extends StObject {
    
    var appId: String = js.native
    
    var authType: js.UndefOr[String] = js.native
    
    var autoLoad: js.UndefOr[Boolean] = js.native
    
    var buttonStyle: js.UndefOr[CSSProperties] = js.native
    
    def callback(userInfo: ReactFacebookFailureResponse): Unit = js.native
    def callback(userInfo: ReactFacebookLoginInfo): Unit = js.native
    
    var containerStyle: js.UndefOr[CSSProperties] = js.native
    
    var cookie: js.UndefOr[Boolean] = js.native
    
    var cssClass: js.UndefOr[String] = js.native
    
    var disableMobileRedirect: js.UndefOr[Boolean] = js.native
    
    var fields: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    var isMobile: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, Unit]] = js.native
    
    var reAuthenticate: js.UndefOr[Boolean] = js.native
    
    var redirectUri: js.UndefOr[String] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    var returnScopes: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[small | medium | metro] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[Node | ReactComponentClass[_]] = js.native
    
    var textButton: js.UndefOr[String] = js.native
    
    var typeButton: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var xfbml: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait ReactFacebookLoginState extends StObject {
    
    var isProcessing: js.UndefOr[Boolean] = js.native
    
    var isSdkLoaded: js.UndefOr[Boolean] = js.native
  }
  object ReactFacebookLoginState {
    
    @scala.inline
    def apply(): ReactFacebookLoginState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactFacebookLoginState]
    }
    
    @scala.inline
    implicit class ReactFacebookLoginStateMutableBuilder[Self <: ReactFacebookLoginState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsProcessing(value: Boolean): Self = StObject.set(x, "isProcessing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsProcessingUndefined: Self = StObject.set(x, "isProcessing", js.undefined)
      
      @scala.inline
      def setIsSdkLoaded(value: Boolean): Self = StObject.set(x, "isSdkLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSdkLoadedUndefined: Self = StObject.set(x, "isSdkLoaded", js.undefined)
    }
  }
}
