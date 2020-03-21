package typingsSlinky.reactMixin.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMixin extends js.Object {
  def apply[S](clazz: js.Any, mixin: Mixin[_, _]): ReactComponentClass[S] = js.native
  def decorate(mixin: Mixin[_, _]): ClassDecorator = js.native
  def onClass[S](clazz: js.Any, mixin: Mixin[_, _]): ReactComponentClass[S] = js.native
}

