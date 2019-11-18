package typingsSlinky.expoDashFileDashSystem

import typingsSlinky.atUnimodulesCore.atUnimodulesCoreMod.EventEmitter
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.Subscription
import typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadOptions
import typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadPauseState
import typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadProgressCallback
import typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadResult
import typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.FileInfo
import typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.ReadingOptions
import typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.WritingOptions
import typingsSlinky.expoDashFileDashSystem.buildFileSystemMod.DownloadResumable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-file-system/build/FileSystem", JSImport.Namespace)
@js.native
object buildFileSystemMod extends js.Object {
  @js.native
  class DownloadResumable protected () extends js.Object {
    def this(url: String, fileUri: String) = this()
    def this(url: String, fileUri: String, options: DownloadOptions) = this()
    def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(
      url: String,
      fileUri: String,
      options: DownloadOptions,
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
    var _callback: js.UndefOr[DownloadProgressCallback] = js.native
    var _emitter: EventEmitter = js.native
    var _fileUri: String = js.native
    var _options: DownloadOptions = js.native
    var _resumeData: js.UndefOr[String] = js.native
    var _subscription: js.UndefOr[Subscription | Null] = js.native
    var _url: String = js.native
    var _uuid: String = js.native
    def _addSubscription(): Unit = js.native
    def _removeSubscription(): Unit = js.native
    def downloadAsync(): js.Promise[js.UndefOr[DownloadResult]] = js.native
    def pauseAsync(): js.Promise[DownloadPauseState] = js.native
    def resumeAsync(): js.Promise[js.UndefOr[DownloadResult]] = js.native
    def savable(): DownloadPauseState = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(bundleDirectory) */ val bundledAssets: String | Null = js.native
  val cacheDirectory: String | Null = js.native
  val documentDirectory: String | Null = js.native
  def copyAsync(options: Anon_From): js.Promise[Unit] = js.native
  def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  def deleteAsync(fileUri: String, options: Anon_Idempotent): js.Promise[Unit] = js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[DownloadResult] = js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[DownloadResult] = js.native
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: String, options: Anon_Md5): js.Promise[FileInfo] = js.native
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  def makeDirectoryAsync(fileUri: String, options: Anon_Intermediates): js.Promise[Unit] = js.native
  def moveAsync(options: Anon_From): js.Promise[Unit] = js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
  @js.native
  object EncodingType extends js.Object {
    /* "base64" */ val Base64: typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType.Base64 with String = js.native
    /* "utf8" */ val UTF8: typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType.UTF8 with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType with String
      ] = js.native
  }
  
}

