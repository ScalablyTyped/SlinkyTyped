package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Columns
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.EncryptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportContext extends StObject {
  
  /** Import parameters specific to SQL Server .BAK files */
  var bakImportOptions: js.UndefOr[EncryptionOptions] = js.native
  
  /** Options for importing data as CSV. */
  var csvImportOptions: js.UndefOr[Columns] = js.native
  
  /**
    * The target database for the import. If *fileType* is *SQL*, this field is required only if the import file does not specify a database, and is overridden by any database
    * specification in the import file. If *fileType* is *CSV*, one database must be specified.
    */
  var database: js.UndefOr[String] = js.native
  
  /** The file type for the specified uri. *SQL*: The file contains SQL statements. *CSV*: The file contains CSV data. */
  var fileType: js.UndefOr[String] = js.native
  
  /** The PostgreSQL user for this import operation. PostgreSQL instances only. */
  var importUser: js.UndefOr[String] = js.native
  
  /** This is always *sql#importContext*. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Path to the import file in Cloud Storage, in the form *gs: //bucketName/fileName*. Compressed gzip files (.gz) are supported // when *fileType* is *SQL*. The instance must have //
    * write permissions to the bucket and read access to the file.
    */
  var uri: js.UndefOr[String] = js.native
}
object ImportContext {
  
  @scala.inline
  def apply(): ImportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportContext]
  }
  
  @scala.inline
  implicit class ImportContextMutableBuilder[Self <: ImportContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBakImportOptions(value: EncryptionOptions): Self = StObject.set(x, "bakImportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBakImportOptionsUndefined: Self = StObject.set(x, "bakImportOptions", js.undefined)
    
    @scala.inline
    def setCsvImportOptions(value: Columns): Self = StObject.set(x, "csvImportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvImportOptionsUndefined: Self = StObject.set(x, "csvImportOptions", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setImportUser(value: String): Self = StObject.set(x, "importUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportUserUndefined: Self = StObject.set(x, "importUser", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
