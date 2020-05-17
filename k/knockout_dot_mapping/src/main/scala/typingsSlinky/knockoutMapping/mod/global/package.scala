package typingsSlinky.knockoutMapping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object global {
  type KnockoutMappingSpecificOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? knockout.mapping.knockout.mapping.<global>.KnockoutPropertyMappingCallBack}
    */ typingsSlinky.knockoutMapping.knockoutMappingStrings.KnockoutMappingSpecificOptions with org.scalablytyped.runtime.TopLevel[js.Any]
  // Could not get this to return any when T is any. It returns a Union type of the possible values.
  type KnockoutObservableArrayType[T] = typingsSlinky.knockout.KnockoutObservableArray[typingsSlinky.knockoutMapping.mod.global.KnockoutObservableType[T] | T]
  type KnockoutObservableType[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends knockout.mapping.knockout.mapping.Primitives? knockout.KnockoutObservable<T[P]> : T[P] extends std.Array<any>? knockout.mapping.knockout.mapping.<global>.KnockoutObservableArrayType<T[P][number]> : T[P] extends std.ReadonlyArray<any>? knockout.mapping.knockout.mapping.<global>.KnockoutReadonlyObservableArrayType<T[P][number]> : knockout.mapping.knockout.mapping.<global>.MappedType<T[P]>}
    */ typingsSlinky.knockoutMapping.knockoutMappingStrings.KnockoutObservableType with org.scalablytyped.runtime.TopLevel[js.Any]
  type KnockoutReadonlyObservableArrayType[T] = typingsSlinky.knockout.KnockoutReadonlyObservableArray[typingsSlinky.knockoutMapping.mod.global.KnockoutObservableType[T] | T]
}
