package typingsSlinky.fastGlob.fsMod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.optionsMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/adapters/fs", JSImport.Default)
@js.native
abstract class default[T] protected () extends FileSystem[T] {
  def this(options: IOptions[EntryItem]) = this()
}

