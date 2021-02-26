package typingsSlinky.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileProperties extends StObject {
  
  var createdById: String = js.native
  
  var createdByName: String = js.native
  
  var createdDate: String = js.native
  
  var fileName: String = js.native
  
  var fullName: String = js.native
  
  var id: String = js.native
  
  var lastModifiedById: String = js.native
  
  var lastModifiedByName: String = js.native
  
  var lastModifiedDate: String = js.native
  
  var manageableState: js.UndefOr[String] = js.native
  
  var namespacePrefix: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object FileProperties {
  
  @scala.inline
  def apply(
    createdById: String,
    createdByName: String,
    createdDate: String,
    fileName: String,
    fullName: String,
    id: String,
    lastModifiedById: String,
    lastModifiedByName: String,
    lastModifiedDate: String,
    `type`: String
  ): FileProperties = {
    val __obj = js.Dynamic.literal(createdById = createdById.asInstanceOf[js.Any], createdByName = createdByName.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedById = lastModifiedById.asInstanceOf[js.Any], lastModifiedByName = lastModifiedByName.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProperties]
  }
  
  @scala.inline
  implicit class FilePropertiesMutableBuilder[Self <: FileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedById(value: String): Self = StObject.set(x, "createdById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByName(value: String): Self = StObject.set(x, "createdByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedById(value: String): Self = StObject.set(x, "lastModifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByName(value: String): Self = StObject.set(x, "lastModifiedByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: String): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageableState(value: String): Self = StObject.set(x, "manageableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageableStateUndefined: Self = StObject.set(x, "manageableState", js.undefined)
    
    @scala.inline
    def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacePrefixUndefined: Self = StObject.set(x, "namespacePrefix", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
