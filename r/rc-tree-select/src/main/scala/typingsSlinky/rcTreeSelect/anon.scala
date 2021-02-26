package typingsSlinky.rcTreeSelect

import slinky.core.facade.ReactElement
import typingsSlinky.rcSelect.generatorMod.FilterFunc
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.LegacyDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.SimpleModeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FilterOption extends StObject {
    
    var filterOption: Boolean | FilterFunc[LegacyDataNode] = js.native
    
    var optionFilterProp: String = js.native
  }
  object FilterOption {
    
    @scala.inline
    def apply(filterOption: Boolean | FilterFunc[LegacyDataNode], optionFilterProp: String): FilterOption = {
      val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOption]
    }
    
    @scala.inline
    implicit class FilterOptionMutableBuilder[Self <: FilterOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterOption(value: Boolean | FilterFunc[LegacyDataNode]): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[LegacyDataNode]) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetLabelProp extends StObject {
    
    def getLabelProp(node: DataNode): ReactElement = js.native
    
    var simpleMode: Boolean | SimpleModeConfig = js.native
  }
  object GetLabelProp {
    
    @scala.inline
    def apply(getLabelProp: DataNode => ReactElement, simpleMode: Boolean | SimpleModeConfig): GetLabelProp = {
      val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLabelProp]
    }
    
    @scala.inline
    implicit class GetLabelPropMutableBuilder[Self <: GetLabelProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLabelProp(value: DataNode => ReactElement): Self = StObject.set(x, "getLabelProp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSimpleMode(value: Boolean | SimpleModeConfig): Self = StObject.set(x, "simpleMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Selected extends StObject {
    
    var selected: Boolean = js.native
  }
  object Selected {
    
    @scala.inline
    def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    @scala.inline
    implicit class SelectedMutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
