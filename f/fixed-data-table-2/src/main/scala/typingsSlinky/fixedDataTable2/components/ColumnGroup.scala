package typingsSlinky.fixedDataTable2.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.center
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.left
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.right
import typingsSlinky.fixedDataTable2.mod.ColumnGroupHeaderProps
import typingsSlinky.fixedDataTable2.mod.ColumnGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnGroup {
  
  @JSImport("fixed-data-table-2", "ColumnGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fixedDataTable2.mod.ColumnGroup] {
    
    @scala.inline
    def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(
      value: String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
    ): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFunction1(value: /* props */ ColumnGroupHeaderProps => String | ReactElement): this.type = set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ColumnGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColumnGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
