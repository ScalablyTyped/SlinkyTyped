package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about settings changes.
  */
@js.native
trait SchemaSettingsChange extends StObject {
  
  /**
    * The set of changes made to restrictions.
    */
  var restrictionChanges: js.UndefOr[js.Array[SchemaRestrictionChange]] = js.native
}
object SchemaSettingsChange {
  
  @scala.inline
  def apply(): SchemaSettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettingsChange]
  }
  
  @scala.inline
  implicit class SchemaSettingsChangeMutableBuilder[Self <: SchemaSettingsChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestrictionChanges(value: js.Array[SchemaRestrictionChange]): Self = StObject.set(x, "restrictionChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionChangesUndefined: Self = StObject.set(x, "restrictionChanges", js.undefined)
    
    @scala.inline
    def setRestrictionChangesVarargs(value: SchemaRestrictionChange*): Self = StObject.set(x, "restrictionChanges", js.Array(value :_*))
  }
}
