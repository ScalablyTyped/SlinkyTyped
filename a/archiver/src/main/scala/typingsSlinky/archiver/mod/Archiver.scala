package typingsSlinky.archiver.mod

import typingsSlinky.archiver.anon.PartialEntryData
import typingsSlinky.archiver.archiverBooleans.`false`
import typingsSlinky.archiver.archiverStrings.close
import typingsSlinky.archiver.archiverStrings.data
import typingsSlinky.archiver.archiverStrings.drain
import typingsSlinky.archiver.archiverStrings.entry
import typingsSlinky.archiver.archiverStrings.error
import typingsSlinky.archiver.archiverStrings.finish
import typingsSlinky.archiver.archiverStrings.pipe
import typingsSlinky.archiver.archiverStrings.progress
import typingsSlinky.archiver.archiverStrings.unpipe
import typingsSlinky.archiver.archiverStrings.warning
import typingsSlinky.glob.mod.IOptions
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Archiver extends Transform {
  
  def abort(): this.type = js.native
  
  def append(source: String): this.type = js.native
  def append(source: String, data: EntryData | TarEntryData): this.type = js.native
  def append(source: String, data: ZipEntryData): this.type = js.native
  def append(source: Buffer): this.type = js.native
  def append(source: Buffer, data: EntryData | TarEntryData): this.type = js.native
  def append(source: Buffer, data: ZipEntryData): this.type = js.native
  def append(source: Readable): this.type = js.native
  def append(source: Readable, data: EntryData | TarEntryData): this.type = js.native
  def append(source: Readable, data: ZipEntryData): this.type = js.native
  
  def directory(dirpath: String, destpath: String): this.type = js.native
  def directory(dirpath: String, destpath: String, data: PartialEntryData): this.type = js.native
  def directory(dirpath: String, destpath: String, data: EntryDataFunction): this.type = js.native
  /** if false is passed for destpath, the path of a chunk of data in the archive is set to the root */
  @JSName("directory")
  def directory_false(dirpath: String, destpath: `false`): this.type = js.native
  @JSName("directory")
  def directory_false(dirpath: String, destpath: `false`, data: PartialEntryData): this.type = js.native
  @JSName("directory")
  def directory_false(dirpath: String, destpath: `false`, data: EntryDataFunction): this.type = js.native
  
  def file(filename: String, data: EntryData): this.type = js.native
  
  def glob(pattern: String): this.type = js.native
  def glob(pattern: String, options: js.UndefOr[scala.Nothing], data: PartialEntryData): this.type = js.native
  def glob(pattern: String, options: IOptions): this.type = js.native
  def glob(pattern: String, options: IOptions, data: PartialEntryData): this.type = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ EntryData, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_entry(event: entry, listener: js.Function1[/* entry */ EntryData, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ ArchiverError, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, listener: js.Function1[/* progress */ ProgressData, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* error */ ArchiverError, Unit]): this.type = js.native
  
  def pointer(): Double = js.native
  
  def setFormat(format: String): this.type = js.native
  
  def setModule(module: js.Function): this.type = js.native
  
  def symlink(filepath: String, target: String): this.type = js.native
  
  def use(plugin: js.Function): this.type = js.native
}
