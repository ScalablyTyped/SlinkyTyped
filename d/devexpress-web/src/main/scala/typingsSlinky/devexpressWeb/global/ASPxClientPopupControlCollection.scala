package typingsSlinky.devexpressWeb.global

import typingsSlinky.devexpressWeb.ASPxClientControlAction
import typingsSlinky.devexpressWeb.ASPxClientControlPredicate
import typingsSlinky.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typingsSlinky.devexpressWeb.ASPxClientEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalBeginCallbackEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalCallbackErrorEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalEndCallbackEventHandler
import typingsSlinky.devexpressWeb.ASPxClientValidationCompletedEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client collection that maintains client popup control objects.
  */
@JSGlobal("ASPxClientPopupControlCollection")
@js.native
class ASPxClientPopupControlCollection ()
  extends typingsSlinky.devexpressWeb.ASPxClientPopupControlCollection {
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  /* CompleteClass */
  override var BeginCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalBeginCallbackEventHandler[typingsSlinky.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  /**
    * Occurs when the browser window is being resized.
    */
  /* CompleteClass */
  override var BrowserWindowResized: typingsSlinky.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsSlinky.devexpressWeb.ASPxClientControlCollection]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any DevExpress web control.
    */
  /* CompleteClass */
  override var CallbackError: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typingsSlinky.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  /* CompleteClass */
  override var ControlsInitialized: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typingsSlinky.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typingsSlinky.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  /**
    * Occurs after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  /* CompleteClass */
  override var ValidationCompleted: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientValidationCompletedEventHandler[typingsSlinky.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  /**
    * Performs the specified action for each control in the collection.
    * @param action An ASPxClientControlAction object specifying an action to perform.
    */
  /* CompleteClass */
  override def ForEachControl(action: ASPxClientControlAction): Unit = js.native
  /** @deprecated Use the GetByName method instead. */
  /**
    * Returns a collection item identified by its unique hierarchically-qualified identifier. An object representing the collection item found.
    * @param name A string value representing the hierarchically-qualified identifier of the required control.
    */
  /* CompleteClass */
  override def Get(name: js.Any): js.Any = js.native
  /**
    * Returns a DevExpress client control object identified by its unique hierarchically-qualified identifier (either ClientInstanceName or ClientID property value). An object that is the client control object found.
    * @param name A string value that is the hierarchically-qualified identifier of the required DevExpress control.
    */
  /* CompleteClass */
  override def GetByName(name: String): js.Any = js.native
  /**
    * Returns all controls in the collection that satisfy the specified predicate. An array of all client controls found.
    * @param predicate An ASPxClientControlPredicate object that is a predicate used to search for controls in the collection.
    */
  /* CompleteClass */
  override def GetControlsByPredicate(predicate: ASPxClientControlPredicate): js.Array[_] = js.native
  /**
    * Returns all controls of the specified type. An array of all client controls found.
    * @param type The object specifying the client control type.
    */
  /* CompleteClass */
  override def GetControlsByType(`type`: js.Any): js.Array[_] = js.native
  /**
    * Hides all popup windows maintained by the collection.
    */
  /* CompleteClass */
  override def HideAllWindows(): Unit = js.native
}

