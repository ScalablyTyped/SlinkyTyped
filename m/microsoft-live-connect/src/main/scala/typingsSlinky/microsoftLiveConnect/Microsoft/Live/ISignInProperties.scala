package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.ui method when 'name' is set to
  * 'signin'.
  */
@js.native
trait ISignInProperties extends IUIProperties {
  
  /**
    * Defines the brand, or type of icon, to be used with the Live Connect
    * sign-in button.
    * @default "windows"
    */
  var brand: js.UndefOr[String] = js.native
  
  /**
    * Specifies the function to call whenever there is any error while the
    * sign-in control is initializing or while the user is signing in.
    */
  var onerror: js.UndefOr[js.Function] = js.native
  
  /**
    * Specifies the function to call after the user completes the sign-in
    * process.
    */
  var onloggedin: js.UndefOr[js.Function] = js.native
  
  /**
    * Specifies the function to call after the user completes the sign-out
    * process.
    */
  var onloggedout: js.UndefOr[js.Function] = js.native
  
  /**
    * If the value of the type property is set to "custom", this value
    * specifies the sign-in text to be displayed in the button.
    */
  var sign_in_text: js.UndefOr[String] = js.native
  
  /**
    * If the value of the type property is "custom", this value specifies
    * the sign-out text to be displayed in the button.
    */
  var sign_out_text: js.UndefOr[String] = js.native
  
  /**
    * Defines the color pallette used for the sign-in button. For Windows
    * Store apps using JavaScript, valid values are "dark" and "light".
    * For web apps, valid values are "blue" and "white".
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Defines the type of button.
    * @default "signin"
    */
  var `type`: js.UndefOr[String] = js.native
}
object ISignInProperties {
  
  @scala.inline
  def apply(element: String, name: String): ISignInProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignInProperties]
  }
  
  @scala.inline
  implicit class ISignInPropertiesMutableBuilder[Self <: ISignInProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnloggedin(value: js.Function): Self = StObject.set(x, "onloggedin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloggedinUndefined: Self = StObject.set(x, "onloggedin", js.undefined)
    
    @scala.inline
    def setOnloggedout(value: js.Function): Self = StObject.set(x, "onloggedout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloggedoutUndefined: Self = StObject.set(x, "onloggedout", js.undefined)
    
    @scala.inline
    def setSign_in_text(value: String): Self = StObject.set(x, "sign_in_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign_in_textUndefined: Self = StObject.set(x, "sign_in_text", js.undefined)
    
    @scala.inline
    def setSign_out_text(value: String): Self = StObject.set(x, "sign_out_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign_out_textUndefined: Self = StObject.set(x, "sign_out_text", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
