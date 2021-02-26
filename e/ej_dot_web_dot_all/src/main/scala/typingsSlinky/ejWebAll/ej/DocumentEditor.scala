package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentEditor extends Widget_ {
  
  var defaults: Model = js.native
  
  /** Finds the first occurrence of specified text from current selection and  highlights the result. If the document end is reached, find operation will occur from the document start
    * position.
    * @param {string} Specifies the text to search in a document.
    * @returns {void}
    */
  def find(text: String): Unit = js.native
  
  /** Gets the page number of current selection in the document.
    * @returns {number}
    */
  def getCurrentPageNumber(): Double = js.native
  
  /** Gets the total number of pages in the document.
    * @returns {number}
    */
  def getPageCount(): Double = js.native
  
  /** Gets the text of current selection in the document.
    * @returns {string}
    */
  def getSelectedText(): String = js.native
  
  /** Gets the current zoom factor value of the document editor.
    * @returns {number}
    */
  def getZoomFactor(): Double = js.native
  
  /** Loads the document from specified path using web API provided by importUrl.
    * @param {string} Specifies the file path.
    * @returns {void}
    */
  def load(path: String): Unit = js.native
  
  @JSName("model")
  var model_DocumentEditor: Model = js.native
  
  /** Prints the document content as page by page.
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Scales the document editor with the specified zoom factor. The range of zoom factor should be 0.10 to 5.00 (10 - 500 %).
    * @param {number} Specifies the factor for zooming.
    * @returns {void}
    */
  def setZoomFactor(factor: Double): Unit = js.native
}
object DocumentEditor {
  
  @js.native
  trait ImportExportSettings extends StObject {
    
    /** Gets or sets URL of Web API that should be used to parse the document while loading.
      */
    var importUrl: js.UndefOr[String] = js.native
  }
  object ImportExportSettings {
    
    @scala.inline
    def apply(): ImportExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportExportSettings]
    }
    
    @scala.inline
    implicit class ImportExportSettingsMutableBuilder[Self <: ImportExportSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportUrl(value: String): Self = StObject.set(x, "importUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportUrlUndefined: Self = StObject.set(x, "importUrl", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Gets or sets an object that indicates initialization of importing and exporting documents in document editor.
      */
    var importExportSettings: js.UndefOr[ImportExportSettings] = js.native
    
    /** Triggers when the document changes.
      */
    var onDocumentChange: js.UndefOr[js.Function1[/* e */ OnDocumentChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the hyperlink is clicked.
      */
    var onRequestNavigate: js.UndefOr[js.Function1[/* e */ OnRequestNavigateEventArgs, Unit]] = js.native
    
    /** Triggers when the selection changes.
      */
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ OnSelectionChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the zoom factor changes.
      */
    var onZoomFactorChange: js.UndefOr[js.Function1[/* e */ OnZoomFactorChangeEventArgs, Unit]] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.DocumentEditor.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.DocumentEditor.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.DocumentEditor.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportExportSettings(value: ImportExportSettings): Self = StObject.set(x, "importExportSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportExportSettingsUndefined: Self = StObject.set(x, "importExportSettings", js.undefined)
      
      @scala.inline
      def setOnDocumentChange(value: /* e */ OnDocumentChangeEventArgs => Unit): Self = StObject.set(x, "onDocumentChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDocumentChangeUndefined: Self = StObject.set(x, "onDocumentChange", js.undefined)
      
      @scala.inline
      def setOnRequestNavigate(value: /* e */ OnRequestNavigateEventArgs => Unit): Self = StObject.set(x, "onRequestNavigate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRequestNavigateUndefined: Self = StObject.set(x, "onRequestNavigate", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: /* e */ OnSelectionChangeEventArgs => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnZoomFactorChange(value: /* e */ OnZoomFactorChangeEventArgs => Unit): Self = StObject.set(x, "onZoomFactorChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnZoomFactorChangeUndefined: Self = StObject.set(x, "onZoomFactorChange", js.undefined)
    }
  }
  
  @js.native
  trait OnDocumentChangeEventArgs extends StObject {
    
    /** True, if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the document editor model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OnDocumentChangeEventArgs {
    
    @scala.inline
    def apply(): OnDocumentChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnDocumentChangeEventArgs]
    }
    
    @scala.inline
    implicit class OnDocumentChangeEventArgsMutableBuilder[Self <: OnDocumentChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait OnRequestNavigateEventArgs extends StObject {
    
    /** true, if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the link type and navigation link.
      */
    var hyperlink: js.UndefOr[js.Any] = js.native
    
    /** Returns the document editor model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OnRequestNavigateEventArgs {
    
    @scala.inline
    def apply(): OnRequestNavigateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnRequestNavigateEventArgs]
    }
    
    @scala.inline
    implicit class OnRequestNavigateEventArgsMutableBuilder[Self <: OnRequestNavigateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setHyperlink(value: js.Any): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait OnSelectionChangeEventArgs extends StObject {
    
    /** True, if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the document editor model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OnSelectionChangeEventArgs {
    
    @scala.inline
    def apply(): OnSelectionChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnSelectionChangeEventArgs]
    }
    
    @scala.inline
    implicit class OnSelectionChangeEventArgsMutableBuilder[Self <: OnSelectionChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait OnZoomFactorChangeEventArgs extends StObject {
    
    /** True, if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the document editor model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OnZoomFactorChangeEventArgs {
    
    @scala.inline
    def apply(): OnZoomFactorChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnZoomFactorChangeEventArgs]
    }
    
    @scala.inline
    implicit class OnZoomFactorChangeEventArgsMutableBuilder[Self <: OnZoomFactorChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
