package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGlobalClusterMessage extends StObject {
  
  /**
    *  The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will not create a database in the global database cluster you are creating. 
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    *  The deletion protection setting for the new global database. The global database can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The engine version of the Aurora global database.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The cluster identifier of the new global database cluster.
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional. 
    */
  var SourceDBClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  The storage encryption setting for the new global database cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
}
object CreateGlobalClusterMessage {
  
  @scala.inline
  def apply(): CreateGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalClusterMessage]
  }
  
  @scala.inline
  implicit class CreateGlobalClusterMessageMutableBuilder[Self <: CreateGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSourceDBClusterIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDBClusterIdentifierUndefined: Self = StObject.set(x, "SourceDBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
  }
}
