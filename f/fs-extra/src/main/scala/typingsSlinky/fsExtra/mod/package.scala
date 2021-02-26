package typingsSlinky.fsExtra

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayBufferView = typingsSlinky.node.NodeJS.TypedArray | js.typedarray.DataView
  
  type CopyFilterAsync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, js.Promise[scala.Boolean]]
  
  type CopyFilterSync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Boolean]
  
  type Mode = java.lang.String | scala.Double
  
  @scala.inline
  def access(path: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def access(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def access(path: typingsSlinky.node.fsMod.PathLike, mode: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def access(
    path: typingsSlinky.node.fsMod.PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def accessSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def accessSync(path: typingsSlinky.node.fsMod.PathLike, mode: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFile(file: scala.Double, data: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: js.Any,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(file: scala.Double, data: js.Any, options: typingsSlinky.fsExtra.anon.Encoding): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: js.Any,
    options: typingsSlinky.fsExtra.anon.Encoding,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(file: typingsSlinky.node.fsMod.PathLike, data: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def appendFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.Any,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.Any,
    options: typingsSlinky.fsExtra.anon.Encoding
  ): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def appendFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.Any,
    options: typingsSlinky.fsExtra.anon.Encoding,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String, options: typingsSlinky.node.fsMod.WriteFileOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: js.typedarray.Uint8Array): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: scala.Double,
    data: js.typedarray.Uint8Array,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: typingsSlinky.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: typingsSlinky.node.fsMod.PathLike, data: js.typedarray.Uint8Array): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.typedarray.Uint8Array,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmod(path: typingsSlinky.node.fsMod.PathLike, mode: typingsSlinky.fsExtra.mod.Mode): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def chmod(
    path: typingsSlinky.node.fsMod.PathLike,
    mode: typingsSlinky.fsExtra.mod.Mode,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmodSync(path: typingsSlinky.node.fsMod.PathLike, mode: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chown(path: typingsSlinky.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def chown(
    path: typingsSlinky.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chownSync(path: typingsSlinky.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def close(fd: scala.Double): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def close(
    fd: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def closeSync(fd: scala.Double): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copy(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def copy(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copy(src: java.lang.String, dest: java.lang.String, options: typingsSlinky.fsExtra.mod.CopyOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def copy(
    src: java.lang.String,
    dest: java.lang.String,
    options: typingsSlinky.fsExtra.mod.CopyOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFile(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def copyFile(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFile(src: java.lang.String, dest: java.lang.String, flags: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def copyFile(
    src: java.lang.String,
    dest: java.lang.String,
    flags: scala.Double,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFileSync(src: typingsSlinky.node.fsMod.PathLike, dest: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFileSync(
    src: typingsSlinky.node.fsMod.PathLike,
    dest: typingsSlinky.node.fsMod.PathLike,
    flags: scala.Double
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copySync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copySync(src: java.lang.String, dest: java.lang.String, options: typingsSlinky.fsExtra.mod.CopyOptionsSync): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createFile(file: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def createFile(file: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createFileSync(file: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createLink(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def createLink(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createLinkSync: js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].selectDynamic("createLinkSync").asInstanceOf[js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Unit]]
  
  @scala.inline
  def createReadStream(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.ReadStream = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): typingsSlinky.node.fsMod.ReadStream = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.AutoClose): typingsSlinky.node.fsMod.ReadStream = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.ReadStream]
  
  @scala.inline
  def createSymlink(src: java.lang.String, dest: java.lang.String, `type`: typingsSlinky.fsExtra.mod.SymlinkType): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def createSymlink(
    src: java.lang.String,
    dest: java.lang.String,
    `type`: typingsSlinky.fsExtra.mod.SymlinkType,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createSymlinkSync(src: java.lang.String, dest: java.lang.String, `type`: typingsSlinky.fsExtra.mod.SymlinkType): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createSymlink_Promise(src: java.lang.String, dest: java.lang.String, `type`: typingsSlinky.fsExtra.mod.SymlinkType): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def createWriteStream(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.WriteStream = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): typingsSlinky.node.fsMod.WriteStream = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.EmitClose): typingsSlinky.node.fsMod.WriteStream = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.WriteStream]
  
  @scala.inline
  def emptyDirSync_(path: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def emptyDir_(path: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def emptyDir_(path: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def emptydir(path: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def emptydir(path: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def emptydirSync: js.Function1[/* path */ java.lang.String, scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].selectDynamic("emptydirSync").asInstanceOf[js.Function1[/* path */ java.lang.String, scala.Unit]]
  
  @scala.inline
  def ensureDir(path: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureDir(
    path: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureDir(path: java.lang.String, options: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureDir(
    path: java.lang.String,
    options: scala.Double,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureDir(path: java.lang.String, options: typingsSlinky.fsExtra.mod.EnsureOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureDir(
    path: java.lang.String,
    options: typingsSlinky.fsExtra.mod.EnsureOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ensureDirSync(path: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureDirSync(path: java.lang.String, options: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureDirSync(path: java.lang.String, options: typingsSlinky.fsExtra.mod.EnsureOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ensureDir_Promise(path: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ensureDir_Promise(path: java.lang.String, options: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ensureDir_Promise(path: java.lang.String, options: typingsSlinky.fsExtra.mod.EnsureOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def ensureFile(path: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ensureFile(path: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ensureFileSync(path: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ensureLink(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ensureLink(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ensureLinkSync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureLinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ensureSymlink(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ensureSymlink(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureSymlink(src: java.lang.String, dest: java.lang.String, `type`: typingsSlinky.fsExtra.mod.SymlinkType): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ensureSymlink(
    src: java.lang.String,
    dest: java.lang.String,
    `type`: typingsSlinky.fsExtra.mod.SymlinkType,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ensureSymlinkSync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ensureSymlinkSync(src: java.lang.String, dest: java.lang.String, `type`: typingsSlinky.fsExtra.mod.SymlinkType): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def exists(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def existsSync(path: typingsSlinky.node.fsMod.PathLike): scala.Boolean = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def fchmod(fd: scala.Double, mode: typingsSlinky.fsExtra.mod.Mode): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def fchmod(
    fd: scala.Double,
    mode: typingsSlinky.fsExtra.mod.Mode,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchmodSync(fd: scala.Double, mode: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasync(fd: scala.Double): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def fdatasync(fd: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasyncSync(fd: scala.Double): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstat(fd: scala.Double): js.Promise[typingsSlinky.node.fsMod.Stats] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.node.fsMod.Stats]]
  @scala.inline
  def fstat(
    fd: scala.Double,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      _
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstatSync(fd: scala.Double): typingsSlinky.node.fsMod.Stats = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Stats]
  
  @scala.inline
  def fsync(fd: scala.Double): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def fsync(
    fd: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fsyncSync(fd: scala.Double): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncate(fd: scala.Double): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ftruncate(
    fd: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ftruncate(
    fd: scala.Double,
    len: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncateSync(fd: scala.Double): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimes(fd: scala.Double, atime: js.Date, mtime: js.Date): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: js.Date,
    mtime: js.Date,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(fd: scala.Double, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmod(
    path: typingsSlinky.node.fsMod.PathLike,
    mode: typingsSlinky.node.fsMod.Mode,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmodSync(path: typingsSlinky.node.fsMod.PathLike, mode: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchown(path: typingsSlinky.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def lchown(
    path: typingsSlinky.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchownSync(path: typingsSlinky.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def link(existingPath: typingsSlinky.node.fsMod.PathLike, newPath: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def link(
    existingPath: typingsSlinky.node.fsMod.PathLike,
    newPath: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def linkSync(existingPath: typingsSlinky.node.fsMod.PathLike, newPath: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstat(path: typingsSlinky.node.fsMod.PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.node.fsMod.Stats]]
  @scala.inline
  def lstat(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      _
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstatSync(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.Stats = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Stats]
  
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: js.Date,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdir(path: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.fsExtra.mod.Mode,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.MakeDirectoryOptions,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirSync(path: typingsSlinky.node.fsMod.PathLike): js.UndefOr[java.lang.String] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.MakeDirectoryOptionsrecur
  ): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.MakeDirectoryOptions): js.UndefOr[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.Mode): js.UndefOr[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def mkdirSync_Unit(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync_Unit(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.Mode): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirp(dir: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def mkdirp(dir: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirpSync(dir: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(dir.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirs(dir: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def mkdirs(dir: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirsSync(dir: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsSync")(dir.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtemp(prefix: java.lang.String): js.Promise[java.lang.String] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtempSync(prefix: java.lang.String): java.lang.String = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: java.lang.String): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typingsSlinky.node.fsMod.BufferEncodingOption): typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  
  @scala.inline
  def move(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def move(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def move(src: java.lang.String, dest: java.lang.String, options: typingsSlinky.fsExtra.mod.MoveOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def move(
    src: java.lang.String,
    dest: java.lang.String,
    options: typingsSlinky.fsExtra.mod.MoveOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def moveSync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def moveSync(src: java.lang.String, dest: java.lang.String, options: typingsSlinky.fsExtra.mod.MoveOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def open(path: typingsSlinky.node.fsMod.PathLike, flags: java.lang.String): js.Promise[scala.Double] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: java.lang.String,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: java.lang.String,
    mode: typingsSlinky.fsExtra.mod.Mode
  ): js.Promise[scala.Double] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: java.lang.String,
    mode: typingsSlinky.fsExtra.mod.Mode,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(path: typingsSlinky.node.fsMod.PathLike, flags: scala.Double): js.Promise[scala.Double] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: scala.Double,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(path: typingsSlinky.node.fsMod.PathLike, flags: scala.Double, mode: typingsSlinky.fsExtra.mod.Mode): js.Promise[scala.Double] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
  @scala.inline
  def open(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: scala.Double,
    mode: typingsSlinky.fsExtra.mod.Mode,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def openSync(path: typingsSlinky.node.fsMod.PathLike, flags: typingsSlinky.node.fsMod.OpenMode): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def openSync(
    path: typingsSlinky.node.fsMod.PathLike,
    flags: typingsSlinky.node.fsMod.OpenMode,
    mode: typingsSlinky.node.fsMod.Mode
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def opendir(path: java.lang.String): js.Promise[typingsSlinky.node.fsMod.Dir] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.node.fsMod.Dir]]
  @scala.inline
  def opendir(
    path: java.lang.String,
    cb: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ typingsSlinky.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def opendir(path: java.lang.String, options: typingsSlinky.node.fsMod.OpenDirOptions): js.Promise[typingsSlinky.node.fsMod.Dir] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.node.fsMod.Dir]]
  @scala.inline
  def opendir(
    path: java.lang.String,
    options: typingsSlinky.node.fsMod.OpenDirOptions,
    cb: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ typingsSlinky.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def opendirSync(path: java.lang.String): typingsSlinky.node.fsMod.Dir = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Dir]
  @scala.inline
  def opendirSync(path: java.lang.String, options: typingsSlinky.node.fsMod.OpenDirOptions): typingsSlinky.node.fsMod.Dir = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.Dir]
  
  @scala.inline
  def outputFile(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def outputFile(file: java.lang.String, data: js.Any, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputFile(file: java.lang.String, data: js.Any, options: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def outputFile(
    file: java.lang.String,
    data: js.Any,
    options: java.lang.String,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputFile(file: java.lang.String, data: js.Any, options: typingsSlinky.fsExtra.mod.WriteFileOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def outputFile(
    file: java.lang.String,
    data: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def outputFileSync(file: java.lang.String, data: js.Any): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputFileSync(file: java.lang.String, data: js.Any, options: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputFileSync(file: java.lang.String, data: js.Any, options: typingsSlinky.fsExtra.mod.WriteFileOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def outputJSONSync_(file: java.lang.String, data: js.Any): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputJSONSync_(file: java.lang.String, data: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def outputJSON_(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def outputJSON_(file: java.lang.String, data: js.Any, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputJSON_(file: java.lang.String, data: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def outputJSON_(
    file: java.lang.String,
    data: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def outputJson(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def outputJson(file: java.lang.String, data: js.Any, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputJson(file: java.lang.String, data: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def outputJson(
    file: java.lang.String,
    data: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def outputJsonSync(file: java.lang.String, data: js.Any): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def outputJsonSync(file: java.lang.String, data: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def pathExists(path: java.lang.String): js.Promise[scala.Boolean] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Boolean]]
  @scala.inline
  def pathExists(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.Error, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def pathExistsSync(path: java.lang.String): scala.Boolean = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.DataView, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferDataView] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataView]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferDataView] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataView]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Float32Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Float64Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Int16Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Int32Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Int8Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Uint16Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesRead] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesRead]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesRead] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesRead]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Uint32Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferUint32Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint32Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferUint32Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint32Array]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(fd: scala.Double, buffer: js.typedarray.Uint8Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.Buffer] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.Buffer]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.Buffer] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.Buffer]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesRead] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesRead]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesRead] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesRead]]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFile(file: scala.Double): js.Promise[typingsSlinky.node.Buffer] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.node.Buffer]]
  @scala.inline
  def readFile(
    file: scala.Double,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(file: scala.Double, encoding: java.lang.String): js.Promise[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(
    file: scala.Double,
    encoding: java.lang.String,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(file: scala.Double, options: typingsSlinky.fsExtra.anon.EncodingFlag): js.Promise[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(
    file: scala.Double,
    options: typingsSlinky.fsExtra.anon.EncodingFlag,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(file: scala.Double, options: typingsSlinky.fsExtra.anon.Flag): js.Promise[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(
    file: scala.Double,
    options: typingsSlinky.fsExtra.anon.Flag,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(file: typingsSlinky.node.fsMod.PathLike): js.Promise[typingsSlinky.node.Buffer] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.node.Buffer]]
  @scala.inline
  def readFile(
    file: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(file: typingsSlinky.node.fsMod.PathLike, encoding: java.lang.String): js.Promise[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(
    file: typingsSlinky.node.fsMod.PathLike,
    encoding: java.lang.String,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(file: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.anon.EncodingFlag): js.Promise[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(
    file: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.fsExtra.anon.EncodingFlag,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(file: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.anon.Flag): js.Promise[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(
    file: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.fsExtra.anon.Flag,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* data */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFileSync(path: scala.Double): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.anon.BaseEncodingOptionsflagst): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.anon.EncodingBufferEncoding): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: typingsSlinky.node.anon.`3`): typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionsflagst
  ): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.EncodingBufferEncoding): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.`3`): typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def readFileSync_Buffer(path: scala.Double): typingsSlinky.node.Buffer = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync_Buffer(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.Buffer = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def readFileSync_Union(path: scala.Double, options: typingsSlinky.node.BufferEncoding): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readFileSync_Union(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  
  @scala.inline
  def readJSONSync_(file: java.lang.String): js.Any = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def readJSONSync_(file: java.lang.String, options: typingsSlinky.fsExtra.mod.ReadOptions): js.Any = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def readJSON_(file: java.lang.String): js.Promise[_] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[_]]
  @scala.inline
  def readJSON_(
    file: java.lang.String,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readJSON_(file: java.lang.String, options: typingsSlinky.fsExtra.mod.ReadOptions): js.Promise[_] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[_]]
  @scala.inline
  def readJSON_(
    file: java.lang.String,
    options: typingsSlinky.fsExtra.mod.ReadOptions,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readJson(file: java.lang.String): js.Promise[_] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[_]]
  @scala.inline
  def readJson(
    file: java.lang.String,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readJson(file: java.lang.String, options: typingsSlinky.fsExtra.mod.ReadOptions): js.Promise[_] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[_]]
  @scala.inline
  def readJson(
    file: java.lang.String,
    options: typingsSlinky.fsExtra.mod.ReadOptions,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readJsonSync(file: java.lang.String): js.Any = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def readJsonSync(file: java.lang.String, options: typingsSlinky.fsExtra.mod.ReadOptions): js.Any = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def readSync(fd: scala.Double, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    opts: typingsSlinky.node.fsMod.ReadSyncOptions
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def readdir(path: typingsSlinky.node.fsMod.PathLike): js.Promise[js.Array[java.lang.String]] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  @scala.inline
  def readdir(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.anon.EncodingWithFileTypes): js.Promise[js.Array[typingsSlinky.node.Buffer]] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.node.Buffer]]]
  @scala.inline
  def readdir(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.anon.WithFileTypes): js.Promise[js.Array[java.lang.String]] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  @scala.inline
  def readdir(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.anon.`0`): js.Promise[js.Array[typingsSlinky.node.Buffer | java.lang.String]] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.node.Buffer | java.lang.String]]]
  @scala.inline
  def readdir(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.anon.`1`): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]]]
  @scala.inline
  def readdir(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): js.Promise[js.Array[java.lang.String]] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike): js.Array[java.lang.String] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): js.Array[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionswithFi
  ): js.Array[typingsSlinky.node.Buffer | java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.Buffer | java.lang.String]]
  @scala.inline
  def readdirSync(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
  ): js.Array[typingsSlinky.node.fsMod.Dirent] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.fsMod.Dirent]]
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.Encoding): js.Array[typingsSlinky.node.Buffer] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.Buffer]]
  @scala.inline
  def readdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.WithFileTypes): js.Array[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def readdirSync_buffer(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.fsExtraStrings.buffer): js.Array[typingsSlinky.node.Buffer] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.node.Buffer]]
  
  @scala.inline
  def readdir_buffer(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.fsExtraStrings.buffer): js.Promise[js.Array[typingsSlinky.node.Buffer]] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.node.Buffer]]]
  
  @scala.inline
  def readlink(path: typingsSlinky.node.fsMod.PathLike): js.Promise[java.lang.String] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readlink(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* linkString */ java.lang.String, 
      _
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike): java.lang.String = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BufferEncodingOption): typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def readlinkSync_Union(path: typingsSlinky.node.fsMod.PathLike): java.lang.String | typingsSlinky.node.Buffer = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  @scala.inline
  def readlinkSync_Union(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BaseEncodingOptions): java.lang.String | typingsSlinky.node.Buffer = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typingsSlinky.node.Buffer]
  
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
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
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
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readvSync(fd: scala.Double, buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView]): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readvSync(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def realpath(path: typingsSlinky.node.fsMod.PathLike): js.Promise[java.lang.String] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def realpath(
    path: typingsSlinky.node.fsMod.PathLike,
    cache: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Promise[java.lang.String] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def realpath(
    path: typingsSlinky.node.fsMod.PathLike,
    cache: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      _
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def realpath(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      _
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def remove(dir: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def remove(dir: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def removeSync(dir: java.lang.String): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rename(oldPath: typingsSlinky.node.fsMod.PathLike, newPath: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def rename(
    oldPath: typingsSlinky.node.fsMod.PathLike,
    newPath: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def renameSync(oldPath: typingsSlinky.node.fsMod.PathLike, newPath: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rm(path: typingsSlinky.node.fsMod.PathLike, callback: typingsSlinky.node.fsMod.NoParamCallback): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def rm(
    path: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.fsMod.RmOptions,
    callback: typingsSlinky.node.fsMod.NoParamCallback
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.RmOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdir(path: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def rmdir(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdirSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmdirSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.RmDirOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def stat(path: typingsSlinky.node.fsMod.PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.node.fsMod.Stats]]
  @scala.inline
  def stat(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      _
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def statSync(path: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.Stats = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.Stats]
  @scala.inline
  def statSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.BigIntOptions): typingsSlinky.node.fsMod.BigIntStats = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.BigIntStats]
  @scala.inline
  def statSync(path: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.fsMod.StatOptions): typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats]
  
  @scala.inline
  def symlink(target: typingsSlinky.node.fsMod.PathLike, path: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def symlink(
    target: typingsSlinky.node.fsMod.PathLike,
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def symlink(
    target: typingsSlinky.node.fsMod.PathLike,
    path: typingsSlinky.node.fsMod.PathLike,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def symlink(
    target: typingsSlinky.node.fsMod.PathLike,
    path: typingsSlinky.node.fsMod.PathLike,
    `type`: typingsSlinky.fsExtra.mod.SymlinkType
  ): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def symlink(
    target: typingsSlinky.node.fsMod.PathLike,
    path: typingsSlinky.node.fsMod.PathLike,
    `type`: typingsSlinky.fsExtra.mod.SymlinkType,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def symlinkSync(target: typingsSlinky.node.fsMod.PathLike, path: typingsSlinky.node.fsMod.PathLike): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def symlinkSync(
    target: typingsSlinky.node.fsMod.PathLike,
    path: typingsSlinky.node.fsMod.PathLike,
    `type`: typingsSlinky.node.fsMod.symlink.Type
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncate(path: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def truncate(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(path: typingsSlinky.node.fsMod.PathLike, len: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def truncate(
    path: typingsSlinky.node.fsMod.PathLike,
    len: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncateSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def truncateSync(path: typingsSlinky.node.fsMod.PathLike, len: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlink(path: typingsSlinky.node.fsMod.PathLike): js.Promise[scala.Unit] = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def unlink(
    path: typingsSlinky.node.fsMod.PathLike,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlinkSync(path: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unwatchFile(filename: typingsSlinky.node.fsMod.PathLike): scala.Unit = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def unwatchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimes(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: js.Date): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def utimes(
    path: typingsSlinky.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: js.Date, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: js.Date): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typingsSlinky.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike): typingsSlinky.node.fsMod.FSWatcher = typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: java.lang.String): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: java.lang.String,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: scala.Null,
    listener: js.Function2[
      /* event */ java.lang.String, 
      typingsSlinky.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.BufferEncoding): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.BufferEncoding,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.Persistent): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.Persistent,
    listener: js.Function2[
      /* event */ java.lang.String, 
      typingsSlinky.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.node.anon.Recursive): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.Recursive,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ typingsSlinky.node.Buffer, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  
  @scala.inline
  def watchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.node.anon.Interval,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch_buffer(filename: typingsSlinky.node.fsMod.PathLike, options: typingsSlinky.fsExtra.fsExtraStrings.buffer): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  @scala.inline
  def watch_buffer(
    filename: typingsSlinky.node.fsMod.PathLike,
    options: typingsSlinky.fsExtra.fsExtraStrings.buffer,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ typingsSlinky.node.Buffer, scala.Unit]
  ): typingsSlinky.node.fsMod.FSWatcher = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.fsMod.FSWatcher]
  
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.DataView): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.DataView, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.DataView, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Float32Array): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Float32Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Float32Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Float64Array): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Float64Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Float64Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int16Array): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int16Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int16Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int32Array): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int32Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int32Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int8Array): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int8Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Int8Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint16Array): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint16Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint16Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferUint16Array]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint32Array): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint32Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint32Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWrittenNumber]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint8Array): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint8Array, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint8Array, offset: scala.Double, length: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint8ClampedArray): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(fd: scala.Double, buffer: js.typedarray.Uint8ClampedArray, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferBytesWritten]]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, data: js.Any): js.Promise[typingsSlinky.fsExtra.anon.BufferString] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferString]]
  @scala.inline
  def write(
    fd: scala.Double,
    data: js.Any,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, data: js.Any, offset: js.UndefOr[scala.Nothing], encoding: java.lang.String): js.Promise[typingsSlinky.fsExtra.anon.BufferString] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferString]]
  @scala.inline
  def write(fd: scala.Double, data: js.Any, offset: scala.Double): js.Promise[typingsSlinky.fsExtra.anon.BufferString] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferString]]
  @scala.inline
  def write(
    fd: scala.Double,
    data: js.Any,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(fd: scala.Double, data: js.Any, offset: scala.Double, encoding: java.lang.String): js.Promise[typingsSlinky.fsExtra.anon.BufferString] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.anon.BufferString]]
  @scala.inline
  def write(
    fd: scala.Double,
    data: js.Any,
    offset: scala.Double,
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFile(file: scala.Double, data: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeFile(
    file: scala.Double,
    data: js.Any,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(file: scala.Double, data: js.Any, options: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeFile(
    file: scala.Double,
    data: js.Any,
    options: java.lang.String,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(file: scala.Double, data: js.Any, options: typingsSlinky.fsExtra.mod.WriteFileOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeFile(
    file: scala.Double,
    data: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(file: typingsSlinky.node.fsMod.PathLike, data: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.Any,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(file: typingsSlinky.node.fsMod.PathLike, data: js.Any, options: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.Any,
    options: java.lang.String,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteFileOptions
  ): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeFile(
    file: typingsSlinky.node.fsMod.PathLike,
    data: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String, options: typingsSlinky.node.fsMod.WriteFileOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: scala.Double,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: typingsSlinky.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: typingsSlinky.node.fsMod.PathLike,
    data: java.lang.String,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: typingsSlinky.node.fsMod.PathLike, data: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: typingsSlinky.node.fsMod.PathLike,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    options: typingsSlinky.node.fsMod.WriteFileOptions
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeJSONSync_(file: java.lang.String, `object`: js.Any): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeJSONSync_(file: java.lang.String, `object`: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeJSON_(file: java.lang.String, `object`: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeJSON_(file: java.lang.String, `object`: js.Any, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeJSON_(file: java.lang.String, `object`: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeJSON_(
    file: java.lang.String,
    `object`: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeJson(file: java.lang.String, `object`: js.Any): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeJson(file: java.lang.String, `object`: js.Any, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeJson(file: java.lang.String, `object`: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeJson(
    file: java.lang.String,
    `object`: js.Any,
    options: typingsSlinky.fsExtra.mod.WriteOptions,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeJsonSync(file: java.lang.String, `object`: js.Any): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeJsonSync(file: java.lang.String, `object`: js.Any, options: typingsSlinky.fsExtra.mod.WriteOptions): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeSync(fd: scala.Double, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, buffer: typingsSlinky.node.NodeJS.ArrayBufferView, offset: scala.Double): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: typingsSlinky.node.BufferEncoding
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String, position: scala.Double): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: typingsSlinky.node.BufferEncoding
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: typingsSlinky.node.BufferEncoding
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def writev(fd: scala.Double, buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView]): js.Promise[typingsSlinky.fsExtra.mod.WritevResult] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.mod.WritevResult]]
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
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writev(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: scala.Double
  ): js.Promise[typingsSlinky.fsExtra.mod.WritevResult] = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.fsExtra.mod.WritevResult]]
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
  ): scala.Unit = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writevSync(fd: scala.Double, buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView]): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writevSync(
    fd: scala.Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: scala.Double
  ): scala.Double = (typingsSlinky.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
