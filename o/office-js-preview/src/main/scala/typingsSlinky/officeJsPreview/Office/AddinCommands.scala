package typingsSlinky.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddinCommands {
  
  /**
    * The `Event` object is passed as a parameter to add-in functions invoked by UI-less command buttons. The object allows the add-in to identify
    * which button was clicked and to signal the host that it has completed its processing.
    *
    * @remarks
    *
    * See {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/add-in-commands-requirement-sets | Add-in commands requirement sets} for more support information.
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level (Outlook)}**: Restricted
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @js.native
  trait Event extends StObject {
    
    /**
      * Indicates that the add-in has completed processing and will automatically be closed.
      *
      * This method must be called at the end of a function which was invoked by the following.
      *
      * - A UI-less button (i.e., an add-in command defined with an `Action` element where the `xsi:type` attribute is set to `ExecuteFunction`)
      *
      * - An {@link https://docs.microsoft.com/office/dev/add-ins/reference/manifest/event | event} defined in the
      * {@link https://docs.microsoft.com/office/dev/add-ins/reference/manifest/extensionpoint#events | Events extension point},
      * e.g., an `ItemSend` event
      *
      * [Api set: Mailbox 1.3]
      *
      * @remarks
      *
      * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
      *
      * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
      *
      * **Note**: The `options` parameter was introduced in Mailbox 1.8.
      *
      * @param options Optional. An object that specifies behavior options for when the event is completed.
      */
    def completed(): Unit = js.native
    def completed(options: EventCompletedOptions): Unit = js.native
    
    /**
      * Information about the control that triggered calling this function.
      *
      * @remarks
      *
      * This property is supported in Outlook only in {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/outlook-api-requirement-sets | requirement set} Mailbox 1.3 and later.
      */
    var source: Source = js.native
  }
  
  /**
    * Specifies the behavior for when the event is completed.
    */
  @js.native
  trait EventCompletedOptions extends StObject {
    
    /**
      * A boolean value. When the completed method is used to signal completion of an event handler,
      * this value indicates of the handled event should continue execution or be canceled.
      * For example, an add-in that handles the `ItemSend` event can set `allowEvent` to `false` to cancel sending of the message.
      */
    var allowEvent: Boolean = js.native
  }
  object EventCompletedOptions {
    
    @scala.inline
    def apply(allowEvent: Boolean): EventCompletedOptions = {
      val __obj = js.Dynamic.literal(allowEvent = allowEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventCompletedOptions]
    }
    
    @scala.inline
    implicit class EventCompletedOptionsMutableBuilder[Self <: EventCompletedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEvent(value: Boolean): Self = StObject.set(x, "allowEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Encapsulates source data for add-in events.
    */
  @js.native
  trait Source extends StObject {
    
    /**
      * The ID of the control that triggered calling this function. The ID comes from the manifest and is the unique ID of your Office Add-in
      * as a GUID.
      */
    var id: String = js.native
  }
  object Source {
    
    @scala.inline
    def apply(id: String): Source = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
