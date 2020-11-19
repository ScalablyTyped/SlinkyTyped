package typingsSlinky.miniStore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.miniStore.typesMod.Store
import typingsSlinky.react.mod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  @JSImport("mini-store/cjs/Provider", "MiniStoreContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[Store[js.Object] | Null]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: Store[js.Object] | Null => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[Store[js.Object] | Null]]))
  }
}
