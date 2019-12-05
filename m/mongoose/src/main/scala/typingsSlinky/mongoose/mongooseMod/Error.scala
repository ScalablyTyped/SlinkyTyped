package typingsSlinky.mongoose.mongooseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongoose.Anon_Message
import typingsSlinky.mongoose.mongooseMod.Error.ValidatorError
import typingsSlinky.mongoose.mongooseStrings.MongooseError
import typingsSlinky.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section error.js
  * http://mongoosejs.com/docs/api.html#error-js
  */
@js.native
trait Error extends ErrorConstructor {
  // "MongooseError" for instances of the current class,
  // an other string for instances of derived classes.
  var name: MongooseError | String = js.native
}

@JSImport("mongoose", "Error")
@js.native
object Error extends js.Object {
  @js.native
  trait CastError extends Error {
    var kind: String = js.native
    var model: js.UndefOr[js.Any] = js.native
    @JSName("name")
    var name_CastError: typingsSlinky.mongoose.mongooseStrings.CastError = js.native
    var path: String = js.native
    var reason: js.UndefOr[js.Any] = js.native
    var stringValue: String = js.native
    var value: js.Any = js.native
    def setModel(model: js.Any): Unit = js.native
  }
  
  @js.native
  trait DivergentArrayError extends Error {
    @JSName("name")
    var name_DivergentArrayError: typingsSlinky.mongoose.mongooseStrings.DivergentArrayError = js.native
  }
  
  @js.native
  trait DocumentNotFoundError extends Error {
    var filter: js.Any = js.native
    @JSName("name")
    var name_DocumentNotFoundError: typingsSlinky.mongoose.mongooseStrings.DocumentNotFoundError = js.native
    var query: js.Any = js.native
  }
  
  @js.native
  trait MissingSchemaError extends Error {
    @JSName("name")
    var name_MissingSchemaError: typingsSlinky.mongoose.mongooseStrings.MissingSchemaError = js.native
  }
  
  @js.native
  trait OverwriteModelError extends Error {
    @JSName("name")
    var name_OverwriteModelError: typingsSlinky.mongoose.mongooseStrings.OverwriteModelError = js.native
  }
  
  @js.native
  trait ParallelSaveError extends Error {
    @JSName("name")
    var name_ParallelSaveError: typingsSlinky.mongoose.mongooseStrings.ParallelSaveError = js.native
  }
  
  @js.native
  trait ValidationError extends Error {
    var errors: StringDictionary[ValidatorError | typingsSlinky.mongoose.mongooseMod.Error.CastError] = js.native
    @JSName("name")
    var name_ValidationError: typingsSlinky.mongoose.mongooseStrings.ValidationError = js.native
    def addError(path: String, error: js.Any): Unit = js.native
    def inspect(): js.Object = js.native
    def toJSON(): js.Object = js.native
  }
  
  @js.native
  trait ValidatorError extends Error {
    var kind: String = js.native
    @JSName("name")
    var name_ValidatorError: typingsSlinky.mongoose.mongooseStrings.ValidatorError = js.native
    var path: String = js.native
    var properties: Anon_Message = js.native
    var reason: js.Any = js.native
    var value: js.Any = js.native
    def formatMessage(msg: String, properties: js.Any): String = js.native
    def formatMessage(msg: js.Function, properties: js.Any): String = js.native
  }
  
  @js.native
  trait VersionError extends Error {
    var modifiedPaths: js.Array[_] = js.native
    @JSName("name")
    var name_VersionError: typingsSlinky.mongoose.mongooseStrings.VersionError = js.native
    var version: js.Any = js.native
  }
  
}

