package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.templatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssueDiscussions", JSImport.Namespace)
@js.native
object issueDiscussionsMod extends js.Object {
  @js.native
  class IssueDiscussions protected () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
}

