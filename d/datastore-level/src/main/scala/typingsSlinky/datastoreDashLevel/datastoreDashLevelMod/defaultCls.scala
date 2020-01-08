package typingsSlinky.datastoreDashLevel.datastoreDashLevelMod

import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Batch
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Key
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Query
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Result
import typingsSlinky.levelup.levelupMod.LevelUp
import typingsSlinky.node.Buffer
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-level", JSImport.Default)
@js.native
class defaultCls protected () extends LevelDatastore[Buffer] {
  def this(path: String) = this()
  def this(path: String, options: LevelDatastoreOptions) = this()
  /* CompleteClass */
  override var db: LevelUp[AbstractLevelDOWN[String, Buffer], AbstractIterator[String, Buffer]] = js.native
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

