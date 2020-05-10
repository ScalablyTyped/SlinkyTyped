package typingsSlinky.fastGlob.adaptersFsMod

import typingsSlinky.fastGlob.managersOptionsMod.IOptions
import typingsSlinky.fastGlob.typesEntriesMod.EntryItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/adapters/fs", JSImport.Default)
@js.native
abstract class default[T] protected () extends FileSystem[T] {
  def this(options: IOptions[EntryItem]) = this()
}

