package typingsSlinky.officeUiFabricReact.anon

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRenderItem extends js.Object {
  
  def onRenderItem(props: ITagItemProps): ReactElement = js.native
  
  def onRenderSuggestionsItem(props: ITag): ReactElement = js.native
}
object OnRenderItem {
  
  @scala.inline
  def apply(onRenderItem: ITagItemProps => ReactElement, onRenderSuggestionsItem: ITag => ReactElement): OnRenderItem = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderSuggestionsItem = js.Any.fromFunction1(onRenderSuggestionsItem))
    __obj.asInstanceOf[OnRenderItem]
  }
  
  @scala.inline
  implicit class OnRenderItemOps[Self <: OnRenderItem] (val x: Self) extends AnyVal {
    
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
    def setOnRenderItem(value: ITagItemProps => ReactElement): Self = this.set("onRenderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRenderSuggestionsItem(value: ITag => ReactElement): Self = this.set("onRenderSuggestionsItem", js.Any.fromFunction1(value))
  }
}
