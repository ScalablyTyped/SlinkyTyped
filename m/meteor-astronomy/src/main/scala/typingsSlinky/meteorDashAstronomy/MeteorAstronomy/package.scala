package typingsSlinky.meteorDashAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MeteorAstronomy {
  import typingsSlinky.meteor.Mongo.ObjectID
  import typingsSlinky.meteor.Mongo.Selector
  import typingsSlinky.meteorDashAstronomy.Anon_Callback
  import typingsSlinky.meteorDashAstronomy.Anon_GetIdentifier
  import typingsSlinky.std.BooleanConstructor
  import typingsSlinky.std.DateConstructor
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.NumberConstructor
  import typingsSlinky.std.ObjectConstructor
  import typingsSlinky.std.Pick
  import typingsSlinky.std.StringConstructor

  type Enum[T] = T with Anon_GetIdentifier
  type Fields[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.NonFunctionProperties<T> ]: meteor-astronomy.MeteorAstronomy.ModelField<T[P], T>}
    */ typingsSlinky.meteorDashAstronomy.meteorDashAstronomyStrings.Fields with T
  type FunctionProperties[T] = Pick[T, FunctionPropertyNames[T]]
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Helpers[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.FunctionProperties<T> ]: (this : T, args : ...any): any}
    */ typingsSlinky.meteorDashAstronomy.meteorDashAstronomyStrings.Helpers with js.Any
  type Model[T] = T with Anon_Callback[T]
  type ModelField[Field, Doc] = (ModelFullField[Field, Doc]) | TypeOptions
  type MongoQuery[T] = Selector[T] | ObjectID | String
  type NonFunctionProperties[T] = Pick[T, NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type RemoveCallback = js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
  type SaveAndValidateCallback = js.Function2[/* err */ js.Any, /* id */ js.Any, Unit]
  type TypeOptions = TypeOptionsPrimitives | js.Array[TypeOptionsPrimitives] | Class[js.Any] | Enum[js.Any]
  type TypeOptionsPrimitives = StringConstructor | DateConstructor | BooleanConstructor | ObjectConstructor | NumberConstructor
}
