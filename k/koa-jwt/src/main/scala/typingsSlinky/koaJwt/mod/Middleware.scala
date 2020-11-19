package typingsSlinky.koaJwt.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koaJwt.anon.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> * / any */ @js.native
trait Middleware extends js.Object {
  
  def unless(): typingsSlinky.koa.mod.Middleware[DefaultState, DefaultContext] = js.native
  def unless(params: Custom): typingsSlinky.koa.mod.Middleware[DefaultState, DefaultContext] = js.native
}
