package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CastError = typingsSlinky.mongoose.mod.Error.CastError
  type ClientSession = typingsSlinky.mongodb.mod.ClientSession
  type CreateDocumentDefinition[T] = typingsSlinky.mongoose.mod.ScrubCreateDefinition[typingsSlinky.mongoose.mod.DocumentDefinition[T]]
  type CreateQuery[D] = typingsSlinky.mongoose.mod.CreateDocumentDefinition[D] | (typingsSlinky.mongodb.mod.OptionalId[
    typingsSlinky.mongoose.mod.CreateDocumentDefinition[D] with typingsSlinky.mongoose.anon.IdAny
  ]) | (typingsSlinky.mongoose.anon.Id with (typingsSlinky.std.Record[java.lang.String, _]))
  type DeepCreateObjectTransformer[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ V in keyof mongoose.mongoose.NonFunctionProperties<mongoose.mongoose.OmitReadonly<T>> ]: T[V] extends object | undefined? mongoose.mongoose.ImplicitMongooseConversions<mongoose.mongoose.DeepCreateTransformer<std.NonNullable<T[V]>>> : mongoose.mongoose.ImplicitMongooseConversions<T[V]>}
    */ typingsSlinky.mongoose.mongooseStrings.DeepCreateObjectTransformer with org.scalablytyped.runtime.TopLevel[js.Any])
  // removes functions from schema from all levels
  type DeepCreateTransformer[T] = typingsSlinky.mongoose.mod.DeepCreateObjectTransformer[T] | (js.Array[
    typingsSlinky.mongoose.mod.DeepCreateObjectTransformer[js.Any] | (js.Tuple2[js.Any, js.Any])
  ]) | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepCreateTransformer<KV> */ js.Object
  ]) | (typingsSlinky.std.Map[js.Any, js.Any])
  // mongoose allows Map<K, V> to be specified either as a Map or a Record<K, V>
  type DeepMapAsObject[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends std.Map<infer KM, infer KV> | undefined? any extends string? std.Map<any, / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<KV> * / object> | std.Record<any, / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<KV> * / object> | std.Array<[any, / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<KV> * / object]> : never : T[K] extends object | undefined? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<T[K]> * / object : T[K]}
    */ typingsSlinky.mongoose.mongooseStrings.DeepMapAsObject with org.scalablytyped.runtime.TopLevel[js.Any])
  /* Helper type to extract a definition type from a Document type */
  type DocumentDefinition[T] = typingsSlinky.mongoose.mod.Omit[
    T, 
    typingsSlinky.std.Exclude[
      typingsSlinky.mongoose.mongooseStrings.__v, 
      typingsSlinky.mongoose.mongooseStrings._id
    ]
  ]
  type Error = typingsSlinky.mongoose.mod.Error_
  type FilterQuery[T] = typingsSlinky.mongoose.mod.MongooseFilterQuery[typingsSlinky.mongoose.mod.DocumentDefinition[T]]
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
  type IfEquals[X, Y, A, B] = B | A
  type ImplicitMongooseConversions[T] = T | java.lang.String | scala.Double
  type MongooseBuiltIns = typingsSlinky.mongodb.mod.ObjectID_ | typingsSlinky.mongodb.mod.Decimal128 | js.Date | scala.Double | scala.Boolean
  type MongooseFilterQuery[T] = typingsSlinky.mongoose.mongooseStrings.MongooseFilterQuery with org.scalablytyped.runtime.TopLevel[js.Any] with typingsSlinky.mongodb.mod.RootQuerySelector[T]
  type MongooseUpdateQuery[S] = typingsSlinky.mongodb.mod.UpdateQuery[S] with typingsSlinky.mongodb.mod.MatchKeysAndValues[S]
  /*
    * Some mongoose classes have the same name as the native JS classes
    * Keep references to native classes using a "Native" prefix
    */
  type NativeBuffer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Buffer */ js.Any
  type NativeDate = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Date */ js.Any
  type NativeError = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error */ js.Any
  type NonFunctionProperties[T] = typingsSlinky.std.Pick[T, typingsSlinky.mongoose.mod.NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  // We can use TypeScript Omit once minimum required TypeScript Version is above 3.5
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type OmitReadonly[T] = typingsSlinky.mongoose.mod.Omit[T, typingsSlinky.mongoose.mod.ReadonlyKeysOf[T]]
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
  type ReadonlyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: mongoose.mongoose.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  /*
    * Intellisense for Schema definitions
    */
  type SchemaDefinition = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.mongoose.mod.SchemaTypeOpts[js.Any] | typingsSlinky.mongoose.mod.Schema[js.Any] | typingsSlinky.mongoose.mod.SchemaType
  ]
  type SchemaTypeOpts[T] = typingsSlinky.mongoose.mod.SchemaTypeOpts_[T]
  type ScrubCreateDefinition[T] = typingsSlinky.mongoose.mod.DeepMapAsObject[typingsSlinky.mongoose.mod.DeepCreateTransformer[T]]
  type TagSet = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type UpdateQuery[D] = typingsSlinky.mongoose.mod.MongooseUpdateQuery[typingsSlinky.mongoose.mod.DocumentDefinition[D]]
}
