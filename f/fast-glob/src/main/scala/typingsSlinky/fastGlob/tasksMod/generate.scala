package typingsSlinky.fastGlob.tasksMod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.optionsMod.IOptions
import typingsSlinky.fastGlob.patternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", "generate")
@js.native
object generate extends js.Object {
  def apply(patterns: js.Array[Pattern], options: IOptions[EntryItem]): js.Array[ITask] = js.native
}

