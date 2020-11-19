package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.mergeListContextMod.MergeWithListContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MergeListContext {
  
  @JSImport("@material-ui/core/ListItem/MergeListContext", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MergeWithListContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MergeListContext.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
