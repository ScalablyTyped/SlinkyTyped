package typingsSlinky.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseAccount extends StObject {
  
  var ConsistencyPolicy: typingsSlinky.documentdb.mod.ConsistencyPolicy = js.native
  
  var CurrentMediaStorageUsageInMB: Double = js.native
  
  var DatabasesLink: String = js.native
  
  var MaxMediaStorageUsageInMB: Double = js.native
  
  var MediaLink: String = js.native
  
  var ReadableLocations: js.Array[String] = js.native
  
  var WritableLocations: js.Array[String] = js.native
}
object DatabaseAccount {
  
  @scala.inline
  def apply(
    ConsistencyPolicy: ConsistencyPolicy,
    CurrentMediaStorageUsageInMB: Double,
    DatabasesLink: String,
    MaxMediaStorageUsageInMB: Double,
    MediaLink: String,
    ReadableLocations: js.Array[String],
    WritableLocations: js.Array[String]
  ): DatabaseAccount = {
    val __obj = js.Dynamic.literal(ConsistencyPolicy = ConsistencyPolicy.asInstanceOf[js.Any], CurrentMediaStorageUsageInMB = CurrentMediaStorageUsageInMB.asInstanceOf[js.Any], DatabasesLink = DatabasesLink.asInstanceOf[js.Any], MaxMediaStorageUsageInMB = MaxMediaStorageUsageInMB.asInstanceOf[js.Any], MediaLink = MediaLink.asInstanceOf[js.Any], ReadableLocations = ReadableLocations.asInstanceOf[js.Any], WritableLocations = WritableLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAccount]
  }
  
  @scala.inline
  implicit class DatabaseAccountMutableBuilder[Self <: DatabaseAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistencyPolicy(value: ConsistencyPolicy): Self = StObject.set(x, "ConsistencyPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMediaStorageUsageInMB(value: Double): Self = StObject.set(x, "CurrentMediaStorageUsageInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasesLink(value: String): Self = StObject.set(x, "DatabasesLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMediaStorageUsageInMB(value: Double): Self = StObject.set(x, "MaxMediaStorageUsageInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaLink(value: String): Self = StObject.set(x, "MediaLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableLocations(value: js.Array[String]): Self = StObject.set(x, "ReadableLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableLocationsVarargs(value: String*): Self = StObject.set(x, "ReadableLocations", js.Array(value :_*))
    
    @scala.inline
    def setWritableLocations(value: js.Array[String]): Self = StObject.set(x, "WritableLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableLocationsVarargs(value: String*): Self = StObject.set(x, "WritableLocations", js.Array(value :_*))
  }
}
