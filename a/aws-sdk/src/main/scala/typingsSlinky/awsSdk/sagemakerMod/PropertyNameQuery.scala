package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyNameQuery extends StObject {
  
  /**
    * Text that begins a property's name.
    */
  var PropertyNameHint: typingsSlinky.awsSdk.sagemakerMod.PropertyNameHint = js.native
}
object PropertyNameQuery {
  
  @scala.inline
  def apply(PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
    val __obj = js.Dynamic.literal(PropertyNameHint = PropertyNameHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNameQuery]
  }
  
  @scala.inline
  implicit class PropertyNameQueryMutableBuilder[Self <: PropertyNameQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyNameHint(value: PropertyNameHint): Self = StObject.set(x, "PropertyNameHint", value.asInstanceOf[js.Any])
  }
}
