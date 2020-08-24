package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.templatesMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectIssueBoards", JSImport.Namespace)
@js.native
object projectIssueBoardsMod extends js.Object {
  @js.native
  class ProjectIssueBoards protected () extends ResourceIssueBoards {
    def this(options: BaseServiceOptions) = this()
  }
  
}

