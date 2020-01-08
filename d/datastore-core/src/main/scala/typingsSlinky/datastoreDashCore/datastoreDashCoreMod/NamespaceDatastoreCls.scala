package typingsSlinky.datastoreDashCore.datastoreDashCoreMod

import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Batch
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Key
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Query
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Result
import typingsSlinky.node.Buffer
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
class NamespaceDatastoreCls protected () extends NamespaceDatastore[Buffer] {
  def this(child: Datastore[_], prefix: Key) = this()
  /* CompleteClass */
  override var child: Datastore[Buffer] = js.native
  /* CompleteClass */
  override var prefix: Key = js.native
  /* CompleteClass */
  override var transform: Transform = js.native
  /* CompleteClass */
  override def batch(): Batch[Buffer] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[Buffer] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: Buffer): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[Buffer]): AsyncIterable[Result[Buffer]] = js.native
}

