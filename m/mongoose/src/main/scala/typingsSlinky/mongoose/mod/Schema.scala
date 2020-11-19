package typingsSlinky.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mongodb.mod.MongoError
import typingsSlinky.mongoose.anon.AutoIndexId
import typingsSlinky.mongoose.anon.Dictother
import typingsSlinky.mongoose.anon.J
import typingsSlinky.mongoose.anon.Length
import typingsSlinky.mongoose.mongooseStrings._id
import typingsSlinky.mongoose.mongooseStrings.`throw`
import typingsSlinky.mongoose.mongooseStrings.aggregate
import typingsSlinky.mongoose.mongooseStrings.autoCreate
import typingsSlinky.mongoose.mongooseStrings.autoIndex
import typingsSlinky.mongoose.mongooseStrings.bufferCommands
import typingsSlinky.mongoose.mongooseStrings.capped
import typingsSlinky.mongoose.mongooseStrings.collation
import typingsSlinky.mongoose.mongooseStrings.collection
import typingsSlinky.mongoose.mongooseStrings.count
import typingsSlinky.mongoose.mongooseStrings.deleteOne
import typingsSlinky.mongoose.mongooseStrings.discriminatorKey
import typingsSlinky.mongoose.mongooseStrings.emitIndexErrors
import typingsSlinky.mongoose.mongooseStrings.excludeIndexes
import typingsSlinky.mongoose.mongooseStrings.find
import typingsSlinky.mongoose.mongooseStrings.findOne
import typingsSlinky.mongoose.mongooseStrings.findOneAndRemove
import typingsSlinky.mongoose.mongooseStrings.findOneAndUpdate
import typingsSlinky.mongoose.mongooseStrings.id
import typingsSlinky.mongoose.mongooseStrings.init
import typingsSlinky.mongoose.mongooseStrings.insertMany
import typingsSlinky.mongoose.mongooseStrings.minimize
import typingsSlinky.mongoose.mongooseStrings.read
import typingsSlinky.mongoose.mongooseStrings.remove
import typingsSlinky.mongoose.mongooseStrings.safe
import typingsSlinky.mongoose.mongooseStrings.save
import typingsSlinky.mongoose.mongooseStrings.selectPopulatedPaths
import typingsSlinky.mongoose.mongooseStrings.shardKey
import typingsSlinky.mongoose.mongooseStrings.skipVersioning
import typingsSlinky.mongoose.mongooseStrings.storeSubdocValidationError
import typingsSlinky.mongoose.mongooseStrings.strict
import typingsSlinky.mongoose.mongooseStrings.strictQuery
import typingsSlinky.mongoose.mongooseStrings.timestamps
import typingsSlinky.mongoose.mongooseStrings.toJSON
import typingsSlinky.mongoose.mongooseStrings.toObject
import typingsSlinky.mongoose.mongooseStrings.typeKey
import typingsSlinky.mongoose.mongooseStrings.typePojoToMixed
import typingsSlinky.mongoose.mongooseStrings.update
import typingsSlinky.mongoose.mongooseStrings.updateMany
import typingsSlinky.mongoose.mongooseStrings.updateOne
import typingsSlinky.mongoose.mongooseStrings.useNestedStrict
import typingsSlinky.mongoose.mongooseStrings.usePushEach
import typingsSlinky.mongoose.mongooseStrings.validate
import typingsSlinky.mongoose.mongooseStrings.validateBeforeSave
import typingsSlinky.mongoose.mongooseStrings.versionKey
import typingsSlinky.mongoose.mongooseStrings.writeConcern
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * section schema.js
  * http://mongoosejs.com/docs/api.html#schema-js
  */
@js.native
trait Schema[T] extends EventEmitter {
  
  /** Adds key path / schema type pairs to this schema. */
  def add(obj: SchemaDefinition): Unit = js.native
  def add(obj: SchemaDefinition, prefix: String): Unit = js.native
  
  /**
    * Iterates the schemas paths similar to Array.forEach.
    * @param fn callback function
    * @returns this
    */
  def eachPath(fn: js.Function2[/* path */ String, /* type */ SchemaType, Unit]): this.type = js.native
  
  /**
    * Gets a schema option.
    * @param key option name
    */
  def get(key: String): js.Any = js.native
  
  /**
    * Defines an index (most likely compound) for this schema.
    * @param options Options to pass to MongoDB driver's createIndex() function
    * @param options.expires Mongoose-specific syntactic sugar, uses ms to convert
    *   expires option into seconds for the expireAfterSeconds in the above link.
    */
  def index(fields: js.Any): this.type = js.native
  def index(fields: js.Any, options: Dictother): this.type = js.native
  
  /** Compiles indexes from fields and schema-level indexes */
  def indexes(): js.Array[_] = js.native
  
  /**
    * Loads an ES6 class into a schema. Maps setters + getters, static methods, and
    * instance methods to schema virtuals, statics, and methods.
    */
  def loadClass(model: js.Function): this.type = js.native
  
  def method(
    methodObj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ F in keyof T ]: T[F]}
    */ typingsSlinky.mongoose.mongooseStrings.Schema with TopLevel[T]
  ): this.type = js.native
  /**
    * Adds an instance method to documents constructed from Models compiled from this schema.
    * If a hash of name/fn pairs is passed as the only argument, each name/fn pair will be added as methods.
    */
  def method[F /* <: /* keyof T */ String */](method: F, fn: /* import warning: importer.ImportType#apply Failed type conversion: T[F] */ js.Any): this.type = js.native
  
  /** Object of currently defined methods on this schema. */
  var methods: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ F in keyof T ]: T[F]}
    */ typingsSlinky.mongoose.mongooseStrings.Schema with TopLevel[T] = js.native
  
  /** The original object passed to the schema constructor */
  var obj: js.Any = js.native
  
  /**
    * Gets/sets schema paths.
    * Sets a path (if arity 2)
    * Gets a path (if arity 1)
    */
  def path(path: String): SchemaType = js.native
  def path(path: String, constructor: js.Any): this.type = js.native
  
  /**
    * Returns the pathType of path for this schema.
    * @returns whether it is a real, virtual, nested, or ad-hoc/undefined path.
    */
  def pathType(path: String): String = js.native
  
  /**
    * Lists all paths and their type in the current schema.
    */
  var paths: StringDictionary[SchemaType] = js.native
  
  /**
    * Registers a plugin for this schema.
    * @param plugin callback
    */
  def plugin(plugin: js.Function1[/* schema */ Schema[_], Unit]): this.type = js.native
  def plugin[T](plugin: js.Function2[/* schema */ Schema[_], /* options */ T, Unit], opts: T): this.type = js.native
  
  def post[T /* <: Document */](
    method: String,
    fn: js.Function2[/* doc */ T, /* next */ js.Function1[/* err */ js.UndefOr[NativeError], Unit], Unit]
  ): this.type = js.native
  def post[T /* <: Document */](
    method: String,
    fn: js.Function3[
      /* error */ MongoError, 
      /* doc */ T, 
      /* next */ js.Function1[/* err */ js.UndefOr[NativeError], Unit], 
      Unit
    ]
  ): this.type = js.native
  def post[T /* <: Document */](
    method: js.RegExp,
    fn: js.Function2[/* doc */ T, /* next */ js.Function1[/* err */ js.UndefOr[NativeError], Unit], Unit]
  ): this.type = js.native
  def post[T /* <: Document */](
    method: js.RegExp,
    fn: js.Function3[
      /* error */ MongoError, 
      /* doc */ T, 
      /* next */ js.Function1[/* err */ js.UndefOr[NativeError], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("post")
  def post_deleteOne[T /* <: Document */](method: deleteOne, hasDocumentQuery: HookOptions, fn: js.Function1[/* doc */ T, Unit]): this.type = js.native
  @JSName("post")
  def post_insertMany[T /* <: Document */](
    method: insertMany,
    fn: js.ThisFunction2[
      /* this */ Model_[Document, js.Object], 
      /* docs */ js.Array[T], 
      /* next */ js.Function1[js.UndefOr[NativeError], js.Promise[_] | Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Defines a post hook for the document
    * Post hooks fire on the event emitted from document instances of Models compiled
    *   from this schema.
    * @param method name of the method to hook
    * @param fn callback
    */
  @JSName("post")
  def post_insertMany[T /* <: Document */](
    method: insertMany,
    fn: js.ThisFunction3[
      /* this */ Model_[Document, js.Object], 
      /* error */ MongoError, 
      /* docs */ js.Array[T], 
      /* next */ js.Function1[/* err */ js.UndefOr[NativeError], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("post")
  def post_remove[T /* <: Document */](method: remove, hasDocumentQuery: HookOptions, fn: js.Function1[/* doc */ T, Unit]): this.type = js.native
  
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: String, fn: HookSyncCallback[T]): this.type = js.native
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: String, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: String, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: String, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: js.RegExp, fn: HookSyncCallback[T]): this.type = js.native
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: js.RegExp, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: js.RegExp, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  def pre[T /* <: Document | (Model_[Document, js.Object]) | Query[_] | Aggregate[_] */](method: js.RegExp, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](method: aggregate, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](method: aggregate, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](method: aggregate, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](method: aggregate, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](method: count, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](method: count, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](method: count, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](method: count, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](method: find, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](method: find, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](method: find, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](method: find, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](method: findOne, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](method: findOne, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](method: findOne, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](method: findOne, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](method: findOneAndRemove, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](method: findOneAndRemove, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](method: findOneAndRemove, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](method: findOneAndRemove, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](method: findOneAndUpdate, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](method: findOneAndUpdate, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](method: findOneAndUpdate, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](method: findOneAndUpdate, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  /**
    * Defines a pre hook for the document.
    */
  @JSName("pre")
  def pre_init[T /* <: Document */](method: init, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_init[T /* <: Document */](method: init, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_init[T /* <: Document */](method: init, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_init[T /* <: Document */](method: init, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model_[Document, js.Object] */](method: insertMany, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model_[Document, js.Object] */](method: insertMany, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model_[Document, js.Object] */](method: insertMany, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model_[Document, js.Object] */](method: insertMany, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](method: remove, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](method: remove, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](method: remove, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](method: remove, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](method: save, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](method: save, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](method: save, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](method: save, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](method: update, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](method: update, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](method: update, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](method: update, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](method: updateMany, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](method: updateMany, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](method: updateMany, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](method: updateMany, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](method: updateOne, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](method: updateOne, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](method: updateOne, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](method: updateOne, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](method: validate, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](method: validate, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](method: validate, parallel: Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](method: validate, parallel: Boolean, fn: HookAsyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  
  /** Object of currently defined query helpers on this schema. */
  var query: js.Any = js.native
  
  /**
    * Adds a method call to the queue.
    * @param name name of the document method to call later
    * @param args arguments to pass to the method
    */
  def queue(name: String, args: js.Array[_]): this.type = js.native
  
  /**
    * Removes the given path (or [paths]).
    */
  def remove(path: String): Unit = js.native
  def remove(path: js.Array[String]): Unit = js.native
  
  /**
    * @param invalidate refresh the cache
    * @returns an Array of path strings that are required by this schema.
    */
  def requiredPaths(): js.Array[String] = js.native
  def requiredPaths(invalidate: Boolean): js.Array[String] = js.native
  
  def set(key: strict, value: `throw`): this.type = js.native
  @JSName("set")
  def set_autoCreate(key: autoCreate): this.type = js.native
  @JSName("set")
  def set_autoCreate(key: autoCreate, value: Boolean): this.type = js.native
  @JSName("set")
  def set_autoCreate_Union(key: autoCreate): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_autoIndex(key: autoIndex): this.type = js.native
  @JSName("set")
  def set_autoIndex(key: autoIndex, value: Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_autoIndex_Union(key: autoIndex): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_bufferCommands(key: bufferCommands): this.type = js.native
  @JSName("set")
  def set_bufferCommands(key: bufferCommands, value: Boolean): this.type = js.native
  @JSName("set")
  def set_bufferCommands_Union(key: bufferCommands): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_capped(key: capped): this.type = js.native
  @JSName("set")
  def set_capped(key: capped, value: Boolean): this.type = js.native
  @JSName("set")
  def set_capped(key: capped, value: Double): this.type = js.native
  @JSName("set")
  def set_capped(key: capped, value: AutoIndexId): this.type = js.native
  @JSName("set")
  def set_capped_Union(key: capped): js.UndefOr[Boolean | Double | AutoIndexId] = js.native
  @JSName("set")
  def set_collation(key: collation): this.type = js.native
  @JSName("set")
  def set_collation(key: collation, value: CollationOptions): this.type = js.native
  @JSName("set")
  def set_collation_Union(key: collation): js.UndefOr[CollationOptions] = js.native
  @JSName("set")
  def set_collection(key: collection): this.type = js.native
  @JSName("set")
  def set_collection(key: collection, value: String): this.type = js.native
  @JSName("set")
  def set_collection_Union(key: collection): js.UndefOr[String] = js.native
  @JSName("set")
  def set_discriminatorKey(key: discriminatorKey): this.type = js.native
  @JSName("set")
  def set_discriminatorKey(key: discriminatorKey, value: String): this.type = js.native
  @JSName("set")
  def set_discriminatorKey_Union(key: discriminatorKey): js.UndefOr[String] = js.native
  @JSName("set")
  def set_emitIndexErrors(key: emitIndexErrors): this.type = js.native
  @JSName("set")
  def set_emitIndexErrors(key: emitIndexErrors, value: Boolean): this.type = js.native
  @JSName("set")
  def set_emitIndexErrors_Union(key: emitIndexErrors): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_excludeIndexes(key: excludeIndexes): this.type = js.native
  @JSName("set")
  def set_excludeIndexes(key: excludeIndexes, value: js.Any): this.type = js.native
  @JSName("set")
  def set_excludeIndexes_Union(key: excludeIndexes): js.UndefOr[js.Any] = js.native
  @JSName("set")
  def set_id(key: _id): this.type = js.native
  @JSName("set")
  def set_id(key: _id, value: Boolean): this.type = js.native
  @JSName("set")
  def set_id(key: id): this.type = js.native
  @JSName("set")
  def set_id(key: id, value: Boolean): this.type = js.native
  @JSName("set")
  def set_id_Union(key: _id): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_id_Union(key: id): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_minimize(key: minimize): this.type = js.native
  @JSName("set")
  def set_minimize(key: minimize, value: Boolean): this.type = js.native
  @JSName("set")
  def set_minimize_Union(key: minimize): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_read(key: read): this.type = js.native
  @JSName("set")
  def set_read(key: read, value: String): this.type = js.native
  @JSName("set")
  def set_read_Union(key: read): js.UndefOr[String] = js.native
  @JSName("set")
  def set_safe(key: safe): this.type = js.native
  @JSName("set")
  def set_safe(key: safe, value: Boolean): this.type = js.native
  @JSName("set")
  def set_safe(key: safe, value: J): this.type = js.native
  @JSName("set")
  def set_safe_Union(key: safe): js.UndefOr[Boolean | J] = js.native
  @JSName("set")
  def set_selectPopulatedPaths(key: selectPopulatedPaths): this.type = js.native
  @JSName("set")
  def set_selectPopulatedPaths(key: selectPopulatedPaths, value: Boolean): this.type = js.native
  @JSName("set")
  def set_selectPopulatedPaths_Union(key: selectPopulatedPaths): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_shardKey(key: shardKey): this.type = js.native
  @JSName("set")
  def set_shardKey(key: shardKey, value: js.Object): this.type = js.native
  @JSName("set")
  def set_shardKey_Union(key: shardKey): js.UndefOr[js.Object] = js.native
  @JSName("set")
  def set_skipVersioning(key: skipVersioning): this.type = js.native
  @JSName("set")
  def set_skipVersioning(key: skipVersioning, value: js.Any): this.type = js.native
  @JSName("set")
  def set_skipVersioning_Union(key: skipVersioning): js.UndefOr[js.Any] = js.native
  @JSName("set")
  def set_storeSubdocValidationError(key: storeSubdocValidationError): this.type = js.native
  @JSName("set")
  def set_storeSubdocValidationError(key: storeSubdocValidationError, value: Boolean): this.type = js.native
  @JSName("set")
  def set_storeSubdocValidationError_Union(key: storeSubdocValidationError): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_strict(key: strict): this.type = js.native
  @JSName("set")
  def set_strict(key: strict, value: Boolean): this.type = js.native
  @JSName("set")
  def set_strictQuery(key: strictQuery): this.type = js.native
  @JSName("set")
  def set_strictQuery(key: strictQuery, value: Boolean): this.type = js.native
  @JSName("set")
  def set_strictQuery_Union(key: strictQuery): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_strict_Union(key: strict): js.UndefOr[Boolean | `throw`] = js.native
  @JSName("set")
  def set_timestamps(key: timestamps): this.type = js.native
  @JSName("set")
  def set_timestamps(key: timestamps, value: Boolean): this.type = js.native
  @JSName("set")
  def set_timestamps(key: timestamps, value: SchemaTimestampsConfig): this.type = js.native
  @JSName("set")
  def set_timestamps_Union(key: timestamps): js.UndefOr[Boolean | SchemaTimestampsConfig] = js.native
  @JSName("set")
  def set_toJSON(key: toJSON): this.type = js.native
  @JSName("set")
  def set_toJSON(key: toJSON, value: DocumentToObjectOptions): this.type = js.native
  @JSName("set")
  def set_toJSON_Union(key: toJSON): js.UndefOr[DocumentToObjectOptions] = js.native
  @JSName("set")
  def set_toObject(key: toObject): this.type = js.native
  @JSName("set")
  def set_toObject(key: toObject, value: DocumentToObjectOptions): this.type = js.native
  @JSName("set")
  def set_toObject_Union(key: toObject): js.UndefOr[DocumentToObjectOptions] = js.native
  @JSName("set")
  def set_typeKey(key: typeKey): this.type = js.native
  @JSName("set")
  def set_typeKey(key: typeKey, value: String): this.type = js.native
  @JSName("set")
  def set_typeKey_Union(key: typeKey): js.UndefOr[String] = js.native
  @JSName("set")
  def set_typePojoToMixed(key: typePojoToMixed): this.type = js.native
  @JSName("set")
  def set_typePojoToMixed(key: typePojoToMixed, value: Boolean): this.type = js.native
  @JSName("set")
  def set_typePojoToMixed_Union(key: typePojoToMixed): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_useNestedStrict(key: useNestedStrict): this.type = js.native
  @JSName("set")
  def set_useNestedStrict(key: useNestedStrict, value: Boolean): this.type = js.native
  @JSName("set")
  def set_useNestedStrict_Union(key: useNestedStrict): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_usePushEach(key: usePushEach): this.type = js.native
  @JSName("set")
  def set_usePushEach(key: usePushEach, value: Boolean): this.type = js.native
  @JSName("set")
  def set_usePushEach_Union(key: usePushEach): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_validateBeforeSave(key: validateBeforeSave): this.type = js.native
  @JSName("set")
  def set_validateBeforeSave(key: validateBeforeSave, value: Boolean): this.type = js.native
  @JSName("set")
  def set_validateBeforeSave_Union(key: validateBeforeSave): js.UndefOr[Boolean] = js.native
  @JSName("set")
  def set_versionKey(key: versionKey): this.type = js.native
  @JSName("set")
  def set_versionKey(key: versionKey, value: String): this.type = js.native
  @JSName("set")
  def set_versionKey(key: versionKey, value: Boolean): this.type = js.native
  @JSName("set")
  def set_versionKey_Union(key: versionKey): js.UndefOr[String | Boolean] = js.native
  @JSName("set")
  def set_writeConcern(key: writeConcern): this.type = js.native
  @JSName("set")
  def set_writeConcern(key: writeConcern, value: WriteConcern): this.type = js.native
  @JSName("set")
  def set_writeConcern_Union(key: writeConcern): js.UndefOr[WriteConcern] = js.native
  
  def static(nameObj: StringDictionary[js.Function]): this.type = js.native
  /**
    * Adds static "class" methods to Models compiled from this schema.
    */
  def static(name: String, fn: js.Function): this.type = js.native
  
  /** Object of currently defined statics on this schema. */
  var statics: js.Any = js.native
  
  /** Creates a virtual type with the given name. */
  def virtual(name: String): VirtualType = js.native
  def virtual(name: String, options: js.Any): VirtualType = js.native
  
  /** Returns the virtual type with the given name. */
  def virtualpath(name: String): VirtualType = js.native
}
@JSImport("mongoose", "Schema")
@js.native
object Schema extends js.Object {
  
  @js.native
  object Types extends js.Object {
    
    /*
      * section schema/array.js
      * http://mongoosejs.com/docs/api.html#schema-array-js
      */
    @js.native
    trait Array extends SchemaType {
      
      /**
        * Check if the given value satisfies a required validator. The given value
        * must be not null nor undefined, and have a non-zero length.
        */
      def checkRequired[T /* <: Length */](value: T): scala.Boolean = js.native
    }
    
    /*
      * section schema/boolean.js
      * http://mongoosejs.com/docs/api.html#schema-boolean-js
      */
    @js.native
    trait Boolean extends SchemaType {
      
      /**
        * Check if the given value satisfies a required validator. For a
        * boolean to satisfy a required validator, it must be strictly
        * equal to true or to false.
        */
      def checkRequired(value: js.Any): scala.Boolean = js.native
    }
    
    /*
      * section schema/buffer.js
      * http://mongoosejs.com/docs/api.html#schema-buffer-js
      */
    @js.native
    trait Buffer extends SchemaType {
      
      /**
        * Check if the given value satisfies a required validator. To satisfy a
        * required validator, a buffer must not be null or undefined and have
        * non-zero length.
        */
      def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
    }
    
    /*
      * section schema/date.js
      * http://mongoosejs.com/docs/api.html#schema-date-js
      */
    @js.native
    trait Date extends SchemaType {
      
      /**
        * Check if the given value satisfies a required validator. To satisfy
        * a required validator, the given value must be an instance of Date.
        */
      def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
      
      def expires(when: java.lang.String): this.type = js.native
      /** Declares a TTL index (rounded to the nearest second) for Date types only. */
      def expires(when: Double): this.type = js.native
      
      /**
        * Sets a maximum date validator.
        * @param maximum date
        * @param message optional custom error message
        */
      def max(maximum: NativeDate): this.type = js.native
      def max(maximum: NativeDate, message: java.lang.String): this.type = js.native
      
      /**
        * Sets a minimum date validator.
        * @param value minimum date
        * @param message optional custom error message
        */
      def min(value: NativeDate): this.type = js.native
      def min(value: NativeDate, message: java.lang.String): this.type = js.native
    }
    
    /*
      * section schema/decimal128.js
      * http://mongoosejs.com/docs/api.html#schema-decimal128-js
      */
    @js.native
    trait Decimal128 extends SchemaType {
      
      /** Check if the given value satisfies a required validator. */
      def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
    }
    
    /*
      * section schema/documentarray.js
      * http://mongoosejs.com/docs/api.html#schema-documentarray-js
      */
    @js.native
    trait DocumentArray extends Array {
      
      /**
        * Adds a discriminator type.
        * @param name discriminator model name
        * @param schema discriminator model schema
        * @param value the string stored in the `discriminatorKey` property
        */
      def discriminator[U /* <: Document */](name: java.lang.String, schema: Schema[_]): Model_[U, js.Object] = js.native
      def discriminator[U /* <: Document */](name: java.lang.String, schema: Schema[_], value: java.lang.String): Model_[U, js.Object] = js.native
      /**
        * Adds a discriminator type.
        * @param name discriminator model name
        * @param schema discriminator model schema
        * @param value the string stored in the `discriminatorKey` property
        */
      @JSName("discriminator")
      def discriminator_U_DocumentM_Model_UObject_M[U /* <: Document */, M /* <: Model_[U, js.Object] */](name: java.lang.String, schema: Schema[_]): M = js.native
      @JSName("discriminator")
      def discriminator_U_DocumentM_Model_UObject_M[U /* <: Document */, M /* <: Model_[U, js.Object] */](name: java.lang.String, schema: Schema[_], value: java.lang.String): M = js.native
    }
    
    /*
      * section schema/number.js
      * http://mongoosejs.com/docs/api.html#schema-number-js
      */
    @js.native
    trait Number extends SchemaType {
      
      /** Check if the given value satisfies a required validator. */
      def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
      
      /**
        * Sets a maximum number validator.
        * @param maximum number
        * @param message optional custom error message
        */
      def max(maximum: Double): this.type = js.native
      def max(maximum: Double, message: java.lang.String): this.type = js.native
      
      /**
        * Sets a minimum number validator.
        * @param value minimum number
        * @param message optional custom error message
        */
      def min(value: Double): this.type = js.native
      def min(value: Double, message: java.lang.String): this.type = js.native
    }
    
    /*
      * section schema/objectid.js
      * http://mongoosejs.com/docs/api.html#schema-objectid-js
      */
    @js.native
    trait ObjectId extends SchemaType {
      
      /**
        * Adds an auto-generated ObjectId default if turnOn is true.
        * @param turnOn auto generated ObjectId defaults
        */
      def auto(turnOn: scala.Boolean): this.type = js.native
      
      /** Check if the given value satisfies a required validator. */
      def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
    }
    
    /*
      * section schema/string.js
      * http://mongoosejs.com/docs/api.html#schema-string-js
      */
    @js.native
    trait String extends SchemaType {
      
      /** Check if the given value satisfies a required validator. */
      def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
      
      /**
        * Adds an enum validator
        * @param args enumeration values
        */
      def enum(args: java.lang.String): this.type = js.native
      def enum(args: js.Any): this.type = js.native
      def enum(args: Array): this.type = js.native
      
      /** Adds a lowercase setter. */
      def lowercase(): this.type = js.native
      
      /**
        * Sets a regexp validator. Any value that does not pass regExp.test(val) will fail validation.
        * @param regExp regular expression to test against
        * @param message optional custom error message
        */
      def `match`(regExp: js.RegExp): this.type = js.native
      def `match`(regExp: js.RegExp, message: java.lang.String): this.type = js.native
      
      /**
        * Sets a maximum length validator.
        * @param value maximum string length
        * @param message optional custom error message
        */
      def maxlength(value: Double): this.type = js.native
      def maxlength(value: Double, message: java.lang.String): this.type = js.native
      
      /**
        * Sets a minimum length validator.
        * @param value minimum string length
        * @param message optional custom error message
        */
      def minlength(value: Double): this.type = js.native
      def minlength(value: Double, message: java.lang.String): this.type = js.native
      
      /** Adds a trim setter. The string value will be trimmed when set. */
      def trim(): this.type = js.native
      
      /** Adds an uppercase setter. */
      def uppercase(): this.type = js.native
    }
    
    /*
      * section schema/embedded.js
      * http://mongoosejs.com/docs/api.html#schema-embedded-js
      */
    type Embedded = SchemaType
    
    /**
      * section schema/map.js
      * https://mongoosejs.com/docs/schematypes.html#maps
      */
    type Map = SchemaType
    
    /*
      * section schema/mixed.js
      * http://mongoosejs.com/docs/api.html#schema-mixed-js
      */
    type Mixed = SchemaType
  }
}
