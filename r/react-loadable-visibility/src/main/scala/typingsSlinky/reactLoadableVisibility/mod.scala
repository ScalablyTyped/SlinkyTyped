package typingsSlinky.reactLoadableVisibility

import typingsSlinky.loadableComponent.anon.FnCall
import typingsSlinky.loadableComponent.mod.DefaultComponent
import typingsSlinky.loadableComponent.mod.LoadableComponent
import typingsSlinky.loadableComponent.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-loadable-visibility", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    var lib: FnCall = js.native
    def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
    def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]], options: Options[T]): LoadableComponent[T] = js.native
  }
  
}

