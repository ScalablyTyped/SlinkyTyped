package typingsSlinky.azureSb

import typingsSlinky.azureSb.anon.Headers
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mpnserviceMod {
  
  @JSImport("azure-sb/lib/mpnservice", JSImport.Namespace)
  @js.native
  class ^ protected () extends MpnsService {
    def this(notificationHubService: typingsSlinky.azureSb.notificationhubserviceMod.^) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.azureSb.mpnserviceMod.Template because Already inherited */ @js.native
  trait FlipTileTemplate extends TileTemplate {
    
    var smallBackgroundImage: String = js.native
    
    var wideBackBackgroundImage: String = js.native
    
    var wideBackContent: String = js.native
    
    var wideBackgroundImage: String = js.native
  }
  object FlipTileTemplate {
    
    @scala.inline
    def apply(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      smallBackgroundImage: String,
      title: String,
      wideBackBackgroundImage: String,
      wideBackContent: String,
      wideBackgroundImage: String
    ): FlipTileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], smallBackgroundImage = smallBackgroundImage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wideBackBackgroundImage = wideBackBackgroundImage.asInstanceOf[js.Any], wideBackContent = wideBackContent.asInstanceOf[js.Any], wideBackgroundImage = wideBackgroundImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlipTileTemplate]
    }
    
    @scala.inline
    implicit class FlipTileTemplateMutableBuilder[Self <: FlipTileTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSmallBackgroundImage(value: String): Self = StObject.set(x, "smallBackgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWideBackBackgroundImage(value: String): Self = StObject.set(x, "wideBackBackgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWideBackContent(value: String): Self = StObject.set(x, "wideBackContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWideBackgroundImage(value: String): Self = StObject.set(x, "wideBackgroundImage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MpnsService extends StObject {
    
    def createNativeRegistration(channel: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(channel: String, tags: String, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(channel: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(channel: String, tags: js.Array[String], options: js.Object, callback: ResponseCallback): Unit = js.native
    
    def createOrUpdateNativeRegistration(registrationId: String, channel: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateNativeRegistration(registrationId: String, channel: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def createRawTemplateRegistration(channel: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: String, template: String, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: String, template: Template, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: String, template: Template, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: js.Array[String], template: String, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(
      channel: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createRawTemplateRegistration(channel: String, tags: js.Array[String], template: Template, callback: ResponseCallback): Unit = js.native
    def createRawTemplateRegistration(
      channel: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def listRegistrationsByChannel(channel: String, callback: ResponseCallback): Unit = js.native
    def listRegistrationsByChannel(channel: String, options: ListNotificationHubsOptions, callback: ResponseCallback): Unit = js.native
    
    var notificationHubService: typingsSlinky.azureSb.notificationhubserviceMod.^ = js.native
    
    def send(
      tags: String,
      payload: String,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: String,
      payload: String,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: String,
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: String,
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: String,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: String,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      callback: ResponseCallback
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: js.Object,
      targetName: String,
      notificationClass: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updatesRawTemplateRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.azureSb.mpnserviceMod.TileTemplate
    - typingsSlinky.azureSb.mpnserviceMod.FlipTileTemplate
    - typingsSlinky.azureSb.mpnserviceMod.ToastTemplate
  */
  trait Template extends StObject
  object Template {
    
    @scala.inline
    def FlipTileTemplate(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      smallBackgroundImage: String,
      title: String,
      wideBackBackgroundImage: String,
      wideBackContent: String,
      wideBackgroundImage: String
    ): typingsSlinky.azureSb.mpnserviceMod.FlipTileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], smallBackgroundImage = smallBackgroundImage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wideBackBackgroundImage = wideBackBackgroundImage.asInstanceOf[js.Any], wideBackContent = wideBackContent.asInstanceOf[js.Any], wideBackgroundImage = wideBackgroundImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.azureSb.mpnserviceMod.FlipTileTemplate]
    }
    
    @scala.inline
    def TileTemplate(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      title: String
    ): typingsSlinky.azureSb.mpnserviceMod.TileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.azureSb.mpnserviceMod.TileTemplate]
    }
    
    @scala.inline
    def ToastTemplate(text1: String, text2: String): typingsSlinky.azureSb.mpnserviceMod.ToastTemplate = {
      val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.azureSb.mpnserviceMod.ToastTemplate]
    }
  }
  
  @js.native
  trait TileTemplate extends Template {
    
    var backBackgroundImage: String = js.native
    
    var backContent: String = js.native
    
    var backTitle: String = js.native
    
    var backgroundImage: String = js.native
    
    var count: String = js.native
    
    var id: String = js.native
    
    var title: String = js.native
  }
  object TileTemplate {
    
    @scala.inline
    def apply(
      backBackgroundImage: String,
      backContent: String,
      backTitle: String,
      backgroundImage: String,
      count: String,
      id: String,
      title: String
    ): TileTemplate = {
      val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileTemplate]
    }
    
    @scala.inline
    implicit class TileTemplateMutableBuilder[Self <: TileTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackBackgroundImage(value: String): Self = StObject.set(x, "backBackgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackContent(value: String): Self = StObject.set(x, "backContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackTitle(value: String): Self = StObject.set(x, "backTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToastTemplate extends Template {
    
    var param: js.UndefOr[String] = js.native
    
    var text1: String = js.native
    
    var text2: String = js.native
  }
  object ToastTemplate {
    
    @scala.inline
    def apply(text1: String, text2: String): ToastTemplate = {
      val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastTemplate]
    }
    
    @scala.inline
    implicit class ToastTemplateMutableBuilder[Self <: ToastTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      @scala.inline
      def setText1(value: String): Self = StObject.set(x, "text1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText2(value: String): Self = StObject.set(x, "text2", value.asInstanceOf[js.Any])
    }
  }
}
