package typingsSlinky.fastGlob.tasksMod

import typingsSlinky.fastGlob.typesMod.Pattern
import typingsSlinky.fastGlob.typesMod.PatternsGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", "convertPatternGroupsToTasks")
@js.native
object convertPatternGroupsToTasks extends js.Object {
  def apply(positive: PatternsGroup, negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = js.native
}

