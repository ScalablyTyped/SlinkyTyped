package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Mark
import typingsSlinky.antd.formItemMod.ValidateStatus
import typingsSlinky.antd.gridColMod.ColProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formItemInputMod extends Shortcut {
  
  @JSImport("antd/lib/form/FormItemInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormItemInputProps with FormItemInputMiscProps] = js.native
  
  @js.native
  trait FormItemInputMiscProps extends StObject {
    
    /**
      * @private Internal usage, do not use in any of your production.
      */
    var _internalItemRender: js.UndefOr[Mark] = js.native
    
    var children: ReactElement = js.native
    
    var errors: js.Array[ReactElement] = js.native
    
    var hasFeedback: js.UndefOr[Boolean] = js.native
    
    def onDomErrorVisibleChange(visible: Boolean): Unit = js.native
    
    var prefixCls: String = js.native
    
    var validateStatus: js.UndefOr[ValidateStatus] = js.native
  }
  object FormItemInputMiscProps {
    
    @scala.inline
    def apply(errors: js.Array[ReactElement], onDomErrorVisibleChange: Boolean => Unit, prefixCls: String): FormItemInputMiscProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], onDomErrorVisibleChange = js.Any.fromFunction1(onDomErrorVisibleChange), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormItemInputMiscProps]
    }
    
    @scala.inline
    implicit class FormItemInputMiscPropsMutableBuilder[Self <: FormItemInputMiscProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      @scala.inline
      def setOnDomErrorVisibleChange(value: Boolean => Unit): Self = StObject.set(x, "onDomErrorVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateStatus(value: ValidateStatus): Self = StObject.set(x, "validateStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
      @scala.inline
      def set_internalItemRender(value: Mark): Self = StObject.set(x, "_internalItemRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_internalItemRenderUndefined: Self = StObject.set(x, "_internalItemRender", js.undefined)
    }
  }
  
  @js.native
  trait FormItemInputProps extends StObject {
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var help: js.UndefOr[ReactElement] = js.native
    
    var status: js.UndefOr[ValidateStatus] = js.native
    
    var wrapperCol: js.UndefOr[ColProps] = js.native
  }
  object FormItemInputProps {
    
    @scala.inline
    def apply(): FormItemInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemInputProps]
    }
    
    @scala.inline
    implicit class FormItemInputPropsMutableBuilder[Self <: FormItemInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setHelp(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpReactElement(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormItemInputProps with FormItemInputMiscProps]
  
  /* This means you don't have to write `default`, but can instead just say `formItemInputMod.foo` */
  override def _to: ReactComponentClass[FormItemInputProps with FormItemInputMiscProps] = default
}
