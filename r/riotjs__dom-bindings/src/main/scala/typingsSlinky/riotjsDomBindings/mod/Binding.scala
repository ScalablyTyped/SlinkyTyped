package typingsSlinky.riotjsDomBindings.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding[Scope, ParentScope] extends js.Object {
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): Binding[_, _] = js.native
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): Binding[_, _] = js.native
  def update(scope: Scope, parentScope: ParentScope): Binding[_, _] = js.native
}

object Binding {
  @scala.inline
  def apply[Scope, ParentScope](
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => Binding[_, _],
    unmount: (Scope, ParentScope, Boolean) => Binding[_, _],
    update: (Scope, ParentScope) => Binding[_, _]
  ): Binding[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction4(mount), unmount = js.Any.fromFunction3(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Binding[Scope, ParentScope]]
  }
  @scala.inline
  implicit class BindingOps[Self[scope, parentscope] <: Binding[scope, parentscope], Scope, ParentScope] (val x: Self[Scope, ParentScope]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Scope, ParentScope] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Scope, ParentScope]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Scope, ParentScope]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Scope, ParentScope]) with Other]
    @scala.inline
    def withMount(value: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => Binding[_, _]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUnmount(value: (Scope, ParentScope, Boolean) => Binding[_, _]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Scope, ParentScope) => Binding[_, _]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

