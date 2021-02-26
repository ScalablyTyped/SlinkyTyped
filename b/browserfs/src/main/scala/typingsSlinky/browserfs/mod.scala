package typingsSlinky.browserfs

import org.scalajs.dom.raw.Worker
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
import typingsSlinky.browserfs.indexedDBMod.IndexedDBFileSystem
import typingsSlinky.browserfs.zipFSMod.ZipTOC
import typingsSlinky.dropboxjs.Dropbox.Client
import typingsSlinky.node.Buffer
import typingsSlinky.node.pathMod.PlatformPath
import typingsSlinky.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browserfs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("browserfs", "BFSRequire")
  @js.native
  def BFSRequire(module: String): js.Any = js.native
  @JSImport("browserfs", "BFSRequire")
  @js.native
  def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = js.native
  @JSImport("browserfs", "BFSRequire")
  @js.native
  def BFSRequire_buffer(module: buffer): Typeofbuffer = js.native
  @JSImport("browserfs", "BFSRequire")
  @js.native
  def BFSRequire_fs(module: fs): FSModule = js.native
  @JSImport("browserfs", "BFSRequire")
  @js.native
  def BFSRequire_path(module: path): PlatformPath = js.native
  @JSImport("browserfs", "BFSRequire")
  @js.native
  def BFSRequire_process(module: process): Process = js.native
  
  @JSImport("browserfs", "EmscriptenFS")
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
  
  object Errors {
    
    @JSImport("browserfs", "Errors.ApiError")
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
    object ApiError {
      
      @JSImport("browserfs", "Errors.ApiError.EEXIST")
      @js.native
      def EEXIST(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs", "Errors.ApiError.EISDIR")
      @js.native
      def EISDIR(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs", "Errors.ApiError.ENOENT")
      @js.native
      def ENOENT(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs", "Errors.ApiError.ENOTDIR")
      @js.native
      def ENOTDIR(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs", "Errors.ApiError.ENOTEMPTY")
      @js.native
      def ENOTEMPTY(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs", "Errors.ApiError.EPERM")
      @js.native
      def EPERM(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs", "Errors.ApiError.FileError")
      @js.native
      def FileError(code: ErrorCode, p: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      /**
        * Creates an ApiError object from a buffer.
        */
      @JSImport("browserfs", "Errors.ApiError.fromBuffer")
      @js.native
      def fromBuffer(buffer: Buffer): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      @JSImport("browserfs", "Errors.ApiError.fromBuffer")
      @js.native
      def fromBuffer(buffer: Buffer, i: Double): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs", "Errors.ApiError.fromJSON")
      @js.native
      def fromJSON(json: js.Any): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    }
    
    @JSImport("browserfs", "Errors.ErrorCode")
    @js.native
    object ErrorCode extends StObject {
      
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
  }
  
  /**
    * @hidden
    */
  /**
    * @hidden
    */
  object FileSystem {
    
    @JSImport("browserfs", "FileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.AsyncMirror")
    @js.native
    class AsyncMirror protected ()
      extends typingsSlinky.browserfs.asyncMirrorMod.default {
      /**
        * **Deprecated; use AsyncMirror.Create() method instead.**
        *
        * Mirrors the synchronous file system into the asynchronous file system.
        *
        * **IMPORTANT**: You must call `initialize` on the file system before it can be used.
        * @param sync The synchronous file system to mirror the asynchronous file system to.
        * @param async The asynchronous file system to mirror.
        */
      def this(
        sync: typingsSlinky.browserfs.fileSystemMod.FileSystem,
        async: typingsSlinky.browserfs.fileSystemMod.FileSystem
      ) = this()
      def this(
        sync: typingsSlinky.browserfs.fileSystemMod.FileSystem,
        async: typingsSlinky.browserfs.fileSystemMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport("browserfs", "FileSystem.AsyncMirror")
    @js.native
    def AsyncMirror: TypeofAsyncMirror = js.native
    @scala.inline
    def AsyncMirror_=(x: TypeofAsyncMirror): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsyncMirror")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.Dropbox")
    @js.native
    class Dropbox protected ()
      extends typingsSlinky.browserfs.dropboxMod.default {
      /**
        * **Deprecated. Please use Dropbox.Create() method instead.**
        *
        * Constructs a Dropbox-backed file system using the *authenticated* DropboxJS client.
        *
        * Note that you must use the old v0.10 version of the Dropbox JavaScript SDK.
        */
      def this(client: Client) = this()
      def this(client: Client, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs", "FileSystem.Dropbox")
    @js.native
    def Dropbox: TypeofDropbox = js.native
    @scala.inline
    def Dropbox_=(x: TypeofDropbox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dropbox")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.Emscripten")
    @js.native
    class Emscripten protected ()
      extends typingsSlinky.browserfs.emscriptenMod.default {
      /**
        * Creates a BrowserFS file system for the given Emscripten file system.
        * @param _FS The Emscripten file system (`FS`).
        */
      def this(_FS: js.Any) = this()
    }
    @JSImport("browserfs", "FileSystem.Emscripten")
    @js.native
    def Emscripten: TypeofEmscripten = js.native
    @scala.inline
    def Emscripten_=(x: TypeofEmscripten): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emscripten")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.FolderAdapter")
    @js.native
    class FolderAdapter protected ()
      extends typingsSlinky.browserfs.folderAdapterMod.default {
      /**
        * Wraps a file system, and uses the given folder as its root.
        *
        * @param folder The folder to use as the root directory.
        * @param wrapped The file system to wrap.
        */
      def this(folder: String, wrapped: typingsSlinky.browserfs.fileSystemMod.FileSystem) = this()
    }
    @JSImport("browserfs", "FileSystem.FolderAdapter")
    @js.native
    def FolderAdapter: TypeofFolderAdapter = js.native
    @scala.inline
    def FolderAdapter_=(x: TypeofFolderAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FolderAdapter")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.HTML5FS")
    @js.native
    /**
      * **Deprecated. Please use HTML5FS.Create() method instead.**
      *
      * Creates a new HTML5 FileSystem-backed BrowserFS file system of the given size
      * and storage type.
      *
      * **IMPORTANT**: You must call `allocate` on the resulting object before the file system
      * can be used.
      *
      * @param size storage quota to request, in megabytes. Allocated value may be less.
      * @param type window.PERSISTENT or window.TEMPORARY. Defaults to PERSISTENT.
      */
    class HTML5FS ()
      extends typingsSlinky.browserfs.html5fsMod.default {
      def this(size: Double) = this()
      def this(size: js.UndefOr[scala.Nothing], `type`: Double) = this()
      def this(size: Double, `type`: Double) = this()
      def this(size: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(size: js.UndefOr[scala.Nothing], `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Double, `type`: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(size: Double, `type`: Double, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs", "FileSystem.HTML5FS")
    @js.native
    def HTML5FS: TypeofHTML5FS = js.native
    @scala.inline
    def HTML5FS_=(x: TypeofHTML5FS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML5FS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.InMemory")
    @js.native
    class InMemory ()
      extends typingsSlinky.browserfs.inMemoryMod.default
    @JSImport("browserfs", "FileSystem.InMemory")
    @js.native
    def InMemory: TypeofInMemory = js.native
    @scala.inline
    def InMemory_=(x: TypeofInMemory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InMemory")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.IndexedDB")
    @js.native
    class IndexedDB protected ()
      extends typingsSlinky.browserfs.indexedDBMod.default {
      /**
        * **Deprecated. Use IndexedDB.Create() method instead.**
        *
        * Constructs an IndexedDB file system.
        * @param cb Called once the database is instantiated and ready for use.
        *   Passes an error if there was an issue instantiating the database.
        * @param storeName The name of this file system. You can have
        *   multiple IndexedDB file systems operating at once, but each must have
        *   a different name.
        */
      def this(cb: BFSCallback[IndexedDBFileSystem]) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs", "FileSystem.IndexedDB")
    @js.native
    def IndexedDB: TypeofIndexedDB = js.native
    @scala.inline
    def IndexedDB_=(x: TypeofIndexedDB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedDB")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.IsoFS")
    @js.native
    class IsoFS protected ()
      extends typingsSlinky.browserfs.isoFSMod.default {
      /**
        * **Deprecated. Please use IsoFS.Create() method instead.**
        *
        * Constructs a read-only file system from the given ISO.
        * @param data The ISO file in a buffer.
        * @param name The name of the ISO (optional; used for debug messages / identification via getName()).
        */
      def this(data: Buffer) = this()
      def this(data: Buffer, name: String) = this()
      def this(data: Buffer, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(data: Buffer, name: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs", "FileSystem.IsoFS")
    @js.native
    def IsoFS: TypeofIsoFS = js.native
    @scala.inline
    def IsoFS_=(x: TypeofIsoFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsoFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.LocalStorage")
    @js.native
    /**
      * Creates a new LocalStorage file system using the contents of `localStorage`.
      */
    class LocalStorage ()
      extends typingsSlinky.browserfs.localStorageMod.default
    @JSImport("browserfs", "FileSystem.LocalStorage")
    @js.native
    def LocalStorage: TypeofLocalStorage = js.native
    @scala.inline
    def LocalStorage_=(x: TypeofLocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalStorage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.MountableFileSystem")
    @js.native
    /**
      * Creates a new, empty MountableFileSystem.
      */
    class MountableFileSystem ()
      extends typingsSlinky.browserfs.mountableFileSystemMod.default
    @JSImport("browserfs", "FileSystem.MountableFileSystem")
    @js.native
    def MountableFileSystem: TypeofMountableFileSystem = js.native
    @scala.inline
    def MountableFileSystem_=(x: TypeofMountableFileSystem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MountableFileSystem")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.OverlayFS")
    @js.native
    class OverlayFS protected ()
      extends typingsSlinky.browserfs.overlayFSMod.default {
      /**
        * **Deprecated. Please use OverlayFS.Create() method instead.**
        * @param writable The file system to write modified files to.
        * @param readable The file system that initially populates this file system.
        */
      def this(
        writable: typingsSlinky.browserfs.fileSystemMod.FileSystem,
        readable: typingsSlinky.browserfs.fileSystemMod.FileSystem
      ) = this()
      def this(
        writable: typingsSlinky.browserfs.fileSystemMod.FileSystem,
        readable: typingsSlinky.browserfs.fileSystemMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport("browserfs", "FileSystem.OverlayFS")
    @js.native
    def OverlayFS: TypeofOverlayFS = js.native
    @scala.inline
    def OverlayFS_=(x: TypeofOverlayFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverlayFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.WorkerFS")
    @js.native
    class WorkerFS protected ()
      extends typingsSlinky.browserfs.workerFSMod.default {
      /**
        * **Deprecated. Please use WorkerFS.Create() method instead.**
        *
        * Constructs a new WorkerFS instance that connects with BrowserFS running on
        * the specified worker.
        */
      def this(worker: Worker) = this()
      def this(worker: Worker, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs", "FileSystem.WorkerFS")
    @js.native
    def WorkerFS: TypeofWorkerFS = js.native
    @scala.inline
    def WorkerFS_=(x: TypeofWorkerFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WorkerFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.XmlHttpRequest")
    @js.native
    class XmlHttpRequest protected ()
      extends typingsSlinky.browserfs.xmlHttpRequestMod.default {
      /**
        * **Deprecated. Please use XmlHttpRequest.Create() method instead to construct XmlHttpRequest objects.**
        *
        * Constructs the file system. You must provide the directory listing as a JSON object
        * produced by the `make_xhrfs_index` script.
        *
        * **DEPRECATED:** You may pass a URL to the file index to the constructor, which will fetch the file index
        * *synchronously* and may freeze up the web page. This behavior will be removed in the next major version
        * of BrowserFS.
        *
        * @param listingUrlOrObj index object or the path to the JSON file index generated by
        *   `make_xhrfs_index`.
        * @param prefixUrl URL that is prepended to any file locations in the file index. e.g. if `prefixUrl = 'data/`, and the user wants to open the file `/foo.txt`,
        * the file system will fetch file `data/foo.txt`. The browser will access the file relative to the currrent webpage
        * URL.
        */
      def this(listingUrlOrObj: String) = this()
      def this(listingUrlOrObj: js.Object) = this()
      def this(listingUrlOrObj: String, prefixUrl: String) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String) = this()
      def this(listingUrlOrObj: String, prefixUrl: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: String, prefixUrl: String, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs", "FileSystem.XmlHttpRequest")
    @js.native
    def XmlHttpRequest: TypeofXmlHttpRequest = js.native
    @scala.inline
    def XmlHttpRequest_=(x: TypeofXmlHttpRequest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XmlHttpRequest")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs", "FileSystem.ZipFS")
    @js.native
    class ZipFS protected ()
      extends typingsSlinky.browserfs.zipFSMod.default {
      def this(input: ZipTOC) = this()
      /**
        * **Deprecated. Please use ZipFS.Create() method to construct ZipFS objects.**
        */
      def this(input: Buffer) = this()
      def this(input: ZipTOC, name: String) = this()
      def this(input: Buffer, name: String) = this()
      def this(input: ZipTOC, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(input: ZipTOC, name: String, deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs", "FileSystem.ZipFS")
    @js.native
    def ZipFS: TypeofZipFS = js.native
    @scala.inline
    def ZipFS_=(x: TypeofZipFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZipFS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("browserfs", "configure")
  @js.native
  def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = js.native
  
  @JSImport("browserfs", "getFileSystem")
  @js.native
  def getFileSystem(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = js.native
  
  @JSImport("browserfs", "initialize")
  @js.native
  def initialize(rootfs: FileSystem): FileSystem = js.native
  
  @JSImport("browserfs", "install")
  @js.native
  def install(obj: js.Any): Unit = js.native
  
  @JSImport("browserfs", "registerFileSystem")
  @js.native
  def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = js.native
  
  @JSImport("browserfs", "setImmediate")
  @js.native
  def setImmediate: js.Function1[/* cb */ js.Function, js.Any] = js.native
  @scala.inline
  def setImmediate_=(x: js.Function1[/* cb */ js.Function, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(x.asInstanceOf[js.Any])
}
