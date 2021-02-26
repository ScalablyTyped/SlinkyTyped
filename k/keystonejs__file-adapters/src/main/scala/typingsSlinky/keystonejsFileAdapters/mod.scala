package typingsSlinky.keystonejsFileAdapters

import typingsSlinky.keystonejsFileAdapters.anon.Filename
import typingsSlinky.keystonejsFileAdapters.anon.FilenameId
import typingsSlinky.keystonejsFileAdapters.anon.FilenameString
import typingsSlinky.keystonejsFileAdapters.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keystonejs/file-adapters", "CloudinaryFileAdapter")
  @js.native
  class CloudinaryFileAdapter protected () extends StObject {
    def this(options: CloudinaryFileAdapterConfig) = this()
    
    def publicUrl(params: FilenameString): String = js.native
    
    def save(params: Filename): js.Promise[FilenameId] = js.native
  }
  
  @JSImport("@keystonejs/file-adapters", "LocalFileAdapter")
  @js.native
  class LocalFileAdapter protected () extends StObject {
    def this(options: LocalFileAdapterConfig) = this()
    
    def publicUrl(params: FilenameString): String = js.native
    
    def save(params: Filename): js.Promise[FilenameId] = js.native
  }
  
  @js.native
  trait CloudinaryFileAdapterConfig extends StObject {
    
    var apiKey: String = js.native
    
    var apiSecret: String = js.native
    
    var cloudName: String = js.native
    
    var folder: js.UndefOr[String] = js.native
  }
  object CloudinaryFileAdapterConfig {
    
    @scala.inline
    def apply(apiKey: String, apiSecret: String, cloudName: String): CloudinaryFileAdapterConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiSecret = apiSecret.asInstanceOf[js.Any], cloudName = cloudName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudinaryFileAdapterConfig]
    }
    
    @scala.inline
    implicit class CloudinaryFileAdapterConfigMutableBuilder[Self <: CloudinaryFileAdapterConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiSecret(value: String): Self = StObject.set(x, "apiSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudName(value: String): Self = StObject.set(x, "cloudName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    }
  }
  
  @js.native
  trait LocalFileAdapterConfig extends StObject {
    
    var getFilename: js.UndefOr[js.Function1[/* options */ Id, String]] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var src: String = js.native
  }
  object LocalFileAdapterConfig {
    
    @scala.inline
    def apply(src: String): LocalFileAdapterConfig = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalFileAdapterConfig]
    }
    
    @scala.inline
    implicit class LocalFileAdapterConfigMutableBuilder[Self <: LocalFileAdapterConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFilename(value: /* options */ Id => String): Self = StObject.set(x, "getFilename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilenameUndefined: Self = StObject.set(x, "getFilename", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
