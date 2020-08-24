package typingsSlinky.fastGlob.tasksMod

import typingsSlinky.fastGlob.settingsMod.default
import typingsSlinky.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", "generate")
@js.native
object generate extends js.Object {
  def apply(patterns: js.Array[Pattern], settings: default): js.Array[Task] = js.native
}

