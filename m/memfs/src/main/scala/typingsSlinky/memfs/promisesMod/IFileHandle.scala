package typingsSlinky.memfs.promisesMod

import typingsSlinky.memfs.encodingMod.TDataOut
import typingsSlinky.memfs.statsMod.TStatNumber
import typingsSlinky.memfs.volumeMod.IAppendFileOptions
import typingsSlinky.memfs.volumeMod.IReadFileOptions
import typingsSlinky.memfs.volumeMod.IStatOptions
import typingsSlinky.memfs.volumeMod.IWriteFileOptions
import typingsSlinky.memfs.volumeMod.TData
import typingsSlinky.memfs.volumeMod.TMode
import typingsSlinky.memfs.volumeMod.TTime
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileHandle extends js.Object {
  var fd: Double = js.native
  def appendFile(data: TData): js.Promise[Unit] = js.native
  def appendFile(data: TData, options: String): js.Promise[Unit] = js.native
  def appendFile(data: TData, options: IAppendFileOptions): js.Promise[Unit] = js.native
  def chmod(mode: TMode): js.Promise[Unit] = js.native
  def chown(uid: Double, gid: Double): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def datasync(): js.Promise[Unit] = js.native
  def read(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
  def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
  def readFile(): js.Promise[TDataOut] = js.native
  def readFile(options: String): js.Promise[TDataOut] = js.native
  def readFile(options: IReadFileOptions): js.Promise[TDataOut] = js.native
  def stat(): js.Promise[typingsSlinky.memfs.statsMod.default[TStatNumber]] = js.native
  def stat(options: IStatOptions): js.Promise[typingsSlinky.memfs.statsMod.default[TStatNumber]] = js.native
  def truncate(): js.Promise[Unit] = js.native
  def truncate(len: Double): js.Promise[Unit] = js.native
  def utimes(atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
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
  def writeFile(data: TData): js.Promise[Unit] = js.native
  def writeFile(data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
}

