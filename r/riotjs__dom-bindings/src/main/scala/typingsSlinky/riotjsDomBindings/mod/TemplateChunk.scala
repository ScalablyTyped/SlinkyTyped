package typingsSlinky.riotjsDomBindings.mod

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateChunk[Scope, ParentScope] extends js.Object {
  var bindings: js.UndefOr[js.Array[Binding[Scope, ParentScope]]] = js.native
  var bindingsData: js.UndefOr[js.Array[BindingData]] = js.native
  var children: js.UndefOr[HTMLCollection] = js.native
  var dom: js.UndefOr[HTMLElement] = js.native
  var el: js.UndefOr[HTMLElement] = js.native
  var fragment: js.UndefOr[DocumentFragment] = js.native
  var html: js.UndefOr[String | Null] = js.native
  var isTemplateTag: js.UndefOr[Boolean] = js.native
  def createDOM(el: HTMLElement): TemplateChunk[_, _] = js.native
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): TemplateChunk[_, _] = js.native
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): TemplateChunk[_, _] = js.native
  def update(scope: Scope, parentScope: ParentScope): TemplateChunk[_, _] = js.native
}

object TemplateChunk {
  @scala.inline
  def apply[Scope, ParentScope](
    createDOM: HTMLElement => TemplateChunk[_, _],
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[_, _],
    unmount: (Scope, ParentScope, Boolean) => TemplateChunk[_, _],
    update: (Scope, ParentScope) => TemplateChunk[_, _]
  ): TemplateChunk[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal(createDOM = js.Any.fromFunction1(createDOM), mount = js.Any.fromFunction4(mount), unmount = js.Any.fromFunction3(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[TemplateChunk[Scope, ParentScope]]
  }
  @scala.inline
  implicit class TemplateChunkOps[Self[scope, parentscope] <: TemplateChunk[scope, parentscope], Scope, ParentScope] (val x: Self[Scope, ParentScope]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Scope, ParentScope] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Scope, ParentScope]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Scope, ParentScope]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Scope, ParentScope]) with Other]
    @scala.inline
    def withCreateDOM(value: HTMLElement => TemplateChunk[_, _]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDOM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMount(value: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[_, _]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUnmount(value: (Scope, ParentScope, Boolean) => TemplateChunk[_, _]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Scope, ParentScope) => TemplateChunk[_, _]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBindings(value: js.Array[Binding[Scope, ParentScope]]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingsData(value: js.Array[BindingData]): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingsData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingsData: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingsData")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: HTMLCollection): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDom(value: HTMLElement): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.undefined)
        ret
    }
    @scala.inline
    def withEl(value: HTMLElement): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withFragment(value: DocumentFragment): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragment: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlNull: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(null)
        ret
    }
    @scala.inline
    def withIsTemplateTag(value: Boolean): Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemplateTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTemplateTag: Self[Scope, ParentScope] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemplateTag")(js.undefined)
        ret
    }
  }
  
}

