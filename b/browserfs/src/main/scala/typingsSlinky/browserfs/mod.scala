package typingsSlinky.browserfs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.browserfs.anon.TypeofAsyncMirror
import typingsSlinky.browserfs.anon.TypeofBFSUtils
import typingsSlinky.browserfs.anon.TypeofDropbox
import typingsSlinky.browserfs.anon.TypeofEmscripten
import typingsSlinky.browserfs.anon.TypeofFolderAdapter
import typingsSlinky.browserfs.anon.TypeofHTML5FS
import typingsSlinky.browserfs.anon.TypeofInMemory
import typingsSlinky.browserfs.anon.TypeofIndexedDB
import typingsSlinky.browserfs.anon.TypeofIsoFS
import typingsSlinky.browserfs.anon.TypeofLocalStorage
import typingsSlinky.browserfs.anon.TypeofMountableFileSystem
import typingsSlinky.browserfs.anon.TypeofOverlayFS
import typingsSlinky.browserfs.anon.TypeofWorkerFS
import typingsSlinky.browserfs.anon.TypeofXmlHttpRequest
import typingsSlinky.browserfs.anon.TypeofZipFS
import typingsSlinky.browserfs.anon.Typeofbuffer
import typingsSlinky.browserfs.apiErrorMod.ErrorCode
import typingsSlinky.browserfs.browserfsMod.FileSystemConfiguration
import typingsSlinky.browserfs.browserfsStrings.bfs_utils
import typingsSlinky.browserfs.browserfsStrings.buffer
import typingsSlinky.browserfs.browserfsStrings.fs
import typingsSlinky.browserfs.browserfsStrings.path
import typingsSlinky.browserfs.browserfsStrings.process
import typingsSlinky.browserfs.fSMod.FSModule
import typingsSlinky.browserfs.fSMod.default
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.BFSOneArgCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemConstructor
import typingsSlinky.node.Buffer
import typingsSlinky.node.pathMod.PlatformPath
import typingsSlinky.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def BFSRequire(module: String): js.Any = js.native
  @JSName("BFSRequire")
  def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = js.native
  @JSName("BFSRequire")
  def BFSRequire_buffer(module: buffer): Typeofbuffer = js.native
  @JSName("BFSRequire")
  def BFSRequire_fs(module: fs): FSModule = js.native
  @JSName("BFSRequire")
  def BFSRequire_path(module: path): PlatformPath = js.native
  @JSName("BFSRequire")
  def BFSRequire_process(module: process): Process = js.native
  
  def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = js.native
  
  def getFileSystem(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = js.native
  
  def initialize(rootfs: FileSystem): FileSystem = js.native
  
  def install(obj: js.Any): Unit = js.native
  
  def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = js.native
  
  var setImmediate: js.Function1[/* cb */ js.Function, js.Any] = js.native
  
  @js.native
  class EmscriptenFS ()
    extends typingsSlinky.browserfs.nodeMod.EmscriptenFS {
    def this(_FS: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.Any,
      nodefs: default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.Any,
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: default
    ) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: default) = this()
    def this(
      _FS: js.Any,
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: default
    ) = this()
    def this(_FS: js.Any, _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any, nodefs: default) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.UndefOr[scala.Nothing], nodefs: default) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: default) = this()
  }
  
  @js.native
  object Errors extends js.Object {
    
    @js.native
    class ApiError protected ()
      extends typingsSlinky.browserfs.nodeMod.Errors.ApiError {
      /**
        * Represents a BrowserFS error. Passed back to applications after a failed
        * call to the BrowserFS API.
        *
        * Error codes mirror those returned by regular Unix file operations, which is
        * what Node returns.
        * @constructor ApiError
        * @param type The type of the error.
        * @param [message] A descriptive error message.
        */
      def this(`type`: ErrorCode) = this()
      def this(`type`: ErrorCode, message: String) = this()
      def this(`type`: ErrorCode, message: js.UndefOr[scala.Nothing], path: String) = this()
      def this(`type`: ErrorCode, message: String, path: String) = this()
    }
    /* static members */
    @js.native
    object ApiError extends js.Object {
      
      def EEXIST(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      def EISDIR(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      def ENOENT(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      def ENOTDIR(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      def ENOTEMPTY(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      def EPERM(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      def FileError(code: ErrorCode, p: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      /**
        * Creates an ApiError object from a buffer.
        */
      def fromBuffer(buffer: Buffer): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      def fromBuffer(buffer: Buffer, i: Double): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      def fromJSON(json: js.Any): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    }
    
    @js.native
    object ErrorCode extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.browserfs.apiErrorMod.ErrorCode with Double] = js.native
      
      /* 13 */ val EACCES: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EACCES with Double = js.native
      
      /* 9 */ val EBADF: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EBADF with Double = js.native
      
      /* 16 */ val EBUSY: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EBUSY with Double = js.native
      
      /* 17 */ val EEXIST: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EEXIST with Double = js.native
      
      /* 27 */ val EFBIG: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EFBIG with Double = js.native
      
      /* 22 */ val EINVAL: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EINVAL with Double = js.native
      
      /* 5 */ val EIO: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EIO with Double = js.native
      
      /* 21 */ val EISDIR: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EISDIR with Double = js.native
      
      /* 2 */ val ENOENT: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOENT with Double = js.native
      
      /* 28 */ val ENOSPC: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOSPC with Double = js.native
      
      /* 20 */ val ENOTDIR: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOTDIR with Double = js.native
      
      /* 39 */ val ENOTEMPTY: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
      
      /* 95 */ val ENOTSUP: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOTSUP with Double = js.native
      
      /* 1 */ val EPERM: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EPERM with Double = js.native
      
      /* 30 */ val EROFS: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EROFS with Double = js.native
    }
    
    @js.native
    object ErrorStrings
      extends /* code */ NumberDictionary[String]
         with /* code */ StringDictionary[String]
  }
  
  /**
    * @hidden
    */
  @js.native
  object FileSystem extends js.Object {
    
    var AsyncMirror: TypeofAsyncMirror = js.native
    
    var Dropbox: TypeofDropbox = js.native
    
    var Emscripten: TypeofEmscripten = js.native
    
    var FolderAdapter: TypeofFolderAdapter = js.native
    
    var HTML5FS: TypeofHTML5FS = js.native
    
    var InMemory: TypeofInMemory = js.native
    
    var IndexedDB: TypeofIndexedDB = js.native
    
    var IsoFS: TypeofIsoFS = js.native
    
    var LocalStorage: TypeofLocalStorage = js.native
    
    var MountableFileSystem: TypeofMountableFileSystem = js.native
    
    var OverlayFS: TypeofOverlayFS = js.native
    
    var WorkerFS: TypeofWorkerFS = js.native
    
    var XmlHttpRequest: TypeofXmlHttpRequest = js.native
    
    var ZipFS: TypeofZipFS = js.native
  }
}
