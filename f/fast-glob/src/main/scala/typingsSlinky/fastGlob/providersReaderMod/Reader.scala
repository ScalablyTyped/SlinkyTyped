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

@js.native
trait Reader[T] extends js.Object {
  val deepFilter: typingsSlinky.fastGlob.filtersDeepMod.default = js.native
  val entryFilter: typingsSlinky.fastGlob.filtersEntryMod.default = js.native
  val micromatchOptions: js.Any = js.native
  val options: IOptions[EntryItem] = js.native
  /**
    * Returns options for micromatch.
    */
  def getMicromatchOptions(): Options = js.native
  /**
    * Returns options for reader.
    */
  def getReaderOptions(task: ITask): typingsSlinky.mrmlncReaddirEnhanced.mod.Options = js.native
  /**
    * Returns root path to scanner.
    */
  def getRootDirectory(task: ITask): String = js.native
  /**
    * Returns true if error has ENOENT code.
    */
  def isEnoentCodeError(err: ErrnoException): Boolean = js.native
  /**
    * The main logic of reading the directories that must be implemented by each providers.
    */
  def read(_task: ITask): T = js.native
  /**
    * Returns transformed entry.
    */
  def transform(entry: Entry): EntryItem = js.native
}

object Reader {
  @scala.inline
  def apply[T](
    deepFilter: typingsSlinky.fastGlob.filtersDeepMod.default,
    entryFilter: typingsSlinky.fastGlob.filtersEntryMod.default,
    getMicromatchOptions: () => Options,
    getReaderOptions: ITask => typingsSlinky.mrmlncReaddirEnhanced.mod.Options,
    getRootDirectory: ITask => String,
    isEnoentCodeError: ErrnoException => Boolean,
    micromatchOptions: js.Any,
    options: IOptions[EntryItem],
    read: ITask => T,
    transform: Entry => EntryItem
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], getMicromatchOptions = js.Any.fromFunction0(getMicromatchOptions), getReaderOptions = js.Any.fromFunction1(getReaderOptions), getRootDirectory = js.Any.fromFunction1(getRootDirectory), isEnoentCodeError = js.Any.fromFunction1(isEnoentCodeError), micromatchOptions = micromatchOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Reader[T]]
  }
  @scala.inline
  implicit class ReaderOps[Self[t] <: Reader[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeepFilter(value: typingsSlinky.fastGlob.filtersDeepMod.default): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryFilter(value: typingsSlinky.fastGlob.filtersEntryMod.default): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMicromatchOptions(value: () => Options): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMicromatchOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReaderOptions(value: ITask => typingsSlinky.mrmlncReaddirEnhanced.mod.Options): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReaderOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRootDirectory(value: ITask => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEnoentCodeError(value: ErrnoException => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnoentCodeError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMicromatchOptions(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micromatchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: IOptions[EntryItem]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: ITask => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransform(value: Entry => EntryItem): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

