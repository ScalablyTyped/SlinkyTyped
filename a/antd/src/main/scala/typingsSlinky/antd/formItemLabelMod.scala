package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.FormItemLabelPropsrequire
import typingsSlinky.antd.anon.Icon
import typingsSlinky.antd.formFormMod.RequiredMark
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import typingsSlinky.antd.tooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formItemLabelMod extends Shortcut {
  
  @JSImport("antd/lib/form/FormItemLabel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormItemLabelPropsrequire] = js.native
  
  @js.native
  trait FormItemLabelProps extends StObject {
    
    var colon: js.UndefOr[Boolean] = js.native
    
    var htmlFor: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.native
    
    var labelCol: js.UndefOr[ColProps] = js.native
    
    var requiredMark: js.UndefOr[RequiredMark] = js.native
    
    var tooltip: js.UndefOr[LabelTooltipType] = js.native
  }
  object FormItemLabelProps {
    
    @scala.inline
    def apply(): FormItemLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemLabelProps]
    }
    
    @scala.inline
    implicit class FormItemLabelPropsMutableBuilder[Self <: FormItemLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
      
      @scala.inline
      def setTooltip(value: LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipReactElement(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type LabelTooltipType = WrapperTooltipProps | ReactElement
  
  type WrapperTooltipProps = TooltipProps with Icon
  
  type _To = ReactComponentClass[FormItemLabelPropsrequire]
  
  /* This means you don't have to write `default`, but can instead just say `formItemLabelMod.foo` */
  override def _to: ReactComponentClass[FormItemLabelPropsrequire] = default
}
