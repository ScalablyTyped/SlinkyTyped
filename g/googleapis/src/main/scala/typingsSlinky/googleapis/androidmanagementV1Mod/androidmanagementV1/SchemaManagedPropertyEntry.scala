package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entry of a managed property.
  */
@js.native
trait SchemaManagedPropertyEntry extends StObject {
  
  /**
    * The human-readable name of the value. Localized.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The machine-readable value of the entry, which should be used in the
    * configuration. Not localized.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaManagedPropertyEntry {
  
  @scala.inline
  def apply(): SchemaManagedPropertyEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedPropertyEntry]
  }
  
  @scala.inline
  implicit class SchemaManagedPropertyEntryMutableBuilder[Self <: SchemaManagedPropertyEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
