package typingsSlinky.gitlab

import typingsSlinky.gitlab.jobsMod.JobScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  scope  :gitlab.gitlab/dist/types/core/services/Jobs.JobScope} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait scopeJobScopeSudo extends js.Object {
  var scope: JobScope
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object scopeJobScopeSudo {
  @scala.inline
  def apply(scope: JobScope, sudo: String | Double = null): scopeJobScopeSudo = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[scopeJobScopeSudo]
  }
}

