package typingsSlinky.pouchdbReplication.PouchDB.Replication

import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replication[Content /* <: js.Object */]
  extends ReplicationEventEmitter[Content, ReplicationResult[Content], ReplicationResultComplete[Content]]
     with Promise[ReplicationResultComplete[Content]]

