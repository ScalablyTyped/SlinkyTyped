package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mongo {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.meteor.Anon_0
  import typingsSlinky.meteor.Anon_And
  import typingsSlinky.meteor.Anon_Id
  import typingsSlinky.meteor.UnionOmit
  import typingsSlinky.meteor.meteorStrings._id
  import typingsSlinky.std.Number
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type ArraysOrEach[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each  :T[P]}}
    */ typingsSlinky.meteor.meteorStrings.ArraysOrEach with js.Any
  type Dictionary[T] = StringDictionary[T]
  type ElementsOf[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typingsSlinky.meteor.meteorStrings.ElementsOf with T
  type FieldSpecifier = StringDictionary[Number]
  type Flatten[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | Anon_0[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  type OptionalId[TSchema] = (UnionOmit[TSchema, _id]) with Anon_Id
  type PartialMapTo[T, M] = Partial[Record[String, M]]
  type PushModifier[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.Mongo.Dictionary<number>}}
    */ typingsSlinky.meteor.meteorStrings.PushModifier with js.Any
  type Query[T] = typingsSlinky.meteor.meteorStrings.Query with js.Any with Anon_And with Dictionary[_]
  type Selector[T] = Query[T] | QueryWithModifiers[T]
}
