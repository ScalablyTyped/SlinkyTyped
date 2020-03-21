package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRenderItem extends js.Object {
  def onRenderItem(props: ITagItemProps): ReactElement
  def onRenderSuggestionsItem(props: ITag): ReactElement
}

object AnonOnRenderItem {
  @scala.inline
  def apply(onRenderItem: ITagItemProps => ReactElement, onRenderSuggestionsItem: ITag => ReactElement): AnonOnRenderItem = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderSuggestionsItem = js.Any.fromFunction1(onRenderSuggestionsItem))
  
    __obj.asInstanceOf[AnonOnRenderItem]
  }
}

