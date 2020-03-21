package typingsSlinky.fastGlob.providersReaderMod

import typingsSlinky.fastGlob.managersOptionsMod.IOptions
import typingsSlinky.fastGlob.managersTasksMod.ITask
import typingsSlinky.fastGlob.typesEntriesMod.Entry
import typingsSlinky.fastGlob.typesEntriesMod.EntryItem
import typingsSlinky.micromatch.mod.Options
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/reader", JSImport.Default)
@js.native
abstract class default[T] protected () extends Reader[T] {
  def this(options: IOptions[EntryItem]) = this()
  /* CompleteClass */
  override val deepFilter: typingsSlinky.fastGlob.filtersDeepMod.default = js.native
  /* CompleteClass */
  override val entryFilter: typingsSlinky.fastGlob.filtersEntryMod.default = js.native
  /* CompleteClass */
  override val micromatchOptions: js.Any = js.native
  /* CompleteClass */
  override val options: IOptions[EntryItem] = js.native
  /**
    * Returns options for micromatch.
    */
  /* CompleteClass */
  override def getMicromatchOptions(): Options = js.native
  /**
    * Returns options for reader.
    */
  /* CompleteClass */
  override def getReaderOptions(task: ITask): typingsSlinky.mrmlncReaddirEnhanced.mod.Options = js.native
  /**
    * Returns root path to scanner.
    */
  /* CompleteClass */
  override def getRootDirectory(task: ITask): String = js.native
  /**
    * Returns true if error has ENOENT code.
    */
  /* CompleteClass */
  override def isEnoentCodeError(err: ErrnoException): Boolean = js.native
  /**
    * The main logic of reading the directories that must be implemented by each providers.
    */
  /* CompleteClass */
  override def read(_task: ITask): T = js.native
  /**
    * Returns transformed entry.
    */
  /* CompleteClass */
  override def transform(entry: Entry): EntryItem = js.native
}

