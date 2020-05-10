package typingsSlinky.riotjsDomBindings.mod

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateChunkMeta extends js.Object {
  var avoidDOMInjection: Boolean = js.native
  var children: HTMLCollection = js.native
  var fragment: DocumentFragment = js.native
}

object TemplateChunkMeta {
  @scala.inline
  def apply(avoidDOMInjection: Boolean, children: HTMLCollection, fragment: DocumentFragment): TemplateChunkMeta = {
    val __obj = js.Dynamic.literal(avoidDOMInjection = avoidDOMInjection.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChunkMeta]
  }
  @scala.inline
  implicit class TemplateChunkMetaOps[Self <: TemplateChunkMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidDOMInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidDOMInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: HTMLCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragment(value: DocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

