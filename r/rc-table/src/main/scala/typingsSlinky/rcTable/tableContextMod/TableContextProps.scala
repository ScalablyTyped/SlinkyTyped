package typingsSlinky.rcTable.tableContextMod

import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.GetComponent
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableContextProps extends js.Object {
  var direction: ltr | rtl = js.native
  var getComponent: GetComponent = js.native
  var prefixCls: String = js.native
  var scrollbarSize: Double = js.native
}

object TableContextProps {
  @scala.inline
  def apply(
    direction: ltr | rtl,
    getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent,
    prefixCls: String,
    scrollbarSize: Double
  ): TableContextProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], getComponent = js.Any.fromFunction2(getComponent), prefixCls = prefixCls.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableContextProps]
  }
  @scala.inline
  implicit class TableContextPropsOps[Self <: TableContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComponent(
      value: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

