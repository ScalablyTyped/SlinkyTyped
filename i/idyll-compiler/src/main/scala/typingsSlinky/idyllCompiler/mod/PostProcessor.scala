package typingsSlinky.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * ast * / typingsSlinky.idyllCompiler.mod.AST, typingsSlinky.idyllCompiler.mod.AST]
  - js.Function2[
/ * ast * / typingsSlinky.idyllCompiler.mod.AST, 
/ * callback * / js.Function2[/ * err * / js.Any, / * value * / typingsSlinky.idyllCompiler.mod.AST, scala.Unit], 
scala.Unit]
*/
trait PostProcessor extends js.Object

object PostProcessor {
  @scala.inline
  implicit def apply(value: js.Function1[/* ast */ AST, AST]): PostProcessor = value.asInstanceOf[PostProcessor]
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* ast */ AST, 
      /* callback */ js.Function2[/* err */ js.Any, /* value */ AST, Unit], 
      Unit
    ]
  ): PostProcessor = value.asInstanceOf[PostProcessor]
}

