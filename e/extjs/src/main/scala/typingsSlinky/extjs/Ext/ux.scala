package typingsSlinky.extjs.Ext

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.form.field.ITrigger
import typingsSlinky.extjs.Ext.grid.column.IColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ux {
  
  @js.native
  trait ICheckColumn extends IColumn {
    
    /** [Method] Disables this CheckColumn
      * @param silent Boolean
      */
    @JSName("onDisable")
    var onDisable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Enables this CheckColumn
      * @param silent Boolean
      */
    @JSName("onEnable")
    var onEnable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var stopSelection: js.UndefOr[Boolean] = js.native
  }
  object ICheckColumn {
    
    @scala.inline
    def apply(): ICheckColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckColumn]
    }
    
    @scala.inline
    implicit class ICheckColumnMutableBuilder[Self <: ICheckColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDisable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onDisable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDisableUndefined: Self = StObject.set(x, "onDisable", js.undefined)
      
      @scala.inline
      def setOnEnable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onEnable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnableUndefined: Self = StObject.set(x, "onEnable", js.undefined)
      
      @scala.inline
      def setStopSelection(value: Boolean): Self = StObject.set(x, "stopSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopSelectionUndefined: Self = StObject.set(x, "stopSelection", js.undefined)
    }
  }
  
  object form {
    
    @js.native
    trait IFileUploadField extends ITrigger {
      
      /** [Property] (Ext.button.Button) */
      var button: js.UndefOr[typingsSlinky.extjs.Ext.button.IButton] = js.native
      
      /** [Config Option] (Object) */
      var buttonConfig: js.UndefOr[js.Any] = js.native
      
      /** [Config Option] (Number) */
      var buttonMargin: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Boolean) */
      var buttonOnly: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (String) */
      var buttonText: js.UndefOr[java.lang.String] = js.native
      
      /** [Config Option] (Boolean) */
      var clearOnSubmit: js.UndefOr[Boolean] = js.native
      
      /** [Method] Only relevant if the instance s isFileUpload method returns true
        * @returns HTMLElement
        */
      @JSName("extractFileInput")
      var extractFileInput_IFileUploadField: js.UndefOr[js.Function0[HTMLElement]] = js.native
      
      /** [Property] (Ext.Element) */
      var fileInputEl: js.UndefOr[IElement] = js.native
      
      /** [Method] Gets the markup to be inserted into the subTplMarkup  */
      var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
        * @returns Boolean
        */
      @JSName("isFileUpload")
      var isFileUpload_IFileUploadField: js.UndefOr[js.Function0[Boolean]] = js.native
      
      /** [Method] Allows addition of behavior to the show operation  */
      @JSName("onShow")
      var onShow_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** [Method] Overridden to do nothing */
      @JSName("setValue")
      var setValue_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.native
    }
    object IFileUploadField {
      
      @scala.inline
      def apply(): IFileUploadField = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFileUploadField]
      }
      
      @scala.inline
      implicit class IFileUploadFieldMutableBuilder[Self <: IFileUploadField] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButton(value: typingsSlinky.extjs.Ext.button.IButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonConfig(value: js.Any): Self = StObject.set(x, "buttonConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonConfigUndefined: Self = StObject.set(x, "buttonConfig", js.undefined)
        
        @scala.inline
        def setButtonMargin(value: Double): Self = StObject.set(x, "buttonMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonMarginUndefined: Self = StObject.set(x, "buttonMargin", js.undefined)
        
        @scala.inline
        def setButtonOnly(value: Boolean): Self = StObject.set(x, "buttonOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonOnlyUndefined: Self = StObject.set(x, "buttonOnly", js.undefined)
        
        @scala.inline
        def setButtonText(value: java.lang.String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
        
        @scala.inline
        def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
        
        @scala.inline
        def setClearOnSubmit(value: Boolean): Self = StObject.set(x, "clearOnSubmit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearOnSubmitUndefined: Self = StObject.set(x, "clearOnSubmit", js.undefined)
        
        @scala.inline
        def setExtractFileInput(value: () => HTMLElement): Self = StObject.set(x, "extractFileInput", js.Any.fromFunction0(value))
        
        @scala.inline
        def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
        
        @scala.inline
        def setFileInputEl(value: IElement): Self = StObject.set(x, "fileInputEl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileInputElUndefined: Self = StObject.set(x, "fileInputEl", js.undefined)
        
        @scala.inline
        def setGetTriggerMarkup(value: () => Unit): Self = StObject.set(x, "getTriggerMarkup", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetTriggerMarkupUndefined: Self = StObject.set(x, "getTriggerMarkup", js.undefined)
        
        @scala.inline
        def setIsFileUpload(value: () => Boolean): Self = StObject.set(x, "isFileUpload", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
        
        @scala.inline
        def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
        
        @scala.inline
        def setSetValue(value: () => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      }
    }
  }
}
