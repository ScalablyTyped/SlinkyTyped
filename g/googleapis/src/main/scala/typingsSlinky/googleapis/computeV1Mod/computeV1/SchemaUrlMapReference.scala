package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUrlMapReference extends StObject {
  
  var urlMap: js.UndefOr[String] = js.native
}
object SchemaUrlMapReference {
  
  @scala.inline
  def apply(): SchemaUrlMapReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapReference]
  }
  
  @scala.inline
  implicit class SchemaUrlMapReferenceMutableBuilder[Self <: SchemaUrlMapReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlMap(value: String): Self = StObject.set(x, "urlMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMapUndefined: Self = StObject.set(x, "urlMap", js.undefined)
  }
}
