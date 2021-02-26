package typingsSlinky.memfs

import typingsSlinky.memfs.encodingMod.TDataOut
import typingsSlinky.memfs.statsMod.TStatNumber
import typingsSlinky.memfs.statsMod.default
import typingsSlinky.memfs.volumeMod.IAppendFileOptions
import typingsSlinky.memfs.volumeMod.IMkdirOptions
import typingsSlinky.memfs.volumeMod.IOptions
import typingsSlinky.memfs.volumeMod.IReadFileOptions
import typingsSlinky.memfs.volumeMod.IReaddirOptions
import typingsSlinky.memfs.volumeMod.IRealpathOptions
import typingsSlinky.memfs.volumeMod.IStatOptions
import typingsSlinky.memfs.volumeMod.IWriteFileOptions
import typingsSlinky.memfs.volumeMod.TData
import typingsSlinky.memfs.volumeMod.TFlags
import typingsSlinky.memfs.volumeMod.TFlagsCopy
import typingsSlinky.memfs.volumeMod.TMode
import typingsSlinky.memfs.volumeMod.TTime
import typingsSlinky.memfs.volumeMod.Volume
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisesMod {
  
  @JSImport("memfs/lib/promises", JSImport.Default)
  @js.native
  def default(vol: Volume): Null | IPromisesAPI = js.native
  
  @JSImport("memfs/lib/promises", "FileHandle")
  @js.native
  class FileHandle protected () extends IFileHandle {
    def this(vol: Volume, fd: Double) = this()
    
    def sync(): js.Promise[Unit] = js.native
    
    var vol: js.Any = js.native
  }
  
  @js.native
  trait IFileHandle extends StObject {
    
    def appendFile(data: TData): js.Promise[Unit] = js.native
    def appendFile(data: TData, options: String): js.Promise[Unit] = js.native
    def appendFile(data: TData, options: IAppendFileOptions): js.Promise[Unit] = js.native
    
    def chmod(mode: TMode): js.Promise[Unit] = js.native
    
    def chown(uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def datasync(): js.Promise[Unit] = js.native
    
    var fd: Double = js.native
    
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
    def read(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
    
    def readFile(): js.Promise[TDataOut] = js.native
    def readFile(options: String): js.Promise[TDataOut] = js.native
    def readFile(options: IReadFileOptions): js.Promise[TDataOut] = js.native
    
    def stat(): js.Promise[default[TStatNumber]] = js.native
    def stat(options: IStatOptions): js.Promise[default[TStatNumber]] = js.native
    
    def truncate(): js.Promise[Unit] = js.native
    def truncate(len: Double): js.Promise[Unit] = js.native
    
    def utimes(atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
    
    def write(buffer: js.typedarray.Uint8Array): js.Promise[TFileHandleWriteResult] = js.native
    def write(
      buffer: js.typedarray.Uint8Array,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(
      buffer: js.typedarray.Uint8Array,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer): js.Promise[TFileHandleWriteResult] = js.native
    def write(
      buffer: Buffer,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double, length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    
    def writeFile(data: TData): js.Promise[Unit] = js.native
    def writeFile(data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait IPromisesAPI extends StObject {
    
    var FileHandle: js.Any = js.native
    
    def access(path: PathLike): js.Promise[Unit] = js.native
    def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    
    def appendFile(path: TFileHandle, data: TData): js.Promise[Unit] = js.native
    def appendFile(path: TFileHandle, data: TData, options: String): js.Promise[Unit] = js.native
    def appendFile(path: TFileHandle, data: TData, options: IAppendFileOptions): js.Promise[Unit] = js.native
    
    def chmod(path: PathLike, mode: TMode): js.Promise[Unit] = js.native
    
    def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
    def copyFile(src: PathLike, dest: PathLike, flags: TFlagsCopy): js.Promise[Unit] = js.native
    
    def lchmod(path: PathLike, mode: TMode): js.Promise[Unit] = js.native
    
    def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    def lstat(path: PathLike): js.Promise[default[TStatNumber]] = js.native
    def lstat(path: PathLike, options: IStatOptions): js.Promise[default[TStatNumber]] = js.native
    
    def mkdir(path: PathLike): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: IMkdirOptions): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: TMode): js.Promise[Unit] = js.native
    
    def mkdtemp(prefix: String): js.Promise[TDataOut] = js.native
    def mkdtemp(prefix: String, options: IOptions): js.Promise[TDataOut] = js.native
    
    def open(path: PathLike, flags: TFlags): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: TFlags, mode: TMode): js.Promise[FileHandle] = js.native
    
    def readFile(id: TFileHandle): js.Promise[TDataOut] = js.native
    def readFile(id: TFileHandle, options: String): js.Promise[TDataOut] = js.native
    def readFile(id: TFileHandle, options: IReadFileOptions): js.Promise[TDataOut] = js.native
    
    def readdir(path: PathLike): js.Promise[js.Array[TDataOut | typingsSlinky.memfs.direntMod.default]] = js.native
    def readdir(path: PathLike, options: String): js.Promise[js.Array[TDataOut | typingsSlinky.memfs.direntMod.default]] = js.native
    def readdir(path: PathLike, options: IReaddirOptions): js.Promise[js.Array[TDataOut | typingsSlinky.memfs.direntMod.default]] = js.native
    
    def readlink(path: PathLike): js.Promise[TDataOut] = js.native
    def readlink(path: PathLike, options: IOptions): js.Promise[TDataOut] = js.native
    
    def realpath(path: PathLike): js.Promise[TDataOut] = js.native
    def realpath(path: PathLike, options: String): js.Promise[TDataOut] = js.native
    def realpath(path: PathLike, options: IRealpathOptions): js.Promise[TDataOut] = js.native
    
    def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    def rmdir(path: PathLike): js.Promise[Unit] = js.native
    
    def stat(path: PathLike): js.Promise[default[TStatNumber]] = js.native
    def stat(path: PathLike, options: IStatOptions): js.Promise[default[TStatNumber]] = js.native
    
    def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
    def symlink(target: PathLike, path: PathLike, `type`: Type): js.Promise[Unit] = js.native
    
    def truncate(path: PathLike): js.Promise[Unit] = js.native
    def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
    
    def unlink(path: PathLike): js.Promise[Unit] = js.native
    
    def utimes(path: PathLike, atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
    
    def writeFile(id: TFileHandle, data: TData): js.Promise[Unit] = js.native
    def writeFile(id: TFileHandle, data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
  }
  
  type TFileHandle = PathLike | IFileHandle
  
  @js.native
  trait TFileHandleReadResult extends StObject {
    
    var buffer: Buffer | js.typedarray.Uint8Array = js.native
    
    var bytesRead: Double = js.native
  }
  object TFileHandleReadResult {
    
    @scala.inline
    def apply(buffer: Buffer | js.typedarray.Uint8Array, bytesRead: Double): TFileHandleReadResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[TFileHandleReadResult]
    }
    
    @scala.inline
    implicit class TFileHandleReadResultMutableBuilder[Self <: TFileHandleReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TFileHandleWriteResult extends StObject {
    
    var buffer: Buffer | js.typedarray.Uint8Array = js.native
    
    var bytesWritten: Double = js.native
  }
  object TFileHandleWriteResult {
    
    @scala.inline
    def apply(buffer: Buffer | js.typedarray.Uint8Array, bytesWritten: Double): TFileHandleWriteResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[TFileHandleWriteResult]
    }
    
    @scala.inline
    implicit class TFileHandleWriteResultMutableBuilder[Self <: TFileHandleWriteResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
}
