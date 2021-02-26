package typingsSlinky.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonMetadata extends StObject {
  
  var deleted: Boolean = js.native
  
  var linkedPeopleResourceNames: js.Array[String] = js.native
  
  var objectType: ObjectType = js.native
  
  var previousResourceNames: js.Array[String] = js.native
  
  var sources: js.Array[Source] = js.native
}
object PersonMetadata {
  
  @scala.inline
  def apply(
    deleted: Boolean,
    linkedPeopleResourceNames: js.Array[String],
    objectType: ObjectType,
    previousResourceNames: js.Array[String],
    sources: js.Array[Source]
  ): PersonMetadata = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], linkedPeopleResourceNames = linkedPeopleResourceNames.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], previousResourceNames = previousResourceNames.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonMetadata]
  }
  
  @scala.inline
  implicit class PersonMetadataMutableBuilder[Self <: PersonMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedPeopleResourceNames(value: js.Array[String]): Self = StObject.set(x, "linkedPeopleResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedPeopleResourceNamesVarargs(value: String*): Self = StObject.set(x, "linkedPeopleResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setObjectType(value: ObjectType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousResourceNames(value: js.Array[String]): Self = StObject.set(x, "previousResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousResourceNamesVarargs(value: String*): Self = StObject.set(x, "previousResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
