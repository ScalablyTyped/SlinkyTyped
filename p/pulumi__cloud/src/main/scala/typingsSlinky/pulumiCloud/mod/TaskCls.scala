package typingsSlinky.pulumiCloud.mod

import typingsSlinky.pulumiCloud.serviceMod.Container
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "Task")
@js.native
class TaskCls protected ()
  extends typingsSlinky.pulumiCloud.serviceMod.Task {
  /**
    * Construct a new Task, which is a Container that can be run many times as individual tasks.
    *
    * @param name The unique name of the task.
    * @param container The container specification.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String, container: Container) = this()
  def this(name: String, container: Container, opts: ResourceOptions) = this()
}

