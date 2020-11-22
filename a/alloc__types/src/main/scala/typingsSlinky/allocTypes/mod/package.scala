package typingsSlinky.allocTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyFn[In /* <: js.Array[_] */, Out] = js.Function1[/* args */ In, Out]
  
  type Exclusive[T] = typingsSlinky.allocTypes.mod.Remap[
    typingsSlinky.allocTypes.allocTypesStrings.Exclusive with org.scalablytyped.runtime.TopLevel[T] with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  
  type Falsy = js.UndefOr[typingsSlinky.allocTypes.allocTypesBooleans.`false` | scala.Null]
  
  /** Convert a union to an intersection */
  type Intersect[U] = js.Any
  
  type Lookup[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type MergeDefaults[T /* <: js.Object */, U /* <: typingsSlinky.allocTypes.mod.Partial[T] */] = typingsSlinky.allocTypes.mod.Remap[
    (typingsSlinky.allocTypes.mod.Omit[T, /* keyof U */ java.lang.String]) with (typingsSlinky.allocTypes.mod.Partial[
      typingsSlinky.allocTypes.mod.Pick[
        T, 
        typingsSlinky.std.Extract[/* keyof U */ java.lang.String, /* keyof T */ java.lang.String]
      ]
    ])
  ]
  
  type MergeUnknown[T, U] = typingsSlinky.allocTypes.mod.Remap[T with (typingsSlinky.allocTypes.mod.Omit[U, /* keyof T */ java.lang.String])]
  
  type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : never] */ js.Any
  
  type ObjectFromUnion[T /* <: js.Object */] = typingsSlinky.allocTypes.mod.Remap[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof @alloc/types.@alloc/types.Intersect<T> ]: T extends infer U? P extends keyof any? any[P] : never : never}
    */ typingsSlinky.allocTypes.allocTypesStrings.ObjectFromUnion with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  
  type ObjectType[T] = js.Object | T
  
  type Omit[T, K] = typingsSlinky.allocTypes.mod.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OneOrMore[T] = T | js.Array[T]
  
  type Overwrite[T, U] = typingsSlinky.allocTypes.mod.Remap[(typingsSlinky.allocTypes.mod.Omit[T, /* keyof U */ java.lang.String]) with U]
  
  type Partial[T] = js.Object with typingsSlinky.allocTypes.allocTypesStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = js.Object with typingsSlinky.allocTypes.allocTypesStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  
  type Remap[T] = js.Object with typingsSlinky.allocTypes.allocTypesStrings.Remap with org.scalablytyped.runtime.TopLevel[T]
  
  type Solve[T] = T
  
  type StaticProps[T] = typingsSlinky.allocTypes.mod.Omit[
    T, 
    (/* keyof T */ java.lang.String) with typingsSlinky.allocTypes.allocTypesStrings.prototype
  ]
  
  type UnknownProps = typingsSlinky.allocTypes.mod.Lookup[js.Any]
}
