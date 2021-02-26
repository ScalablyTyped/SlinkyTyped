package typingsSlinky.reactMdTable.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTable.tableCellContentMod.SortOrder
import typingsSlinky.reactMdTable.tableCellContentMod.TableCellContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableCellContent {
  
  @JSImport("@react-md/table", "TableCellContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLButtonElement] {
    
    @scala.inline
    def aboveClassName(value: String): this.type = set("aboveClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterClassName(value: String): this.type = set("afterClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeClassName(value: String): this.type = set("beforeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def belowClassName(value: String): this.type = set("belowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceIconWrap(value: Boolean): this.type = set("forceIconWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconAfter(value: Boolean): this.type = set("iconAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotated(value: Boolean): this.type = set("rotated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortOrder(value: SortOrder): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableCellContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableCellContentProps with RefAttributes[HTMLButtonElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
