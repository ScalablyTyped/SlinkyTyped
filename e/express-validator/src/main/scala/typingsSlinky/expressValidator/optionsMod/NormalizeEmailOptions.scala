package typingsSlinky.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizeEmailOptions extends StObject {
  
  var all_lowercase: js.UndefOr[Boolean] = js.native
  
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.native
  
  var gmail_lowercase: js.UndefOr[Boolean] = js.native
  
  var gmail_remove_dots: js.UndefOr[Boolean] = js.native
  
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.native
  
  var icloud_lowercase: js.UndefOr[Boolean] = js.native
  
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.native
  
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.native
  
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.native
  
  var yahoo_lowercase: js.UndefOr[Boolean] = js.native
  
  var yahoo_remove_subaddress: js.UndefOr[Boolean] = js.native
}
object NormalizeEmailOptions {
  
  @scala.inline
  def apply(): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
  
  @scala.inline
  implicit class NormalizeEmailOptionsMutableBuilder[Self <: NormalizeEmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll_lowercase(value: Boolean): Self = StObject.set(x, "all_lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_lowercaseUndefined: Self = StObject.set(x, "all_lowercase", js.undefined)
    
    @scala.inline
    def setGmail_convert_googlemaildotcom(value: Boolean): Self = StObject.set(x, "gmail_convert_googlemaildotcom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmail_convert_googlemaildotcomUndefined: Self = StObject.set(x, "gmail_convert_googlemaildotcom", js.undefined)
    
    @scala.inline
    def setGmail_lowercase(value: Boolean): Self = StObject.set(x, "gmail_lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmail_lowercaseUndefined: Self = StObject.set(x, "gmail_lowercase", js.undefined)
    
    @scala.inline
    def setGmail_remove_dots(value: Boolean): Self = StObject.set(x, "gmail_remove_dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmail_remove_dotsUndefined: Self = StObject.set(x, "gmail_remove_dots", js.undefined)
    
    @scala.inline
    def setGmail_remove_subaddress(value: Boolean): Self = StObject.set(x, "gmail_remove_subaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmail_remove_subaddressUndefined: Self = StObject.set(x, "gmail_remove_subaddress", js.undefined)
    
    @scala.inline
    def setIcloud_lowercase(value: Boolean): Self = StObject.set(x, "icloud_lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcloud_lowercaseUndefined: Self = StObject.set(x, "icloud_lowercase", js.undefined)
    
    @scala.inline
    def setIcloud_remove_subaddress(value: Boolean): Self = StObject.set(x, "icloud_remove_subaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcloud_remove_subaddressUndefined: Self = StObject.set(x, "icloud_remove_subaddress", js.undefined)
    
    @scala.inline
    def setOutlookdotcom_lowercase(value: Boolean): Self = StObject.set(x, "outlookdotcom_lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookdotcom_lowercaseUndefined: Self = StObject.set(x, "outlookdotcom_lowercase", js.undefined)
    
    @scala.inline
    def setOutlookdotcom_remove_subaddress(value: Boolean): Self = StObject.set(x, "outlookdotcom_remove_subaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookdotcom_remove_subaddressUndefined: Self = StObject.set(x, "outlookdotcom_remove_subaddress", js.undefined)
    
    @scala.inline
    def setYahoo_lowercase(value: Boolean): Self = StObject.set(x, "yahoo_lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYahoo_lowercaseUndefined: Self = StObject.set(x, "yahoo_lowercase", js.undefined)
    
    @scala.inline
    def setYahoo_remove_subaddress(value: Boolean): Self = StObject.set(x, "yahoo_remove_subaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYahoo_remove_subaddressUndefined: Self = StObject.set(x, "yahoo_remove_subaddress", js.undefined)
  }
}
