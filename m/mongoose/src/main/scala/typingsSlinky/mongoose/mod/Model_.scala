package typingsSlinky.mongoose.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mongodb.anon.N
import typingsSlinky.mongodb.mod.BulkWriteOpResultObject
import typingsSlinky.mongodb.mod.ChangeStream
import typingsSlinky.mongodb.mod.CollectionBulkWriteOptions
import typingsSlinky.mongodb.mod.CollectionCreateOptions
import typingsSlinky.mongodb.mod.DefaultSchema
import typingsSlinky.mongodb.mod.FindAndModifyWriteOpResultObject
import typingsSlinky.mongoose.anon.ChangeStreamOptionssessio
import typingsSlinky.mongoose.anon.DeletedCount
import typingsSlinky.mongoose.anon.Lean
import typingsSlinky.mongoose.anon.Typeofmongoose
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindBase
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindOneA
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindOpti
import typingsSlinky.mongoose.anon.orderedbooleanundefinedra
import typingsSlinky.mongoose.anon.rawResulttrueQueryFindOne
import typingsSlinky.mongoose.anon.rawResulttrueQueryFindOneArrayFilters
import typingsSlinky.mongoose.anon.rawResulttrueupserttruene
import typingsSlinky.mongoose.anon.upserttruenewtrueQueryFin
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model_[T /* <: Document */, QueryHelpers]
  extends EventEmitter
     with ModelProperties
     with /**
  * Model constructor
  * Provides the interface to MongoDB collections as well as creates document instances.
  * @param doc values with which to create the document
  * @event error If listening to this event, it is emitted when a document
  *   was saved without passing a callback and an error occurred. If not
  *   listening, the event bubbles to the connection used to create this Model.
  * @event index Emitted after Model#ensureIndexes completes. If an error
  *   occurred it is passed with the event.
  * @event index-single-start Emitted when an individual index starts within
  *   Model#ensureIndexes. The fields and options being used to build the index
  *   are also passed with the event.
  * @event index-single-done Emitted when an individual index finishes within
  *   Model#ensureIndexes. If an error occurred it is passed with the event.
  *   The fields, options, and index name are also passed.
  */
Instantiable0[T]
     with Instantiable1[/* doc */ js.Any, T] {
  
  /**
    * Creates a Query and specifies a $where condition.
    * @param argument is a javascript string or anonymous function
    */
  @JSName("$where")
  def $where(argument: String): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  @JSName("$where")
  def $where(argument: js.Function): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Performs aggregations on the models collection.
    * If a callback is passed, the aggregate is executed and a Promise is returned.
    * If a callback is not passed, the aggregate itself is returned.
    * @param aggregations pipeline operator(s) or operator array
    */
  def aggregate[U](): Aggregate[js.Array[U]] = js.native
  def aggregate[U](aggregations: js.Array[_]): Aggregate[js.Array[U]] = js.native
  def aggregate[U](aggregations: js.Array[_], cb: js.Function): js.Promise[js.Array[U]] = js.native
  
  /** Base Mongoose instance the model uses. */
  var base: Typeofmongoose = js.native
  
  /**
    * If this is a discriminator model, baseModelName is the
    * name of the base model.
    */
  var baseModelName: js.UndefOr[String] = js.native
  
  /**
    * Sends multiple insertOne, updateOne, updateMany, replaceOne, deleteOne, and/or deleteMany operations to the MongoDB server in one command. This is faster than sending multiple independent operations (like) if you use create()) because with bulkWrite() there is only one round trip to MongoDB.
    * Mongoose will perform casting on all operations you provide.
    * This function does not trigger any middleware, not save() nor update(). If you need to trigger save() middleware for every document use create() instead.
    * @param writes Operations
    * @param options Optional settings. See https://mongoosejs.com/docs/api/model.html#model_Model.bulkWrite
    * @param cb callback
    * @return `BulkWriteOpResult` if the operation succeeds
    */
  def bulkWrite(writes: js.Array[_]): js.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(writes: js.Array[_], cb: js.Function2[/* err */ js.Any, /* res */ BulkWriteOpResultObject, Unit]): js.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(writes: js.Array[_], options: CollectionBulkWriteOptions): js.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(
    writes: js.Array[_],
    options: CollectionBulkWriteOptions,
    cb: js.Function2[/* err */ js.Any, /* res */ BulkWriteOpResultObject, Unit]
  ): Unit = js.native
  
  /** Counts number of matching documents in a database collection. */
  def count(conditions: FilterQuery[T]): Query[Double] with QueryHelpers = js.native
  def count(conditions: FilterQuery[T], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with QueryHelpers = js.native
  
  /**
    * Counts number of documents matching `criteria` in a database collection.
    *
    * If you want to count all documents in a large collection,
    * use the `estimatedDocumentCount()` instead.
    * If you call `countDocuments({})`, MongoDB will always execute
    * a full collection scan and **not** use any indexes.
    *
    * @param {Object} filter
    * @param {Function} [callback]
    * @return {Query}
    */
  def countDocuments(): Query[Double] with QueryHelpers = js.native
  def countDocuments(callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with QueryHelpers = js.native
  def countDocuments(criteria: FilterQuery[T]): Query[Double] with QueryHelpers = js.native
  def countDocuments(criteria: FilterQuery[T], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with QueryHelpers = js.native
  
  def create[TCreate](docs: CreateQuery[TCreate]*): js.Promise[T] = js.native
  def create[TCreate](docs: js.Array[CreateQuery[TCreate]]): js.Promise[js.Array[T]] = js.native
  def create[TCreate](
    docs: js.Array[CreateQuery[TCreate]],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): js.Promise[js.Array[T]] = js.native
  def create[TCreate](
    docs: js.Array[CreateQuery[TCreate]],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): js.Promise[js.Array[T]] = js.native
  def create[TCreate](docs: js.Array[CreateQuery[TCreate]], options: SaveOptions): js.Promise[js.Array[T]] = js.native
  def create[TCreate](
    docs: js.Array[CreateQuery[TCreate]],
    options: SaveOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): js.Promise[js.Array[T]] = js.native
  /**
    * Shortcut for saving one or more documents to the database. MyModel.create(docs)
    * does new MyModel(doc).save() for every doc in docs.
    * Triggers the save() hook.
    */
  def create[TCreate](doc: CreateQuery[TCreate]): js.Promise[T] = js.native
  def create[TCreate](doc: CreateQuery[TCreate], callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]): js.Promise[T] = js.native
  def create[TCreate](doc: CreateQuery[TCreate], options: SaveOptions): js.Promise[T] = js.native
  
  /**
    * Create the collection for this model. By default, if no indexes are specified, mongoose will not create the
    * collection for the model until any documents are created. Use this method to create the collection explicitly.
    */
  def createCollection(): js.Promise[Unit] = js.native
  def createCollection(options: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def createCollection(options: CollectionCreateOptions): js.Promise[Unit] = js.native
  def createCollection(options: CollectionCreateOptions, cb: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Similar to ensureIndexes(), except for it uses the createIndex function. The ensureIndex() function checks to see if an index with that name already exists, and, if not, does not attempt to create the index. createIndex() bypasses this check.
    * @param cb Optional callback
    */
  def createIndexes(): js.Promise[Unit] = js.native
  def createIndexes(cb: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  def deleteMany(conditions: FilterQuery[T]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  def deleteMany(conditions: FilterQuery[T], callback: js.Function1[/* err */ js.Any, Unit]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  def deleteMany(conditions: FilterQuery[T], options: ModelOptions): (Query[N with DeletedCount]) with QueryHelpers = js.native
  def deleteMany(conditions: FilterQuery[T], options: ModelOptions, callback: js.Function1[/* err */ js.Any, Unit]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  
  def deleteOne(conditions: FilterQuery[T]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  def deleteOne(conditions: FilterQuery[T], callback: js.Function1[/* err */ js.Any, Unit]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  def deleteOne(conditions: FilterQuery[T], options: ModelOptions): (Query[N with DeletedCount]) with QueryHelpers = js.native
  def deleteOne(conditions: FilterQuery[T], options: ModelOptions, callback: js.Function1[/* err */ js.Any, Unit]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  
  /**
    * Adds a discriminator type.
    * @param name discriminator model name
    * @param schema discriminator model schema
    * @param value the string stored in the `discriminatorKey` property
    */
  def discriminator[U /* <: Document */](name: String, schema: Schema[_]): Model_[U, js.Object] = js.native
  def discriminator[U /* <: Document */](name: String, schema: Schema[_], value: String): Model_[U, js.Object] = js.native
  /**
    * Adds a discriminator type.
    * @param name discriminator model name
    * @param schema discriminator model schema
    * @param value the string stored in the `discriminatorKey` property
    */
  @JSName("discriminator")
  def discriminator_U_DocumentM_Model_UObject_M[U /* <: Document */, M /* <: Model_[U, js.Object] */](name: String, schema: Schema[_]): M = js.native
  @JSName("discriminator")
  def discriminator_U_DocumentM_Model_UObject_M[U /* <: Document */, M /* <: Model_[U, js.Object] */](name: String, schema: Schema[_], value: String): M = js.native
  
  /** Registered discriminators for this model. */
  var discriminators: js.UndefOr[StringDictionary[Model_[_, js.Object]]] = js.native
  
  /** Creates a Query for a distinct operation. Passing a callback immediately executes the query. */
  def distinct(field: String): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(field: String, callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(field: String, conditions: js.Any): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(
    field: String,
    conditions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): Query[js.Array[_]] with QueryHelpers = js.native
  
  /**
    * Sends ensureIndex commands to mongo for each index declared in the schema.
    * @param options internal options
    * @param cb optional callback
    */
  def ensureIndexes(): js.Promise[Unit] = js.native
  def ensureIndexes(callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def ensureIndexes(options: js.Any): js.Promise[Unit] = js.native
  def ensureIndexes(options: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Estimates the number of documents in the MongoDB collection. Faster than
    * using `countDocuments()` for large collections because
    * `estimatedDocumentCount()` uses collection metadata rather than scanning
    * the entire collection.
    *
    * @param {Object} [options]
    * @param {Function} [callback]
    * @return {Query}
    */
  def estimatedDocumentCount(): Query[Double] with QueryHelpers = js.native
  def estimatedDocumentCount(callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with QueryHelpers = js.native
  def estimatedDocumentCount(options: js.Any): Query[Double] with QueryHelpers = js.native
  def estimatedDocumentCount(options: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with QueryHelpers = js.native
  
  /**
    * Returns true if at least one document exists in the database that matches
    * the given `filter`, and false otherwise.
    */
  def exists(filter: FilterQuery[T]): js.Promise[Boolean] = js.native
  def exists(filter: FilterQuery[T], callback: js.Function2[/* err */ js.Any, /* res */ Boolean, Unit]): js.Promise[Boolean] = js.native
  
  /**
    * Finds documents.
    * @param projection optional fields to return
    */
  def find(): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(conditions: FilterQuery[T]): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(conditions: FilterQuery[T], callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.UndefOr[scala.Nothing],
    options: leantrueOmitQueryFindOpti
  ): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.UndefOr[scala.Nothing],
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(conditions: FilterQuery[T], projection: js.UndefOr[scala.Nothing], options: QueryFindOptions): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.UndefOr[scala.Nothing],
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(conditions: FilterQuery[T], projection: js.Any): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(conditions: FilterQuery[T], projection: js.Any, options: leantrueOmitQueryFindOpti): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.Any,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(conditions: FilterQuery[T], projection: js.Any, options: QueryFindOptions): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: js.Any,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(conditions: FilterQuery[T], projection: Null, options: leantrueOmitQueryFindOpti): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: Null,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): Query[js.Array[DocumentDefinition[T]]] with QueryHelpers = js.native
  def find(conditions: FilterQuery[T], projection: Null, options: QueryFindOptions): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def find(
    conditions: FilterQuery[T],
    projection: Null,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  
  def findById(id: String): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: String, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: String, projection: js.Any): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: String, projection: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: String, projection: js.Any, options: leantrueOmitQueryFindBase): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findById(
    id: String,
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findById(id: String, projection: js.Any, options: QueryFindBaseOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(
    id: String,
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  /**
    * Finds a single document by its _id field. findById(id) is almost*
    * equivalent to findOne({ _id: id }). findById() triggers findOne hooks.
    * @param id value of _id to query by
    * @param projection optional fields to return
    */
  def findById(id: js.Any): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: js.Any, projection: js.Any): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: js.Any, projection: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: js.Any, projection: js.Any, options: leantrueOmitQueryFindBase): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findById(
    id: js.Any,
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findById(id: js.Any, projection: js.Any, options: QueryFindBaseOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(
    id: js.Any,
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: Double): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: Double, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: Double, projection: js.Any): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: Double, projection: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(id: Double, projection: js.Any, options: leantrueOmitQueryFindBase): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findById(
    id: Double,
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findById(id: Double, projection: js.Any, options: QueryFindBaseOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findById(
    id: Double,
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Issue a mongodb findOneAndDelete command by a document's _id field.
    * findByIdAndDelete(id, ...) is equivalent to findByIdAndDelete({ _id: id }, ...).
    * Finds a matching document, removes it, passing the found document (if any) to the callback.
    * Executes immediately if callback is passed, else a Query object is returned.
    *
    * Note: same signatures as findByIdAndRemove
    *
    * @param id value of _id to query by
    */
  def findByIdAndDelete(): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndDelete(id: String): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndDelete(id: String, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndDelete(id: String, options: QueryFindOneAndRemoveOptions): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndDelete(
    id: String,
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      (/* res */ FindAndModifyWriteOpResultObject[T | Null]) | Null | T, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndDelete(id: js.Any): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndDelete(id: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndDelete(id: js.Any, options: QueryFindOneAndRemoveOptions): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndDelete(
    id: js.Any,
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      (/* res */ FindAndModifyWriteOpResultObject[T | Null]) | Null | T, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndDelete(id: Double): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndDelete(id: Double, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndDelete(id: Double, options: QueryFindOneAndRemoveOptions): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndDelete(
    id: Double,
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      (/* res */ FindAndModifyWriteOpResultObject[T | Null]) | Null | T, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  
  /**
    * Issue a mongodb findAndModify remove command by a document's _id field.
    * findByIdAndRemove(id, ...) is equivalent to findOneAndRemove({ _id: id }, ...).
    * Finds a matching document, removes it, passing the found document (if any) to the callback.
    * Executes immediately if callback is passed, else a Query object is returned.
    *
    * If mongoose option 'useFindAndModify': set to false it uses native findOneAndUpdate() rather than deprecated findAndModify().
    * https://mongoosejs.com/docs/api.html#mongoose_Mongoose-set
    *
    * Note: same signatures as findByIdAndDelete
    *
    * @param id value of _id to query by
    */
  def findByIdAndRemove(): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndRemove(id: String): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndRemove(id: String, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndRemove(id: String, options: QueryFindOneAndRemoveOptions): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndRemove(
    id: String,
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      (/* res */ FindAndModifyWriteOpResultObject[T | Null]) | Null | T, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndRemove(id: js.Any): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndRemove(id: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndRemove(id: js.Any, options: QueryFindOneAndRemoveOptions): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndRemove(
    id: js.Any,
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      (/* res */ FindAndModifyWriteOpResultObject[T | Null]) | Null | T, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndRemove(id: Double): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndRemove(id: Double, callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndRemove(id: Double, options: QueryFindOneAndRemoveOptions): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndRemove(
    id: Double,
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      (/* res */ FindAndModifyWriteOpResultObject[T | Null]) | Null | T, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  
  /**
    * Issues a mongodb findAndModify update command by a document's _id field. findByIdAndUpdate(id, ...)
    * is equivalent to findOneAndUpdate({ _id: id }, ...).
    *
    * If mongoose option 'useFindAndModify': set to false it uses native findOneAndUpdate() rather than deprecated findAndModify().
    * https://mongoosejs.com/docs/api.html#mongoose_Mongoose-set
    *
    * @param id value of _id to query by
    */
  def findByIdAndUpdate(): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: String, update: UpdateQuery[T]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: String,
    update: UpdateQuery[T],
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: String, update: UpdateQuery[T], options: leantrueOmitQueryFindOneA): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: String,
    update: UpdateQuery[T],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[T], Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(id: String, update: UpdateQuery[T], options: rawResulttrueQueryFindOneArrayFilters): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: String,
    update: UpdateQuery[T],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function2[/* err */ js.Any, /* res */ FindAndModifyWriteOpResultObject[T | Null], Unit]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: String, update: UpdateQuery[T], options: rawResulttrueupserttruene): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: String,
    update: UpdateQuery[T],
    options: rawResulttrueupserttruene,
    callback: js.Function2[/* err */ js.Any, /* res */ T, Unit]
  ): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: String, update: UpdateQuery[T], options: upserttruenewtrueQueryFin): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: String,
    update: UpdateQuery[T],
    options: upserttruenewtrueQueryFin,
    callback: js.Function2[/* err */ js.Any, /* res */ FindAndModifyWriteOpResultObject[T], Unit]
  ): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(id: String, update: UpdateQuery[T], options: QueryFindOneAndUpdateOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: String,
    update: UpdateQuery[T],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: js.Any, update: UpdateQuery[T]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: js.Any,
    update: UpdateQuery[T],
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: js.Any, update: UpdateQuery[T], options: leantrueOmitQueryFindOneA): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: js.Any,
    update: UpdateQuery[T],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[T], Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(id: js.Any, update: UpdateQuery[T], options: rawResulttrueQueryFindOneArrayFilters): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: js.Any,
    update: UpdateQuery[T],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function2[/* err */ js.Any, /* res */ FindAndModifyWriteOpResultObject[T | Null], Unit]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: js.Any, update: UpdateQuery[T], options: rawResulttrueupserttruene): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: js.Any,
    update: UpdateQuery[T],
    options: rawResulttrueupserttruene,
    callback: js.Function2[/* err */ js.Any, /* res */ T, Unit]
  ): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: js.Any, update: UpdateQuery[T], options: upserttruenewtrueQueryFin): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: js.Any,
    update: UpdateQuery[T],
    options: upserttruenewtrueQueryFin,
    callback: js.Function2[/* err */ js.Any, /* res */ FindAndModifyWriteOpResultObject[T], Unit]
  ): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(id: js.Any, update: UpdateQuery[T], options: QueryFindOneAndUpdateOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: js.Any,
    update: UpdateQuery[T],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: Double, update: UpdateQuery[T]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: Double,
    update: UpdateQuery[T],
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: Double, update: UpdateQuery[T], options: leantrueOmitQueryFindOneA): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: Double,
    update: UpdateQuery[T],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function2[/* err */ js.Any, /* res */ DocumentDefinition[T], Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(id: Double, update: UpdateQuery[T], options: rawResulttrueQueryFindOneArrayFilters): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: Double,
    update: UpdateQuery[T],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function2[/* err */ js.Any, /* res */ FindAndModifyWriteOpResultObject[T | Null], Unit]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: Double, update: UpdateQuery[T], options: rawResulttrueupserttruene): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: Double,
    update: UpdateQuery[T],
    options: rawResulttrueupserttruene,
    callback: js.Function2[/* err */ js.Any, /* res */ T, Unit]
  ): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(id: Double, update: UpdateQuery[T], options: upserttruenewtrueQueryFin): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: Double,
    update: UpdateQuery[T],
    options: upserttruenewtrueQueryFin,
    callback: js.Function2[/* err */ js.Any, /* res */ FindAndModifyWriteOpResultObject[T], Unit]
  ): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findByIdAndUpdate(id: Double, update: UpdateQuery[T], options: QueryFindOneAndUpdateOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findByIdAndUpdate(
    id: Double,
    update: UpdateQuery[T],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Finds one document.
    * The conditions are cast to their respective SchemaTypes before the command is sent.
    * @param projection optional fields to return
    */
  def findOne(): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOne(
    conditions: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOne(conditions: FilterQuery[T]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOne(conditions: FilterQuery[T], callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOne(conditions: FilterQuery[T], projection: js.Any): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOne(
    conditions: FilterQuery[T],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOne(conditions: FilterQuery[T], projection: js.Any, options: leantrueOmitQueryFindBase): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findOne(
    conditions: FilterQuery[T],
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findOne(conditions: FilterQuery[T], projection: js.Any, options: QueryFindBaseOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOne(
    conditions: FilterQuery[T],
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Issues a mongodb findOneAndDelete command.
    * Finds a matching document, removes it, passing the found document (if any) to the
    * callback. Executes immediately if callback is passed.
    *
    * Note: same signatures as findOneAndRemove
    *
    */
  def findOneAndDelete(): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndDelete(conditions: FilterQuery[T]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndDelete(conditions: FilterQuery[T], callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndDelete(conditions: FilterQuery[T], options: rawResulttrueQueryFindOne): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findOneAndDelete(
    conditions: FilterQuery[T],
    options: rawResulttrueQueryFindOne,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[T | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findOneAndDelete(conditions: FilterQuery[T], options: QueryFindOneAndRemoveOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndDelete(
    conditions: FilterQuery[T],
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Issue a mongodb findAndModify remove command.
    * Finds a matching document, removes it, passing the found document (if any) to the callback.
    * Executes immediately if callback is passed else a Query object is returned.
    *
    * If mongoose option 'useFindAndModify': set to false it uses native findOneAndUpdate() rather than deprecated findAndModify().
    * https://mongoosejs.com/docs/api.html#mongoose_Mongoose-set
    *
    * Note: same signatures as findOneAndDelete
    *
    */
  def findOneAndRemove(): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndRemove(conditions: FilterQuery[T]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndRemove(conditions: FilterQuery[T], callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndRemove(conditions: FilterQuery[T], options: rawResulttrueQueryFindOne): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findOneAndRemove(
    conditions: FilterQuery[T],
    options: rawResulttrueQueryFindOne,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[T | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findOneAndRemove(conditions: FilterQuery[T], options: QueryFindOneAndRemoveOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndRemove(
    conditions: FilterQuery[T],
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T | Null, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Issues a mongodb findAndModify update command.
    * Finds a matching document, updates it according to the update arg, passing any options,
    * and returns the found document (if any) to the callback. The query executes immediately
    * if callback is passed else a Query object is returned.
    *
    * If mongoose option 'useFindAndModify': set to false it uses native findOneAndUpdate() rather than the deprecated findAndModify().
    * https://mongoosejs.com/docs/api.html#mongoose_Mongoose-set
    */
  def findOneAndUpdate(): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndUpdate(conditions: FilterQuery[T], update: UpdateQuery[T]): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndUpdate(
    conditions: FilterQuery[T],
    update: UpdateQuery[T],
    callback: js.Function3[/* err */ js.Any, /* doc */ T | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndUpdate(conditions: FilterQuery[T], update: UpdateQuery[T], options: leantrueOmitQueryFindOneA): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findOneAndUpdate(
    conditions: FilterQuery[T],
    update: UpdateQuery[T],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocumentDefinition[T], /* res */ js.Any, Unit]
  ): Query[DocumentDefinition[T]] with QueryHelpers = js.native
  def findOneAndUpdate(conditions: FilterQuery[T], update: UpdateQuery[T], options: rawResulttrueQueryFindOneArrayFilters): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findOneAndUpdate(
    conditions: FilterQuery[T],
    update: UpdateQuery[T],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[T | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[T | Null]]) with QueryHelpers = js.native
  def findOneAndUpdate(conditions: FilterQuery[T], update: UpdateQuery[T], options: rawResulttrueupserttruene): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findOneAndUpdate(
    conditions: FilterQuery[T],
    update: UpdateQuery[T],
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[T], 
      /* res */ js.Any, 
      Unit
    ]
  ): Query[FindAndModifyWriteOpResultObject[T]] with QueryHelpers = js.native
  def findOneAndUpdate(conditions: FilterQuery[T], update: UpdateQuery[T], options: upserttruenewtrueQueryFin): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndUpdate(
    conditions: FilterQuery[T],
    update: UpdateQuery[T],
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ T, /* res */ js.Any, Unit]
  ): (DocumentQuery[T, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndUpdate(conditions: FilterQuery[T], update: UpdateQuery[T], options: QueryFindOneAndUpdateOptions): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  def findOneAndUpdate(
    conditions: FilterQuery[T],
    update: UpdateQuery[T],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ T | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[T | Null, T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Implements $geoSearch functionality for Mongoose
    * @param conditions an object that specifies the match condition (required)
    * @param options for the geoSearch, some (near, maxDistance) are required
    * @param callback optional callback
    */
  def geoSearch(conditions: js.Any, options: Lean): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  def geoSearch(
    conditions: js.Any,
    options: Lean,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): (DocumentQuery[js.Array[T], T, QueryHelpers]) with QueryHelpers = js.native
  
  /**
    * Shortcut for creating a new Document from existing raw data,
    * pre-saved in the DB. The document returned has no paths marked
    * as modified initially.
    */
  def hydrate(obj: js.Any): T = js.native
  
  /**
    * Performs any async initialization of this model against MongoDB.
    * This function is called automatically, so you don't need to call it.
    * This function is also idempotent, so you may call it to get back a promise
    * that will resolve when your indexes are finished building as an alternative
    * to `MyModel.on('index')`
    * @param callback optional
    */
  def init(): js.Promise[T] = js.native
  def init(callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[T] = js.native
  
  def insertMany(doc: js.Any): js.Promise[T] = js.native
  def insertMany(doc: js.Any, callback: js.Function2[/* error */ js.Any, /* doc */ T, Unit]): js.Promise[T] = js.native
  def insertMany(
    doc: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* doc */ T, Unit]
  ): js.Promise[T] = js.native
  def insertMany(doc: js.Any, options: orderedbooleanundefinedra): js.Promise[T] = js.native
  def insertMany(
    doc: js.Any,
    options: orderedbooleanundefinedra,
    callback: js.Function2[/* error */ js.Any, /* doc */ T, Unit]
  ): js.Promise[T] = js.native
  /**
    * Shortcut for validating an array of documents and inserting them into
    * MongoDB if they're all valid. This function is faster than .create()
    * because it only sends one operation to the server, rather than one for each
    * document.
    * This function does not trigger save middleware.
    * @param docs Documents to insert.
    * @param options Optional settings.
    * @param options.ordered  if true, will fail fast on the first error encountered.
    *        If false, will insert all the documents it can and report errors later.
    * @param options.rawResult if false, the returned promise resolves to the documents that passed mongoose document validation.
    *        If `true`, will return the [raw result from the MongoDB driver](http://mongodb.github.io/node-mongodb-native/2.2/api/Collection.html#~insertWriteOpCallback)
    *        with a `mongoose` property that contains `validationErrors` if this is an unordered `insertMany`.
    */
  def insertMany(docs: js.Array[_]): js.Promise[js.Array[T]] = js.native
  def insertMany(docs: js.Array[_], callback: js.Function2[/* error */ js.Any, /* docs */ js.Array[T], Unit]): js.Promise[js.Array[T]] = js.native
  def insertMany(
    docs: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* docs */ js.Array[T], Unit]
  ): js.Promise[js.Array[T]] = js.native
  def insertMany(docs: js.Array[_], options: orderedbooleanundefinedra): js.Promise[js.Array[T]] = js.native
  def insertMany(
    docs: js.Array[_],
    options: orderedbooleanundefinedra,
    callback: js.Function2[/* error */ js.Any, /* docs */ js.Array[T], Unit]
  ): js.Promise[js.Array[T]] = js.native
  
  def listIndexes(): js.Promise[Unit] = js.native
  /**
    * Lists the indexes currently defined in MongoDB. This may or may not be
    * the same as the indexes defined in your schema depending on whether you
    * use the [`autoIndex` option](/docs/guide.html#autoIndex) and if you
    * build indexes manually.
    * @param cb optional callback
    * @return Returns `undefined` if callback is specified, returns a promise if no callback.
    */
  def listIndexes(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  /**
    * Executes a mapReduce command.
    * @param o an object specifying map-reduce options
    * @param callbackoptional callback
    */
  def mapReduce[Key, Value](o: ModelMapReduceOption[T, Key, Value]): js.Promise[_] = js.native
  def mapReduce[Key, Value](
    o: ModelMapReduceOption[T, Key, Value],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): js.Promise[_] = js.native
  
  def model[U /* <: Document */](name: String): Model_[U, js.Object] = js.native
  
  /** The name of the model */
  var modelName: String = js.native
  
  def populate(docs: js.Array[_], options: js.Array[ModelPopulateOptions]): js.Promise[js.Array[T]] = js.native
  def populate(
    docs: js.Array[_],
    options: js.Array[ModelPopulateOptions],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): js.Promise[js.Array[T]] = js.native
  /**
    * Populates document references.
    * @param docs Either a single document or array of documents to populate.
    * @param options A hash of key/val (path, options) used for population.
    * @param callback Optional callback, executed upon completion. Receives err and the doc(s).
    */
  def populate(docs: js.Array[_], options: ModelPopulateOptions): js.Promise[js.Array[T]] = js.native
  def populate(
    docs: js.Array[_],
    options: ModelPopulateOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[T], Unit]
  ): js.Promise[js.Array[T]] = js.native
  def populate[T](docs: js.Any, options: js.Array[ModelPopulateOptions]): js.Promise[T] = js.native
  def populate[T](
    docs: js.Any,
    options: js.Array[ModelPopulateOptions],
    callback: js.Function2[/* err */ js.Any, /* res */ T, Unit]
  ): js.Promise[T] = js.native
  def populate[T](docs: js.Any, options: ModelPopulateOptions): js.Promise[T] = js.native
  def populate[T](
    docs: js.Any,
    options: ModelPopulateOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ T, Unit]
  ): js.Promise[T] = js.native
  
  /** Removes documents from the collection. */
  def remove(conditions: FilterQuery[T]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  def remove(conditions: FilterQuery[T], callback: js.Function1[/* err */ js.Any, Unit]): (Query[N with DeletedCount]) with QueryHelpers = js.native
  
  /**
    * Same as update(), except MongoDB replace the existing document with the given document (no atomic operators like $set).
    * This function triggers the following middleware: replaceOne
    */
  def replaceOne(conditions: FilterQuery[T], replacement: js.Any): Query[_] with QueryHelpers = js.native
  def replaceOne(
    conditions: FilterQuery[T],
    replacement: js.Any,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with QueryHelpers = js.native
  
  def syncIndexes(): js.Promise[Unit] = js.native
  def syncIndexes(options: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def syncIndexes(options: js.Object): js.Promise[Unit] = js.native
  /**
    * Makes the indexes in MongoDB match the indexes defined in this model's
    * schema. This function will drop any indexes that are not defined in
    * the model's schema except the `_id` index, and build any indexes that
    * are in your schema but not in MongoDB.
    * @param options options to pass to `ensureIndexes()`
    * @param callback optional callback
    * @return Returns `undefined` if callback is specified, returns a promise if no callback.
    */
  def syncIndexes(options: js.Object, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def syncIndexes(options: Null, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  /**
    * Translate any aliases fields/conditions so the final query or document object is pure
    * @param raw fields/conditions that may contain aliased keys
    * @return the translated 'pure' fields/conditions
    */
  def translateAliases(raw: js.Any): js.Any = js.native
  
  /**
    * Updates documents in the database without returning them.
    * All update values are cast to their appropriate SchemaTypes before being sent.
    */
  def update(conditions: FilterQuery[T], doc: UpdateQuery[T]): Query[_] with QueryHelpers = js.native
  def update(
    conditions: FilterQuery[T],
    doc: UpdateQuery[T],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with QueryHelpers = js.native
  def update(conditions: FilterQuery[T], doc: UpdateQuery[T], options: ModelUpdateOptions): Query[_] with QueryHelpers = js.native
  def update(
    conditions: FilterQuery[T],
    doc: UpdateQuery[T],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with QueryHelpers = js.native
  
  def updateMany(conditions: FilterQuery[T], doc: UpdateQuery[T]): Query[_] with QueryHelpers = js.native
  def updateMany(
    conditions: FilterQuery[T],
    doc: UpdateQuery[T],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with QueryHelpers = js.native
  def updateMany(conditions: FilterQuery[T], doc: UpdateQuery[T], options: ModelUpdateOptions): Query[_] with QueryHelpers = js.native
  def updateMany(
    conditions: FilterQuery[T],
    doc: UpdateQuery[T],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with QueryHelpers = js.native
  
  def updateOne(conditions: FilterQuery[T], doc: UpdateQuery[T]): Query[_] with QueryHelpers = js.native
  def updateOne(
    conditions: FilterQuery[T],
    doc: UpdateQuery[T],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with QueryHelpers = js.native
  def updateOne(conditions: FilterQuery[T], doc: UpdateQuery[T], options: ModelUpdateOptions): Query[_] with QueryHelpers = js.native
  def updateOne(
    conditions: FilterQuery[T],
    doc: UpdateQuery[T],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with QueryHelpers = js.native
  
  /**
    * Requires a replica set running MongoDB >= 3.6.0. Watches the underlying collection for changes using MongoDB change streams.
    * This function does not trigger any middleware. In particular, it does not trigger aggregate middleware.
    * @param pipeline See http://mongodb.github.io/node-mongodb-native/3.3/api/Collection.html#watch
    * @param options See https://mongodb.github.io/node-mongodb-native/3.3/api/Collection.html#watch
    */
  def watch(): ChangeStream[DefaultSchema] = js.native
  def watch(pipeline: js.UndefOr[scala.Nothing], options: ChangeStreamOptionssessio): ChangeStream[DefaultSchema] = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream[DefaultSchema] = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptionssessio): ChangeStream[DefaultSchema] = js.native
  
  /** Creates a Query, applies the passed conditions, and returns the Query. */
  def where(path: String): Query[_] with QueryHelpers = js.native
  def where(path: String, `val`: js.Any): Query[_] with QueryHelpers = js.native
}
@JSImport("mongoose", "Model")
@js.native
object Model_
  extends TopLevel[Model_[js.Any, js.Object]]
