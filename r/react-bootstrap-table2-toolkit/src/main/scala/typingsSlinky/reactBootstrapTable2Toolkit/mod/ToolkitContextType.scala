package typingsSlinky.reactBootstrapTable2Toolkit.mod

import typingsSlinky.reactBootstrapTable2Toolkit.anon.Bootstrap4
import typingsSlinky.reactBootstrapTable2Toolkit.anon.Columns
import typingsSlinky.reactBootstrapTable2Toolkit.anon.OnExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolkitContextType extends js.Object {
  var baseProps: Bootstrap4 = js.native
  var columnToggleProps: Columns = js.native
  var csvProps: OnExport = js.native
  var searchProps: InjectedSearchProps = js.native
}

object ToolkitContextType {
  @scala.inline
  def apply(
    baseProps: Bootstrap4,
    columnToggleProps: Columns,
    csvProps: OnExport,
    searchProps: InjectedSearchProps
  ): ToolkitContextType = {
    val __obj = js.Dynamic.literal(baseProps = baseProps.asInstanceOf[js.Any], columnToggleProps = columnToggleProps.asInstanceOf[js.Any], csvProps = csvProps.asInstanceOf[js.Any], searchProps = searchProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolkitContextType]
  }
  @scala.inline
  implicit class ToolkitContextTypeOps[Self <: ToolkitContextType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseProps(value: Bootstrap4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnToggleProps(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnToggleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsvProps(value: OnExport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchProps(value: InjectedSearchProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

