package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the Android instance details resource.
  */
@js.native
trait SchemaInstanceAndroidDetails extends StObject {
  
  /**
    * Flag indicating whether the anti-piracy check is enabled.
    */
  var enablePiracyCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceAndroidDetails.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Android package name which maps to Google Play URL.
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean] = js.native
}
object SchemaInstanceAndroidDetails {
  
  @scala.inline
  def apply(): SchemaInstanceAndroidDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceAndroidDetails]
  }
  
  @scala.inline
  implicit class SchemaInstanceAndroidDetailsMutableBuilder[Self <: SchemaInstanceAndroidDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablePiracyCheck(value: Boolean): Self = StObject.set(x, "enablePiracyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePiracyCheckUndefined: Self = StObject.set(x, "enablePiracyCheck", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
  }
}
