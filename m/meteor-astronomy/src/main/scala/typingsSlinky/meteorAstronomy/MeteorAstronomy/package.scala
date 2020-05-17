package typingsSlinky.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MeteorAstronomy {
  type Enum[T] = T with typingsSlinky.meteorAstronomy.anon.GetIdentifier
  type Fields[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.NonFunctionProperties<T> ]: meteor-astronomy.MeteorAstronomy.ModelField<T[P], T>}
    */ typingsSlinky.meteorAstronomy.meteorAstronomyStrings.Fields with org.scalablytyped.runtime.TopLevel[T]
  type FunctionProperties[T] = typingsSlinky.std.Pick[T, typingsSlinky.meteorAstronomy.MeteorAstronomy.FunctionPropertyNames[T]]
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Helpers[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.FunctionProperties<T> ]: (this : T, args : ...any): any}
    */ typingsSlinky.meteorAstronomy.meteorAstronomyStrings.Helpers with org.scalablytyped.runtime.TopLevel[js.Any]
  type Model[T] = T with typingsSlinky.meteorAstronomy.anon.Copy[T]
  type NonFunctionProperties[T] = typingsSlinky.std.Pick[T, typingsSlinky.meteorAstronomy.MeteorAstronomy.NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type RemoveCallback = js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  type SaveAndValidateCallback = js.Function2[/* err */ js.Any, /* id */ js.Any, scala.Unit]
}
