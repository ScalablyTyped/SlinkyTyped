package typingsSlinky.fastGlob.managersTasksMod

import typingsSlinky.fastGlob.managersOptionsMod.IOptions
import typingsSlinky.fastGlob.typesEntriesMod.EntryItem
import typingsSlinky.fastGlob.typesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/managers/tasks", "generate")
@js.native
object generate extends js.Object {
  def apply(patterns: js.Array[Pattern], options: IOptions[EntryItem]): js.Array[ITask] = js.native
}

