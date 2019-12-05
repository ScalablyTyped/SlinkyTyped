package typingsSlinky.apolloDashEnv

import typingsSlinky.std.Pick
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/typescript-utility-types", JSImport.Namespace)
@js.native
object libTypescriptDashUtilityDashTypesMod extends js.Object {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias apollo-env.apollo-env/lib/typescript-utility-types.DeepPartial<T[P]> * / object}
    */ typingsSlinky.apolloDashEnv.apolloDashEnvStrings.DeepPartial with js.Any
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}

