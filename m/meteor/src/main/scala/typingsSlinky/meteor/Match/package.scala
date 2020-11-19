package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Match {
  
  type Pattern = js.UndefOr[
    (typingsSlinky.std.StringConstructor with org.scalablytyped.runtime.Instantiable0[typingsSlinky.std.global.String]) | (typingsSlinky.std.NumberConstructor with org.scalablytyped.runtime.Instantiable0[typingsSlinky.std.global.Number]) | (typingsSlinky.std.BooleanConstructor with org.scalablytyped.runtime.Instantiable0[typingsSlinky.std.global.Boolean]) | (typingsSlinky.std.ObjectConstructor with org.scalablytyped.runtime.Instantiable0[js.Object]) | (typingsSlinky.std.FunctionConstructor with (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ java.lang.String, js.Function])) | (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]) | scala.Null | java.lang.String | scala.Double | scala.Boolean | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.Pattern */ js.Object
    ]) | (org.scalablytyped.runtime.StringDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.Pattern */ js.Object
    ]) | typingsSlinky.meteor.Match.Matcher[js.Any]
  ]
  
  type PatternMatch[T /* <: typingsSlinky.meteor.Match.Pattern */] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.PatternMatch<T[K]> * / object}
    */ typingsSlinky.meteor.meteorStrings.PatternMatch with org.scalablytyped.runtime.TopLevel[js.Any]) | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.PatternMatch<T[0]> */ js.Object
  ]) | T | js.Function | scala.Boolean | scala.Double | java.lang.String
}
