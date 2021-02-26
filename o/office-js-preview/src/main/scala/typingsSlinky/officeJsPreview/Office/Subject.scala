package typingsSlinky.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to get and set the subject of an appointment or message in an Outlook add-in.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait Subject extends StObject {
  
  /**
    * Gets the subject of an appointment or message.
    *
    * The `getAsync` method starts an asynchronous call to the Exchange server to get the subject of an appointment or message.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. The `value` property of the result is the subject of the item.
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Gets the subject of an appointment or message.
    *
    * The `getAsync` method starts an asynchronous call to the Exchange server to get the subject of an appointment or message.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. The `value` property of the result is the subject of the item.
    */
  def getAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Sets the subject of an appointment or message.
    *
    * The `setAsync` method starts an asynchronous call to the Exchange server to set the subject of an appointment or message.
    * Setting the subject overwrites the current subject, but leaves any prefixes, such as "Fwd:" or "Re:" in place.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `DataExceedsMaximumSize`: The subject parameter is longer than 255 characters.
    *
    * @param subject - The subject of the appointment or message. The string is limited to 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. If setting the subject fails, the `asyncResult.error` property will contain an error code.
    */
  def setAsync(subject: String): Unit = js.native
  def setAsync(
    subject: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setAsync(subject: String, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    subject: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
