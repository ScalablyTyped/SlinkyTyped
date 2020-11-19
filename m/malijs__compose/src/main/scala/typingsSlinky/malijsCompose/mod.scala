package typingsSlinky.malijsCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@malijs/compose", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T](middleware: js.Array[Middleware[T]]): ComposedMiddleware[T] = js.native
  
  type ComposedMiddleware[T] = js.Function2[
    /* context */ T, 
    /* next */ js.UndefOr[js.Function0[js.Promise[js.Any]]], 
    js.Promise[Unit]
  ]
  
  type Middleware[T] = js.Function2[/* context */ T, /* next */ js.Function0[js.Promise[js.Any]], js.Any]
}
