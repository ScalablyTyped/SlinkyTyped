package typingsSlinky.fastGlob.providersReaderMod

import typingsSlinky.fastGlob.managersOptionsMod.IOptions
import typingsSlinky.fastGlob.typesEntriesMod.EntryItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/reader", JSImport.Default)
@js.native
abstract class default[T] protected () extends Reader[T] {
  def this(options: IOptions[EntryItem]) = this()
}

