package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive location search restricts (e.g. &quot;is:starred&quot;).
  */
@js.native
trait SchemaDriveLocationRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDriveLocationRestrict {
  
  @scala.inline
  def apply(): SchemaDriveLocationRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveLocationRestrict]
  }
  
  @scala.inline
  implicit class SchemaDriveLocationRestrictMutableBuilder[Self <: SchemaDriveLocationRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
