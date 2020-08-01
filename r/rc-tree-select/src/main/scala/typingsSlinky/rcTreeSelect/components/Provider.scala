package typingsSlinky.rcTreeSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcTreeSelect.contextMod.ContextProps
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("rc-tree-select/lib/Context", "SelectContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[ContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: ContextProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[ContextProps]]))
  }
}

