package typingsSlinky.fastDashGlob.outManagersTasksMod

import typingsSlinky.fastDashGlob.outTypesMod.Pattern
import typingsSlinky.fastDashGlob.outTypesMod.PatternsGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", "convertPatternGroupsToTasks")
@js.native
object convertPatternGroupsToTasks extends js.Object {
  def apply(positive: PatternsGroup, negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = js.native
}

