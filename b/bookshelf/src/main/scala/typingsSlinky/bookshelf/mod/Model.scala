package typingsSlinky.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.bookshelf.anon.Instantiable
import typingsSlinky.createError.mod.Error
import typingsSlinky.knex.mod.QueryBuilder
import typingsSlinky.knex.mod.SafePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "Model")
@js.native
class Model[T /* <: Model[_] */] () extends ModelBase[T] {
  def belongsTo[R /* <: Model[_] */](target: Instantiable[R]): R = js.native
  def belongsTo[R /* <: Model[_] */](target: Instantiable[R], foreignKey: String): R = js.native
  def belongsTo[R /* <: Model[_] */](target: Instantiable[R], foreignKey: String, foreignKeyTarget: String): R = js.native
  def belongsToMany[R /* <: Model[_] */](target: Instantiable[R]): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: Instantiable[R], table: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: Instantiable[R], table: String, foreignKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: Instantiable[R], table: String, foreignKey: String, otherKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def count(): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  def count(column: String): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  def count(column: String, options: SyncOptions): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  /**
    * @throws {NoRowsDeletedError} if no records are deleted and `options.required !== false`
    */
  def destroy(): typingsSlinky.bluebird.mod.^[T] = js.native
  def destroy(options: DestroyOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  /**
    * @throws {NotFoundError} if no result and `options.required !== false`
    */
  def fetch(): typingsSlinky.bluebird.mod.^[T] = js.native
  def fetch(options: FetchOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def fetchAll(): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def fetchAll(options: FetchAllOptions): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  def hasMany[R /* <: Model[_] */](target: Instantiable[R]): Collection[R] = js.native
  def hasMany[R /* <: Model[_] */](target: Instantiable[R], foreignKey: String): Collection[R] = js.native
  def hasMany[R /* <: Model[_] */](target: Instantiable[R], foreignKey: String, foreignKeyTarget: String): Collection[R] = js.native
  def hasOne[R /* <: Model[_] */](target: Instantiable[R]): R = js.native
  def hasOne[R /* <: Model[_] */](target: Instantiable[R], foreignKey: String): R = js.native
  def hasOne[R /* <: Model[_] */](target: Instantiable[R], foreignKey: String, foreignKeyTarget: String): R = js.native
  def load(relations: String): typingsSlinky.bluebird.mod.^[T] = js.native
  def load(relations: String, options: LoadOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def load(relations: js.Array[String]): typingsSlinky.bluebird.mod.^[T] = js.native
  def load(relations: js.Array[String], options: LoadOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def morphMany[R /* <: Model[_] */](target: Instantiable[R]): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: Instantiable[R], name: String): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: Instantiable[R], name: String, columnNames: js.Array[String]): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: Instantiable[R], name: String, columnNames: js.Array[String], morphValue: String): Collection[R] = js.native
  def morphOne[R /* <: Model[_] */](target: Instantiable[R]): R = js.native
  def morphOne[R /* <: Model[_] */](target: Instantiable[R], name: String): R = js.native
  def morphOne[R /* <: Model[_] */](target: Instantiable[R], name: String, columnNames: js.Array[String]): R = js.native
  def morphOne[R /* <: Model[_] */](target: Instantiable[R], name: String, columnNames: js.Array[String], morphValue: String): R = js.native
  def morphTo(name: String): T = js.native
  def morphTo(name: String, columnNames: js.Array[String], target: ModelSubclass*): T = js.native
  def morphTo(name: String, target: ModelSubclass*): T = js.native
  def orderBy(column: String): T = js.native
  def orderBy(column: String, order: SortOrder): T = js.native
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def query(callback: js.Function1[/* qb */ QueryBuilder[_, js.Array[SafePartial[_]]], Unit]): T = js.native
  def query(query: String*): T = js.native
  def query(query: StringDictionary[js.Any]): T = js.native
  def refresh(): typingsSlinky.bluebird.mod.^[T] = js.native
  def refresh(options: FetchOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def resetQuery(): T = js.native
  /**
    * @throws {NoRowsUpdatedError} if updating and `options.required !== false`
    */
  def save(): typingsSlinky.bluebird.mod.^[T] = js.native
  def save(attrs: StringDictionary[js.Any]): typingsSlinky.bluebird.mod.^[T] = js.native
  def save(attrs: StringDictionary[js.Any], options: SaveOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def save(key: String): typingsSlinky.bluebird.mod.^[T] = js.native
  def save(key: String, `val`: js.Any): typingsSlinky.bluebird.mod.^[T] = js.native
  def save(key: String, `val`: js.Any, options: SaveOptions): typingsSlinky.bluebird.mod.^[T] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass): R = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: String): R = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: String, otherKey: String): R = js.native
  def where(key: String, operatorOrValue: String): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Double): T = js.native
  def where(key: String, operatorOrValue: Boolean): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Double): T = js.native
  def where(key: String, operatorOrValue: Double): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Double): T = js.native
  def where(properties: StringDictionary[js.Any]): T = js.native
}

/* static members */
@JSImport("bookshelf", "Model")
@js.native
object Model extends js.Object {
  var NoRowsDeletedError: Error[js.Error] = js.native
  var NoRowsUpdatedError: Error[js.Error] = js.native
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/errors.js
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/model.js#L1280
  var NotFoundError: Error[js.Error] = js.native
  def collection[T /* <: Model[_] */](): Collection[T] = js.native
  def collection[T /* <: Model[_] */](models: js.Array[T]): Collection[T] = js.native
  def collection[T /* <: Model[_] */](models: js.Array[T], options: CollectionOptions[T]): Collection[T] = js.native
  def count(): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  def count(column: String): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  def count(column: String, options: SyncOptions): typingsSlinky.bluebird.mod.^[Double | String] = js.native
  /** @deprecated use Typescript classes */
  def extend[T /* <: Model[_] */](): js.Function = js.native
  def extend[T /* <: Model[_] */](prototypeProperties: js.Any): js.Function = js.native
  def extend[T /* <: Model[_] */](prototypeProperties: js.Any, classProperties: js.Any): js.Function = js.native
   // should return a type
  def fetchAll[T /* <: Model[_] */](): typingsSlinky.bluebird.mod.^[Collection[T]] = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](): T = js.native
  def forge[T](attributes: js.Any): T = js.native
  def forge[T](attributes: js.Any, options: ModelOptions): T = js.native
  def where[T](key: String, operatorOrValue: String): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: String): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: js.Array[Double | String]): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: Double): T = js.native
  def where[T](key: String, operatorOrValue: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: String): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: js.Array[Double | String]): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: Double): T = js.native
  def where[T](key: String, operatorOrValue: Double): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: String): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: js.Array[Double | String]): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: Double): T = js.native
  def where[T](properties: StringDictionary[js.Any]): T = js.native
}

