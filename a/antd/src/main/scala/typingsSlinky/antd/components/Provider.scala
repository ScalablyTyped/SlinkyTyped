package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antd.listMod.ListConsumerProps
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("antd/lib/list", "ListContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[ListConsumerProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: ListConsumerProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[ListConsumerProps]]))
  }
}

