package typingsSlinky.reactMdTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactMdTable.anon.RequiredTableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableConfigProvider {
  
  @scala.inline
  def apply(value: RequiredTableConfig): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[RequiredTableConfig]]))
  }
  
  @JSImport("@react-md/table/types/config", "TableConfigProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[RequiredTableConfig]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
