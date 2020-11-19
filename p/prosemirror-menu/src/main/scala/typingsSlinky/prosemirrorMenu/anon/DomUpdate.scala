package typingsSlinky.prosemirrorMenu.anon

import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomUpdate[S /* <: Schema[_, _] */] extends js.Object {
  
  var dom: js.UndefOr[DocumentFragment | Null] = js.native
  
  def update(p: EditorState[S]): Boolean = js.native
}
object DomUpdate {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](update: EditorState[S] => Boolean): DomUpdate[S] = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DomUpdate[S]]
  }
  
  @scala.inline
  implicit class DomUpdateOps[Self <: DomUpdate[_], S /* <: Schema[_, _] */] (val x: Self with DomUpdate[S]) extends AnyVal {
    
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
    def setUpdate(value: EditorState[S] => Boolean): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDom(value: DocumentFragment): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    
    @scala.inline
    def setDomNull: Self = this.set("dom", null)
  }
}
