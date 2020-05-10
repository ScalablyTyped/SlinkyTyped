package typingsSlinky.fastGlob.readerMod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.optionsMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader", JSImport.Default)
@js.native
abstract class default[T] protected () extends Reader[T] {
  def this(options: IOptions[EntryItem]) = this()
}

