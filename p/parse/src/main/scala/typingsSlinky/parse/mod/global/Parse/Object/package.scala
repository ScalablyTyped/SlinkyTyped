package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Object {
  
  // From https://github.com/parse-community/Parse-SDK-JS/blob/master/src/encode.js
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsSlinky.parse.mod.global.Parse.Object.ToJSON[T]
    - js.Array[js.Any]
    - java.lang.String
    - typingsSlinky.parse.anon.Iso
    - typingsSlinky.std.ReturnType[
  / * import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] * / js.Any]
    - typingsSlinky.parse.mod.global.Parse.Pointer
  */
  type Encode[T] = typingsSlinky.parse.mod.global.Parse.Object._Encode[T] | js.Array[js.Any] | (typingsSlinky.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] */ js.Any
  ]) | T | typingsSlinky.parse.mod.global.Parse.Object.ToJSON[T] | java.lang.String
  
  type ToJSON[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: parse.parse.<global>.Parse.Object.Encode<T[K]>}
    */ typingsSlinky.parse.parseStrings.ToJSON with org.scalablytyped.runtime.TopLevel[T]
}
