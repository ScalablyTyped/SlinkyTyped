package typingsSlinky.pouchdbReplication.PouchDB

import typingsSlinky.pouchdbCore.PouchDB.Core.Callback
import typingsSlinky.pouchdbReplication.AnonFrom
import typingsSlinky.pouchdbReplication.PouchDB.Replication.Sync
import typingsSlinky.pouchdbReplication.PouchDB.Replication.SyncOptions
import typingsSlinky.pouchdbReplication.PouchDB.Replication.SyncResultComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  var replicate: AnonFrom = js.native
  /**
    * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
    *
    * In other words, this code:
    * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
    * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
    * is equivalent to this code:
    * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
    */
  def sync[Content](remote: String): Sync[Content] = js.native
  def sync[Content](remote: String, options: SyncOptions): Sync[Content] = js.native
  def sync[Content](remote: String, options: SyncOptions, callback: Callback[SyncResultComplete[Content]]): Sync[Content] = js.native
  def sync[Content](remote: Database[Content]): Sync[Content] = js.native
  def sync[Content](remote: Database[Content], options: SyncOptions): Sync[Content] = js.native
  def sync[Content](remote: Database[Content], options: SyncOptions, callback: Callback[SyncResultComplete[Content]]): Sync[Content] = js.native
}

