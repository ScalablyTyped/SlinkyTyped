package typingsSlinky.azureSb.apnsserviceMod

import typingsSlinky.azureSb.anon.Headers
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApnsService extends js.Object {
  
  def createNativeRegistration(token: String, tags: String, callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(token: String, tags: String, options: js.Object, callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(token: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(token: String, tags: js.Array[String], options: js.Object, callback: ResponseCallback): Unit = js.native
  
  def createOrUpdateNativeRegistration(registrationId: String, token: String, tags: String, callback: ResponseCallback): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    token: String,
    tags: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateNativeRegistration(registrationId: String, token: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    token: String,
    tags: js.Array[String],
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  
  def createTemplateRegistration(token: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(token: String, tags: String, template: String, options: js.Object, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(token: String, tags: String, template: Template, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(token: String, tags: String, template: Template, options: js.Object, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(token: String, tags: js.Array[String], template: String, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(
    token: String,
    tags: js.Array[String],
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createTemplateRegistration(token: String, tags: js.Array[String], template: Template, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(
    token: String,
    tags: js.Array[String],
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  
  def listRegistrationsByToken(token: String, callback: ResponseCallback): Unit = js.native
  def listRegistrationsByToken(token: String, options: ListNotificationHubsOptions, callback: ResponseCallback): Unit = js.native
  
  var notificationHubService: typingsSlinky.azureSb.notificationhubserviceMod.^ = js.native
  
  def send(tags: String, payload: String, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: String, options: Headers, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: js.Object, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: js.Object, options: Headers, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: String, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: String, options: Headers, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: js.Object, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: js.Object, options: Headers, callback: ResponseCallback): Unit = js.native
  
  def updateTemplateRegistration(registrationId: String, token: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: String,
    template: String,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: String,
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: String,
    template: Template,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: js.Array[String],
    template: String,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: js.Array[String],
    template: String,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: js.Array[String],
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: js.Array[String],
    template: Template,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
}
