package typingsSlinky.rcTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcTable.bodyContextMod.BodyContextProps
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("rc-table/lib/context/BodyContext", "default.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[BodyContextProps[Record[String, js.Any]]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: BodyContextProps[Record[String, js.Any]]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[BodyContextProps[Record[String, js.Any]]]]))
  }
}
