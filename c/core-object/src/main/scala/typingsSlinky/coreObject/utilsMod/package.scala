package typingsSlinky.coreObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type Constructor[Instance] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, Instance]
  type MethodNames[T] = typingsSlinky.coreObject.utilsMod.Values[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}
    */ typingsSlinky.coreObject.coreObjectStrings.MethodNames with T
  ]
  type Mix[T, U] = U with (typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, java.lang.String]])
  type Super[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in core-object.core-object/-private/utils.MethodNames<T> ]: T[K] extends (): infer Return? core-object.core-object/-private/utils.CallOrApply<T, undefined, any> : T[K] extends (a : infer A): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any], any> : T[K] extends (a : infer A, b : infer B): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C, d : infer D): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any, any], any> : T[K] extends (args : ...any): infer Return? core-object.core-object/-private/utils.CallOrApply<T, std.Array<any>, any> : never}
    */ typingsSlinky.coreObject.coreObjectStrings.Super with js.Any
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
