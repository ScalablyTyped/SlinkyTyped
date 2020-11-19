package typingsSlinky.memfs.promisesMod

import typingsSlinky.memfs.encodingMod.TDataOut
import typingsSlinky.memfs.statsMod.TStatNumber
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
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromisesAPI extends js.Object {
  
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
  
  def lstat(path: PathLike): js.Promise[typingsSlinky.memfs.statsMod.default[TStatNumber]] = js.native
  def lstat(path: PathLike, options: IStatOptions): js.Promise[typingsSlinky.memfs.statsMod.default[TStatNumber]] = js.native
  
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
  
  def stat(path: PathLike): js.Promise[typingsSlinky.memfs.statsMod.default[TStatNumber]] = js.native
  def stat(path: PathLike, options: IStatOptions): js.Promise[typingsSlinky.memfs.statsMod.default[TStatNumber]] = js.native
  
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def symlink(target: PathLike, path: PathLike, `type`: Type): js.Promise[Unit] = js.native
  
  def truncate(path: PathLike): js.Promise[Unit] = js.native
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
  
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  
  def utimes(path: PathLike, atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
  
  def writeFile(id: TFileHandle, data: TData): js.Promise[Unit] = js.native
  def writeFile(id: TFileHandle, data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
}
