package typingsSlinky.officeUiFabricReact.anon

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRenderItem extends StObject {
  
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
  implicit class OnRenderItemMutableBuilder[Self <: OnRenderItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRenderItem(value: ITagItemProps => ReactElement): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRenderSuggestionsItem(value: ITag => ReactElement): Self = StObject.set(x, "onRenderSuggestionsItem", js.Any.fromFunction1(value))
  }
}
