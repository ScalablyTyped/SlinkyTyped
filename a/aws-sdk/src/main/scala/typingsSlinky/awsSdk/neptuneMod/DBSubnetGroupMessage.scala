package typingsSlinky.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBSubnetGroupMessage extends StObject {
  
  /**
    *  A list of DBSubnetGroup instances.
    */
  var DBSubnetGroups: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.DBSubnetGroups] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBSubnetGroupMessage {
  
  @scala.inline
  def apply(): DBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class DBSubnetGroupMessageMutableBuilder[Self <: DBSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSubnetGroups(value: DBSubnetGroups): Self = StObject.set(x, "DBSubnetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupsUndefined: Self = StObject.set(x, "DBSubnetGroups", js.undefined)
    
    @scala.inline
    def setDBSubnetGroupsVarargs(value: DBSubnetGroup*): Self = StObject.set(x, "DBSubnetGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
