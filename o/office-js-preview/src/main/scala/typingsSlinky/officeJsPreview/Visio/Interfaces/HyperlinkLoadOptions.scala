package typingsSlinky.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Hyperlink.
  *
  * [Api set:  1.1]
  */
@js.native
trait HyperlinkLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[Boolean] = js.native
}
object HyperlinkLoadOptions {
  
  @scala.inline
  def apply(): HyperlinkLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkLoadOptions]
  }
  
  @scala.inline
  implicit class HyperlinkLoadOptionsMutableBuilder[Self <: HyperlinkLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAddress(value: Boolean): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDescription(value: Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExtraInfo(value: Boolean): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraInfoUndefined: Self = StObject.set(x, "extraInfo", js.undefined)
    
    @scala.inline
    def setSubAddress(value: Boolean): Self = StObject.set(x, "subAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAddressUndefined: Self = StObject.set(x, "subAddress", js.undefined)
  }
}
