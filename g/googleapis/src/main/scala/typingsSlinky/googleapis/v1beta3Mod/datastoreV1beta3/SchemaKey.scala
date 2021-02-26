package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A unique identifier for an entity. If a key&#39;s partition ID or any of
  * its path kinds or names are reserved/read-only, the key is
  * reserved/read-only. A reserved/read-only key is forbidden in certain
  * documented contexts.
  */
@js.native
trait SchemaKey extends StObject {
  
  /**
    * Entities are partitioned into subsets, currently identified by a project
    * ID and namespace ID. Queries are scoped to a single partition.
    */
  var partitionId: js.UndefOr[SchemaPartitionId] = js.native
  
  /**
    * The entity path. An entity path consists of one or more elements composed
    * of a kind and a string or numerical identifier, which identify entities.
    * The first element identifies a _root entity_, the second element
    * identifies a _child_ of the root entity, the third element identifies a
    * child of the second entity, and so forth. The entities identified by all
    * prefixes of the path are called the element&#39;s _ancestors_.  An entity
    * path is always fully complete: *all* of the entity&#39;s ancestors are
    * required to be in the path along with the entity identifier itself. The
    * only exception is that in some documented cases, the identifier in the
    * last path element (for the entity) itself may be omitted. For example,
    * the last path element of the key of `Mutation.insert` may have no
    * identifier.  A path can never be empty, and a path can have at most 100
    * elements.
    */
  var path: js.UndefOr[js.Array[SchemaPathElement]] = js.native
}
object SchemaKey {
  
  @scala.inline
  def apply(): SchemaKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKey]
  }
  
  @scala.inline
  implicit class SchemaKeyMutableBuilder[Self <: SchemaKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionId(value: SchemaPartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
    
    @scala.inline
    def setPath(value: js.Array[SchemaPathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: SchemaPathElement*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
