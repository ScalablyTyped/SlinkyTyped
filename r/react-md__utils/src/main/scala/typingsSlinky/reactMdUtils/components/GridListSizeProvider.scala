package typingsSlinky.reactMdUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactMdUtils.useGridListMod.GridListSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridListSizeProvider {
  
  @scala.inline
  def apply(value: GridListSize): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[GridListSize]]))
  }
  
  @JSImport("@react-md/utils", "GridListSizeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[GridListSize]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
