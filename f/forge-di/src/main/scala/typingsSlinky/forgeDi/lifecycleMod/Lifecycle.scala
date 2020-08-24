package typingsSlinky.forgeDi.lifecycleMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifecycle extends js.Object {
  def resolve(resolver: default, context: typingsSlinky.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
}

object Lifecycle {
  @scala.inline
  def apply(resolve: (default, typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Lifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
    __obj.asInstanceOf[Lifecycle]
  }
  @scala.inline
  implicit class LifecycleOps[Self <: Lifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolve(value: (default, typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Self = this.set("resolve", js.Any.fromFunction3(value))
  }
  
}

