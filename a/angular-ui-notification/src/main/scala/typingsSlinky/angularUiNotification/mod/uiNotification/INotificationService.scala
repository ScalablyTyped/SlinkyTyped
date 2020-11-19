package typingsSlinky.angularUiNotification.mod.uiNotification

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotificationService extends js.Object {
  
  def apply(message: Message): IPromise[INotificationScope] = js.native
  def apply(message: Message, `type`: MessageType): IPromise[INotificationScope] = js.native
  
  def clearAll(): Unit = js.native
  
  def error(message: Message): IPromise[INotificationScope] = js.native
  
  def info(message: Message): IPromise[INotificationScope] = js.native
  
  def primary(message: Message): IPromise[INotificationScope] = js.native
  
  def success(message: Message): IPromise[INotificationScope] = js.native
  
  def warning(message: Message): IPromise[INotificationScope] = js.native
}
