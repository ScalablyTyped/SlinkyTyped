package typingsSlinky.rcTable.expandedRowMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent
  var children: ReactElement
  var className: String
  var colSpan: Double
  var component: CustomizeComponent
  var componentWidth: Double
  var expanded: Boolean
  var fixColumn: Boolean
  var fixHeader: Boolean
  var horizonScroll: Boolean
  var prefixCls: String
}

object ExpandedRowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    className: String,
    colSpan: Double,
    component: CustomizeComponent,
    componentWidth: Double,
    expanded: Boolean,
    fixColumn: Boolean,
    fixHeader: Boolean,
    horizonScroll: Boolean,
    prefixCls: String
  ): ExpandedRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedRowProps[RecordType]]
  }
  @scala.inline
  implicit class ExpandedRowPropsOps[Self <: ExpandedRowProps[_], RecordType] (val x: Self with ExpandedRowProps[RecordType]) extends AnyVal {
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
    def setCellComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellComponentComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellComponent(value: CustomizeComponent): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: CustomizeComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentWidth(value: Double): Self = this.set("componentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixColumn(value: Boolean): Self = this.set("fixColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixHeader(value: Boolean): Self = this.set("fixHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizonScroll(value: Boolean): Self = this.set("horizonScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

