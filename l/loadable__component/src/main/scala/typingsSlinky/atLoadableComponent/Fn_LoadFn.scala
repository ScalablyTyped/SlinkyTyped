package typingsSlinky.atLoadableComponent

import typingsSlinky.atLoadableComponent.atLoadableComponentMod.DefaultComponent
import typingsSlinky.atLoadableComponent.atLoadableComponentMod.LoadableComponent
import typingsSlinky.atLoadableComponent.atLoadableComponentMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LoadFn extends js.Object {
  def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
  def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]], options: Options[T]): LoadableComponent[T] = js.native
}

