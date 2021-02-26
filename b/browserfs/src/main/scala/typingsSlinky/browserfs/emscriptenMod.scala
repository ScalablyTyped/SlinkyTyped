package typingsSlinky.browserfs

import typingsSlinky.browserfs.fileMod.BaseFile
import typingsSlinky.browserfs.fileMod.File
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.BFSOneArgCallback
import typingsSlinky.browserfs.fileSystemMod.BFSThreeArgCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.fileSystemMod.SynchronousFileSystem
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emscriptenMod {
  
  @JSImport("browserfs/dist/node/backend/Emscripten", JSImport.Default)
  @js.native
  class default protected () extends EmscriptenFileSystem {
    /**
      * Creates a BrowserFS file system for the given Emscripten file system.
      * @param _FS The Emscripten file system (`FS`).
      */
    def this(_FS: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Create an EmscriptenFileSystem instance with the given options.
      */
    @JSImport("browserfs/dist/node/backend/Emscripten", "default.Create")
    @js.native
    def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
    
    @JSImport("browserfs/dist/node/backend/Emscripten", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/Emscripten", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    @JSImport("browserfs/dist/node/backend/Emscripten", "default.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
  }
  
  @JSImport("browserfs/dist/node/backend/Emscripten", "EmscriptenFile")
  @js.native
  class EmscriptenFile protected ()
    extends BaseFile
       with File {
    def this(_fs: EmscriptenFileSystem, _FS: js.Any, _path: String, _stream: js.Any) = this()
    
    var _FS: js.Any = js.native
    
    var _fs: js.Any = js.native
    
    var _path: js.Any = js.native
    
    var _stream: js.Any = js.native
    
    /* InferMemberOverrides */
    override def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasyncSync(): Unit = js.native
    
    def read(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    def readSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double
    ): Double = js.native
    def readSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
    
    /* InferMemberOverrides */
    override def sync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def syncSync(): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(atime: js.Date, mtime: js.Date): Unit = js.native
    
    def write(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    def writeSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double
    ): Double = js.native
    def writeSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
  }
  
  @js.native
  trait EmscriptenFileSystem extends SynchronousFileSystem {
    
    var _FS: js.Any = js.native
    
    def getName(): String = js.native
    
    def isReadOnly(): Boolean = js.native
    
    /* private */ def modeToFileType(mode: js.Any): js.Any = js.native
    
    def supportsProps(): Boolean = js.native
  }
  
  @js.native
  trait EmscriptenFileSystemOptions extends StObject {
    
    var FS: js.Any = js.native
  }
  object EmscriptenFileSystemOptions {
    
    @scala.inline
    def apply(FS: js.Any): EmscriptenFileSystemOptions = {
      val __obj = js.Dynamic.literal(FS = FS.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmscriptenFileSystemOptions]
    }
    
    @scala.inline
    implicit class EmscriptenFileSystemOptionsMutableBuilder[Self <: EmscriptenFileSystemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFS(value: js.Any): Self = StObject.set(x, "FS", value.asInstanceOf[js.Any])
    }
  }
}
