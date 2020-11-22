package typingsSlinky.baseui.tableSemanticMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps extends js.Object {
  
  var columns: js.Array[ReactElement] = js.native
  
  var data: js.Array[js.Array[ReactElement]] = js.native
  
  var emptyMessage: js.UndefOr[ReactElement | js.Function0[ReactElement]] = js.native
  
  var horizontalScrollWidth: js.UndefOr[String] = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
  
  var loadingMessage: js.UndefOr[ReactElement | js.Function0[ReactElement]] = js.native
  
  var overrides: js.UndefOr[TableOverrides] = js.native
}
object TableProps {
  
  @scala.inline
  def apply(columns: js.Array[ReactElement], data: js.Array[js.Array[ReactElement]]): TableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: ReactElement*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ReactElement]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Array[ReactElement]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Array[ReactElement]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyMessageReactElement(value: ReactElement): Self = this.set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyMessageFunction0(value: () => ReactElement): Self = this.set("emptyMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmptyMessage(value: ReactElement | js.Function0[ReactElement]): Self = this.set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyMessage: Self = this.set("emptyMessage", js.undefined)
    
    @scala.inline
    def setHorizontalScrollWidth(value: String): Self = this.set("horizontalScrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalScrollWidth: Self = this.set("horizontalScrollWidth", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setLoadingMessageReactElement(value: ReactElement): Self = this.set("loadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingMessageFunction0(value: () => ReactElement): Self = this.set("loadingMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadingMessage(value: ReactElement | js.Function0[ReactElement]): Self = this.set("loadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingMessage: Self = this.set("loadingMessage", js.undefined)
    
    @scala.inline
    def setOverrides(value: TableOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
