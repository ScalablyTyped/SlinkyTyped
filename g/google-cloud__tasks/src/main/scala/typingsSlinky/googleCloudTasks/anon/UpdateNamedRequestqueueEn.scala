package typingsSlinky.googleCloudTasks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/tasks.@google-cloud/tasks.UpdateNamedRequest<'queue', @google-cloud/tasks.@google-cloud/tasks.EnhancedPick<@google-cloud/tasks.@google-cloud/tasks.Queue, 'name', 'appEngineHttpQueue' | 'rateLimits' | 'retryConfig'>> */
@js.native
trait UpdateNamedRequestqueueEn extends js.Object {
  /**
    * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
    */
  var parent: String = js.native
  var queue: EnhancedPickQueuenameappE = js.native
}

object UpdateNamedRequestqueueEn {
  @scala.inline
  def apply(parent: String, queue: EnhancedPickQueuenameappE): UpdateNamedRequestqueueEn = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNamedRequestqueueEn]
  }
  @scala.inline
  implicit class UpdateNamedRequestqueueEnOps[Self <: UpdateNamedRequestqueueEn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: EnhancedPickQueuenameappE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

