package typingsSlinky.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fsMod {
  
  type Mode = scala.Double | java.lang.String
  
  type NoParamCallback = js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, scala.Unit]
  
  type OpenMode = scala.Double | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.node.urlMod.URL_
  */
  type PathLike = typingsSlinky.node.fsMod._PathLike | java.lang.String
  
  type WriteFileOptions = typingsSlinky.node.anon.BaseEncodingOptionsmodeMoEncoding | java.lang.String | scala.Null
  
  @scala.inline
  def access(path: typingsSlinky.node.fsMod.PathLike, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def access(
    path: typingsSlinky.node.fsMod.PathLike,
    mode: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def access(
    path: typingsSlinky.node.fsMod.PathLike,
    mode: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def accessSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def accessSync(path: typingsSlinky.node.fsMod.PathLike, mode: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFile(file: scala.Double, data: java.lang.String, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: js.typedarray.Uint8Array,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: js.typedarray.Uint8Array,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.typedarray.Uint8Array,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.typedarray.Uint8Array,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String, options: typingsSlinky.node.fsMod.WriteFileOptions): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: js.typedarray.Uint8Array): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: scala.Double,
    data: js.typedarray.Uint8Array,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: typingsSlinky.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: typingsSlinky.node.fsMod.PathLike, data: js.typedarray.Uint8Array): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.typedarray.Uint8Array,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmod(
    path: typingsSlinky.node.fsMod.PathLike,
    mode: typingsSlinky.node.fsMod.Mode,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmodSync(path: typingsSlinky.node.fsMod.PathLike, mode: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chown(
    path: typingsSlinky.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chownSync(path: typingsSlinky.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def close(fd: scala.Double, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def closeSync(fd: scala.Double): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFile(
    src: typingsSlinky.node.fsMod.PathLike,
    dest: typingsSlinky.node.fsMod.PathLike,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFile(
    src: typingsSlinky.node.fsMod.PathLike,
    dest: typingsSlinky.node.fsMod.PathLike,
    flags: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFileSync(src: typingsSlinky.node.fsMod.PathLike, dest: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFileSync(
    src: typingsSlinky.node.fsMod.PathLike,
    dest: typingsSlinky.node.fsMod.PathLike,
    flags: scala.Double
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createReadStream(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.ReadStream = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): typingsSlinky.node.fsMod.ReadStream = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.AutoClose): typingsSlinky.node.fsMod.ReadStream = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.ReadStream]
  
  @scala.inline
  def createWriteStream(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.WriteStream = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): typingsSlinky.node.fsMod.WriteStream = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.EmitClose): typingsSlinky.node.fsMod.WriteStream = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.WriteStream]
  
  @scala.inline
  def exists(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def existsSync(path: typingsSlinky.node.fsMod.PathLike): scala.Boolean = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def fchmod(
    fd: scala.Double,
    mode: typingsSlinky.node.fsMod.Mode,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchmodSync(fd: scala.Double, mode: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasync(fd: scala.Double, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasyncSync(fd: scala.Double): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstat(
    fd: scala.Double,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstatSync(fd: scala.Double): typingsSlinky.node.fsMod.Stats = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Stats]
  
  @scala.inline
  def fsync(fd: scala.Double, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fsyncSync(fd: scala.Double): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncate(fd: scala.Double, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(
    fd: scala.Double,
    len: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: scala.Double, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: scala.Null, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncateSync(fd: scala.Double): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: js.Date,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: js.Date,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: js.Date,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmod(
    path: typingsSlinky.node.fsMod.PathLike,
    mode: typingsSlinky.node.fsMod.Mode,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmodSync(path: typingsSlinky.node.fsMod.PathLike, mode: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchown(
    path: typingsSlinky.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchownSync(path: typingsSlinky.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def link(
    existingPath: typingsSlinky.node.fsMod.PathLike,
    newPath: typingsSlinky.node.fsMod.PathLike,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def linkSync(existingPath: typingsSlinky.node.fsMod.PathLike, newPath: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstat(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstatSync(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.Stats = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Stats]
  
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdir(path: typingsSlinky.node.fsMod.PathLike, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[typingsSlinky.node.fsMod.Mode],
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[typingsSlinky.node.fsMod.Mode],
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.MakeDirectoryOptionsrecur,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.MakeDirectoryOptions,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirSync(path: typingsSlinky.node.fsMod.PathLike): js.UndefOr[java.lang.String] = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.MakeDirectoryOptionsrecur
  ): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.MakeDirectoryOptions): js.UndefOr[java.lang.String] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.Mode): js.UndefOr[java.lang.String] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def mkdirSync_Unit(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync_Unit(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: scala.Null,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typingsSlinky.node.BufferEncoding,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typingsSlinky.node.anon.`2`,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typingsSlinky.node.nodeStrings.buffer_,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtempSync(prefix: java.lang.String): java.lang.String = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: java.lang.String): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typingsSlinky.node.fsMod.BufferEncodingOption): typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: typingsSlinky.node.fsMod.OpenMode,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: typingsSlinky.node.fsMod.OpenMode,
    mode: js.UndefOr[typingsSlinky.node.fsMod.Mode],
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: typingsSlinky.node.fsMod.OpenMode,
    mode: scala.Null,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def openSync(path: typingsSlinky.node.fsMod.PathLike, flags: typingsSlinky.node.fsMod.OpenMode): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def openSync(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: typingsSlinky.node.fsMod.OpenMode,
    mode: typingsSlinky.node.fsMod.Mode
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def opendir(
    path: java.lang.String,
    cb: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ typingsSlinky.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def opendir(
    path: java.lang.String,
    options: typingsSlinky.node.fsMod.OpenDirOptions,
    cb: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ typingsSlinky.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def opendirSync(path: java.lang.String): typingsSlinky.node.fsMod.Dir = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Dir]
  @scala.inline
  def opendirSync(path: java.lang.String, options: typingsSlinky.node.fsMod.OpenDirOptions): typingsSlinky.node.fsMod.Dir = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.Dir]
  
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFile(
    path: scala.Double,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: java.lang.String,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: scala.Null,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: typingsSlinky.node.anon.BaseEncodingOptionsflagst,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: typingsSlinky.node.anon.EncodingBufferEncoding,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: typingsSlinky.node.anon.`3`,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typingsSlinky.node.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionsflagst,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.EncodingBufferEncoding,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.`3`,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFileSync(path: scala.Double): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.anon.BaseEncodingOptionsflagst): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.anon.EncodingBufferEncoding): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.anon.`3`): typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionsflagst
  ): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.EncodingBufferEncoding): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.`3`): typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def readFileSync_Buffer(path: scala.Double): typingsSlinky.node.Buffer = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync_Buffer(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.Buffer = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def readFileSync_Union(path: scala.Double, options: typingsSlinky.node.BufferEncoding): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync_Union(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  
  @scala.inline
  def readSync(fd: scala.Double, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    opts: typingsSlinky.node.fsMod.ReadSyncOptions
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typingsSlinky.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typingsSlinky.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.BufferEncoding,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typingsSlinky.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typingsSlinky.node.fsMod.Dirent], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionswithFi,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typingsSlinky.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.Encoding,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typingsSlinky.node.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.WithFileTypes,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.nodeStrings.buffer_,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typingsSlinky.node.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike): js.Array[java.lang.String] = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): js.Array[java.lang.String] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionswithFi
  ): js.Array[typingsSlinky.node.Buffer | java.lang.String] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.Buffer | java.lang.String]]
  @scala.inline
  def readdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
  ): js.Array[typingsSlinky.node.fsMod.Dirent] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.fsMod.Dirent]]
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.Encoding): js.Array[typingsSlinky.node.Buffer] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.Buffer]]
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.WithFileTypes): js.Array[java.lang.String] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def readdirSync_buffer(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.nodeStrings.buffer_): js.Array[typingsSlinky.node.Buffer] = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.Buffer]]
  
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.BufferEncoding,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.BaseEncodingOptions,
    callback: js.Function2[
      typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      typingsSlinky.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.BufferEncodingOption,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike): java.lang.String = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BufferEncodingOption): typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def readlinkSync_Union(path: typingsSlinky.node.fsMod.PathLike): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readlinkSync_Union(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  
  @scala.inline
  def readv(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    cb: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffers */ js.Array[typingsSlinky.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readv(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: scala.Double,
    cb: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffers */ js.Array[typingsSlinky.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readvSync(fd: scala.Double, buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView]): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readvSync(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def rename(
    oldPath: typingsSlinky.node.fsMod.PathLike,
    newPath: typingsSlinky.node.fsMod.PathLike,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def renameSync(oldPath: typingsSlinky.node.fsMod.PathLike, newPath: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rm(path: typingsSlinky.node.fsMod.PathLike, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def rm(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.RmOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.RmOptions): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdir(path: typingsSlinky.node.fsMod.PathLike, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def rmdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.RmDirOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdirSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.RmDirOptions): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def stat(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.BigIntOptions,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typingsSlinky.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.StatOptions,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def statSync(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.Stats = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Stats]
  @scala.inline
  def statSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BigIntOptions): typingsSlinky.node.fsMod.BigIntStats = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.BigIntStats]
  @scala.inline
  def statSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.StatOptions): typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats]
  
  @scala.inline
  def symlinkSync(target: typingsSlinky.node.fsMod.PathLike, path: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def symlinkSync(
    target: typingsSlinky.node.fsMod.PathLike,
    path: typingsSlinky.node.fsMod.PathLike,
    `type`: typingsSlinky.node.fsMod.symlink.Type
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncate(path: typingsSlinky.node.fsMod.PathLike, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(
    path: typingsSlinky.node.fsMod.PathLike,
    len: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(
    path: typingsSlinky.node.fsMod.PathLike,
    len: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(
    path: typingsSlinky.node.fsMod.PathLike,
    len: scala.Null,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncateSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def truncateSync(path: typingsSlinky.node.fsMod.PathLike, len: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlink(path: typingsSlinky.node.fsMod.PathLike, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlinkSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unwatchFile(filename: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def unwatchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: js.Date): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.FSWatcher = typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: java.lang.String,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    listener: js.Function2[
      /* event */ java.lang.String, 
      typingsSlinky.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.BufferEncoding,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.Persistent): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.Persistent,
    listener: js.Function2[
      /* event */ java.lang.String, 
      typingsSlinky.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.Recursive): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.Recursive,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ typingsSlinky.node.Buffer, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  
  @scala.inline
  def watchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.Interval,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch_buffer(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.nodeStrings.buffer_): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch_buffer(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.nodeStrings.buffer_,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ typingsSlinky.node.Buffer, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: typingsSlinky.node.BufferEncoding,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: typingsSlinky.node.BufferEncoding,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: typingsSlinky.node.BufferEncoding,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFile(path: scala.Double, data: java.lang.String, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typingsSlinky.node.fsMod.PathLike,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typingsSlinky.node.fsMod.PathLike,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    options: typingsSlinky.node.fsMod.WriteFileOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String, options: typingsSlinky.node.fsMod.WriteFileOptions): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: scala.Double,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: typingsSlinky.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: typingsSlinky.node.fsMod.PathLike, data: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: typingsSlinky.node.fsMod.PathLike,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeSync(fd: scala.Double, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, buffer: typingsSlinky.node.NodeJS.ArrayBufferView, offset: scala.Double): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: typingsSlinky.node.BufferEncoding
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String, position: scala.Double): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: typingsSlinky.node.BufferEncoding
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: typingsSlinky.node.BufferEncoding
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def writev(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    cb: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesWritten */ scala.Double, 
      /* buffers */ js.Array[typingsSlinky.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writev(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: scala.Double,
    cb: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesWritten */ scala.Double, 
      /* buffers */ js.Array[typingsSlinky.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writevSync(fd: scala.Double, buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView]): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writevSync(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: scala.Double
  ): scala.Double = (typingsSlinky.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
