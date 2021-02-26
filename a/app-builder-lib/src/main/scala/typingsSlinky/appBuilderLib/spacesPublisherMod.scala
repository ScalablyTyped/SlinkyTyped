package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.baseS3PublisherMod.BaseS3Publisher
import typingsSlinky.builderUtilRuntime.publishOptionsMod.SpacesOptions
import typingsSlinky.electronPublish.mod.PublishContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacesPublisherMod {
  
  @JSImport("app-builder-lib/out/publish/s3/spacesPublisher", JSImport.Default)
  @js.native
  class default protected () extends SpacesPublisher {
    def this(context: PublishContext, info: SpacesOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("app-builder-lib/out/publish/s3/spacesPublisher", "default.checkAndResolveOptions")
    @js.native
    def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = js.native
    @JSImport("app-builder-lib/out/publish/s3/spacesPublisher", "default.checkAndResolveOptions")
    @js.native
    def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait SpacesPublisher extends BaseS3Publisher {
    
    val info: js.Any = js.native
    
    @JSName("providerName")
    val providerName_FSpacesPublisher: /* "Spaces" */ String = js.native
  }
}
