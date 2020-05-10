package typingsSlinky.fastGlob.fsMod

import typingsSlinky.fastGlob.entriesMod.Entry
import typingsSlinky.fastGlob.patternsMod.Pattern
import typingsSlinky.mrmlncReaddirEnhanced.mod.FilterFunction
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystem[T] extends js.Object {
  val options: js.Any = js.native
  /**
    * Return full path to entry.
    */
  def getFullEntryPath(filepath: String): String = js.native
  /**
    * Return an implementation of the Entry interface.
    */
  def makeEntry(stat: Stats, pattern: Pattern): Entry = js.native
  /**
    * The main logic of reading the entries that must be implemented by each adapter.
    */
  def read(filepaths: js.Array[String], filter: FilterFunction): T = js.native
}

object FileSystem {
  @scala.inline
  def apply[T](
    getFullEntryPath: String => String,
    makeEntry: (Stats, Pattern) => Entry,
    options: js.Any,
    read: (js.Array[String], FilterFunction) => T
  ): FileSystem[T] = {
    val __obj = js.Dynamic.literal(getFullEntryPath = js.Any.fromFunction1(getFullEntryPath), makeEntry = js.Any.fromFunction2(makeEntry), options = options.asInstanceOf[js.Any], read = js.Any.fromFunction2(read))
    __obj.asInstanceOf[FileSystem[T]]
  }
  @scala.inline
  implicit class FileSystemOps[Self[t] <: FileSystem[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetFullEntryPath(value: String => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullEntryPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeEntry(value: (Stats, Pattern) => Entry): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeEntry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: (js.Array[String], FilterFunction) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

