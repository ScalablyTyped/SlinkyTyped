package typingsSlinky.googleCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/tasks.@google-cloud/tasks.EnhancedPick<@google-cloud/tasks.@google-cloud/tasks.Queue, 'name', 'appEngineHttpQueue' | 'rateLimits' | 'retryConfig'> */
@js.native
trait EnhancedPickQueuenameappE extends js.Object {
  var name: js.UndefOr[String] = js.native
}

object EnhancedPickQueuenameappE {
  @scala.inline
  def apply(): EnhancedPickQueuenameappE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedPickQueuenameappE]
  }
  @scala.inline
  implicit class EnhancedPickQueuenameappEOps[Self <: EnhancedPickQueuenameappE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

