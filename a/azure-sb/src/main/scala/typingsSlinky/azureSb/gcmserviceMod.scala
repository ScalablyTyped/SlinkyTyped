package typingsSlinky.azureSb

import typingsSlinky.azureSb.anon.Headers
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcmserviceMod {
  
  @JSImport("azure-sb/lib/gcmservice", JSImport.Namespace)
  @js.native
  class ^ protected () extends GcmService {
    def this(notificationHubService: typingsSlinky.azureSb.notificationhubserviceMod.^) = this()
  }
  
  @js.native
  trait GcmService extends StObject {
    
    def createNativeRegistration(gcmRegistrationId: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(gcmRegistrationId: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(token: String, tags: String, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(token: String, tags: js.Array[String], options: js.Object, callback: ResponseCallback): Unit = js.native
    
    def createOrUpdateNativeRegistration(registrationId: String, gcmRegistrationId: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: js.Array[String],
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: js.Array[String],
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def createTemplateRegistration(gcmRegistrationId: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(
      gcmRegistrationId: String,
      tags: String,
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createTemplateRegistration(gcmRegistrationId: String, tags: String, template: Template, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(
      gcmRegistrationId: String,
      tags: String,
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createTemplateRegistration(gcmRegistrationId: String, tags: js.Array[String], template: String, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(
      gcmRegistrationId: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createTemplateRegistration(gcmRegistrationId: String, tags: js.Array[String], template: Template, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(
      gcmRegistrationId: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def listRegistrationsByGcmRegistrationId(gcmRegistrationId: String, callback: ResponseCallback): Unit = js.native
    def listRegistrationsByGcmRegistrationId(gcmRegistrationId: String, options: ListNotificationHubsOptions, callback: ResponseCallback): Unit = js.native
    
    var notificationHubService: typingsSlinky.azureSb.notificationhubserviceMod.^ = js.native
    
    def send(tags: String, payload: String, callback: ResponseCallback): Unit = js.native
    def send(tags: String, payload: js.Object, callback: ResponseCallback): Unit = js.native
    def send(tags: js.Array[String], payload: String, callback: ResponseCallback): Unit = js.native
    def send(tags: js.Array[String], payload: js.Object, callback: ResponseCallback): Unit = js.native
    
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: String,
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: String,
      template: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: String,
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: String,
      template: Template,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: js.Array[String],
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: js.Array[String],
      template: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: js.Array[String],
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      gcmRegistrationId: String,
      tags: js.Array[String],
      template: Template,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
  }
  
  /* Inlined std.Partial<{}> */
  @js.native
  trait Template extends StObject
}
