package typingsSlinky.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActivityType extends StObject
@JSImport("backlog-js", "Option.ActivityType")
@js.native
object ActivityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivityType with Double] = js.native
  
  @js.native
  sealed trait FileAdded extends ActivityType
  /* 8 */ val FileAdded: typingsSlinky.backlogJs.mod.Option.ActivityType.FileAdded with Double = js.native
  
  @js.native
  sealed trait FileDeleted extends ActivityType
  /* 10 */ val FileDeleted: typingsSlinky.backlogJs.mod.Option.ActivityType.FileDeleted with Double = js.native
  
  @js.native
  sealed trait FileUpdated extends ActivityType
  /* 9 */ val FileUpdated: typingsSlinky.backlogJs.mod.Option.ActivityType.FileUpdated with Double = js.native
  
  @js.native
  sealed trait GitPushed extends ActivityType
  /* 12 */ val GitPushed: typingsSlinky.backlogJs.mod.Option.ActivityType.GitPushed with Double = js.native
  
  @js.native
  sealed trait GitRepositoryCreated extends ActivityType
  /* 13 */ val GitRepositoryCreated: typingsSlinky.backlogJs.mod.Option.ActivityType.GitRepositoryCreated with Double = js.native
  
  @js.native
  sealed trait IssueCommented extends ActivityType
  /* 3 */ val IssueCommented: typingsSlinky.backlogJs.mod.Option.ActivityType.IssueCommented with Double = js.native
  
  @js.native
  sealed trait IssueCreated extends ActivityType
  /* 1 */ val IssueCreated: typingsSlinky.backlogJs.mod.Option.ActivityType.IssueCreated with Double = js.native
  
  @js.native
  sealed trait IssueDeleted extends ActivityType
  /* 4 */ val IssueDeleted: typingsSlinky.backlogJs.mod.Option.ActivityType.IssueDeleted with Double = js.native
  
  @js.native
  sealed trait IssueMultiUpdated extends ActivityType
  /* 14 */ val IssueMultiUpdated: typingsSlinky.backlogJs.mod.Option.ActivityType.IssueMultiUpdated with Double = js.native
  
  @js.native
  sealed trait IssueUpdated extends ActivityType
  /* 2 */ val IssueUpdated: typingsSlinky.backlogJs.mod.Option.ActivityType.IssueUpdated with Double = js.native
  
  @js.native
  sealed trait NotifyAdded extends ActivityType
  /* 17 */ val NotifyAdded: typingsSlinky.backlogJs.mod.Option.ActivityType.NotifyAdded with Double = js.native
  
  @js.native
  sealed trait ProjectUserAdded extends ActivityType
  /* 15 */ val ProjectUserAdded: typingsSlinky.backlogJs.mod.Option.ActivityType.ProjectUserAdded with Double = js.native
  
  @js.native
  sealed trait ProjectUserRemoved extends ActivityType
  /* 16 */ val ProjectUserRemoved: typingsSlinky.backlogJs.mod.Option.ActivityType.ProjectUserRemoved with Double = js.native
  
  @js.native
  sealed trait PullRequestAdded extends ActivityType
  /* 18 */ val PullRequestAdded: typingsSlinky.backlogJs.mod.Option.ActivityType.PullRequestAdded with Double = js.native
  
  @js.native
  sealed trait PullRequestCommented extends ActivityType
  /* 20 */ val PullRequestCommented: typingsSlinky.backlogJs.mod.Option.ActivityType.PullRequestCommented with Double = js.native
  
  @js.native
  sealed trait PullRequestMerged extends ActivityType
  /* 21 */ val PullRequestMerged: typingsSlinky.backlogJs.mod.Option.ActivityType.PullRequestMerged with Double = js.native
  
  @js.native
  sealed trait PullRequestUpdated extends ActivityType
  /* 19 */ val PullRequestUpdated: typingsSlinky.backlogJs.mod.Option.ActivityType.PullRequestUpdated with Double = js.native
  
  @js.native
  sealed trait SvnCommitted extends ActivityType
  /* 11 */ val SvnCommitted: typingsSlinky.backlogJs.mod.Option.ActivityType.SvnCommitted with Double = js.native
  
  @js.native
  sealed trait Undefined extends ActivityType
  /* -1 */ val Undefined: typingsSlinky.backlogJs.mod.Option.ActivityType.Undefined with Double = js.native
  
  @js.native
  sealed trait WikiCreated extends ActivityType
  /* 5 */ val WikiCreated: typingsSlinky.backlogJs.mod.Option.ActivityType.WikiCreated with Double = js.native
  
  @js.native
  sealed trait WikiDeleted extends ActivityType
  /* 7 */ val WikiDeleted: typingsSlinky.backlogJs.mod.Option.ActivityType.WikiDeleted with Double = js.native
  
  @js.native
  sealed trait WikiUpdated extends ActivityType
  /* 6 */ val WikiUpdated: typingsSlinky.backlogJs.mod.Option.ActivityType.WikiUpdated with Double = js.native
}
