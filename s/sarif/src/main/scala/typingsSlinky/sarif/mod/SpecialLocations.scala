package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecialLocations extends StObject {
  
  /**
    * Provides a suggestion to SARIF consumers to display file paths relative to the specified location.
    */
  var displayBase: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * Key/value pairs that provide additional information about the special locations.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}
object SpecialLocations {
  
  @scala.inline
  def apply(): SpecialLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecialLocations]
  }
  
  @scala.inline
  implicit class SpecialLocationsMutableBuilder[Self <: SpecialLocations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayBase(value: ArtifactLocation): Self = StObject.set(x, "displayBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayBaseUndefined: Self = StObject.set(x, "displayBase", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
