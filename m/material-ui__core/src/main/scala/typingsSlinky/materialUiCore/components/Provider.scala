package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.tableContextMod.TableContextProps
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@material-ui/core/Table/TableContext", "default.Provider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: TableContextProps): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps[js.UndefOr[TableContextProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
