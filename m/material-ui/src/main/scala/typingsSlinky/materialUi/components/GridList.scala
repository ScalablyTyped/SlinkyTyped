package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.GridList.GridListProps
import typingsSlinky.materialUi.materialUiStrings.auto
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridList {
  
  @JSImport("material-ui", "GridList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.GridList] {
    
    @scala.inline
    def cellHeight(value: Double | auto): this.type = set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GridList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
