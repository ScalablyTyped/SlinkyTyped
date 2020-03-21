package typingsSlinky.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.createError.mod.Error
import typingsSlinky.knex.mod.QueryBuilder
import typingsSlinky.knex.mod.SafePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "Collection")
@js.native
class Collection[T /* <: Model[_] */] () extends CollectionBase[T] {
  def attach(ids: js.Any): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def attach(ids: js.Any, options: SyncOptions): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def attach(ids: js.Array[_]): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def attach(ids: js.Array[_], options: SyncOptions): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def count(): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  def count(column: String): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  def count(column: String, options: SyncOptions): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  def create(model: StringDictionary[js.Any]): typingsSlinky.bluebird.mod.^[T] = js.native
  def create(model: StringDictionary[js.Any], options: CollectionCreateOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def detach(): typingsSlinky.bluebird.mod.^[_] = js.native
  def detach(ids: js.Array[_]): typingsSlinky.bluebird.mod.^[_] = js.native
  def detach(ids: js.Array[_], options: SyncOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  def detach(options: SyncOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  def fetchOne(): typingsSlinky.bluebird.mod.^[T] = js.native
  def fetchOne(options: CollectionFetchOneOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def load(relations: String): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def load(relations: String, options: SyncOptions): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def load(relations: js.Array[String]): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def load(relations: js.Array[String], options: SyncOptions): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def orderBy(column: String): Collection[T] = js.native
  def orderBy(column: String, order: SortOrder): Collection[T] = js.native
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def query(callback: js.Function1[/* qb */ QueryBuilder[_, js.Array[SafePartial[_]]], Unit]): Collection[T] = js.native
  def query(query: String*): Collection[T] = js.native
  def query(query: StringDictionary[js.Any]): Collection[T] = js.native
  def resetQuery(): Collection[T] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass): Collection[R] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: String): Collection[R] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: String, otherKey: String): Collection[R] = js.native
  def updatePivot(attributes: js.Any): typingsSlinky.bluebird.mod.^[Double] = js.native
  def updatePivot(attributes: js.Any, options: PivotOptions): typingsSlinky.bluebird.mod.^[Double] = js.native
  def withPivot(columns: js.Array[String]): Collection[T] = js.native
}

/* static members */
@JSImport("bookshelf", "Collection")
@js.native
object Collection extends js.Object {
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/collection.js#L389
  var EmptyError: Error[js.Error] = js.native
  /** @deprecated use Typescript classes */
  def extend[T](): js.Function = js.native
  def extend[T](prototypeProperties: js.Any): js.Function = js.native
  def extend[T](prototypeProperties: js.Any, classProperties: js.Any): js.Function = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](): T = js.native
  def forge[T](attributes: js.Any): T = js.native
  def forge[T](attributes: js.Any, options: ModelOptions): T = js.native
}

