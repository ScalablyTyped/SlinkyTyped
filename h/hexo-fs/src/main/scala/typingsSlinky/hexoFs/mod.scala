package typingsSlinky.hexoFs

import typingsSlinky.chokidar.mod.FSWatcher
import typingsSlinky.chokidar.mod.WatchOptions
import typingsSlinky.hexoFs.anon.BufferBytesWritten
import typingsSlinky.hexoFs.anon.BytesRead
import typingsSlinky.hexoFs.anon.BytesWritten
import typingsSlinky.hexoFs.anon.DirectoryOptionsexcludeAr
import typingsSlinky.hexoFs.anon.Encoding
import typingsSlinky.hexoFs.anon.Escape
import typingsSlinky.hexoFs.anon.Flag
import typingsSlinky.hexoFs.anon.`0`
import typingsSlinky.hexoFs.anon.`1`
import typingsSlinky.hexoFs.anon.`2`
import typingsSlinky.hexoFs.hexoFsStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.EmitClose
import typingsSlinky.node.anon.Interval
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.fsMod.BaseEncodingOptions
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.BufferEncodingOption
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.OpenMode
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.ReadSyncOptions
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.symlink.Type
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hexo-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hexo-fs", "F_OK")
  @js.native
  def F_OK: js.UndefOr[Double] = js.native
  @scala.inline
  def F_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "R_OK")
  @js.native
  def R_OK: js.UndefOr[Double] = js.native
  @scala.inline
  def R_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "ReadStream")
  @js.native
  class ReadStream ()
    extends typingsSlinky.gracefulFs.mod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("hexo-fs", "Stats")
  @js.native
  class Stats ()
    extends typingsSlinky.gracefulFs.mod.Stats
  
  @JSImport("hexo-fs", "W_OK")
  @js.native
  def W_OK: js.UndefOr[Double] = js.native
  @scala.inline
  def W_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "WriteStream")
  @js.native
  class WriteStream ()
    extends typingsSlinky.gracefulFs.mod.WriteStream {
    def this(opts: WritableOptions) = this()
  }
  
  @JSImport("hexo-fs", "X_OK")
  @js.native
  def X_OK: js.UndefOr[Double] = js.native
  @scala.inline
  def X_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "access")
  @js.native
  def access: js.UndefOr[
    js.Function2[
      /* path */ PathLike, 
      /* mode */ js.UndefOr[Double], 
      typingsSlinky.bluebird.mod.^[Unit]
    ]
  ] = js.native
  
  @JSImport("hexo-fs", "accessSync")
  @js.native
  def accessSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ js.UndefOr[Double], Unit]] = js.native
  @scala.inline
  def accessSync_=(x: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ js.UndefOr[Double], Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessSync")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def access_=(
    x: js.UndefOr[
      js.Function2[
        /* path */ PathLike, 
        /* mode */ js.UndefOr[Double], 
        typingsSlinky.bluebird.mod.^[Unit]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("access")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: js.Any): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: js.Any, options: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: js.Any, options: AppendFileOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "appendFile")
  @js.native
  def appendFile(
    path: String,
    data: js.Any,
    options: AppendFileOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "appendFileSync")
  @js.native
  def appendFileSync(path: String, data: js.Any): Unit = js.native
  @JSImport("hexo-fs", "appendFileSync")
  @js.native
  def appendFileSync(path: String, data: js.Any, options: String): Unit = js.native
  @JSImport("hexo-fs", "appendFileSync")
  @js.native
  def appendFileSync(path: String, data: js.Any, options: AppendFileOptions): Unit = js.native
  
  @JSImport("hexo-fs", "chmod")
  @js.native
  def chmod(path: PathLike, mode: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "chmod")
  @js.native
  def chmod(path: PathLike, mode: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "chmodSync")
  @js.native
  def chmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  @JSImport("hexo-fs", "chown")
  @js.native
  def chown(path: PathLike, uid: Double, gid: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "chownSync")
  @js.native
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("hexo-fs", "close")
  @js.native
  def close(fd: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "closeSync")
  @js.native
  def closeSync(fd: Double): Unit = js.native
  
  @JSImport("hexo-fs", "copyDir")
  @js.native
  def copyDir(src: String, dest: String): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "copyDir")
  @js.native
  def copyDir(
    src: String,
    dest: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "copyDir")
  @js.native
  def copyDir(
    src: String,
    dest: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "copyDir")
  @js.native
  def copyDir(src: String, dest: String, options: DirectoryOptions): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "copyDir")
  @js.native
  def copyDir(
    src: String,
    dest: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  
  @JSImport("hexo-fs", "copyFile")
  @js.native
  def copyFile(src: PathLike, dest: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "copyFile")
  @js.native
  def copyFile(src: PathLike, dest: String, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike): typingsSlinky.node.fsMod.ReadStream = js.native
  @JSImport("hexo-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: String): typingsSlinky.node.fsMod.ReadStream = js.native
  @JSImport("hexo-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: AutoClose): typingsSlinky.node.fsMod.ReadStream = js.native
  
  @JSImport("hexo-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike): typingsSlinky.node.fsMod.WriteStream = js.native
  @JSImport("hexo-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike, options: String): typingsSlinky.node.fsMod.WriteStream = js.native
  @JSImport("hexo-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike, options: EmitClose): typingsSlinky.node.fsMod.WriteStream = js.native
  
  @JSImport("hexo-fs", "emptyDir")
  @js.native
  def emptyDir(path: String): typingsSlinky.bluebird.mod.^[String | js.Array[String]] = js.native
  @JSImport("hexo-fs", "emptyDir")
  @js.native
  def emptyDir(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[String | js.Array[String]] = js.native
  @JSImport("hexo-fs", "emptyDir")
  @js.native
  def emptyDir(
    path: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[String | js.Array[String]] = js.native
  @JSImport("hexo-fs", "emptyDir")
  @js.native
  def emptyDir(path: String, options: DirectoryOptionsexcludeAr): typingsSlinky.bluebird.mod.^[String | js.Array[String]] = js.native
  @JSImport("hexo-fs", "emptyDir")
  @js.native
  def emptyDir(
    path: String,
    options: DirectoryOptionsexcludeAr,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[String | js.Array[String]] = js.native
  
  @JSImport("hexo-fs", "emptyDirSync")
  @js.native
  def emptyDirSync(path: String): String | js.Array[String] = js.native
  @JSImport("hexo-fs", "emptyDirSync")
  @js.native
  def emptyDirSync(path: String, options: js.UndefOr[scala.Nothing], parent: String): String | js.Array[String] = js.native
  @JSImport("hexo-fs", "emptyDirSync")
  @js.native
  def emptyDirSync(path: String, options: DirectoryOptionsexcludeAr): String | js.Array[String] = js.native
  @JSImport("hexo-fs", "emptyDirSync")
  @js.native
  def emptyDirSync(path: String, options: DirectoryOptionsexcludeAr, parent: String): String | js.Array[String] = js.native
  
  @JSImport("hexo-fs", "ensurePath")
  @js.native
  def ensurePath(path: String): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "ensurePath")
  @js.native
  def ensurePath(path: String, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typingsSlinky.bluebird.mod.^[String] = js.native
  
  @JSImport("hexo-fs", "ensurePathSync")
  @js.native
  def ensurePathSync(path: String): String = js.native
  
  @JSImport("hexo-fs", "ensureWriteStream")
  @js.native
  def ensureWriteStream(path: String): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  @JSImport("hexo-fs", "ensureWriteStream")
  @js.native
  def ensureWriteStream(
    path: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsSlinky.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  @JSImport("hexo-fs", "ensureWriteStream")
  @js.native
  def ensureWriteStream(
    path: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsSlinky.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  @JSImport("hexo-fs", "ensureWriteStream")
  @js.native
  def ensureWriteStream(path: String, options: String): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  @JSImport("hexo-fs", "ensureWriteStream")
  @js.native
  def ensureWriteStream(
    path: String,
    options: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsSlinky.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  @JSImport("hexo-fs", "ensureWriteStream")
  @js.native
  def ensureWriteStream(path: String, options: typingsSlinky.hexoFs.anon.AutoClose): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  @JSImport("hexo-fs", "ensureWriteStream")
  @js.native
  def ensureWriteStream(
    path: String,
    options: typingsSlinky.hexoFs.anon.AutoClose,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsSlinky.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  
  @JSImport("hexo-fs", "ensureWriteStreamSync")
  @js.native
  def ensureWriteStreamSync(path: String): typingsSlinky.gracefulFs.mod.WriteStream = js.native
  @JSImport("hexo-fs", "ensureWriteStreamSync")
  @js.native
  def ensureWriteStreamSync(path: String, options: String): typingsSlinky.gracefulFs.mod.WriteStream = js.native
  @JSImport("hexo-fs", "ensureWriteStreamSync")
  @js.native
  def ensureWriteStreamSync(path: String, options: typingsSlinky.hexoFs.anon.AutoClose): typingsSlinky.gracefulFs.mod.WriteStream = js.native
  
  @JSImport("hexo-fs", "escapeBOM")
  @js.native
  def escapeBOM(str: String): String = js.native
  
  @JSImport("hexo-fs", "escapeEOL")
  @js.native
  def escapeEOL(str: String): String = js.native
  
  @JSImport("hexo-fs", "exists")
  @js.native
  def exists(path: PathLike): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  @JSImport("hexo-fs", "exists")
  @js.native
  def exists(path: PathLike, callback: js.Function1[/* exist */ Boolean, Unit]): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  
  @JSImport("hexo-fs", "existsSync")
  @js.native
  def existsSync(path: PathLike): Boolean = js.native
  
  @JSImport("hexo-fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "fchmodSync")
  @js.native
  def fchmodSync(fd: Double, mode: Mode): Unit = js.native
  
  @JSImport("hexo-fs", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "fchownSync")
  @js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("hexo-fs", "fstat")
  @js.native
  def fstat(fd: Double): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.Stats] = js.native
  
  @JSImport("hexo-fs", "fstatSync")
  @js.native
  def fstatSync(fd: Double): typingsSlinky.node.fsMod.Stats = js.native
  
  @JSImport("hexo-fs", "fsync")
  @js.native
  def fsync(fd: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "fsyncSync")
  @js.native
  def fsyncSync(fd: Double): Unit = js.native
  
  @JSImport("hexo-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, len: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double): Unit = js.native
  @JSImport("hexo-fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: String, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: String, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: String, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: js.Date, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: js.Date, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: js.Date, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: String): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: js.Date): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: Double): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: String): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: js.Date): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: Double): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: String): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: js.Date): Unit = js.native
  @JSImport("hexo-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  
  @JSImport("hexo-fs", "lchmod")
  @js.native
  def lchmod(path: PathLike, mode: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "lchmod")
  @js.native
  def lchmod(path: PathLike, mode: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "lchmodSync")
  @js.native
  def lchmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  @JSImport("hexo-fs", "lchown")
  @js.native
  def lchown(path: PathLike, uid: Double, gid: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "lchownSync")
  @js.native
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("hexo-fs", "link")
  @js.native
  def link(existingPath: PathLike, newPath: PathLike): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "linkSync")
  @js.native
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  
  @JSImport("hexo-fs", "listDir")
  @js.native
  def listDir(path: String): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "listDir")
  @js.native
  def listDir(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "listDir")
  @js.native
  def listDir(
    path: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "listDir")
  @js.native
  def listDir(path: String, options: DirectoryOptions): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "listDir")
  @js.native
  def listDir(
    path: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  
  @JSImport("hexo-fs", "listDirSync")
  @js.native
  def listDirSync(path: String): String | js.Array[String] = js.native
  @JSImport("hexo-fs", "listDirSync")
  @js.native
  def listDirSync(path: String, options: js.UndefOr[scala.Nothing], parent: String): String | js.Array[String] = js.native
  @JSImport("hexo-fs", "listDirSync")
  @js.native
  def listDirSync(path: String, options: DirectoryOptions): String | js.Array[String] = js.native
  @JSImport("hexo-fs", "listDirSync")
  @js.native
  def listDirSync(path: String, options: DirectoryOptions, parent: String): String | js.Array[String] = js.native
  
  @JSImport("hexo-fs", "lstat")
  @js.native
  def lstat(path: PathLike): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.Stats] = js.native
  
  @JSImport("hexo-fs", "lstatSync")
  @js.native
  def lstatSync(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
  
  @JSImport("hexo-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, mode: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, mode: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  @JSImport("hexo-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  @JSImport("hexo-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  @JSImport("hexo-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  @JSImport("hexo-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  @JSImport("hexo-fs", "mkdirSync")
  @js.native
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSImport("hexo-fs", "mkdirSync")
  @js.native
  def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
  
  @JSImport("hexo-fs", "mkdirs")
  @js.native
  def mkdirs(path: PathLike): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "mkdirs")
  @js.native
  def mkdirs(path: PathLike, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "mkdirsSync")
  @js.native
  def mkdirsSync(path: String): Unit = js.native
  
  @JSImport("hexo-fs", "open")
  @js.native
  def open(path: PathLike, flags: String): typingsSlinky.bluebird.mod.^[Double] = js.native
  @JSImport("hexo-fs", "open")
  @js.native
  def open(path: PathLike, flags: String, mode: String): typingsSlinky.bluebird.mod.^[Double] = js.native
  @JSImport("hexo-fs", "open")
  @js.native
  def open(path: PathLike, flags: String, mode: Double): typingsSlinky.bluebird.mod.^[Double] = js.native
  @JSImport("hexo-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double): typingsSlinky.bluebird.mod.^[Double] = js.native
  @JSImport("hexo-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double, mode: String): typingsSlinky.bluebird.mod.^[Double] = js.native
  @JSImport("hexo-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double, mode: Double): typingsSlinky.bluebird.mod.^[Double] = js.native
  
  @JSImport("hexo-fs", "openSync")
  @js.native
  def openSync(path: PathLike, flags: OpenMode): Double = js.native
  @JSImport("hexo-fs", "openSync")
  @js.native
  def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  
  @JSImport("hexo-fs", "read")
  @js.native
  def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[BytesRead] = js.native
  @JSImport("hexo-fs", "read")
  @js.native
  def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[BytesRead] = js.native
  @JSImport("hexo-fs", "read")
  @js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[typingsSlinky.hexoFs.anon.Buffer] = js.native
  @JSImport("hexo-fs", "read")
  @js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[typingsSlinky.hexoFs.anon.Buffer] = js.native
  
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(path: Double): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(path: Double, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(
    path: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(path: Double, options: Escape): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(
    path: Double,
    options: Escape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(path: PathLike): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(path: PathLike, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(path: PathLike, options: Escape): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readFile")
  @js.native
  def readFile(
    path: PathLike,
    options: Escape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typingsSlinky.bluebird.mod.^[String] = js.native
  
  @JSImport("hexo-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double): String = js.native
  @JSImport("hexo-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: Escape): String = js.native
  @JSImport("hexo-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike): String = js.native
  @JSImport("hexo-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: Escape): String = js.native
  
  @JSImport("hexo-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  @JSImport("hexo-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  @JSImport("hexo-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  @JSImport("hexo-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
  
  @JSImport("hexo-fs", "readdir")
  @js.native
  def readdir(path: PathLike): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: String): typingsSlinky.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  @JSImport("hexo-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: Encoding): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  @JSImport("hexo-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: `0`): typingsSlinky.bluebird.mod.^[js.Array[Buffer]] = js.native
  @JSImport("hexo-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: `1`): typingsSlinky.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  @JSImport("hexo-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  
  @JSImport("hexo-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
  @JSImport("hexo-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
  @JSImport("hexo-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  @JSImport("hexo-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
  @JSImport("hexo-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: typingsSlinky.node.anon.Encoding): js.Array[Buffer] = js.native
  @JSImport("hexo-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
  @JSImport("hexo-fs", "readdirSync")
  @js.native
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  
  @JSImport("hexo-fs", "readdir")
  @js.native
  def readdir_buffer(path: PathLike, options: buffer): typingsSlinky.bluebird.mod.^[js.Array[Buffer]] = js.native
  
  @JSImport("hexo-fs", "readlink")
  @js.native
  def readlink(path: PathLike): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: String): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  @JSImport("hexo-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: `0`): typingsSlinky.bluebird.mod.^[Buffer] = js.native
  @JSImport("hexo-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: `1`): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  @JSImport("hexo-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: `2`): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.mod.^[String] = js.native
  
  @JSImport("hexo-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike): String = js.native
  @JSImport("hexo-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  @JSImport("hexo-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  @JSImport("hexo-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BaseEncodingOptions): String = js.native
  @JSImport("hexo-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  @JSImport("hexo-fs", "readlinkSync")
  @js.native
  def readlinkSync_Union(path: PathLike): String | Buffer = js.native
  @JSImport("hexo-fs", "readlinkSync")
  @js.native
  def readlinkSync_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  
  @JSImport("hexo-fs", "readlink")
  @js.native
  def readlink_buffer(path: PathLike, options: buffer): typingsSlinky.bluebird.mod.^[Buffer] = js.native
  
  @JSImport("hexo-fs", "realpath")
  @js.native
  def realpath(path: PathLike): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: String): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  @JSImport("hexo-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: `0`): typingsSlinky.bluebird.mod.^[Buffer] = js.native
  @JSImport("hexo-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: `1`): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  @JSImport("hexo-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: `2`): typingsSlinky.bluebird.mod.^[String] = js.native
  @JSImport("hexo-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.mod.^[String] = js.native
  
  object realpathSync {
    
    @JSImport("hexo-fs", "realpathSync")
    @js.native
    def apply(path: PathLike): String = js.native
    @JSImport("hexo-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: String): String | Buffer = js.native
    @JSImport("hexo-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    @JSImport("hexo-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
    @JSImport("hexo-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    
    @JSImport("hexo-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike): String = js.native
    @JSImport("hexo-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: String): String | Buffer = js.native
    @JSImport("hexo-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BufferEncoding): String = js.native
    @JSImport("hexo-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BaseEncodingOptions): String = js.native
    @JSImport("hexo-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    @JSImport("hexo-fs", "realpathSync.native")
    @js.native
    def native_Union(path: PathLike): String | Buffer = js.native
    @JSImport("hexo-fs", "realpathSync.native")
    @js.native
    def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  }
  
  @JSImport("hexo-fs", "realpath")
  @js.native
  def realpath_buffer(path: PathLike, options: buffer): typingsSlinky.bluebird.mod.^[Buffer] = js.native
  
  @JSImport("hexo-fs", "rename")
  @js.native
  def rename(oldPath: PathLike, newPath: PathLike): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "renameSync")
  @js.native
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  
  @JSImport("hexo-fs", "rmdir")
  @js.native
  def rmdir(path: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "rmdir")
  @js.native
  def rmdir(path: String, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "rmdirSync")
  @js.native
  def rmdirSync(path: String): Unit = js.native
  
  @JSImport("hexo-fs", "stat")
  @js.native
  def stat(path: PathLike): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.Stats] = js.native
  
  @JSImport("hexo-fs", "statSync")
  @js.native
  def statSync(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
  @JSImport("hexo-fs", "statSync")
  @js.native
  def statSync(path: PathLike, options: BigIntOptions): BigIntStats = js.native
  @JSImport("hexo-fs", "statSync")
  @js.native
  def statSync(path: PathLike, options: StatOptions): typingsSlinky.node.fsMod.Stats | BigIntStats = js.native
  
  @JSImport("hexo-fs", "symlink")
  @js.native
  def symlink(target: PathLike, path: PathLike): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "symlink")
  @js.native
  def symlink(target: PathLike, path: PathLike, `type`: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "symlinkSync")
  @js.native
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  @JSImport("hexo-fs", "symlinkSync")
  @js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  
  @JSImport("hexo-fs", "truncate")
  @js.native
  def truncate(path: PathLike): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "truncate")
  @js.native
  def truncate(path: PathLike, len: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "truncateSync")
  @js.native
  def truncateSync(path: PathLike): Unit = js.native
  @JSImport("hexo-fs", "truncateSync")
  @js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  
  @JSImport("hexo-fs", "unlink")
  @js.native
  def unlink(path: PathLike): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "unlinkSync")
  @js.native
  def unlinkSync(path: PathLike): Unit = js.native
  
  @JSImport("hexo-fs", "unwatchFile")
  @js.native
  def unwatchFile(filename: PathLike): Unit = js.native
  @JSImport("hexo-fs", "unwatchFile")
  @js.native
  def unwatchFile(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: js.Date, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: js.Date, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: js.Date, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
  @JSImport("hexo-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(path: String): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(
    path: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(path: String, options: WatchOptions): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(path: js.Array[String]): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(
    path: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(path: js.Array[String], options: WatchOptions): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  @JSImport("hexo-fs", "watch")
  @js.native
  def watch(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  
  @JSImport("hexo-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("hexo-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("hexo-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("hexo-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: js.UndefOr[scala.Nothing], encoding: String): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: Double): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: Double, encoding: String): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: Null, encoding: String): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](
    fd: Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  @JSImport("hexo-fs", "write")
  @js.native
  def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  
  @JSImport("hexo-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: js.Any): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "writeFile")
  @js.native
  def writeFile(
    path: String,
    data: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.Any, Unit]
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: js.Any, options: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: js.Any, options: Flag): typingsSlinky.bluebird.mod.^[Unit] = js.native
  @JSImport("hexo-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: js.Any, options: Flag, callback: js.Function1[/* err */ js.Any, Unit]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  @JSImport("hexo-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: String, data: js.Any): Unit = js.native
  @JSImport("hexo-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: String, data: js.Any, options: String): Unit = js.native
  @JSImport("hexo-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: String, data: js.Any, options: Flag): Unit = js.native
  
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    position: Double
  ): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Double): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
  @JSImport("hexo-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
  
  @js.native
  trait AppendFileOptions extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.native
    
    var flag: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[String | Double] = js.native
  }
  object AppendFileOptions {
    
    @scala.inline
    def apply(): AppendFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendFileOptions]
    }
    
    @scala.inline
    implicit class AppendFileOptionsMutableBuilder[Self <: AppendFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait DirectoryOptions extends StObject {
    
    var ignoreHidden: js.UndefOr[Boolean] = js.native
    
    var ignorePattern: js.UndefOr[js.RegExp] = js.native
  }
  object DirectoryOptions {
    
    @scala.inline
    def apply(): DirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptions]
    }
    
    @scala.inline
    implicit class DirectoryOptionsMutableBuilder[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
      
      @scala.inline
      def setIgnorePattern(value: js.RegExp): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
    }
  }
}
