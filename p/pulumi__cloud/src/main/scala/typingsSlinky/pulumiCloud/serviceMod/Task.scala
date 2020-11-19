package typingsSlinky.pulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends js.Object {
  
  /**
    * Run the task, passing in additional task run options.
    */
  def run(): js.Promise[Unit] = js.native
  def run(options: TaskRunOptions): js.Promise[Unit] = js.native
}
@JSImport("@pulumi/cloud/service", "Task")
@js.native
object Task extends TopLevel[TaskConstructor]
