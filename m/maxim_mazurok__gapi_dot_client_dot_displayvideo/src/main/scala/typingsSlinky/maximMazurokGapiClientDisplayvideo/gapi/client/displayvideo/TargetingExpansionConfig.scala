package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingExpansionConfig extends StObject {
  
  /**
    * Required. Whether to exclude first party audiences from targeting. Similar audiences of the excluded first party lists will not be excluded. Only applicable when a first-party
    * audience is positively targeted (directly or included in a combined audience), otherwise this selection will be ignored.
    */
  var excludeFirstPartyAudience: js.UndefOr[Boolean] = js.native
  
  /** Required. Magnitude of expansion for applicable targeting under this line item. */
  var targetingExpansionLevel: js.UndefOr[String] = js.native
}
object TargetingExpansionConfig {
  
  @scala.inline
  def apply(): TargetingExpansionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingExpansionConfig]
  }
  
  @scala.inline
  implicit class TargetingExpansionConfigMutableBuilder[Self <: TargetingExpansionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeFirstPartyAudience(value: Boolean): Self = StObject.set(x, "excludeFirstPartyAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFirstPartyAudienceUndefined: Self = StObject.set(x, "excludeFirstPartyAudience", js.undefined)
    
    @scala.inline
    def setTargetingExpansionLevel(value: String): Self = StObject.set(x, "targetingExpansionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingExpansionLevelUndefined: Self = StObject.set(x, "targetingExpansionLevel", js.undefined)
  }
}
