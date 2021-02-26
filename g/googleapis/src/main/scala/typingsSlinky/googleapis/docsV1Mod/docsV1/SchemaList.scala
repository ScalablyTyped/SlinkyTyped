package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A List represents the list attributes for a group of paragraphs that all
  * belong to the same list. A paragraph that is part of a list has a reference
  * to the list&#39;s ID in its bullet.
  */
@js.native
trait SchemaList extends StObject {
  
  /**
    * The properties of the list.
    */
  var listProperties: js.UndefOr[SchemaListProperties] = js.native
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this list.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  
  /**
    * The suggested changes to the list properties, keyed by suggestion ID.
    */
  var suggestedListPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedListProperties]] = js.native
}
object SchemaList {
  
  @scala.inline
  def apply(): SchemaList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaList]
  }
  
  @scala.inline
  implicit class SchemaListMutableBuilder[Self <: SchemaList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListProperties(value: SchemaListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    @scala.inline
    def setSuggestedListPropertiesChanges(value: StringDictionary[SchemaSuggestedListProperties]): Self = StObject.set(x, "suggestedListPropertiesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedListPropertiesChangesUndefined: Self = StObject.set(x, "suggestedListPropertiesChanges", js.undefined)
  }
}
