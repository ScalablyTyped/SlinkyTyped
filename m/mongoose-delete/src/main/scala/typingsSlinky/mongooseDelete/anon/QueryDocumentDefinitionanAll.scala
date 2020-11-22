package typingsSlinky.mongooseDelete.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.mongodb.mod.ClientSession
import typingsSlinky.mongodb.mod.FindAndModifyWriteOpResultObject
import typingsSlinky.mongoose.anon.Coordinates
import typingsSlinky.mongoose.anon.FnCallOnfulfilledOnrejected
import typingsSlinky.mongoose.anon.NumberOfRetries
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindBase
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindOneA
import typingsSlinky.mongoose.anon.rawResulttrueQueryFindOne
import typingsSlinky.mongoose.anon.rawResulttrueQueryFindOneArrayFilters
import typingsSlinky.mongoose.anon.rawResulttrueupserttruene
import typingsSlinky.mongoose.anon.upserttruenewtrueQueryFin
import typingsSlinky.mongoose.mod.CollationOptions
import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.DocumentDefinition
import typingsSlinky.mongoose.mod.DocumentQuery
import typingsSlinky.mongoose.mod.Error
import typingsSlinky.mongoose.mod.FilterQuery
import typingsSlinky.mongoose.mod.NativeError
import typingsSlinky.mongoose.mod.Query
import typingsSlinky.mongoose.mod.QueryCursor
import typingsSlinky.mongoose.mod.QueryFindBaseOptions
import typingsSlinky.mongoose.mod.QueryFindOneAndRemoveOptions
import typingsSlinky.mongoose.mod.QueryFindOneAndUpdateOptions
import typingsSlinky.mongoose.mod.QueryPopulateOptions
import typingsSlinky.mongoose.mod.QueryUpdateOptions
import typingsSlinky.mongoose.mod.UpdateQuery
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongoose.mongoose.Query<mongoose.mongoose.DocumentDefinition<any>> & {} */
@js.native
trait QueryDocumentDefinitionanAll extends js.Object {
  
  /**
    * Specifies a javascript function or expression to pass to MongoDBs query system.
    * Only use $where when you have a condition that cannot be met using other MongoDB
    * operators like $lt. Be sure to read about all of its caveats before using.
    * @param js javascript string or function
    */
  @JSName("$where")
  def $where(js_ : String): this.type = js.native
  @JSName("$where")
  def $where(js_ : js.Function): this.type = js.native
  
  def all(path: String, `val`: js.Array[_]): this.type = js.native
  def all(path: String, `val`: Double): this.type = js.native
  def all(`val`: js.Array[_]): this.type = js.native
  /**
    * Specifies an $all query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def all(`val`: Double): this.type = js.native
  
  /**
    * Specifies arguments for a $and condition.
    * @param array array of conditions
    */
  def and(array: js.Array[_]): this.type = js.native
  
  /** Specifies the batchSize option. Cannot be used with distinct() */
  def batchSize(`val`: Double): this.type = js.native
  
  def box(lower: js.Array[Double], upper: js.Array[Double]): this.type = js.native
  /**
    * Specifies a $box condition
    * @param Upper Right Coords
    */
  def box(`val`: js.Any): this.type = js.native
  
  /** Casts this query to the schema of model, If obj is present, it is cast instead of this query.*/
  def cast(model: js.Any): js.Any = js.native
  def cast(model: js.Any, obj: js.Any): js.Any = js.native
  
  /**
    * Executes the query returning a Promise which will be
    * resolved with either the doc(s) or rejected with the error.
    * Like .then(), but only takes a rejection handler.
    */
  def `catch`[TRes](): js.Promise[TRes] = js.native
  def `catch`[TRes](reject: js.Function1[/* err */ js.Any, Unit | TRes | js.Thenable[TRes]]): js.Promise[TRes] = js.native
  
  /**
    * DEPRECATED Alias for circle
    * Specifies a $center or $centerSphere condition.
    * @deprecated Use circle instead.
    */
  def center(area: js.Any): this.type = js.native
  def center(path: String, area: js.Any): this.type = js.native
  
  /**
    * DEPRECATED Specifies a $centerSphere condition
    * @deprecated Use circle instead.
    */
  def centerSphere(path: String, `val`: js.Any): this.type = js.native
  def centerSphere(`val`: js.Any): this.type = js.native
  
  /** Specifies a $center or $centerSphere condition. */
  def circle(area: js.Any): this.type = js.native
  def circle(path: String, area: js.Any): this.type = js.native
  
  /** Adds a collation to this op (MongoDB 3.4 and up) */
  def collation(value: CollationOptions): this.type = js.native
  
  /** Specifies the comment option. Cannot be used with distinct() */
  def comment(`val`: String): this.type = js.native
  
  /**
    * Specifying this query as a count query. Passing a callback executes the query.
    * @param criteria mongodb selector
    */
  def count(): QuerynumberAll = js.native
  def count(callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  def count(criteria: FilterQuery[_]): QuerynumberAll = js.native
  def count(criteria: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  
  /**
    * Specifies this query as a `countDocuments()` query. Behaves like `count()`,
    * except it always does a full collection scan when passed an empty filter `{}`.
    *
    * There are also minor differences in how `countDocuments()` handles
    * [`$where` and a couple geospatial operators](http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments).
    * versus `count()`.
    *
    * Passing a `callback` executes the query.
    *
    * This function triggers the following middleware.
    *
    * - `countDocuments()`
    *
    *
    * @param {Object} [criteria] mongodb selector
    * @param {Function} [callback] optional params are (error, count)
    * @return {Query} this
    */
  def countDocuments(): QuerynumberAll = js.native
  def countDocuments(callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  def countDocuments(criteria: FilterQuery[_]): QuerynumberAll = js.native
  def countDocuments(criteria: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  
  /**
    * Returns a wrapper around a mongodb driver cursor. A Query<T>Cursor exposes a
    * Streams3-compatible interface, as well as a .next() function.
    */
  def cursor(): QueryCursor[_] = js.native
  def cursor(options: js.Any): QueryCursor[_] = js.native
  
  /** Declares or executes a distict() operation. Passing a callback executes the query. */
  def distinct(): QueryArrayany = js.native
  def distinct(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): QueryArrayany = js.native
  def distinct(field: String): QueryArrayany = js.native
  def distinct(field: String, callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): QueryArrayany = js.native
  def distinct(field: String, criteria: js.Any): QueryArrayany = js.native
  def distinct(
    field: String,
    criteria: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayany = js.native
  def distinct(field: String, criteria: Query[_]): QueryArrayany = js.native
  def distinct(
    field: String,
    criteria: Query[_],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayany = js.native
  
  def elemMatch(criteria: js.Any): this.type = js.native
  /** Specifies an $elemMatch condition */
  def elemMatch(criteria: js.Function1[/* elem */ Query[_], Unit]): this.type = js.native
  def elemMatch(path: String, criteria: js.Any): this.type = js.native
  def elemMatch(path: String, criteria: js.Function1[/* elem */ Query[_], Unit]): this.type = js.native
  def elemMatch(path: js.Any, criteria: js.Any): this.type = js.native
  def elemMatch(path: js.Any, criteria: js.Function1[/* elem */ Query[_], Unit]): this.type = js.native
  def elemMatch(path: js.Function, criteria: js.Any): this.type = js.native
  def elemMatch(path: js.Function, criteria: js.Function1[/* elem */ Query[_], Unit]): this.type = js.native
  
  /** Get the current error flag value */
  def error(): Error | Null = js.native
  /**
    * Set the error flag on this query
    * @param err The error flag
    */
  def error(err: Error): this.type = js.native
  /** Unset the error flag set on this query */
  def error(unset: Null): this.type = js.native
  
  /**
    * Estimates the number of documents in the MongoDB collection. Faster than
    * using `countDocuments()` for large collections because
    * `estimatedDocumentCount()` uses collection metadata rather than scanning
    * the entire collection.
    *
    * @param {Object} [options] passed transparently to the [MongoDB driver](http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#estimatedDocumentCount)
    * @param {Function} [callback] optional params are (error, count)
    * @return {Query} this
    */
  def estimatedDocumentCount(): QuerynumberAll = js.native
  def estimatedDocumentCount(callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  def estimatedDocumentCount(options: js.Any): QuerynumberAll = js.native
  def estimatedDocumentCount(options: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  
  /** Executes the query */
  def exec(): js.Promise[DocumentDefinition[_]] = js.native
  def exec(callback: js.Function2[/* err */ NativeError, /* res */ DocumentDefinition[_], Unit]): js.Promise[DocumentDefinition[_]] = js.native
  def exec(operation: String): js.Promise[DocumentDefinition[_]] = js.native
  def exec(operation: String, callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[_], Unit]): js.Promise[DocumentDefinition[_]] = js.native
  def exec(operation: js.Function): js.Promise[DocumentDefinition[_]] = js.native
  def exec(
    operation: js.Function,
    callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[_], Unit]
  ): js.Promise[DocumentDefinition[_]] = js.native
  
  /** Specifies an $exists condition */
  def exists(): this.type = js.native
  def exists(path: String): this.type = js.native
  def exists(path: String, `val`: Boolean): this.type = js.native
  def exists(`val`: Boolean): this.type = js.native
  
  /**
    * Finds documents. When no callback is passed, the query is not executed. When the
    * query is executed, the result will be an array of documents.
    * @param criteria mongodb selector
    */
  def find(): DocumentQueryArrayanyany = js.native
  def find(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyany = js.native
  def find(criteria: FilterQuery[_]): DocumentQueryArrayanyany = js.native
  def find(criteria: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyany = js.native
  
  /**
    * Declares the query a findOne operation. When executed, the first found document is
    * passed to the callback. Passing a callback executes the query. The result of the query
    * is a single document.
    * @param criteria mongodb selector
    * @param projection optional fields to return
    */
  def findOne(): DocumentQueryanynullany = js.native
  def findOne(callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]): DocumentQueryanynullany = js.native
  def findOne(criteria: FilterQuery[_]): DocumentQueryanynullany = js.native
  def findOne(criteria: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]): DocumentQueryanynullany = js.native
  def findOne(criteria: FilterQuery[_], projection: js.Any): DocumentQueryanynullany = js.native
  def findOne(
    criteria: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[_] | Null, Unit]
  ): DocumentQueryanynullany = js.native
  def findOne(criteria: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindBase): Query[DocumentDefinition[_]] with js.Object = js.native
  def findOne(
    criteria: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[_] | Null, Unit]
  ): Query[DocumentDefinition[_]] with js.Object = js.native
  def findOne(criteria: FilterQuery[_], projection: js.Any, options: QueryFindBaseOptions): DocumentQueryanynullany = js.native
  def findOne(
    criteria: FilterQuery[_],
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[_] | Null, Unit]
  ): DocumentQueryanynullany = js.native
  
  /**
    * Issues a mongodb findAndModify remove command.
    * Finds a matching document, removes it, passing the found document (if any) to the
    * callback. Executes immediately if callback is passed.
    *
    * If mongoose option 'useFindAndModify': set to false it uses native findOneAndUpdate() rather than deprecated findAndModify().
    * https://mongoosejs.com/docs/api.html#mongoose_Mongoose-set
    */
  def findOneAndRemove(): DocumentQueryanynullany = js.native
  def findOneAndRemove(callback: js.Function3[/* error */ js.Any, /* doc */ js.Any | Null, /* result */ js.Any, Unit]): DocumentQueryanynullany = js.native
  def findOneAndRemove(conditions: FilterQuery[_]): DocumentQueryanynullany = js.native
  def findOneAndRemove(
    conditions: FilterQuery[_],
    callback: js.Function3[/* error */ js.Any, /* doc */ js.Any | Null, /* result */ js.Any, Unit]
  ): DocumentQueryanynullany = js.native
  def findOneAndRemove(conditions: FilterQuery[_], options: rawResulttrueQueryFindOne): QueryFindAndModifyWriteOp = js.native
  def findOneAndRemove(
    conditions: FilterQuery[_],
    options: rawResulttrueQueryFindOne,
    callback: js.Function3[
      /* error */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* result */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOp = js.native
  def findOneAndRemove(conditions: FilterQuery[_], options: QueryFindOneAndRemoveOptions): DocumentQueryanynullany = js.native
  def findOneAndRemove(
    conditions: FilterQuery[_],
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function3[/* error */ js.Any, /* doc */ js.Any | Null, /* result */ js.Any, Unit]
  ): DocumentQueryanynullany = js.native
  
  /**
    * Issues a mongodb findAndModify update command.
    * Finds a matching document, updates it according to the update arg, passing any options, and returns
    * the found document (if any) to the callback. The query executes immediately if callback is passed.
    *
    * If mongoose option 'useFindAndModify': set to false it uses native findOneAndUpdate() rather than deprecated findAndModify().
    * https://mongoosejs.com/docs/api.html#mongoose_Mongoose-set
    */
  def findOneAndUpdate(): DocumentQueryanynullany = js.native
  def findOneAndUpdate(callback: js.Function2[/* err */ js.Any, /* doc */ js.Any | Null, Unit]): DocumentQueryanynullany = js.native
  def findOneAndUpdate(query: FilterQuery[_], update: UpdateQuery[_]): DocumentQueryanynullany = js.native
  def findOneAndUpdate(
    query: FilterQuery[_],
    update: UpdateQuery[_],
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullany = js.native
  def findOneAndUpdate(query: FilterQuery[_], update: UpdateQuery[_], options: leantrueOmitQueryFindOneA): Query[DocumentDefinition[_]] with js.Object = js.native
  def findOneAndUpdate(
    query: FilterQuery[_],
    update: UpdateQuery[_],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocumentDefinition[_], /* res */ js.Any, Unit]
  ): Query[DocumentDefinition[_]] with js.Object = js.native
  def findOneAndUpdate(query: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueQueryFindOneArrayFilters): QueryFindAndModifyWriteOp = js.native
  def findOneAndUpdate(
    query: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOp = js.native
  def findOneAndUpdate(query: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAll = js.native
  def findOneAndUpdate(
    query: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAll = js.native
  def findOneAndUpdate(query: FilterQuery[_], update: UpdateQuery[_], options: upserttruenewtrueQueryFin): DocumentQueryanyany = js.native
  def findOneAndUpdate(
    query: FilterQuery[_],
    update: UpdateQuery[_],
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyany = js.native
  def findOneAndUpdate(query: FilterQuery[_], update: UpdateQuery[_], options: QueryFindOneAndUpdateOptions): DocumentQueryanynullany = js.native
  def findOneAndUpdate(
    query: FilterQuery[_],
    update: UpdateQuery[_],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullany = js.native
  def findOneAndUpdate(update: UpdateQuery[_]): DocumentQueryanynullany = js.native
  def findOneAndUpdate(
    update: UpdateQuery[_],
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullany = js.native
  
  /**
    * Specifies a $geometry condition. geometry() must come after either intersects() or within().
    * @param object Must contain a type property which is a String and a coordinates property which
    *   is an Array. See the examples.
    */
  def geometry(`object`: Coordinates): this.type = js.native
  
  /**
    * Returns the current query filter (also known as conditions) as a POJO.
    * @returns current query filter
    */
  def getFilter(): js.Any = js.native
  
  /**
    * Returns the current query options as a JSON object.
    * @returns current query options
    */
  def getOptions(): js.Any = js.native
  
  /**
    * Returns the current query conditions as a JSON object.
    * @returns current query conditions
    * @deprecated You should use getFilter() instead of getQuery() where possible. getQuery() will likely be deprecated in a future release.
    */
  def getQuery(): js.Any = js.native
  
  /**
    * Returns the current update operations as a JSON object.
    * @returns current update operations
    */
  def getUpdate(): js.Any = js.native
  
  def gt[T](path: String, `val`: T): this.type = js.native
  /**
    * Specifies a $gt query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def gt[T](`val`: T): this.type = js.native
  
  def gte[T](path: String, `val`: T): this.type = js.native
  /**
    * Specifies a $gte query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def gte[T](`val`: T): this.type = js.native
  
  /**
    * Sets query hints.
    * @param val a hint object
    */
  def hint(`val`: js.Any): this.type = js.native
  
  def in(path: String, `val`: js.Array[_]): this.type = js.native
  /**
    * Specifies an $in query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def in(`val`: js.Array[_]): this.type = js.native
  
  /** Declares an intersects query for geometry(). MUST be used after where(). */
  def intersects(): this.type = js.native
  def intersects(arg: js.Any): this.type = js.native
  
  /**
    * Sets the lean option.
    * Documents returned from queries with the lean option enabled are plain
    * javascript objects, not MongooseDocuments. They have no save method,
    * getters/setters or other Mongoose magic applied.
    * @param {Boolean|Object} bool defaults to true
    */
  def lean[P](): (Query[P | Null | js.Array[P]]) with js.Object = js.native
  def lean[P](bool: js.Object): (Query[P | Null | js.Array[P]]) with js.Object = js.native
  def lean[P](bool: Boolean): (Query[P | Null | js.Array[P]]) with js.Object = js.native
  
  /** Specifies the maximum number of documents the query will return. Cannot be used with distinct() */
  def limit(`val`: Double): this.type = js.native
  
  def lt[T](path: String, `val`: T): this.type = js.native
  /**
    * Specifies a $lt query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def lt[T](`val`: T): this.type = js.native
  
  def lte[T](path: String, `val`: T): this.type = js.native
  /**
    * Specifies a $lte query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def lte[T](`val`: T): this.type = js.native
  
  /**
    * Runs a function fn and treats the return value of fn as the new value for the query to resolve to.
    * Any functions you pass to map() will run after any post hooks.
    */
  def map[TRes](fn: js.Function1[/* res */ DocumentDefinition[_], TRes]): (DocumentQuery[TRes, _, js.Object]) with js.Object = js.native
  
  def maxDistance(path: String, `val`: Double): this.type = js.native
  /**
    * Specifies a $maxDistance query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def maxDistance(`val`: Double): this.type = js.native
  
  /** Specifies the maxScan option. Cannot be used with distinct() */
  def maxScan(`val`: Double): this.type = js.native
  
  /** Specifies the maxTimeMS options. */
  def maxTimeMS(`val`: Double): this.type = js.native
  
  /** @deprecated Alias of maxScan */
  def maxscan(`val`: Double): this.type = js.native
  
  /**
    * Merges another Query or conditions object into this one.
    * When a Query is passed, conditions, field selection and options are merged.
    */
  def merge(source: js.Any): this.type = js.native
  def merge(source: Query[_]): this.type = js.native
  
  def mod(path: String, `val`: js.Array[Double]): this.type = js.native
  /** Specifies a $mod condition */
  def mod(`val`: js.Array[Double]): this.type = js.native
  
  def ne(path: String, `val`: js.Any): this.type = js.native
  /**
    * Specifies a $ne query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def ne(`val`: js.Any): this.type = js.native
  
  def near(path: String, `val`: js.Any): this.type = js.native
  /** Specifies a $near or $nearSphere condition. */
  def near(`val`: js.Any): this.type = js.native
  
  def nearSphere(path: String, `val`: js.Any): this.type = js.native
  /**
    * DEPRECATED Specifies a $nearSphere condition
    * @deprecated Use query.near() instead with the spherical option set to true.
    */
  def nearSphere(`val`: js.Any): this.type = js.native
  
  def nin(path: String, `val`: js.Array[_]): this.type = js.native
  /**
    * Specifies a $nin query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def nin(`val`: js.Array[_]): this.type = js.native
  
  /**
    * Specifies arguments for a $nor condition.
    * @param array array of conditions
    */
  def nor(array: js.Array[_]): this.type = js.native
  
  /**
    * Specifies arguments for an $or condition.
    * @param array array of conditions
    */
  def or(array: js.Array[_]): this.type = js.native
  
  /**
    * Make this query throw an error if no documents match the given `filter`.
    * This is handy for integrating with async/await, because `orFail()` saves you
    * an extra `if` statement to check if no document was found.
    *
    * Example:
    *
    *     // Throws if no doc returned
    *     await Model.findOne({ foo: 'bar' }).orFail();
    *
    *     // Throws if no document was updated
    *     await Model.updateOne({ foo: 'bar' }, { name: 'test' }).orFail();
    *
    *     // Throws "No docs found!" error if no docs match `{ foo: 'bar' }`
    *     await Model.find({ foo: 'bar' }).orFail(new Error('No docs found!'));
    *
    *     // Throws "Not found" error if no document was found
    *     await Model.findOneAndUpdate({ foo: 'bar' }, { name: 'test' }).
    *       orFail(() => Error('Not found'));
    *
    * @param err optional error to throw if no docs match `filter`
    */
  def orFail(): DocumentQuery[NonNullable[DocumentDefinition[_]], _, js.Object] = js.native
  def orFail(err: js.Function0[Error]): DocumentQuery[NonNullable[DocumentDefinition[_]], _, js.Object] = js.native
  def orFail(err: Error): DocumentQuery[NonNullable[DocumentDefinition[_]], _, js.Object] = js.native
  
  /** Specifies a $polygon condition */
  def polygon(coordinatePairs: js.Array[Double]*): this.type = js.native
  def polygon(path: String, coordinatePairs: js.Array[Double]*): this.type = js.native
  
  def populate(options: js.Array[QueryPopulateOptions]): this.type = js.native
  def populate(options: QueryPopulateOptions): this.type = js.native
  /**
    * Specifies paths which should be populated with other documents.
    * Paths are populated after the query executes and a response is received. A separate
    * query is then executed for each path specified for population. After a response for
    * each query has also been returned, the results are passed to the callback.
    * @param path either the path to populate or an object specifying all parameters
    * @param select Field selection for the population query
    * @param model The model you wish to use for population. If not specified, populate
    *   will look up the model by the name in the Schema's ref field.
    * @param match Conditions for the population query
    * @param options Options for the population query (sort, etc)
    */
  def populate(path: String): this.type = js.native
  def populate(
    path: String,
    select: js.UndefOr[scala.Nothing],
    model: js.UndefOr[scala.Nothing],
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: String, select: js.UndefOr[scala.Nothing], model: js.UndefOr[scala.Nothing], `match`: js.Any): this.type = js.native
  def populate(
    path: String,
    select: js.UndefOr[scala.Nothing],
    model: js.UndefOr[scala.Nothing],
    `match`: js.Any,
    options: js.Any
  ): this.type = js.native
  def populate(path: String, select: js.UndefOr[scala.Nothing], model: js.Any): this.type = js.native
  def populate(
    path: String,
    select: js.UndefOr[scala.Nothing],
    model: js.Any,
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: String, select: js.UndefOr[scala.Nothing], model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: String, select: js.UndefOr[scala.Nothing], model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: String, select: String): this.type = js.native
  def populate(
    path: String,
    select: String,
    model: js.UndefOr[scala.Nothing],
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: String, select: String, model: js.UndefOr[scala.Nothing], `match`: js.Any): this.type = js.native
  def populate(path: String, select: String, model: js.UndefOr[scala.Nothing], `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: String, select: String, model: js.Any): this.type = js.native
  def populate(path: String, select: String, model: js.Any, `match`: js.UndefOr[scala.Nothing], options: js.Any): this.type = js.native
  def populate(path: String, select: String, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: String, select: String, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: String, select: js.Any): this.type = js.native
  def populate(
    path: String,
    select: js.Any,
    model: js.UndefOr[scala.Nothing],
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: String, select: js.Any, model: js.UndefOr[scala.Nothing], `match`: js.Any): this.type = js.native
  def populate(path: String, select: js.Any, model: js.UndefOr[scala.Nothing], `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: String, select: js.Any, model: js.Any): this.type = js.native
  def populate(path: String, select: js.Any, model: js.Any, `match`: js.UndefOr[scala.Nothing], options: js.Any): this.type = js.native
  def populate(path: String, select: js.Any, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: String, select: js.Any, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: js.Any): this.type = js.native
  def populate(
    path: js.Any,
    select: js.UndefOr[scala.Nothing],
    model: js.UndefOr[scala.Nothing],
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: js.Any, select: js.UndefOr[scala.Nothing], model: js.UndefOr[scala.Nothing], `match`: js.Any): this.type = js.native
  def populate(
    path: js.Any,
    select: js.UndefOr[scala.Nothing],
    model: js.UndefOr[scala.Nothing],
    `match`: js.Any,
    options: js.Any
  ): this.type = js.native
  def populate(path: js.Any, select: js.UndefOr[scala.Nothing], model: js.Any): this.type = js.native
  def populate(
    path: js.Any,
    select: js.UndefOr[scala.Nothing],
    model: js.Any,
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: js.Any, select: js.UndefOr[scala.Nothing], model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.UndefOr[scala.Nothing], model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: js.Any, select: String): this.type = js.native
  def populate(
    path: js.Any,
    select: String,
    model: js.UndefOr[scala.Nothing],
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: js.Any, select: String, model: js.UndefOr[scala.Nothing], `match`: js.Any): this.type = js.native
  def populate(path: js.Any, select: String, model: js.UndefOr[scala.Nothing], `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: js.Any, select: String, model: js.Any): this.type = js.native
  def populate(path: js.Any, select: String, model: js.Any, `match`: js.UndefOr[scala.Nothing], options: js.Any): this.type = js.native
  def populate(path: js.Any, select: String, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: js.Any, select: String, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any): this.type = js.native
  def populate(
    path: js.Any,
    select: js.Any,
    model: js.UndefOr[scala.Nothing],
    `match`: js.UndefOr[scala.Nothing],
    options: js.Any
  ): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.UndefOr[scala.Nothing], `match`: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.UndefOr[scala.Nothing], `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.Any, `match`: js.UndefOr[scala.Nothing], options: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  
  /**
    * Determines the MongoDB nodes from which to read.
    * @param pref one of the listed preference options or aliases
    * @param tags optional tags for this query
    */
  def read(pref: String): this.type = js.native
  def read(pref: String, tags: js.Array[_]): this.type = js.native
  
  /**
    * Sets the readConcern option for the query.
    * @param level one of the listed read concern level or their aliases
    */
  def readConcern(level: String): this.type = js.native
  
  def regex(path: String, `val`: js.RegExp): this.type = js.native
  /**
    * Specifies a $regex query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def regex(`val`: js.RegExp): this.type = js.native
  
  /**
    * Declare and/or execute this query as a remove() operation.
    * The operation is only executed when a callback is passed. To force execution without a callback,
    * you must first call remove() and then execute it by using the exec() method.
    * @param criteria mongodb selector
    */
  def remove(): QueryWriteOpResultresult = js.native
  def remove(callback: js.Function1[/* err */ js.Any, Unit]): QueryWriteOpResultresult = js.native
  def remove(criteria: FilterQuery[_]): QueryWriteOpResultresult = js.native
  def remove(criteria: FilterQuery[_], callback: js.Function1[/* err */ js.Any, Unit]): QueryWriteOpResultresult = js.native
  def remove(criteria: Query[_]): QueryWriteOpResultresult = js.native
  def remove(criteria: Query[_], callback: js.Function1[/* err */ js.Any, Unit]): QueryWriteOpResultresult = js.native
  
  /** Specifies which document fields to include or exclude (also known as the query "projection") */
  def select(arg: String): this.type = js.native
  def select(arg: js.Any): this.type = js.native
  
  /** Determines if field selection has been made. */
  def selected(): Boolean = js.native
  
  /** Determines if exclusive field selection has been made.*/
  def selectedExclusively(): Boolean = js.native
  
  /** Determines if inclusive field selection has been made. */
  def selectedInclusively(): Boolean = js.native
  
  /**
    * Sets the [MongoDB session](https://docs.mongodb.com/manual/reference/server-sessions/)
    * associated with this query. Sessions are how you mark a query as part of a
    * [transaction](/docs/transactions.html).
    */
  def session(): this.type = js.native
  def session(session: ClientSession): this.type = js.native
  
  /** Sets query options. */
  def setOptions(options: js.Any): this.type = js.native
  
  /** Sets query conditions to the provided JSON object. */
  def setQuery(conditions: js.Any): this.type = js.native
  
  def size(path: String, `val`: Double): this.type = js.native
  /**
    * Specifies a $size query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def size(`val`: Double): this.type = js.native
  
  /** Specifies the number of documents to skip. Cannot be used with distinct() */
  def skip(`val`: Double): this.type = js.native
  
  /**
    * DEPRECATED Sets the slaveOk option.
    * @param v defaults to true
    * @deprecated in MongoDB 2.2 in favor of read preferences.
    */
  def slaveOk(): this.type = js.native
  def slaveOk(v: Boolean): this.type = js.native
  
  def slice(path: String, `val`: js.Array[Double]): this.type = js.native
  def slice(path: String, `val`: Double): this.type = js.native
  def slice(`val`: js.Array[Double]): this.type = js.native
  /**
    * Specifies a $slice projection for an array.
    * @param val number/range of elements to slice
    */
  def slice(`val`: Double): this.type = js.native
  
  /** Specifies this query as a snapshot query. Cannot be used with distinct() */
  def snapshot(): this.type = js.native
  def snapshot(v: Boolean): this.type = js.native
  
  /**
    * Sets the sort order
    * If an object is passed, values allowed are asc, desc, ascending, descending, 1, and -1.
    * If a string is passed, it must be a space delimited list of path names. The
    * sort order of each path is ascending unless the path name is prefixed with -
    * which will be treated as descending.
    */
  def sort(arg: String): this.type = js.native
  def sort(arg: js.Any): this.type = js.native
  
  /**
    * Sets the tailable option (for use with capped collections). Cannot be used with distinct()
    * @param bool defaults to true
    * @param opts options to set
    * @param opts.numberOfRetries if cursor is exhausted, retry this many times before giving up
    * @param opts.tailableRetryInterval if cursor is exhausted, wait this many milliseconds before retrying
    */
  def tailable(): this.type = js.native
  def tailable(bool: js.UndefOr[scala.Nothing], opts: NumberOfRetries): this.type = js.native
  def tailable(bool: Boolean): this.type = js.native
  def tailable(bool: Boolean, opts: NumberOfRetries): this.type = js.native
  
  /** Executes this query and returns a promise */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  /** Executes this query and returns a promise */
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /** Executes this query and returns a promise */
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ DocumentDefinition[_], TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  /** Executes this query and returns a promise */
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ DocumentDefinition[_], TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /** Executes this query and returns a promise */
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  /** Executes this query and returns a promise */
  @JSName("then")
  var then_Original: FnCallOnfulfilledOnrejected[DocumentDefinition[_]] = js.native
  
  /**
    * Converts this query to a customized, reusable query
    * constructor with all arguments and options retained.
    */
  def toConstructor[T](): Instantiable1[/* args (repeated) */ js.Any, Query[T] with js.Object] = js.native
  @JSName("toConstructor")
  def toConstructor_TDoc_Document[T, Doc /* <: Document */](): Instantiable1[/* args (repeated) */ js.Any, (DocumentQuery[T, Doc, js.Object]) with js.Object] = js.native
  
  /**
    * Declare and/or execute this query as an update() operation.
    * All paths passed that are not $atomic operations will become $set ops.
    * @param doc the update command
    */
  def update(): QuerynumberAll = js.native
  def update(callback: js.Function2[/* err */ js.Any, /* affectedRows */ Double, Unit]): QuerynumberAll = js.native
  def update(criteria: FilterQuery[_], doc: UpdateQuery[_]): QuerynumberAll = js.native
  def update(
    criteria: FilterQuery[_],
    doc: UpdateQuery[_],
    callback: js.Function2[/* err */ js.Any, /* affectedRows */ Double, Unit]
  ): QuerynumberAll = js.native
  def update(criteria: FilterQuery[_], doc: UpdateQuery[_], options: QueryUpdateOptions): QuerynumberAll = js.native
  def update(
    criteria: FilterQuery[_],
    doc: UpdateQuery[_],
    options: QueryUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* affectedRows */ Double, Unit]
  ): QuerynumberAll = js.native
  def update(doc: UpdateQuery[_]): QuerynumberAll = js.native
  def update(doc: UpdateQuery[_], callback: js.Function2[/* err */ js.Any, /* affectedRows */ Double, Unit]): QuerynumberAll = js.native
  
  /** Specifies a path for use with chaining. */
  def where(): this.type = js.native
  def where(path: js.UndefOr[scala.Nothing], `val`: js.Any): this.type = js.native
  def where(path: String): this.type = js.native
  def where(path: String, `val`: js.Any): this.type = js.native
  def where(path: js.Any): this.type = js.native
  def where(path: js.Any, `val`: js.Any): this.type = js.native
  
  /** Defines a $within or $geoWithin argument for geo-spatial queries. */
  def within(): this.type = js.native
  def within(coordinate: js.Array[Double], coordinatePairs: js.Array[Double]*): this.type = js.native
  def within(`val`: js.Any): this.type = js.native
  
  def wtimeout(): this.type = js.native
  def wtimeout(ms: Double): this.type = js.native
}
