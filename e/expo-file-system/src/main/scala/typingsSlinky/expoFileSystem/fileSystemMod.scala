package typingsSlinky.expoFileSystem

import typingsSlinky.expoFileSystem.anon.From
import typingsSlinky.expoFileSystem.anon.Idempotent
import typingsSlinky.expoFileSystem.anon.Intermediates
import typingsSlinky.expoFileSystem.anon.Md5
import typingsSlinky.expoFileSystem.fileSystemTypesMod.DownloadOptions
import typingsSlinky.expoFileSystem.fileSystemTypesMod.DownloadPauseState
import typingsSlinky.expoFileSystem.fileSystemTypesMod.DownloadProgressCallback
import typingsSlinky.expoFileSystem.fileSystemTypesMod.FileInfo
import typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemDownloadResult
import typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadOptions
import typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadResult
import typingsSlinky.expoFileSystem.fileSystemTypesMod.ReadingOptions
import typingsSlinky.expoFileSystem.fileSystemTypesMod.WritingOptions
import typingsSlinky.unimodulesCore.mod.EventEmitter
import typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-file-system/build/FileSystem", JSImport.Namespace)
@js.native
object fileSystemMod extends js.Object {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ val bundledAssets: String | Null = js.native
  
  val cacheDirectory: String | Null = js.native
  
  def copyAsync(options: From): js.Promise[Unit] = js.native
  
  def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback
  ): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  def deleteAsync(fileUri: String, options: Idempotent): js.Promise[Unit] = js.native
  
  def deleteLegacyDocumentDirectoryAndroid(): js.Promise[Unit] = js.native
  
  val documentDirectory: String | Null = js.native
  
  def downloadAsync(uri: String, fileUri: String): js.Promise[FileSystemDownloadResult] = js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[FileSystemDownloadResult] = js.native
  
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: String, options: Md5): js.Promise[FileInfo] = js.native
  
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  def makeDirectoryAsync(fileUri: String, options: Intermediates): js.Promise[Unit] = js.native
  
  def moveAsync(options: From): js.Promise[Unit] = js.native
  
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  
  def uploadAsync(url: String, fileUri: String): js.Promise[FileSystemUploadResult] = js.native
  def uploadAsync(url: String, fileUri: String, options: FileSystemUploadOptions): js.Promise[FileSystemUploadResult] = js.native
  
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
  
  @js.native
  class DownloadResumable protected () extends js.Object {
    def this(url: String, fileUri: String) = this()
    def this(url: String, fileUri: String, options: DownloadOptions) = this()
    def this(
      url: String,
      fileUri: String,
      options: js.UndefOr[scala.Nothing],
      callback: DownloadProgressCallback
    ) = this()
    def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(
      url: String,
      fileUri: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      resumeData: String
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: js.UndefOr[scala.Nothing],
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: DownloadOptions,
      callback: js.UndefOr[scala.Nothing],
      resumeData: String
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: DownloadOptions,
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
    
    def _addSubscription(): Unit = js.native
    
    var _callback: js.UndefOr[DownloadProgressCallback] = js.native
    
    var _emitter: EventEmitter = js.native
    
    var _fileUri: String = js.native
    
    var _options: DownloadOptions = js.native
    
    def _removeSubscription(): Unit = js.native
    
    var _resumeData: js.UndefOr[String] = js.native
    
    var _subscription: js.UndefOr[Subscription | Null] = js.native
    
    var _url: String = js.native
    
    var _uuid: String = js.native
    
    def downloadAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    
    def pauseAsync(): js.Promise[DownloadPauseState] = js.native
    
    def resumeAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    
    def savable(): DownloadPauseState = js.native
  }
  
  @js.native
  object EncodingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expoFileSystem.fileSystemTypesMod.EncodingType with String] = js.native
    
    /* "base64" */ val Base64: typingsSlinky.expoFileSystem.fileSystemTypesMod.EncodingType.Base64 with String = js.native
    
    /* "utf8" */ val UTF8: typingsSlinky.expoFileSystem.fileSystemTypesMod.EncodingType.UTF8 with String = js.native
  }
  
  @js.native
  object FileSystemSessionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemSessionType with Double
      ] = js.native
    
    /* 0 */ val BACKGROUND: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.BACKGROUND with Double = js.native
    
    /* 1 */ val FOREGROUND: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.FOREGROUND with Double = js.native
  }
  
  @js.native
  object FileSystemUploadType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadType with Double] = js.native
    
    /* 0 */ val BINARY_CONTENT: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT with Double = js.native
    
    /* 1 */ val MULTIPART: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.MULTIPART with Double = js.native
  }
}
