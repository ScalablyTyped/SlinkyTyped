package typingsSlinky.mongodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AcceptedFields[TSchema, FieldType, AssignableType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, FieldType> ]:? AssignableType}
    */ typingsSlinky.mongodb.mongodbStrings.AcceptedFields with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type AggregationCursorResult = js.Object | scala.Null
  
  /** https://docs.mongodb.com/manual/reference/operator/query-bitwise */
  type BitwiseQuery = scala.Double | typingsSlinky.bson.mod.Binary | js.Array[scala.Double]
  
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, scala.Unit]
  
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  
  type CommandCursorResult = js.Object | scala.Null
  
  type Condition[T] = typingsSlinky.mongodb.mod.MongoAltQuery[T] | typingsSlinky.mongodb.mod.QuerySelector[typingsSlinky.mongodb.mod.MongoAltQuery[T]]
  
  type CursorResult = js.Object | scala.Null | scala.Boolean
  
  type Default = js.Any
  
  type DefaultSchema = js.Any
  
  type DotAndArrayNotation[AssignableType] = org.scalablytyped.runtime.StringDictionary[AssignableType]
  
  type EndCallback = js.Function1[/* error */ typingsSlinky.mongodb.mod.MongoError, scala.Unit]
  
  // TypeScript Omit (Exclude to be specific) does not work for objects with an "any" indexed type
  type EnhancedOmit[T, K] = (typingsSlinky.mongodb.mod.Omit[T, K]) | T
  
  /**
    * This is similar to Parameters but will work with a type which is
    * a function or with a tuple specifying arguments, which are both
    * common ways to define eventemitter events
    */
  type EventArguments[T] = js.Array[js.Any | T]
  
  type ExtractIdType[TSchema] = typingsSlinky.bson.mod.ObjectId | (typingsSlinky.std.Exclude[js.Any, js.Object])
  
  type FieldUpdates[TSchema] = typingsSlinky.std.Partial[TSchema] with org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type FilterQuery[T] = typingsSlinky.mongodb.mongodbStrings.FilterQuery with org.scalablytyped.runtime.TopLevel[T] with typingsSlinky.mongodb.mod.RootQuerySelector[T]
  
  type FlattenIfArray[T] = T
  
  type GridFSBucketErrorCallback = typingsSlinky.mongodb.mod.MongoCallback[scala.Unit]
  
  type GridFSBucketWriteStreamId = java.lang.String | scala.Double | js.Object | typingsSlinky.bson.mod.ObjectId
  
  type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]
  
  /** Update Query */
  type KeysOfAType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? key : never}[keyof TSchema] */ js.Any
  
  type KeysOfOtherType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? never : key}[keyof TSchema] */ js.Any
  
  type MatchKeysAndValues[TSchema] = typingsSlinky.mongodb.mod.ReadonlyPartial[TSchema] with typingsSlinky.mongodb.mod.DotAndArrayNotation[_]
  
  type MongoAltQuery[T] = (typingsSlinky.mongodb.mod.RegExpForString[js.Any | T]) | T
  
  type MongoCallback[T] = js.Function2[/* error */ typingsSlinky.mongodb.mod.MongoError, /* result */ T, scala.Unit]
  
  /** It avoid uses fields of non Type */
  type NotAcceptedFields[TSchema, FieldType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfOtherType<TSchema, FieldType> ]:? never}
    */ typingsSlinky.mongodb.mongodbStrings.NotAcceptedFields with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type NumericTypes = scala.Double | typingsSlinky.bson.mod.Decimal128 | typingsSlinky.bson.mod.Double | typingsSlinky.bson.mod.Int32 | typingsSlinky.bson.mod.Long
  
  type ObjectQuerySelector[T] = typingsSlinky.mongodb.mod.QuerySelector[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? mongodb.mongodb.QuerySelector<T[key]>}
    */ typingsSlinky.mongodb.mongodbStrings.ObjectQuerySelector with org.scalablytyped.runtime.TopLevel[T])
  
  // We can use TypeScript Omit once minimum required TypeScript Version is above 3.5
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OnlyFieldsOfType[TSchema, FieldType, AssignableType] = (typingsSlinky.mongodb.mod.AcceptedFields[TSchema, FieldType, AssignableType]) with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, FieldType]) with typingsSlinky.mongodb.mod.DotAndArrayNotation[AssignableType]
  
  type OptionalId[TSchema /* <: typingsSlinky.mongodb.anon.`0` */] = (// a Schema provided but _id type is not ObjectId
  typingsSlinky.mongodb.mod.WithId[TSchema]) | ((// a Schema with ObjectId _id type or "any" or "indexed type" provided
  typingsSlinky.mongodb.mod.EnhancedOmit[TSchema, typingsSlinky.mongodb.mongodbStrings._id]) with typingsSlinky.mongodb.anon.`2`[TSchema])
  
  type PullAllOperator[TSchema] = typingsSlinky.mongodb.mongodbStrings.PullAllOperator with org.scalablytyped.runtime.TopLevel[TSchema] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  
  type PullOperator[TSchema] = typingsSlinky.mongodb.mongodbStrings.PullOperator with org.scalablytyped.runtime.TopLevel[js.Any] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typingsSlinky.mongodb.mod.QuerySelector[_] | js.Any])
  
  type PushOperator[TSchema] = typingsSlinky.mongodb.mongodbStrings.PushOperator with org.scalablytyped.runtime.TopLevel[js.Any] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typingsSlinky.mongodb.mod.ArrayOperator[_] | js.Any])
  
  type ReadonlyPartial[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in keyof TSchema ]:? TSchema[key]}
    */ typingsSlinky.mongodb.mongodbStrings.ReadonlyPartial with org.scalablytyped.runtime.TopLevel[TSchema]
  
  /** [ <position1>, <position2>, ... ] */
  // we can search using alternative types in mongodb e.g.
  // string types can be searched using a regex in mongo
  // array types can be searched using their element type
  type RegExpForString[T] = T | js.RegExp
  
  type SchemaMember[T, V] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? V}
    */ typingsSlinky.mongodb.mongodbStrings.SchemaMember with org.scalablytyped.runtime.TopLevel[js.Any]) | org.scalablytyped.runtime.StringDictionary[V]
  
  type SetFields[TSchema] = typingsSlinky.mongodb.mongodbStrings.SetFields with org.scalablytyped.runtime.TopLevel[js.Any] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.UndefOr[js.Array[_]]]) with (org.scalablytyped.runtime.StringDictionary[typingsSlinky.mongodb.mod.AddToSetOperators[_] | js.Any])
  
  type SortOptionObject[T] = typingsSlinky.mongodb.mod.SchemaMember[T, scala.Double | typingsSlinky.mongodb.anon.Meta]
  
  type Unpacked[Type] = Type
  
  type UpdateOptionalId[T] = T | typingsSlinky.mongodb.mod.OptionalId[T]
  
  type WithId[TSchema] = (typingsSlinky.mongodb.mod.EnhancedOmit[TSchema, typingsSlinky.mongodb.mongodbStrings._id]) with typingsSlinky.mongodb.anon.IdExtractIdType[TSchema]
  
  type WithTransactionCallback[T] = js.Function1[/* session */ typingsSlinky.mongodb.mod.ClientSession, js.Promise[T]]
  
  @scala.inline
  def connect(uri: java.lang.String): js.Promise[typingsSlinky.mongodb.mod.MongoClient] = typingsSlinky.mongodb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.mongodb.mod.MongoClient]]
  @scala.inline
  def connect(
    uri: java.lang.String,
    callback: typingsSlinky.mongodb.mod.MongoCallback[typingsSlinky.mongodb.mod.MongoClient]
  ): scala.Unit = (typingsSlinky.mongodb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def connect(uri: java.lang.String, options: typingsSlinky.mongodb.mod.MongoClientOptions): js.Promise[typingsSlinky.mongodb.mod.MongoClient] = (typingsSlinky.mongodb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.mongodb.mod.MongoClient]]
  @scala.inline
  def connect(
    uri: java.lang.String,
    options: typingsSlinky.mongodb.mod.MongoClientOptions,
    callback: typingsSlinky.mongodb.mod.MongoCallback[typingsSlinky.mongodb.mod.MongoClient]
  ): scala.Unit = (typingsSlinky.mongodb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  type log = js.Function2[
    /* message */ js.UndefOr[java.lang.String], 
    /* state */ js.UndefOr[typingsSlinky.mongodb.mod.LoggerState], 
    scala.Unit
  ]
}
