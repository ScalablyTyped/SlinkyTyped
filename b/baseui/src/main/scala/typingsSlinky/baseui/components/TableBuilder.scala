package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import typingsSlinky.baseui.tableSemanticMod.BuilderOverrides
import typingsSlinky.baseui.tableSemanticMod.TableBuilderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBuilder {
  
  @scala.inline
  def apply[RowT](data: js.Array[RowT]): Builder[RowT] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[RowT](js.Array(this.component, __props.asInstanceOf[TableBuilderProps[RowT]]))
  }
  
  @JSImport("baseui/table-semantic", "TableBuilder")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RowT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilder[RowT]] {
    
    @scala.inline
    def emptyMessage(value: ReactElement | js.Function0[ReactElement]): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyMessageFunction0(value: () => ReactElement): this.type = set("emptyMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def emptyMessageReactElement(value: ReactElement): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontalScrollWidth(value: String): this.type = set("horizontalScrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingMessage(value: ReactElement | js.Function0[ReactElement]): this.type = set("loadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingMessageFunction0(value: () => ReactElement): this.type = set("loadingMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def loadingMessageReactElement(value: ReactElement): this.type = set("loadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSort(value: /* columnId */ String => Unit): this.type = set("onSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: BuilderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortColumn(value: String): this.type = set("sortColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortColumnNull: this.type = set("sortColumn", null)
    
    @scala.inline
    def sortOrder(value: ASC | DESC): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortOrderNull: this.type = set("sortOrder", null)
  }
  
  def withProps[RowT](p: TableBuilderProps[RowT]): Builder[RowT] = new Builder[RowT](js.Array(this.component, p.asInstanceOf[js.Any]))
}
