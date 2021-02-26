package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IName extends StObject {
  
  /** The culture of the region. */
  var Culture: String = js.native
  
  /** The name of boundary. Example: "United States" */
  var EntityName: String = js.native
  
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String = js.native
}
object IName {
  
  @scala.inline
  def apply(Culture: String, EntityName: String, SourceID: String): IName = {
    val __obj = js.Dynamic.literal(Culture = Culture.asInstanceOf[js.Any], EntityName = EntityName.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IName]
  }
  
  @scala.inline
  implicit class INameMutableBuilder[Self <: IName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityName(value: String): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceID(value: String): Self = StObject.set(x, "SourceID", value.asInstanceOf[js.Any])
  }
}
