package typingsSlinky.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.FunctionConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Match {
  
  @js.native
  trait Matcher[T] extends StObject {
    
    var _meteorCheckMatcherBrand: Unit = js.native
  }
  object Matcher {
    
    @scala.inline
    def apply[T](_meteorCheckMatcherBrand: Unit): Matcher[T] = {
      val __obj = js.Dynamic.literal(_meteorCheckMatcherBrand = _meteorCheckMatcherBrand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matcher[T]]
    }
    
    @scala.inline
    implicit class MatcherMutableBuilder[Self <: Matcher[_], T] (val x: Self with Matcher[T]) extends AnyVal {
      
      @scala.inline
      def set_meteorCheckMatcherBrand(value: Unit): Self = StObject.set(x, "_meteorCheckMatcherBrand", value.asInstanceOf[js.Any])
    }
  }
  
  type Pattern = js.UndefOr[
    StringConstructor | NumberConstructor | BooleanConstructor | ObjectConstructor | FunctionConstructor | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | Null | String | Double | Boolean | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.Pattern */ js.Object
    ]) | (StringDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.Pattern */ js.Object
    ]) | Matcher[js.Any]
  ]
  
  type PatternMatch[T /* <: Pattern */] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.PatternMatch<T[K]> * / object}
    */ typingsSlinky.meteor.meteorStrings.PatternMatch with TopLevel[js.Any]) | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.Match.PatternMatch<T[0]> */ js.Object
  ]) | T | js.Function | Boolean | Double | String
}
