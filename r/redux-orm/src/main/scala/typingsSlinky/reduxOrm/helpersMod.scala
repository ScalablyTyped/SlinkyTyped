package typingsSlinky.reduxOrm

import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, Exclude[/* keyof T */ String, /* keyof U */ String]]
  
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  type KnownKeys[T] = js.Any
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? K : never}[keyof T] */ js.Any
  
  type PickByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: T[Key] extends ValueType? Key : never}[keyof T] */ js.Any
  ]
}
