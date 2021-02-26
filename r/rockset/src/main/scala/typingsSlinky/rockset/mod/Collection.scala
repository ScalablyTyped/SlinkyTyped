package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.CATCHINGUP
import typingsSlinky.rockset.rocksetStrings.CREATED
import typingsSlinky.rockset.rocksetStrings.DELETED
import typingsSlinky.rockset.rocksetStrings.PAUSED
import typingsSlinky.rockset.rocksetStrings.PAUSING
import typingsSlinky.rockset.rocksetStrings.READY
import typingsSlinky.rockset.rocksetStrings.RESUMING
import typingsSlinky.rockset.rocksetStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection extends StObject {
  
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.native
  
  // email of user who created the collection
  var created_by: js.UndefOr[String] = js.native
  
  // text describing the collection
  var description: js.UndefOr[String] = js.native
  
  // list of mappings applied on all documents in a collection
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.native
  
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: js.UndefOr[String] = js.native
  
  // number of seconds after which data is purged based on event time
  var retention_secs: js.UndefOr[Double] = js.native
  
  // list of sources from which collection ingests
  var sources: js.UndefOr[js.Array[Source]] = js.native
  
  // metrics about the collection
  var stats: js.UndefOr[CollectionStats] = js.native
  
  // current status of collection, one of: CREATED, READY, DELETED
  var status: js.UndefOr[CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN] = js.native
  
  // name of the workspace that the collection is in
  var workspace: js.UndefOr[String] = js.native
}
object Collection {
  
  @scala.inline
  def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit class CollectionMutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setField_mappings(value: js.Array[FieldMappingV2]): Self = StObject.set(x, "field_mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField_mappingsUndefined: Self = StObject.set(x, "field_mappings", js.undefined)
    
    @scala.inline
    def setField_mappingsVarargs(value: FieldMappingV2*): Self = StObject.set(x, "field_mappings", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRetention_secs(value: Double): Self = StObject.set(x, "retention_secs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetention_secsUndefined: Self = StObject.set(x, "retention_secs", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: CollectionStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatus(value: CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
