package typingsSlinky.nivoTooltip.tableTooltipMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableTooltipProps extends js.Object {
  
  var renderContent: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var rows: js.UndefOr[js.Array[js.Array[ReactElement]]] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object TableTooltipProps {
  
  @scala.inline
  def apply(): TableTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableTooltipProps]
  }
  
  @scala.inline
  implicit class TableTooltipPropsOps[Self <: TableTooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRenderContent(value: () => ReactElement): Self = this.set("renderContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderContent: Self = this.set("renderContent", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[ReactElement]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[ReactElement]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
