package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jobid extends js.Object {
  var job_id: Required
  var owner: Required
  var repo: Required
}

object Jobid {
  @scala.inline
  def apply(job_id: Required, owner: Required, repo: Required): Jobid = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobid]
  }
}

