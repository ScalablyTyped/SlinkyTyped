package typingsSlinky.materialUi.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Table.TableHeaderColumnProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeaderColumn {
  
  @JSImport("material-ui", "TableHeaderColumn")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.TableHeaderColumn] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnNumber(value: Double): this.type = set("columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: String): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipStyle(value: CSSProperties): this.type = set("tooltipStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableHeaderColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableHeaderColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
