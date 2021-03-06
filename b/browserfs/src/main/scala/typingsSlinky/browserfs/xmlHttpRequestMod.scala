package typingsSlinky.browserfs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.browserfs.fileFlagMod.FileFlag
import typingsSlinky.browserfs.fileMod.File
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.BFSOneArgCallback
import typingsSlinky.browserfs.fileSystemMod.BaseFileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlHttpRequestMod {
  
  @JSImport("browserfs/dist/node/backend/XmlHttpRequest", JSImport.Default)
  @js.native
  class default protected () extends XmlHttpRequest {
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
  /* static members */
  object default {
    
    /**
      * Construct an XmlHttpRequest file system backend with the given options.
      */
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.Create")
    @js.native
    def Create(opts: XmlHttpRequestOptions, cb: BFSCallback[XmlHttpRequest]): Unit = js.native
    
    /**
      * **Deprecated. Please use XmlHttpRequest.Create() method instead to construct XmlHttpRequest objects.**
      *
      * Constructs an XmlHttpRequest object using the directory listing at the given URL.
      * Uses the base URL as the URL prefix for fetched files.
      * @param cb Called when the file system has been instantiated, or if an error occurs.
      */
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.FromURL")
    @js.native
    def FromURL(url: String, cb: BFSCallback[XmlHttpRequest]): Unit = js.native
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.FromURL")
    @js.native
    def FromURL(
      url: String,
      cb: BFSCallback[XmlHttpRequest],
      baseUrl: js.UndefOr[scala.Nothing],
      deprecateMsg: Boolean
    ): Unit = js.native
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.FromURL")
    @js.native
    def FromURL(url: String, cb: BFSCallback[XmlHttpRequest], baseUrl: String): Unit = js.native
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.FromURL")
    @js.native
    def FromURL(url: String, cb: BFSCallback[XmlHttpRequest], baseUrl: String, deprecateMsg: Boolean): Unit = js.native
    
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    @JSImport("browserfs/dist/node/backend/XmlHttpRequest", "default.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
  }
  
  @js.native
  trait XmlHttpRequest
    extends BaseFileSystem
       with FileSystem {
    
    var _index: js.Any = js.native
    
    /**
      * Asynchronously download the given file.
      */
    /* private */ def _requestFileAsync(p: js.Any, `type`: js.Any, cb: js.Any): js.Any = js.native
    
    /**
      * Only requests the HEAD content, for the file size.
      */
    /* private */ def _requestFileSizeAsync(path: js.Any, cb: js.Any): js.Any = js.native
    
    /* private */ def _requestFileSizeSync(path: js.Any): js.Any = js.native
    
    /**
      * Synchronously download the given file.
      */
    /* private */ def _requestFileSync(p: js.Any, `type`: js.Any): js.Any = js.native
    
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, _]): Unit = js.native
    
    def empty(): Unit = js.native
    
    /* InferMemberOverrides */
    override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def existsSync(p: String): Boolean = js.native
    
    /* private */ def getXhrPath(filePath: js.Any): js.Any = js.native
    
    /* InferMemberOverrides */
    override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdirSync(p: String, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
    
    /* InferMemberOverrides */
    override def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
    
    val prefixUrl: String = js.native
    
    /**
      * Special XHR function: Preload the given file into the index.
      * @param [String] path
      * @param [BrowserFS.Buffer] buffer
      */
    def preloadFile(path: String, buffer: Buffer): Unit = js.native
    
    /* InferMemberOverrides */
    override def readFile(fname: String, encoding: String, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
    /* InferMemberOverrides */
    override def readFile(fname: String, encoding: Null, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
    
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: String, flag: FileFlag): js.Any = js.native
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: Null, flag: FileFlag): js.Any = js.native
    
    /* InferMemberOverrides */
    override def readdir(p: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
    
    /* InferMemberOverrides */
    override def readdirSync(p: String): js.Array[String] = js.native
    
    /* InferMemberOverrides */
    override def readlinkSync(p: String): String = js.native
    
    /* InferMemberOverrides */
    override def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
    
    /* InferMemberOverrides */
    override def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
    
    /* InferMemberOverrides */
    override def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def renameSync(oldPath: String, newPath: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def rmdir(p: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def rmdirSync(p: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Boolean, cb: BFSCallback[typingsSlinky.browserfs.nodeFsStatsMod.default]): Unit = js.native
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Null, cb: BFSCallback[typingsSlinky.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /* InferMemberOverrides */
    override def statSync(p: String): typingsSlinky.browserfs.nodeFsStatsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typingsSlinky.browserfs.nodeFsStatsMod.default = js.native
    
    /* InferMemberOverrides */
    override def supportsLinks(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def truncateSync(p: String, len: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def unlinkSync(p: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(p: String, atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  
  @js.native
  trait XmlHttpRequestOptions extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var index: js.UndefOr[String | js.Object] = js.native
  }
  object XmlHttpRequestOptions {
    
    @scala.inline
    def apply(): XmlHttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlHttpRequestOptions]
    }
    
    @scala.inline
    implicit class XmlHttpRequestOptionsMutableBuilder[Self <: XmlHttpRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setIndex(value: String | js.Object): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
}
