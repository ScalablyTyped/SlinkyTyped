package typingsSlinky.koaDashJwt.koaDashJwtMod

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koaDashJwt.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> * / any */ @js.native
trait Middleware extends js.Object {
  def unless(): typingsSlinky.koa.koaMod.Middleware[DefaultState, DefaultContext] = js.native
  def unless(params: Anon_Path): typingsSlinky.koa.koaMod.Middleware[DefaultState, DefaultContext] = js.native
}

