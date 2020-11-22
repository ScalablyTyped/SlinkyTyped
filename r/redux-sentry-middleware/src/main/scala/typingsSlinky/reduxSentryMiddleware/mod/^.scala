package typingsSlinky.reduxSentryMiddleware.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.reduxSentryMiddleware.anon.TypeofSentry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-sentry-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  // tslint:disable-next-line: no-unnecessary-generics
  def apply[T](sentry: TypeofSentry): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](sentry: TypeofSentry, options: Options[T]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}
