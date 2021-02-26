package typingsSlinky.electronPublish

import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.builderUtilRuntime.mod.CancellationToken
import typingsSlinky.electronPublish.multiProgressMod.MultiProgress
import typingsSlinky.electronPublish.progressMod.ProgressBar
import typingsSlinky.fsExtra.mod.Stats
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-publish", "HttpPublisher")
  @js.native
  abstract class HttpPublisher protected () extends Publisher {
    protected def this(context: PublishContext) = this()
    protected def this(context: PublishContext, useSafeArtifactName: Boolean) = this()
    
    /* protected */ def doUpload(
      fileName: String,
      arch: Arch,
      dataLength: Double,
      requestProcessor: js.Function2[
          /* request */ ClientRequest, 
          /* reject */ js.Function1[/* error */ js.Error, Unit], 
          Unit
        ]
    ): js.Promise[_] = js.native
    /* protected */ def doUpload(
      fileName: String,
      arch: Arch,
      dataLength: Double,
      requestProcessor: js.Function2[
          /* request */ ClientRequest, 
          /* reject */ js.Function1[/* error */ js.Error, Unit], 
          Unit
        ],
      file: String
    ): js.Promise[_] = js.native
    
    val useSafeArtifactName: js.Any = js.native
  }
  
  @JSImport("electron-publish", "ProgressCallback")
  @js.native
  class ProgressCallback protected ()
    extends typingsSlinky.electronPublish.progressMod.ProgressCallback {
    def this(progressBar: ProgressBar) = this()
  }
  
  @JSImport("electron-publish", "Publisher")
  @js.native
  abstract class Publisher protected () extends StObject {
    protected def this(context: PublishContext) = this()
    
    val context: PublishContext = js.native
    
    /* protected */ def createProgressBar(fileName: String, size: Double): ProgressBar | Null = js.native
    
    /* protected */ def createReadStreamAndProgressBar(file: String, fileStat: Stats, progressBar: Null, reject: js.Function1[/* error */ js.Error, Unit]): ReadableStream = js.native
    /* protected */ def createReadStreamAndProgressBar(
      file: String,
      fileStat: Stats,
      progressBar: ProgressBar,
      reject: js.Function1[/* error */ js.Error, Unit]
    ): ReadableStream = js.native
    
    def providerName: String = js.native
    
    def upload(task: UploadTask): js.Promise[_] = js.native
  }
  
  @JSImport("electron-publish", "getCiTag")
  @js.native
  def getCiTag(): String | Null = js.native
  
  @js.native
  trait PublishContext extends StObject {
    
    val cancellationToken: CancellationToken = js.native
    
    val progress: MultiProgress | Null = js.native
  }
  object PublishContext {
    
    @scala.inline
    def apply(cancellationToken: CancellationToken): PublishContext = {
      val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishContext]
    }
    
    @scala.inline
    implicit class PublishContextMutableBuilder[Self <: PublishContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellationToken(value: CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: MultiProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressNull: Self = StObject.set(x, "progress", null)
    }
  }
  
  @js.native
  trait PublishOptions extends StObject {
    
    var publish: js.UndefOr[PublishPolicy | Null] = js.native
  }
  object PublishOptions {
    
    @scala.inline
    def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    @scala.inline
    implicit class PublishOptionsMutableBuilder[Self <: PublishOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublish(value: PublishPolicy): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishNull: Self = StObject.set(x, "publish", null)
      
      @scala.inline
      def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.electronPublish.electronPublishStrings.onTag
    - typingsSlinky.electronPublish.electronPublishStrings.onTagOrDraft
    - typingsSlinky.electronPublish.electronPublishStrings.always
    - typingsSlinky.electronPublish.electronPublishStrings.never
  */
  trait PublishPolicy extends StObject
  object PublishPolicy {
    
    @scala.inline
    def always: typingsSlinky.electronPublish.electronPublishStrings.always = "always".asInstanceOf[typingsSlinky.electronPublish.electronPublishStrings.always]
    
    @scala.inline
    def never: typingsSlinky.electronPublish.electronPublishStrings.never = "never".asInstanceOf[typingsSlinky.electronPublish.electronPublishStrings.never]
    
    @scala.inline
    def onTag: typingsSlinky.electronPublish.electronPublishStrings.onTag = "onTag".asInstanceOf[typingsSlinky.electronPublish.electronPublishStrings.onTag]
    
    @scala.inline
    def onTagOrDraft: typingsSlinky.electronPublish.electronPublishStrings.onTagOrDraft = "onTagOrDraft".asInstanceOf[typingsSlinky.electronPublish.electronPublishStrings.onTagOrDraft]
  }
  
  @js.native
  trait UploadTask extends StObject {
    
    var arch: Arch | Null = js.native
    
    var file: String = js.native
    
    var fileContent: js.UndefOr[Buffer | Null] = js.native
    
    var safeArtifactName: js.UndefOr[String | Null] = js.native
  }
  object UploadTask {
    
    @scala.inline
    def apply(file: String): UploadTask = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadTask]
    }
    
    @scala.inline
    implicit class UploadTaskMutableBuilder[Self <: UploadTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: Arch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchNull: Self = StObject.set(x, "arch", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileContent(value: Buffer): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileContentNull: Self = StObject.set(x, "fileContent", null)
      
      @scala.inline
      def setFileContentUndefined: Self = StObject.set(x, "fileContent", js.undefined)
      
      @scala.inline
      def setSafeArtifactName(value: String): Self = StObject.set(x, "safeArtifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeArtifactNameNull: Self = StObject.set(x, "safeArtifactName", null)
      
      @scala.inline
      def setSafeArtifactNameUndefined: Self = StObject.set(x, "safeArtifactName", js.undefined)
    }
  }
}
