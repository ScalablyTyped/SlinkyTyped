package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends StObject {
  
  /** The Cloud SQL charset value. */
  var charset: js.UndefOr[String] = js.native
  
  /** The Cloud SQL collation value. */
  var collation: js.UndefOr[String] = js.native
  
  /** This field is deprecated and will be removed from a future version of the API. */
  var etag: js.UndefOr[String] = js.native
  
  /** The name of the Cloud SQL instance. This does not include the project ID. */
  var instance: js.UndefOr[String] = js.native
  
  /** This is always *sql#database*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The name of the database in the Cloud SQL instance. This does not include the project ID or instance name. */
  var name: js.UndefOr[String] = js.native
  
  /** The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable. */
  var project: js.UndefOr[String] = js.native
  
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  var sqlserverDatabaseDetails: js.UndefOr[SqlServerDatabaseDetails] = js.native
}
object Database {
  
  @scala.inline
  def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseMutableBuilder[Self <: Database] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSqlserverDatabaseDetails(value: SqlServerDatabaseDetails): Self = StObject.set(x, "sqlserverDatabaseDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlserverDatabaseDetailsUndefined: Self = StObject.set(x, "sqlserverDatabaseDetails", js.undefined)
  }
}
