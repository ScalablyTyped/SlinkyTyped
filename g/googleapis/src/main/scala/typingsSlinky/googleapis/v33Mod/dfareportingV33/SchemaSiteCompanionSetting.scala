package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Companion Settings
  */
@js.native
trait SchemaSiteCompanionSetting extends StObject {
  
  /**
    * Whether companions are disabled for this site template.
    */
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whitelist of companion sizes to be served via this site template. Set
    * this list to null or empty to serve all companion sizes.
    */
  var enabledSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  
  /**
    * Whether to serve only static images as companions.
    */
  var imageOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteCompanionSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaSiteCompanionSetting {
  
  @scala.inline
  def apply(): SchemaSiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteCompanionSetting]
  }
  
  @scala.inline
  implicit class SchemaSiteCompanionSettingMutableBuilder[Self <: SchemaSiteCompanionSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanionsDisabled(value: Boolean): Self = StObject.set(x, "companionsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionsDisabledUndefined: Self = StObject.set(x, "companionsDisabled", js.undefined)
    
    @scala.inline
    def setEnabledSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "enabledSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledSizesUndefined: Self = StObject.set(x, "enabledSizes", js.undefined)
    
    @scala.inline
    def setEnabledSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "enabledSizes", js.Array(value :_*))
    
    @scala.inline
    def setImageOnly(value: Boolean): Self = StObject.set(x, "imageOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOnlyUndefined: Self = StObject.set(x, "imageOnly", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
