package typingsSlinky.orchestrator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMissingTasks extends js.Object {
  var missingTasks: js.Array[String] = js.native
  var recursiveDependencies: js.Array[String] = js.native
  var sequence: js.Array[String] = js.native
}

object AnonMissingTasks {
  @scala.inline
  def apply(
    missingTasks: js.Array[String],
    recursiveDependencies: js.Array[String],
    sequence: js.Array[String]
  ): AnonMissingTasks = {
    val __obj = js.Dynamic.literal(missingTasks = missingTasks.asInstanceOf[js.Any], recursiveDependencies = recursiveDependencies.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMissingTasks]
  }
  @scala.inline
  implicit class AnonMissingTasksOps[Self <: AnonMissingTasks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissingTasks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursiveDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

