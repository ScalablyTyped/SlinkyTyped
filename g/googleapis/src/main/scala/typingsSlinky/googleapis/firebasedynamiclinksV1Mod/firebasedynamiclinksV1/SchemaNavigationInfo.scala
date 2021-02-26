package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information of navigation behavior.
  */
@js.native
trait SchemaNavigationInfo extends StObject {
  
  /**
    * If this option is on, FDL click will be forced to redirect rather than
    * show an interstitial page.
    */
  var enableForcedRedirect: js.UndefOr[Boolean] = js.native
}
object SchemaNavigationInfo {
  
  @scala.inline
  def apply(): SchemaNavigationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNavigationInfo]
  }
  
  @scala.inline
  implicit class SchemaNavigationInfoMutableBuilder[Self <: SchemaNavigationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableForcedRedirect(value: Boolean): Self = StObject.set(x, "enableForcedRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableForcedRedirectUndefined: Self = StObject.set(x, "enableForcedRedirect", js.undefined)
  }
}
