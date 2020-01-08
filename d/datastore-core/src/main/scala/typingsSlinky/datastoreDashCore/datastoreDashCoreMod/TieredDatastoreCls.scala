package typingsSlinky.datastoreDashCore.datastoreDashCoreMod

import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Batch
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Key
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Query
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Result
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "TieredDatastore")
@js.native
class TieredDatastoreCls protected () extends TieredDatastore {
  def this(stores: js.Array[Datastore[_]]) = this()
  /* CompleteClass */
  override var stores: js.Array[Datastore[_]] = js.native
  /* CompleteClass */
  override def batch(): Batch[js.Any] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[js.Any] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: js.Any): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[js.Any]): AsyncIterable[Result[js.Any]] = js.native
}

