package typingsSlinky.pouchdbReplication.PouchDB.Replication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replication[Content /* <: js.Object */]
  extends js.Promise[ReplicationResultComplete[Content]]
     with ReplicationEventEmitter[Content, ReplicationResult[Content], ReplicationResultComplete[Content]]
