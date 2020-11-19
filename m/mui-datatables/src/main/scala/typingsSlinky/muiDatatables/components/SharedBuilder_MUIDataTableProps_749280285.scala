package typingsSlinky.muiDatatables.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.anon.PartialTableBodyReactNode
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_MUIDataTableProps_749280285 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def components(value: PartialTableBodyReactNode): this.type = set("components", value.asInstanceOf[js.Any])
  
  @scala.inline
  def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
  
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
}
