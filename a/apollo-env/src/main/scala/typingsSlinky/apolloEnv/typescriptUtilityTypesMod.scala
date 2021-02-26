package typingsSlinky.apolloEnv

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Pick
import typingsSlinky.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptUtilityTypesMod {
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias apollo-env.apollo-env/lib/typescript-utility-types.DeepPartial<T[P]> * / object}
    */ typingsSlinky.apolloEnv.apolloEnvStrings.DeepPartial with TopLevel[js.Any]
  
  type WithRequired[T, K /* <: /* keyof T */ String */] = T with (Required[Pick[T, K]])
}
