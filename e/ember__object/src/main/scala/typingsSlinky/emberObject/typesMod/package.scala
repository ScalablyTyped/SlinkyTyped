package typingsSlinky.emberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComputedPropertyGetterFunction[T] = js.ThisFunction1[/* this */ js.Any, /* key */ java.lang.String, T]
  type ComputedPropertySetterFunction[T] = js.ThisFunction3[/* this */ js.Any, /* key */ java.lang.String, /* newVal */ T, /* oldVal */ T, T]
  type EmberClassArguments = org.scalablytyped.runtime.StringDictionary[js.Any]
  type EmberClassConstructor[T] = (org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* properties */ js.Object], T]) with (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T])
  type EmberInstanceArguments[T] = typingsSlinky.std.Partial[T] with org.scalablytyped.runtime.StringDictionary[js.Any]
  type ExtractPropertyNamesOfType[T, S] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends S? K : never}[keyof T] */ js.Any
  type Fix[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsSlinky.emberObject.emberObjectStrings.Fix with org.scalablytyped.runtime.TopLevel[T]
  type Objectify[T] = T
  type UnwrapComputedPropertyGetter[T] = T
  type UnwrapComputedPropertyGetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertyGetter<T[P]>}
    */ typingsSlinky.emberObject.emberObjectStrings.UnwrapComputedPropertyGetters with org.scalablytyped.runtime.TopLevel[T]
  type UnwrapComputedPropertySetter[T] = T
  type UnwrapComputedPropertySetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertySetter<T[P]>}
    */ typingsSlinky.emberObject.emberObjectStrings.UnwrapComputedPropertySetters with org.scalablytyped.runtime.TopLevel[T]
}
