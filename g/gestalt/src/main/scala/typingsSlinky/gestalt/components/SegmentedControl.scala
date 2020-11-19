package typingsSlinky.gestalt.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.ActiveIndex
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.mod.SegmentedControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedControl {
  
  @JSImport("gestalt", "SegmentedControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.SegmentedControl] {
    
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentedControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(items: js.Array[ReactElement], onChange: ActiveIndex => Unit, selectedItemIndex: Double): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SegmentedControlProps]))
  }
}
