package typingsSlinky.realm.Realm.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object MongoDB {
  
  /**
    * A stage of an aggregation pipeline.
    */
  type AggregatePipelineStage = js.Object
  
  /**
    * Represents a change event communicated via a MongoDB change stream.
    *
    * @see https://docs.mongodb.com/manual/reference/change-events/
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.realm.Realm.Services.MongoDB.InsertEvent[T]
    - typingsSlinky.realm.Realm.Services.MongoDB.UpdateEvent[T]
    - typingsSlinky.realm.Realm.Services.MongoDB.ReplaceEvent[T]
    - typingsSlinky.realm.Realm.Services.MongoDB.DeleteEvent[T]
    - typingsSlinky.realm.Realm.Services.MongoDB.DropEvent
    - typingsSlinky.realm.Realm.Services.MongoDB.RenameEvent
    - typingsSlinky.realm.Realm.Services.MongoDB.DropDatabaseEvent
    - typingsSlinky.realm.Realm.Services.MongoDB.InvalidateEvent
  */
  type ChangeEvent[T /* <: typingsSlinky.realm.Realm.Services.MongoDB.Document[_] */] = typingsSlinky.realm.Realm.Services.MongoDB._ChangeEvent[T] | typingsSlinky.realm.Realm.Services.MongoDB.InvalidateEvent
  
  /**
    * Acts as the `resumeToken` for the `resumeAfter` parameter when resuming a change stream.
    */
  type ChangeEventId = js.Any
  
  /**
    * A document that contains the _id of the document created or modified by the insert, replace, delete, update operations (i.e. CRUD operations). For sharded collections, also displays the full shard key for the document. The _id field is not repeated if it is already a part of the shard key.
    */
  type DocumentKey[IdType] = typingsSlinky.realm.anon.Id[IdType] with (typingsSlinky.std.Record[java.lang.String, _])
  
  /**
    * A filter applied to limit the documents being queried for.
    */
  type Filter = js.Object
  
  /**
    * Invalidate events close the change stream cursor.
    */
  type InvalidateEvent = typingsSlinky.realm.Realm.Services.MongoDB.BaseChangeEvent[typingsSlinky.realm.realmStrings.invalidate]
  
  /**
    * A new document with an optional _id defined.
    */
  type NewDocument[T /* <: typingsSlinky.realm.Realm.Services.MongoDB.Document[_] */] = (typingsSlinky.std.Omit[T, typingsSlinky.realm.realmStrings._id]) with (typingsSlinky.std.Partial[typingsSlinky.std.Pick[T, typingsSlinky.realm.realmStrings._id]])
  
  /**
    * An object specifying the update operations to perform when updating a document.
    */
  type Update = js.Object
}
