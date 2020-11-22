package typingsSlinky.promiseFs

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.anon.BaseEncodingOptionsflagOp
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.BaseEncodingOptionsmodeMo
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.EmitClose
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.Interval
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.anon.Persistent
import typingsSlinky.node.anon.Recursive
import typingsSlinky.node.anon.`3`
import typingsSlinky.node.fsMod.BaseEncodingOptions
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BufferEncodingOption
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.OpenDirOptions
import typingsSlinky.node.fsMod.OpenMode
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.ReadSyncOptions
import typingsSlinky.node.fsMod.RmDirOptions
import typingsSlinky.node.fsMod.RmOptions
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.StatsBase
import typingsSlinky.node.fsMod.WriteFileOptions
import typingsSlinky.node.fsMod.symlink.Type
import typingsSlinky.node.promisesMod.FileHandle
import typingsSlinky.promiseFs.anon.BufferBytesRead
import typingsSlinky.promiseFs.anon.BufferBytesWritten
import typingsSlinky.promiseFs.anon.BufferDataView
import typingsSlinky.promiseFs.anon.BufferFloat32Array
import typingsSlinky.promiseFs.anon.BufferFloat64Array
import typingsSlinky.promiseFs.anon.BufferInt16Array
import typingsSlinky.promiseFs.anon.BufferInt32Array
import typingsSlinky.promiseFs.anon.BufferInt8Array
import typingsSlinky.promiseFs.anon.BufferUint32Array
import typingsSlinky.promiseFs.anon.BytesRead
import typingsSlinky.promiseFs.anon.BytesWritten
import typingsSlinky.promiseFs.anon.Encoding
import typingsSlinky.promiseFs.anon.EncodingFlag
import typingsSlinky.promiseFs.anon.EncodingWithFileTypes
import typingsSlinky.promiseFs.anon.Flag
import typingsSlinky.promiseFs.anon.WithFileTypes
import typingsSlinky.promiseFs.anon.`0`
import typingsSlinky.promiseFs.anon.`1`
import typingsSlinky.promiseFs.anon.`2`
import typingsSlinky.promiseFs.anon.`4`
import typingsSlinky.promiseFs.promiseFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-fs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def access(path: PathLike): js.Promise[Unit] = js.native
  def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  
  def accessSync(path: PathLike): Unit = js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  
  def appendFile(file: Double, data: js.Any): js.Promise[Unit] = js.native
  def appendFile(file: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def appendFile(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
  def appendFile(file: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  
  def appendFileSync(file: Double, data: String): Unit = js.native
  def appendFileSync(file: Double, data: String, options: WriteFileOptions): Unit = js.native
  def appendFileSync(file: Double, data: js.typedarray.Uint8Array): Unit = js.native
  def appendFileSync(file: Double, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  def appendFileSync(file: PathLike, data: String): Unit = js.native
  def appendFileSync(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  def appendFileSync(file: PathLike, data: js.typedarray.Uint8Array): Unit = js.native
  def appendFileSync(file: PathLike, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  
  def chmod(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def chmod(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  
  def chmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  def close(fd: Double): js.Promise[Unit] = js.native
  
  def closeSync(fd: Double): Unit = js.native
  
  def copyFile(src: PathLike, dst: PathLike): js.Promise[Unit] = js.native
  def copyFile(src: PathLike, dst: PathLike, flags: Double): js.Promise[Unit] = js.native
  
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
  
  def createReadStream(path: PathLike): typingsSlinky.node.fsMod.ReadStream = js.native
  def createReadStream(path: PathLike, options: String): typingsSlinky.node.fsMod.ReadStream = js.native
  def createReadStream(path: PathLike, options: AutoClose): typingsSlinky.node.fsMod.ReadStream = js.native
  
  def createWriteStream(path: PathLike): typingsSlinky.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: String): typingsSlinky.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: EmitClose): typingsSlinky.node.fsMod.WriteStream = js.native
  
  def existsSync(path: PathLike): Boolean = js.native
  
  def fchmod(fd: Double, mode: String): js.Promise[Unit] = js.native
  def fchmod(fd: Double, mode: Double): js.Promise[Unit] = js.native
  
  def fchmodSync(fd: Double, mode: Mode): Unit = js.native
  
  def fchown(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  def fdatasyncSync(fd: Double): Unit = js.native
  
  def fstat(fd: Double): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  
  def fstatSync(fd: Double): typingsSlinky.node.fsMod.Stats = js.native
  
  def fsync(fd: Double): js.Promise[Unit] = js.native
  
  def fsyncSync(fd: Double): Unit = js.native
  
  def ftruncate(fd: Double): js.Promise[Unit] = js.native
  def ftruncate(fd: Double, len: Double): js.Promise[Unit] = js.native
  
  def ftruncateSync(fd: Double): Unit = js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  def futimes(fd: Double, atime: String, mtime: String): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  def futimes(fd: Double, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  
  def futimesSync(fd: Double, atime: String, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: js.Date): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: js.Date): Unit = js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: js.Date): Unit = js.native
  
  def lchmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  
  def lstat(path: PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  
  def lstatSync(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
  
  def lutimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
  def lutimesSync(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
  
  def mkdir(path: PathLike): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: String): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: Double): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
  
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
  
  def mkdtempSync(prefix: String): String = js.native
  def mkdtempSync(prefix: String, options: String): String | Buffer = js.native
  def mkdtempSync(prefix: String, options: BufferEncoding): String = js.native
  def mkdtempSync(prefix: String, options: BaseEncodingOptions): String = js.native
  def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_Union(prefix: String): String | Buffer = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_Union(prefix: String, options: BaseEncodingOptions): String | Buffer = js.native
  
  def open(path: PathLike, flags: String): js.Promise[Double] = js.native
  def open(path: PathLike, flags: String, mode: String): js.Promise[Double] = js.native
  def open(path: PathLike, flags: String, mode: Double): js.Promise[Double] = js.native
  def open(path: PathLike, flags: Double): js.Promise[Double] = js.native
  def open(path: PathLike, flags: Double, mode: String): js.Promise[Double] = js.native
  def open(path: PathLike, flags: Double, mode: Double): js.Promise[Double] = js.native
  
  def openSync(path: PathLike, flags: OpenMode): Double = js.native
  def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  
  def opendirSync(path: String): typingsSlinky.node.fsMod.Dir = js.native
  def opendirSync(path: String, options: OpenDirOptions): typingsSlinky.node.fsMod.Dir = js.native
  
  def read(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[BufferDataView] = js.native
  def read(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = js.native
  def read(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[BufferBytesRead] = js.native
  def read(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferBytesRead] = js.native
  def read(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = js.native
  def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[typingsSlinky.promiseFs.anon.Buffer] = js.native
  def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typingsSlinky.promiseFs.anon.Buffer] = js.native
  def read(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[BytesRead] = js.native
  def read(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double
  ): js.Promise[BytesRead] = js.native
  
  def readFile(path: Double): js.Promise[Buffer] = js.native
  def readFile(path: Double, options: String): js.Promise[String] = js.native
  def readFile(path: Double, options: Encoding): js.Promise[Buffer] = js.native
  def readFile(path: Double, options: EncodingFlag): js.Promise[String | Buffer] = js.native
  def readFile(path: Double, options: Flag): js.Promise[String] = js.native
  def readFile(path: PathLike): js.Promise[Buffer] = js.native
  def readFile(path: PathLike, options: String): js.Promise[String] = js.native
  def readFile(path: PathLike, options: Encoding): js.Promise[Buffer] = js.native
  def readFile(path: PathLike, options: EncodingFlag): js.Promise[String | Buffer] = js.native
  def readFile(path: PathLike, options: Flag): js.Promise[String] = js.native
  
  def readFileSync(path: Double): String | Buffer = js.native
  def readFileSync(path: Double, options: BufferEncoding): String = js.native
  def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
  def readFileSync(path: Double, options: `3`): Buffer = js.native
  def readFileSync(path: PathLike): String | Buffer = js.native
  def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
  def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
  def readFileSync(path: PathLike, options: `3`): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: Double): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: PathLike): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
  
  def readSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
  
  def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
  def readdir(path: PathLike, options: String): js.Promise[js.Array[Buffer | String]] = js.native
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  def readdir(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
  def readdir(path: PathLike, options: `0`): js.Promise[js.Array[Buffer | String]] = js.native
  def readdir(path: PathLike, options: `1`): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = js.native
  
  def readdirSync(path: PathLike): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[typingsSlinky.node.fsMod.Dirent] = js.native
  def readdirSync(path: PathLike, options: typingsSlinky.node.anon.Encoding): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: typingsSlinky.node.anon.WithFileTypes): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  
  @JSName("readdir")
  def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  
  def readlink(path: PathLike): js.Promise[String] = js.native
  def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def readlink(path: PathLike, options: `2`): js.Promise[String] = js.native
  def readlink(path: PathLike, options: typingsSlinky.promiseFs.anon.`3`): js.Promise[Buffer] = js.native
  def readlink(path: PathLike, options: `4`): js.Promise[String | Buffer] = js.native
  
  def readlinkSync(path: PathLike): String = js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  def readlinkSync(path: PathLike, options: BaseEncodingOptions): String = js.native
  def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  @JSName("readlinkSync")
  def readlinkSync_Union(path: PathLike): String | Buffer = js.native
  @JSName("readlinkSync")
  def readlinkSync_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  
  @JSName("readlink")
  def readlink_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  
  def realpath(path: PathLike): js.Promise[String] = js.native
  def realpath(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def realpath(path: PathLike, options: `2`): js.Promise[String] = js.native
  def realpath(path: PathLike, options: typingsSlinky.promiseFs.anon.`3`): js.Promise[Buffer] = js.native
  def realpath(path: PathLike, options: `4`): js.Promise[String | Buffer] = js.native
  @JSName("realpath")
  def realpath_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  
  def rmSync(path: PathLike): Unit = js.native
  def rmSync(path: PathLike, options: RmOptions): Unit = js.native
  
  def rmdir(path: PathLike): js.Promise[Unit] = js.native
  def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = js.native
  
  def rmdirSync(path: PathLike): Unit = js.native
  def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
  
  def stat(path: PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  
  def statSync(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
  def statSync(path: PathLike, options: BigIntOptions): typingsSlinky.node.fsMod.BigIntStats = js.native
  def statSync(path: PathLike, options: StatOptions): typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats = js.native
  
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  
  def truncateSync(path: PathLike): Unit = js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  
  def unlinkSync(path: PathLike): Unit = js.native
  
  def unwatchFile(filename: PathLike): Unit = js.native
  def unwatchFile(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  
  def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  
  def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
  
  def watch(filename: PathLike): FSWatcher = js.native
  def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: String): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: Persistent): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Persistent,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: Recursive): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Recursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  def watchFile(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  def watchFile(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
  @JSName("watch")
  def watch_buffer(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  def write(fd: Double, string: js.Any): js.Promise[BufferBytesWritten] = js.native
  def write(fd: Double, string: js.Any, position: js.UndefOr[scala.Nothing], encoding: String): js.Promise[BufferBytesWritten] = js.native
  def write(fd: Double, string: js.Any, position: Double): js.Promise[BufferBytesWritten] = js.native
  def write(fd: Double, string: js.Any, position: Double, encoding: String): js.Promise[BufferBytesWritten] = js.native
  def write(fd: Double, string: js.Any, position: Null, encoding: String): js.Promise[BufferBytesWritten] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  
  def writeFile(path: Double, data: js.Any): js.Promise[Unit] = js.native
  def writeFile(path: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def writeFile(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
  def writeFile(path: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  
  def writeFileSync(path: Double, data: String): Unit = js.native
  def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: Double, data: ArrayBufferView): Unit = js.native
  def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: PathLike, data: String): Unit = js.native
  def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView): Unit = js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, string: String): Double = js.native
  def writeSync(fd: Double, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def writeSync(fd: Double, string: String, position: Double): Double = js.native
  def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
  def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
  
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  
  @js.native
  class BigIntStats ()
    extends typingsSlinky.node.fsMod.BigIntStats
  
  @js.native
  class Dir ()
    extends typingsSlinky.node.fsMod.Dir
  
  @js.native
  class Dirent ()
    extends typingsSlinky.node.fsMod.Dirent
  
  @js.native
  class ReadStream ()
    extends typingsSlinky.node.fsMod.ReadStream
  
  @js.native
  class Stats () extends StatsBase[Double]
  
  @js.native
  class WriteStream ()
    extends typingsSlinky.node.fsMod.WriteStream
  
  @js.native
  object constants extends js.Object {
    
    // File Copy Constants
    /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
    val COPYFILE_EXCL: Double = js.native
    
    /**
      * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
      */
    val COPYFILE_FICLONE: Double = js.native
    
    /**
      * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
      */
    val COPYFILE_FICLONE_FORCE: Double = js.native
    
    // File Access Constants
    /** Constant for fs.access(). File is visible to the calling process. */
    val F_OK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    val O_APPEND: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    val O_CREAT: Double = js.native
    
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    val O_DIRECT: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    val O_DIRECTORY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
    val O_DSYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    val O_EXCL: Double = js.native
    
    /**
      * constant for fs.open().
      * Flag indicating reading accesses to the file system will no longer result in
      * an update to the atime information associated with the file.
      * This flag is available on Linux operating systems only.
      */
    val O_NOATIME: Double = js.native
    
    /**
      * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
      * opening the path shall not cause that terminal to become the controlling terminal for the process
      * (if the process does not already have one).
      */
    val O_NOCTTY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    val O_NOFOLLOW: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    val O_NONBLOCK: Double = js.native
    
    // File Open Constants
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    val O_RDONLY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    val O_RDWR: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    val O_SYMLINK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    val O_SYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    val O_TRUNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    val O_WRONLY: Double = js.native
    
    /** Constant for fs.access(). File can be read by the calling process. */
    val R_OK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    val S_IFBLK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    val S_IFCHR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    val S_IFDIR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    val S_IFIFO: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    val S_IFLNK: Double = js.native
    
    // File Type Constants
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    val S_IFMT: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    val S_IFREG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    val S_IFSOCK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    val S_IRGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    val S_IROTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    val S_IRUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    val S_IRWXG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    val S_IRWXO: Double = js.native
    
    // File Mode Constants
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    val S_IRWXU: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    val S_IWGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    val S_IWOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    val S_IWUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    val S_IXGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    val S_IXOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    val S_IXUSR: Double = js.native
    
    /**
      * When set, a memory file mapping is used to access the file. This flag
      * is available on Windows operating systems only. On other operating systems,
      * this flag is ignored.
      */
    val UV_FS_O_FILEMAP: Double = js.native
    
    /** Constant for fs.access(). File can be written by the calling process. */
    val W_OK: Double = js.native
    
    /** Constant for fs.access(). File can be executed by the calling process. */
    val X_OK: Double = js.native
  }
  
  @js.native
  object exists extends js.Object {
    
    def apply(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  }
  
  @js.native
  object fdatasync extends js.Object {
    
    def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  object lchmod extends js.Object {
    
    def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  object lutimes extends js.Object {
    
    def apply(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: String, mtime: js.Date, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: Double, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: js.Date, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: js.Date, mtime: String, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: js.Date, mtime: Double, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, atime: js.Date, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  object mkdtemp extends js.Object {
    
    def apply(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = js.native
    def apply(
      prefix: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: Null,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: BufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: typingsSlinky.node.anon.`2`,
      callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: BaseEncodingOptions,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
    ): Unit = js.native
  }
  
  @js.native
  object opendir extends js.Object {
    
    def apply(
      path: String,
      cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsSlinky.node.fsMod.Dir, Unit]
    ): Unit = js.native
    def apply(
      path: String,
      options: OpenDirOptions,
      cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsSlinky.node.fsMod.Dir, Unit]
    ): Unit = js.native
  }
  
  @js.native
  object promises extends js.Object {
    
    /**
      * Asynchronously tests a user's permissions for the file specified by path.
      * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    def access(path: PathLike): js.Promise[Unit] = js.native
    def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously append data to a file, creating the file if it does not exist.
      * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    def appendFile(path: PathLike, data: String): js.Promise[Unit] = js.native
    def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous chown(2) - Change ownership of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
      * Node.js makes no guarantees about the atomicity of the copy operation.
      * If an error occurs after the destination file has been opened for writing, Node.js will attempt
      * to remove the destination.
      * @param src A path to the source file.
      * @param dest A path to the destination file.
      * @param flags An optional integer that specifies the behavior of the copy operation. The only
      * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
      * `dest` already exists.
      */
    def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
    def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param handle A `FileHandle`.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def fchmod(handle: FileHandle, mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      * @param handle A `FileHandle`.
      */
    def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      * @param handle A `FileHandle`.
      */
    def fdatasync(handle: FileHandle): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fstat(2) - Get file status.
      * @param handle A `FileHandle`.
      */
    def fstat(handle: FileHandle): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
    
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      * @param handle A `FileHandle`.
      */
    def fsync(handle: FileHandle): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param handle A `FileHandle`.
      * @param len If not specified, defaults to `0`.
      */
    def ftruncate(handle: FileHandle): js.Promise[Unit] = js.native
    def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def futimes(handle: FileHandle, atime: String, mtime: String): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: String, mtime: Double): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Double, mtime: String): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
      * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def lstat(path: PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
    
    /**
      * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`,
      * with the difference that if the path refers to a symbolic link, then the link is not
      * dereferenced: instead, the timestamps of the symbolic link itself are changed.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def lutimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
    def lutimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    def mkdir(path: PathLike): js.Promise[Unit] = js.native
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
    def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def mkdtemp(prefix: String): js.Promise[String] = js.native
    def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
    def mkdtemp(prefix: String, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous open(2) - open and possibly create a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
      * supplied, defaults to `0o666`.
      */
    def open(path: PathLike, flags: String): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: Double): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = js.native
    
    def opendir(path: String): js.Promise[typingsSlinky.node.fsMod.Dir] = js.native
    def opendir(path: String, options: OpenDirOptions): js.Promise[typingsSlinky.node.fsMod.Dir] = js.native
    
    /**
      * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If
      * `null`, data will be read from the current position.
      */
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Null,
      position: Double
    ): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Null,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typingsSlinky.node.anon.Buffer[TBuffer]] = js.native
    
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(path: PathLike): js.Promise[Buffer] = js.native
    def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    def readFile(path: PathLike, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(path: PathLike, options: typingsSlinky.node.anon.EncodingFlag): js.Promise[String] = js.native
    def readFile(path: PathLike, options: typingsSlinky.node.anon.Flag): js.Promise[Buffer] = js.native
    def readFile(path: FileHandle): js.Promise[Buffer] = js.native
    def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = js.native
    def readFile(path: FileHandle, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
    def readFile(path: FileHandle, options: typingsSlinky.node.anon.EncodingFlag): js.Promise[String] = js.native
    def readFile(path: FileHandle, options: typingsSlinky.node.anon.Flag): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
    def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
    def readdir(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
      */
    def readdir(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readdir(path: PathLike, options: typingsSlinky.node.anon.Encoding): js.Promise[js.Array[Buffer]] = js.native
    @JSName("readdir")
    def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
    
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readlink(path: PathLike): js.Promise[String] = js.native
    def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    def readlink(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def realpath(path: PathLike): js.Promise[String] = js.native
    def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    def realpath(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous rename(2) - Change the name or location of a file or directory.
      * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously removes files and directories (modeled on the standard POSIX `rm` utility).
      */
    def rm(path: PathLike): js.Promise[Unit] = js.native
    def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def rmdir(path: PathLike): js.Promise[Unit] = js.native
    def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def stat(path: PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
    
    /**
      * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
      * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
      * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
      * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
      * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
      */
    def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
    def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous truncate(2) - Truncate a file to a specified length.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param len If not specified, defaults to `0`.
      */
    def truncate(path: PathLike): js.Promise[Unit] = js.native
    def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def unlink(path: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied path.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param string A string to write.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    def write(handle: FileHandle, string: String): js.Promise[typingsSlinky.node.anon.BufferBytesWritten] = js.native
    def write(handle: FileHandle, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): js.Promise[typingsSlinky.node.anon.BufferBytesWritten] = js.native
    def write(handle: FileHandle, string: String, position: Double): js.Promise[typingsSlinky.node.anon.BufferBytesWritten] = js.native
    def write(handle: FileHandle, string: String, position: Double, encoding: BufferEncoding): js.Promise[typingsSlinky.node.anon.BufferBytesWritten] = js.native
    def write(handle: FileHandle, string: String, position: Null, encoding: BufferEncoding): js.Promise[typingsSlinky.node.anon.BufferBytesWritten] = js.native
    /**
      * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Null,
      position: Double
    ): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Null,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typingsSlinky.node.anon.BytesWritten[TBuffer]] = js.native
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.
      * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    def writeFile(path: PathLike, data: String): js.Promise[Unit] = js.native
    def writeFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def writeFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def writeFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(path: PathLike, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  }
  
  @js.native
  object readv extends js.Object {
    
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      position: Double,
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  object realpathSync extends js.Object {
    
    def apply(path: PathLike): String = js.native
    def apply(path: PathLike, options: String): String | Buffer = js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
    def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    
    def native(path: PathLike): String = js.native
    def native(path: PathLike, options: String): String | Buffer = js.native
    def native(path: PathLike, options: BufferEncoding): String = js.native
    def native(path: PathLike, options: BaseEncodingOptions): String = js.native
    def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    @JSName("native")
    def native_Union(path: PathLike): String | Buffer = js.native
    @JSName("native")
    def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  }
  
  @js.native
  object rm extends js.Object {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  object symlink extends js.Object {
    
    def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  object truncate extends js.Object {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, len: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, len: Double, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, len: Null, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  object writev extends js.Object {
    
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesWritten */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      position: Double,
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesWritten */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
  }
}
