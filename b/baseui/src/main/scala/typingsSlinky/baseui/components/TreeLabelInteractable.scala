package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.LabelInteractable
import typingsSlinky.baseui.anon.Overrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeLabelInteractable {
  
  @JSImport("baseui/tree-view", "TreeLabelInteractable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def overrides(value: LabelInteractable): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Overrides): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TreeLabelInteractable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
