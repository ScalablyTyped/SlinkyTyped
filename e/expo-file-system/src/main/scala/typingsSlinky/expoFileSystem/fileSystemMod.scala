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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSystemMod {
  
  @JSImport("expo-file-system/build/FileSystem", "DownloadResumable")
  @js.native
  class DownloadResumable protected () extends StObject {
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
  
  @JSImport("expo-file-system/build/FileSystem", "EncodingType")
  @js.native
  object EncodingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expoFileSystem.fileSystemTypesMod.EncodingType with String] = js.native
    
    /* "base64" */ val Base64: typingsSlinky.expoFileSystem.fileSystemTypesMod.EncodingType.Base64 with String = js.native
    
    /* "utf8" */ val UTF8: typingsSlinky.expoFileSystem.fileSystemTypesMod.EncodingType.UTF8 with String = js.native
  }
  
  @JSImport("expo-file-system/build/FileSystem", "FileSystemSessionType")
  @js.native
  object FileSystemSessionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemSessionType with Double
      ] = js.native
    
    /* 0 */ val BACKGROUND: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.BACKGROUND with Double = js.native
    
    /* 1 */ val FOREGROUND: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.FOREGROUND with Double = js.native
  }
  
  @JSImport("expo-file-system/build/FileSystem", "FileSystemUploadType")
  @js.native
  object FileSystemUploadType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadType with Double] = js.native
    
    /* 0 */ val BINARY_CONTENT: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT with Double = js.native
    
    /* 1 */ val MULTIPART: typingsSlinky.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.MULTIPART with Double = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ @JSImport("expo-file-system/build/FileSystem", "bundledAssets")
  @js.native
  val bundledAssets: String | Null = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "cacheDirectory")
  @js.native
  val cacheDirectory: String | Null = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "copyAsync")
  @js.native
  def copyAsync(options: From): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = js.native
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): DownloadResumable = js.native
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback
  ): DownloadResumable = js.native
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = js.native
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): DownloadResumable = js.native
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): DownloadResumable = js.native
  @JSImport("expo-file-system/build/FileSystem", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "deleteAsync")
  @js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  @JSImport("expo-file-system/build/FileSystem", "deleteAsync")
  @js.native
  def deleteAsync(fileUri: String, options: Idempotent): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "deleteLegacyDocumentDirectoryAndroid")
  @js.native
  def deleteLegacyDocumentDirectoryAndroid(): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "documentDirectory")
  @js.native
  val documentDirectory: String | Null = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "downloadAsync")
  @js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[FileSystemDownloadResult] = js.native
  @JSImport("expo-file-system/build/FileSystem", "downloadAsync")
  @js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[FileSystemDownloadResult] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "getContentUriAsync")
  @js.native
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "getFreeDiskStorageAsync")
  @js.native
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "getInfoAsync")
  @js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  @JSImport("expo-file-system/build/FileSystem", "getInfoAsync")
  @js.native
  def getInfoAsync(fileUri: String, options: Md5): js.Promise[FileInfo] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "getTotalDiskCapacityAsync")
  @js.native
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "makeDirectoryAsync")
  @js.native
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  @JSImport("expo-file-system/build/FileSystem", "makeDirectoryAsync")
  @js.native
  def makeDirectoryAsync(fileUri: String, options: Intermediates): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "moveAsync")
  @js.native
  def moveAsync(options: From): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "readAsStringAsync")
  @js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  @JSImport("expo-file-system/build/FileSystem", "readAsStringAsync")
  @js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "readDirectoryAsync")
  @js.native
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "uploadAsync")
  @js.native
  def uploadAsync(url: String, fileUri: String): js.Promise[FileSystemUploadResult] = js.native
  @JSImport("expo-file-system/build/FileSystem", "uploadAsync")
  @js.native
  def uploadAsync(url: String, fileUri: String, options: FileSystemUploadOptions): js.Promise[FileSystemUploadResult] = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "writeAsStringAsync")
  @js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  @JSImport("expo-file-system/build/FileSystem", "writeAsStringAsync")
  @js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
}
