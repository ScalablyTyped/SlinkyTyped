package typingsSlinky.meteor.mongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mongo {
  type ArraysOrEach[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each  :T[P]}}
    */ typingsSlinky.meteor.meteorStrings.ArraysOrEach with js.Any
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ElementsOf[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typingsSlinky.meteor.meteorStrings.ElementsOf with T
  type FieldSpecifier = org.scalablytyped.runtime.StringDictionary[typingsSlinky.std.Number]
  type Flatten[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | typingsSlinky.meteor.AnonCurrentDate[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = typingsSlinky.std.Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  type OptionalId[TSchema] = (typingsSlinky.meteor.mongoMod.UnionOmit[TSchema, typingsSlinky.meteor.meteorStrings._id]) with typingsSlinky.meteor.AnonId
  type PartialMapTo[T, M] = typingsSlinky.std.Partial[typingsSlinky.std.Record[java.lang.String, M]]
  type PushModifier[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.meteor/mongo.Mongo.Dictionary<number>}}
    */ typingsSlinky.meteor.meteorStrings.PushModifier with js.Any
  type Query[T] = typingsSlinky.meteor.meteorStrings.Query with js.Any with typingsSlinky.meteor.AnonAnd with typingsSlinky.meteor.mongoMod.Mongo.Dictionary[_]
  type Selector[T] = typingsSlinky.meteor.mongoMod.Mongo.Query[T] | typingsSlinky.meteor.mongoMod.Mongo.QueryWithModifiers[T]
}
