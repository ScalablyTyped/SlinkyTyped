package typingsSlinky.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeAttributedIPConversions extends StObject {
  
  /** Include conversions that have no cookie, but do have an exposure path. */
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser within the Floodlight
    * group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the lookback window prior
    * to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
}
object IncludeAttributedIPConversions {
  
  @scala.inline
  def apply(): IncludeAttributedIPConversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAttributedIPConversions]
  }
  
  @scala.inline
  implicit class IncludeAttributedIPConversionsMutableBuilder[Self <: IncludeAttributedIPConversions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAttributedIPConversions(value: Boolean): Self = StObject.set(x, "includeAttributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributedIPConversionsUndefined: Self = StObject.set(x, "includeAttributedIPConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedCookieConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedCookieConversionsUndefined: Self = StObject.set(x, "includeUnattributedCookieConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedIPConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedIPConversionsUndefined: Self = StObject.set(x, "includeUnattributedIPConversions", js.undefined)
  }
}
