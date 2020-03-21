package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CastError = typingsSlinky.mongoose.mod.Error.CastError
  type ClientSession = typingsSlinky.mongodb.mod.ClientSession
  // Because the mongoose Map type shares a name with the default global interface,
  // this type alias has to exist outside of the namespace
  type GlobalMap[K, V] = typingsSlinky.std.Map[K, V]
  type HookAsyncCallback[T] = js.ThisFunction3[
    /* this */ T, 
    /* next */ typingsSlinky.mongoose.mod.HookNextFunction, 
    /* done */ typingsSlinky.mongoose.mod.HookDoneFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | scala.Unit
  ]
  type HookDoneFunction = js.Function1[/* error */ js.UndefOr[typingsSlinky.mongoose.mod.Error], js.Any]
  type HookErrorCallback = js.Function1[/* error */ js.UndefOr[typingsSlinky.mongoose.mod.Error], js.Any]
  type HookNextFunction = js.Function1[/* error */ js.UndefOr[typingsSlinky.mongoose.mod.Error], js.Any]
  // Hook functions: https://github.com/vkarpov15/hooks-fixed
  type HookSyncCallback[T] = js.ThisFunction2[
    /* this */ T, 
    /* next */ typingsSlinky.mongoose.mod.HookNextFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | scala.Unit
  ]
  /*
    * Some mongoose classes have the same name as the native JS classes
    * Keep references to native classes using a "Native" prefix
    */
  type NativeBuffer = typingsSlinky.node.TypeofBuffer
  type NativeDate = typingsSlinky.std.DateConstructor
  type NativeError = typingsSlinky.std.ErrorConstructor
  /*
    * section query.js
    * http://mongoosejs.com/docs/api.html#query-js
    *
    * Query<T> is for backwards compatibility. Example: Query<T>.find() returns Query<T[]>.
    * If later in the query chain a method returns Query<T>, we will need to know type T.
    * So we save this type as the second type parameter in DocumentQuery. Since people have
    * been using Query<T>, we set it as an alias of DocumentQuery.
    *
    * Furthermore, Query<T> is used for function that has an option { rawResult: true }.
    * for instance findOneAndUpdate.
    */
  type Query[T] = typingsSlinky.mongoose.mod.DocumentQuery[T, js.Any, js.Object]
  /*
    * Intellisense for Schema definitions
    */
  type SchemaDefinition = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.mongoose.mod.SchemaTypeOpts[js.Any] | typingsSlinky.mongoose.mod.Schema[js.Any] | typingsSlinky.mongoose.mod.SchemaType
  ]
  type SchemaTypeOpts[T] = typingsSlinky.mongoose.mod.SchemaTypeOpts_[T]
  type TagSet = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
