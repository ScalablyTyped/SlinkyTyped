package typingsSlinky.mongoose.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.mod.ClientSession
import typingsSlinky.mongodb.mod.MongoError
import typingsSlinky.mongodb.mod.SessionOptions
import typingsSlinky.mongoose.mod.ConnectionOptions
import typingsSlinky.mongoose.mod.Connection_
import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.Model_
import typingsSlinky.mongoose.mod.Mongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmongoose extends js.Object {
  
  var DocumentProvider: js.Any = js.native
  
  val Error: js.Any = js.native
  
  var Model: Model_[_, js.Object] = js.native
  
  var Mongoose: Instantiable1[
    /* args (repeated) */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof mongoose */ js.Any
  ] = js.native
  
  var Promise: js.Any = js.native
  
  var PromiseProvider: js.Any = js.native
  
  val Schema: TypeofSchema = js.native
  
  // Interfaces specific to schema type options should be scoped in this namespace
  val SchemaTypeOpts: js.Any = js.native
  
  val Types: js.Any = js.native
  
  def connect(uris: String): js.Promise[Mongoose] = js.native
  def connect(uris: String, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
  def connect(uris: String, options: ConnectionOptions): js.Promise[Mongoose] = js.native
  def connect(uris: String, options: ConnectionOptions, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
  
  var connection: Connection_ = js.native
  
  var connections: js.Array[Connection_] = js.native
  
  def createConnection(): Connection_ = js.native
  def createConnection(uri: String): ConnectionthenPromiseConn = js.native
  def createConnection(uri: String, options: ConnectionOptions): ConnectionthenPromiseConn = js.native
  
  def deleteModel(name: String): Connection_ = js.native
  def deleteModel(name: js.RegExp): Connection_ = js.native
  
  def disconnect(): js.Promise[Unit] = js.native
  def disconnect(fn: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def get(key: String): js.Any = js.native
  
  def isValidObjectId(value: js.Any): Boolean = js.native
  
  def model[T /* <: Document */](name: String): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](
    name: String,
    schema: js.UndefOr[scala.Nothing],
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: js.UndefOr[scala.Nothing], collection: String): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: js.UndefOr[scala.Nothing], collection: String, skipInit: Boolean): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: typingsSlinky.mongoose.mod.Schema[_]): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](
    name: String,
    schema: typingsSlinky.mongoose.mod.Schema[_],
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: typingsSlinky.mongoose.mod.Schema[_], collection: String): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: typingsSlinky.mongoose.mod.Schema[_], collection: String, skipInit: Boolean): Model_[T, js.Object] = js.native
  
  def modelNames(): js.Array[String] = js.native
  
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](
    name: String,
    schema: js.UndefOr[scala.Nothing],
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: js.UndefOr[scala.Nothing], collection: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: js.UndefOr[scala.Nothing], collection: String, skipInit: Boolean): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: typingsSlinky.mongoose.mod.Schema[_]): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](
    name: String,
    schema: typingsSlinky.mongoose.mod.Schema[_],
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: typingsSlinky.mongoose.mod.Schema[_], collection: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: typingsSlinky.mongoose.mod.Schema[_], collection: String, skipInit: Boolean): U = js.native
  
  var models: StringDictionary[Model_[_, js.Object]] = js.native
  
  def plugin(fn: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: typeof mongoose */ js.Any = js.native
  def plugin[T](fn: js.Function, opts: T): /* import warning: importer.ImportType#apply Failed type conversion: typeof mongoose */ js.Any = js.native
  
  def pluralize(): js.Function1[/* str */ String, String] = js.native
  def pluralize(fn: js.Function1[/* str */ String, String]): js.Function1[/* str */ String, String] = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  
  def startSession(): js.Promise[ClientSession] = js.native
  def startSession(
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ js.Any, /* session */ ClientSession, Unit]
  ): js.Promise[ClientSession] = js.native
  def startSession(options: SessionOptions): js.Promise[ClientSession] = js.native
  def startSession(options: SessionOptions, cb: js.Function2[/* err */ js.Any, /* session */ ClientSession, Unit]): js.Promise[ClientSession] = js.native
  
  var version: String = js.native
}
