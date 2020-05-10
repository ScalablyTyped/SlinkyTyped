package typingsSlinky.pulumiCloud.serviceMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunOptions extends js.Object {
  /**
    * Optional environment variables to override those set in the container definition.
    */
  var environment: js.UndefOr[Record[String, String]] = js.native
  /**
    * The properties of the host where this task can run.
    */
  var host: js.UndefOr[HostProperties] = js.native
}

object TaskRunOptions {
  @scala.inline
  def apply(): TaskRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunOptions]
  }
  @scala.inline
  implicit class TaskRunOptionsOps[Self <: TaskRunOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: HostProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
  }
  
}

