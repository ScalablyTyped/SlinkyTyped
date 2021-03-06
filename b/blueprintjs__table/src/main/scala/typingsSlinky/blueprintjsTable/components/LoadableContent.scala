package typingsSlinky.blueprintjsTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.loadableContentMod.ILoadableContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadableContent {
  
  @scala.inline
  def apply(loading: Boolean): Builder = {
    val __props = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ILoadableContentProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/common/loadableContent", "LoadableContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.loadableContentMod.LoadableContent] {
    
    @scala.inline
    def variableLength(value: Boolean): this.type = set("variableLength", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ILoadableContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
