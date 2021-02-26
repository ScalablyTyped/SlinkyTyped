package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accordion extends Widget_ {
  
  /** AddItem method is used to add the panel in dynamically. It receives the following parameters
    * @param {string} specify the name of the header
    * @param {string} content of the new panel
    * @param {number} insertion place of the new panel
    * @param {boolean} Enable or disable the AJAX request to the added panel
    * @returns {void}
    */
  def addItem(header_name: String, content: String, index: Double, isAjaxReq: Boolean): Unit = js.native
  
  /** This method used to collapse the all the expanded items in accordion at a time.
    * @returns {void}
    */
  def collapseAll(): Unit = js.native
  
  /** This method used to Collapses the specified items in accordion at a time.
    * @returns {void}
    */
  def collapsePanel(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Disables the accordion widget includes all the headers and content panels.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disable the accordion widget item based on specified header index.
    * @param {any[]} index values to disable the panels
    * @returns {void}
    */
  def disableItems(index: js.Array[_]): Unit = js.native
  
  /** Enable the accordion widget includes all the headers and content panels.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enable the accordion widget item based on specified header index.
    * @param {any[]} index values to enable the panels
    * @returns {void}
    */
  def enableItems(index: js.Array[_]): Unit = js.native
  
  /** To expand all the accordion widget items.
    * @returns {void}
    */
  def expandAll(): Unit = js.native
  
  /** This method used to Expand the specified items in accordion at a time.
    * @returns {void}
    */
  def expandPanel(): Unit = js.native
  
  /** Returns the total number of panels in the control.
    * @returns {number}
    */
  def getItemsCount(): Double = js.native
  
  /** Hides the visible Accordion control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_Accordion: Model = js.native
  
  /** The refresh method is used to adjust the control size based on the parent element dimension.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** RemoveItem method is used to remove the specified index panel.It receives the parameter as number.
    * @param {number} specify the index value for remove the accordion panel.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
  
  /** Shows the hidden Accordion control.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object Accordion {
  
  @js.native
  sealed trait HeightAdjustMode extends StObject
  @JSGlobal("ej.Accordion.HeightAdjustMode")
  @js.native
  object HeightAdjustMode extends StObject {
    
    ///Height set to the largest content in the panel
    @js.native
    sealed trait Auto extends HeightAdjustMode
    
    ///Height fit to the content in the panel
    @js.native
    sealed trait Content extends HeightAdjustMode
    
    ///Height filled to the content of the panel
    @js.native
    sealed trait Fill extends HeightAdjustMode
  }
  
  @js.native
  trait ActivateEventArgs extends StObject {
    
    /** returns current active header
      */
    var activeHeader: js.UndefOr[js.Any] = js.native
    
    /** returns active index
      */
    var activeIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns true when the Accordion index activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ActivateEventArgs {
    
    @scala.inline
    def apply(): ActivateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivateEventArgs]
    }
    
    @scala.inline
    implicit class ActivateEventArgsMutableBuilder[Self <: ActivateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveHeader(value: js.Any): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** returns current AJAX content location
      */
    var URL: js.UndefOr[String] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxBeforeLoadEventArgs {
    
    @scala.inline
    def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    @scala.inline
    implicit class AjaxBeforeLoadEventArgsMutableBuilder[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait AjaxErrorEventArgs extends StObject {
    
    /** returns current AJAX content location
      */
    var URL: js.UndefOr[String] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the failed data sent.
      */
    var data: js.UndefOr[String] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxErrorEventArgs {
    
    @scala.inline
    def apply(): AjaxErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxErrorEventArgs]
    }
    
    @scala.inline
    implicit class AjaxErrorEventArgsMutableBuilder[Self <: AjaxErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait AjaxLoadEventArgs extends StObject {
    
    /** returns the name of the URL
      */
    var URL: js.UndefOr[String] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxLoadEventArgs {
    
    @scala.inline
    def apply(): AjaxLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxLoadEventArgs]
    }
    
    @scala.inline
    implicit class AjaxLoadEventArgsMutableBuilder[Self <: AjaxLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait AjaxSettings extends StObject {
    
    /** It specifies, whether to enable or disable asynchronous request.
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** It specifies the page will be cached in the web browser.
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /** It specifies the type of data is send in the query string.
      */
    var contentType: js.UndefOr[String] = js.native
    
    /** It specifies the data as an object, will be passed in the query string.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** It specifies the type of data that you're expecting back from the response.
      */
    var dataType: js.UndefOr[String] = js.native
    
    /** It specifies the HTTP request type.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxSettings {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.Accordion.AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.Accordion.AjaxSettings]
    }
    
    @scala.inline
    implicit class AjaxSettingsMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.Accordion.AjaxSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AjaxSuccessEventArgs extends StObject {
    
    /** returns current AJAX content location
      */
    var URL: js.UndefOr[String] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the AJAX content.
      */
    var content: js.UndefOr[String] = js.native
    
    /** returns the successful data sent.
      */
    var data: js.UndefOr[String] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxSuccessEventArgs {
    
    @scala.inline
    def apply(): AjaxSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSuccessEventArgs]
    }
    
    @scala.inline
    implicit class AjaxSuccessEventArgsMutableBuilder[Self <: AjaxSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait BeforeActivateEventArgs extends StObject {
    
    /** returns active index
      */
    var activeIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns true when the Accordion index activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeActivateEventArgs {
    
    @scala.inline
    def apply(): BeforeActivateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeActivateEventArgs]
    }
    
    @scala.inline
    implicit class BeforeActivateEventArgsMutableBuilder[Self <: BeforeActivateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeInactivateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns active index
      */
    var inActiveIndex: js.UndefOr[Double] = js.native
    
    /** returns true when the Accordion index activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeInactivateEventArgs {
    
    @scala.inline
    def apply(): BeforeInactivateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeInactivateEventArgs]
    }
    
    @scala.inline
    implicit class BeforeInactivateEventArgsMutableBuilder[Self <: BeforeInactivateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setInActiveIndex(value: Double): Self = StObject.set(x, "inActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInActiveIndexUndefined: Self = StObject.set(x, "inActiveIndex", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CustomIcon extends StObject {
    
    /** This class name set to collapsing header.
      */
    var header: js.UndefOr[String] = js.native
    
    /** This class name set to expanded (active) header.
      */
    var selectedHeader: js.UndefOr[String] = js.native
  }
  object CustomIcon {
    
    @scala.inline
    def apply(): CustomIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomIcon]
    }
    
    @scala.inline
    implicit class CustomIconMutableBuilder[Self <: CustomIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setSelectedHeader(value: String): Self = StObject.set(x, "selectedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedHeaderUndefined: Self = StObject.set(x, "selectedHeader", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait InActivateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns in active element
      */
    var inActiveHeader: js.UndefOr[js.Any] = js.native
    
    /** returns active index
      */
    var inActiveIndex: js.UndefOr[Double] = js.native
    
    /** returns true when the Accordion index activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the accordion model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object InActivateEventArgs {
    
    @scala.inline
    def apply(): InActivateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InActivateEventArgs]
    }
    
    @scala.inline
    implicit class InActivateEventArgsMutableBuilder[Self <: InActivateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setInActiveHeader(value: js.Any): Self = StObject.set(x, "inActiveHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInActiveHeaderUndefined: Self = StObject.set(x, "inActiveHeader", js.undefined)
      
      @scala.inline
      def setInActiveIndex(value: Double): Self = StObject.set(x, "inActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInActiveIndexUndefined: Self = StObject.set(x, "inActiveIndex", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggered after a Accordion item is active . Argument values are activeIndex, activeHeader, isInteraction and current model values.
      */
    var activate: js.UndefOr[js.Function1[/* e */ ActivateEventArgs, Unit]] = js.native
    
    /** Triggered before the AJAX content is loaded in a content panel. Arguments have location of the content (URL) and current model value.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
    
    /** Triggered after AJAX load failed action. Arguments have URL, error message, and current model value.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
    
    /** Triggered after the AJAX content loads. Arguments have current model values.
      */
    var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.native
    
    /** Specifies the ajaxSettings option to load the content to the accordion control.
      * @Default {null}
      */
    var ajaxSettings: js.UndefOr[typingsSlinky.ejWebAll.ej.Accordion.AjaxSettings] = js.native
    
    /** Triggered after AJAX success action. Arguments have URL, content, and current model values.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
    
    /** Accordion headers can be expanded and collapsed on keyboard action.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Triggered before a tab item is active. Arguments have active index and model values.
      */
    var beforeActivate: js.UndefOr[js.Function1[/* e */ BeforeActivateEventArgs, Unit]] = js.native
    
    /** Triggered before a Accordion item is inactive. Argument values are  inActiveIndex and  model values.
      */
    var beforeInactivate: js.UndefOr[js.Function1[/* e */ BeforeInactivateEventArgs, Unit]] = js.native
    
    /** To set the Accordion headers Collapse Speed.
      * @Default {300}
      */
    var collapseSpeed: js.UndefOr[Double] = js.native
    
    /** Specifies the collapsible state of accordion control.
      * @Default {false}
      */
    var collapsible: js.UndefOr[Boolean] = js.native
    
    /** Triggered after Accordion control creation.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Sets the root CSS class for Accordion theme, which is used customize.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Allows you to set the custom header Icon. It accepts two key values â€œheaderâ€, â€selectedHeaderâ€.
      * @Default {{ header: e-collapse, selectedHeader: e-expand }}
      */
    var customIcon: js.UndefOr[CustomIcon] = js.native
    
    /** Triggered after Accordion control destroy.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Disables the specified indexed items in accordion.
      * @Default {[]}
      */
    var disabledItems: js.UndefOr[js.Array[Double]] = js.native
    
    /** Specifies the animation behavior in accordion.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Multiple content panels to activate at a time.
      * @Default {false}
      */
    var enableMultipleOpen: js.UndefOr[Boolean] = js.native
    
    /** Save current model value to browser cookies for maintaining states. When refreshing the accordion control page, the model value is applied from browser cookies or HTML 5local
      * storage.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Display headers and panel text from right-to-left.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** With this enabled property, you can enable or disable the Accordion.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** Used to enable the disabled items in accordion.
      * @Default {[]}
      */
    var enabledItems: js.UndefOr[js.Array[Double]] = js.native
    
    /** The events API binds the action for activating the accordion header. Users can activate the header by using mouse actions such as mouse-over, mouse-up, mouse-down, and soon.
      * @Default {click}
      */
    var events: js.UndefOr[String] = js.native
    
    /** To set the Accordion headers Expand Speed.
      * @Default {300}
      */
    var expandSpeed: js.UndefOr[Double] = js.native
    
    /** Sets the height for Accordion items header.
      */
    var headerSize: js.UndefOr[Double | String] = js.native
    
    /** Specifies height of the accordion.
      * @Default {null}
      */
    var height: js.UndefOr[Double | String] = js.native
    
    /** Adjusts the content panel height based on the given option (content, auto, or fill). By default, the panel heights are adjusted based on the content.
      * @Default {content}
      */
    var heightAdjustMode: js.UndefOr[HeightAdjustMode | String] = js.native
    
    /** It allows to define the characteristics of the Accordion control. It will helps to extend the capability of an HTML element.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Triggered after a Accordion item is inactive. Argument values are  inActiveHeader, inActiveIndex ,isInteraction and current model values.
      */
    var inActivate: js.UndefOr[js.Function1[/* e */ InActivateEventArgs, Unit]] = js.native
    
    /** The given index header will activate (open). If collapsible is set to true, and a negative value is given, then all headers are collapsed. Otherwise, the first panel isactivated.
      * @Default {0}
      */
    var selectedItemIndex: js.UndefOr[Double] = js.native
    
    /** Activate the specified indexed items of the accordion
      * @Default {[0]}
      */
    var selectedItems: js.UndefOr[js.Array[Double]] = js.native
    
    /** Used to determines the close button visibility an each accordion items. This close button helps to remove the accordion item from the control.
      * @Default {false}
      */
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    /** Displays rounded corner borders on the Accordion control's panels and headers.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** Specifies width of the accordion.
      * @Default {null}
      */
    var width: js.UndefOr[Double | String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.Accordion.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.Accordion.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.Accordion.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: /* e */ ActivateEventArgs => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
      
      @scala.inline
      def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      @scala.inline
      def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      @scala.inline
      def setAjaxLoad(value: /* e */ AjaxLoadEventArgs => Unit): Self = StObject.set(x, "ajaxLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxLoadUndefined: Self = StObject.set(x, "ajaxLoad", js.undefined)
      
      @scala.inline
      def setAjaxSettings(value: typingsSlinky.ejWebAll.ej.Accordion.AjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      @scala.inline
      def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setBeforeActivate(value: /* e */ BeforeActivateEventArgs => Unit): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeActivateUndefined: Self = StObject.set(x, "beforeActivate", js.undefined)
      
      @scala.inline
      def setBeforeInactivate(value: /* e */ BeforeInactivateEventArgs => Unit): Self = StObject.set(x, "beforeInactivate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeInactivateUndefined: Self = StObject.set(x, "beforeInactivate", js.undefined)
      
      @scala.inline
      def setCollapseSpeed(value: Double): Self = StObject.set(x, "collapseSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseSpeedUndefined: Self = StObject.set(x, "collapseSpeed", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustomIcon(value: CustomIcon): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDisabledItems(value: js.Array[Double]): Self = StObject.set(x, "disabledItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemsUndefined: Self = StObject.set(x, "disabledItems", js.undefined)
      
      @scala.inline
      def setDisabledItemsVarargs(value: Double*): Self = StObject.set(x, "disabledItems", js.Array(value :_*))
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableMultipleOpen(value: Boolean): Self = StObject.set(x, "enableMultipleOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMultipleOpenUndefined: Self = StObject.set(x, "enableMultipleOpen", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledItems(value: js.Array[Double]): Self = StObject.set(x, "enabledItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledItemsUndefined: Self = StObject.set(x, "enabledItems", js.undefined)
      
      @scala.inline
      def setEnabledItemsVarargs(value: Double*): Self = StObject.set(x, "enabledItems", js.Array(value :_*))
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setExpandSpeed(value: Double): Self = StObject.set(x, "expandSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandSpeedUndefined: Self = StObject.set(x, "expandSpeed", js.undefined)
      
      @scala.inline
      def setHeaderSize(value: Double | String): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAdjustMode(value: HeightAdjustMode | String): Self = StObject.set(x, "heightAdjustMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAdjustModeUndefined: Self = StObject.set(x, "heightAdjustMode", js.undefined)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setInActivate(value: /* e */ InActivateEventArgs => Unit): Self = StObject.set(x, "inActivate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInActivateUndefined: Self = StObject.set(x, "inActivate", js.undefined)
      
      @scala.inline
      def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemIndexUndefined: Self = StObject.set(x, "selectedItemIndex", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Array[Double]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSelectedItemsVarargs(value: Double*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
