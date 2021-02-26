package typingsSlinky.rcTable

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandedRowMod {
  
  @JSImport("rc-table/lib/Body/ExpandedRow", JSImport.Default)
  @js.native
  def default(
    hasPrefixClsChildrenComponentCellComponentFixHeaderFixColumnHorizonScrollClassNameExpandedComponentWidthColSpan: ExpandedRowProps
  ): ReactElement = js.native
  
  @js.native
  trait ExpandedRowProps extends StObject {
    
    var cellComponent: CustomizeComponent = js.native
    
    var children: ReactElement = js.native
    
    var className: String = js.native
    
    var colSpan: Double = js.native
    
    var component: CustomizeComponent = js.native
    
    var componentWidth: Double = js.native
    
    var expanded: Boolean = js.native
    
    var fixColumn: Boolean = js.native
    
    var fixHeader: Boolean = js.native
    
    var horizonScroll: Boolean = js.native
    
    var prefixCls: String = js.native
  }
  object ExpandedRowProps {
    
    @scala.inline
    def apply(
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
    ): ExpandedRowProps = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandedRowProps]
    }
    
    @scala.inline
    implicit class ExpandedRowPropsMutableBuilder[Self <: ExpandedRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellComponentComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentWidth(value: Double): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixColumn(value: Boolean): Self = StObject.set(x, "fixColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizonScroll(value: Boolean): Self = StObject.set(x, "horizonScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
