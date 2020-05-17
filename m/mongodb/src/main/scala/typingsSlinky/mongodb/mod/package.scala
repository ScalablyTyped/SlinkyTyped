package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AcceptedFields[TSchema, FieldType, AssignableType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, FieldType> ]:? AssignableType}
    */ typingsSlinky.mongodb.mongodbStrings.AcceptedFields with org.scalablytyped.runtime.TopLevel[js.Any]
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, scala.Unit]
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  type Default = js.Any
  type DefaultSchema = js.Any
  type DotAndArrayNotation[AssignableType] = org.scalablytyped.runtime.StringDictionary[AssignableType]
  type EndCallback = js.Function1[/* error */ typingsSlinky.mongodb.mod.MongoError, scala.Unit]
  /**
    * This is similar to Parameters but will work with a type which is
    * a function or with a tuple specifying arguments, which are both
    * common ways to define eventemitter events
    */
  type EventArguments[T] = js.Array[js.Any | T]
  type FieldUpdates[TSchema] = typingsSlinky.std.Partial[TSchema] with org.scalablytyped.runtime.StringDictionary[js.Any]
  type FilterQuery[T] = typingsSlinky.mongodb.mongodbStrings.FilterQuery with org.scalablytyped.runtime.TopLevel[T] with typingsSlinky.mongodb.mod.RootQuerySelector[T]
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[typingsSlinky.mongodb.mod.MongoError], scala.Unit]
  type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]
  /** Update Query */
  type KeysOfAType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? key : never}[keyof TSchema] */ js.Any
  type KeysOfOtherType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? never : key}[keyof TSchema] */ js.Any
  type MatchKeysAndValues[TSchema] = typingsSlinky.mongodb.mod.ReadonlyPartial[TSchema] with typingsSlinky.mongodb.mod.DotAndArrayNotation[_]
  type MongoCallback[T] = js.Function2[/* error */ typingsSlinky.mongodb.mod.MongoError, /* result */ T, scala.Unit]
  /** It avoid uses fields of non Type */
  type NotAcceptedFields[TSchema, FieldType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfOtherType<TSchema, FieldType> ]:? never}
    */ typingsSlinky.mongodb.mongodbStrings.NotAcceptedFields with org.scalablytyped.runtime.TopLevel[js.Any]
  // We can use TypeScript Omit once minimum required TypeScript Version is above 3.5
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type OnlyFieldsOfType[TSchema, FieldType, AssignableType] = (typingsSlinky.mongodb.mod.AcceptedFields[TSchema, FieldType, AssignableType]) with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, FieldType]) with typingsSlinky.mongodb.mod.DotAndArrayNotation[AssignableType]
  type PullAllOperator[TSchema] = typingsSlinky.mongodb.mongodbStrings.PullAllOperator with org.scalablytyped.runtime.TopLevel[TSchema] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  type PullOperator[TSchema] = typingsSlinky.mongodb.mongodbStrings.PullOperator with org.scalablytyped.runtime.TopLevel[js.Any] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typingsSlinky.mongodb.mod.QuerySelector[_] | js.Any])
  type PushOperator[TSchema] = typingsSlinky.mongodb.mongodbStrings.PushOperator with org.scalablytyped.runtime.TopLevel[js.Any] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typingsSlinky.mongodb.mod.ArrayOperator[_] | js.Any])
  type ReadonlyPartial[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in keyof TSchema ]:? TSchema[key]}
    */ typingsSlinky.mongodb.mongodbStrings.ReadonlyPartial with org.scalablytyped.runtime.TopLevel[TSchema]
  type SetFields[TSchema] = typingsSlinky.mongodb.mongodbStrings.SetFields with org.scalablytyped.runtime.TopLevel[js.Any] with (typingsSlinky.mongodb.mod.NotAcceptedFields[TSchema, js.UndefOr[js.Array[_]]]) with (org.scalablytyped.runtime.StringDictionary[typingsSlinky.mongodb.mod.AddToSetOperators[_] | js.Any])
  type Unpacked[Type] = Type
  type WithId[TSchema] = (typingsSlinky.mongodb.mod.EnhancedOmit[TSchema, typingsSlinky.mongodb.mongodbStrings._id]) with typingsSlinky.mongodb.anon.`0`[TSchema]
  type WithTransactionCallback[T] = js.Function1[/* session */ typingsSlinky.mongodb.mod.ClientSession, js.Promise[T]]
  type log = js.Function2[
    /* message */ js.UndefOr[java.lang.String], 
    /* state */ js.UndefOr[typingsSlinky.mongodb.mod.LoggerState], 
    scala.Unit
  ]
}
