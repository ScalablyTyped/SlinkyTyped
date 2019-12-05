package typingsSlinky.backlogDashJs.backlogDashJsMod.Option

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivityType extends js.Object

@JSImport("backlog-js", "Option.ActivityType")
@js.native
object ActivityType extends js.Object {
  @js.native
  sealed trait FileAdded extends ActivityType
  
  @js.native
  sealed trait FileDeleted extends ActivityType
  
  @js.native
  sealed trait FileUpdated extends ActivityType
  
  @js.native
  sealed trait GitPushed extends ActivityType
  
  @js.native
  sealed trait GitRepositoryCreated extends ActivityType
  
  @js.native
  sealed trait IssueCommented extends ActivityType
  
  @js.native
  sealed trait IssueCreated extends ActivityType
  
  @js.native
  sealed trait IssueDeleted extends ActivityType
  
  @js.native
  sealed trait IssueMultiUpdated extends ActivityType
  
  @js.native
  sealed trait IssueUpdated extends ActivityType
  
  @js.native
  sealed trait NotifyAdded extends ActivityType
  
  @js.native
  sealed trait ProjectUserAdded extends ActivityType
  
  @js.native
  sealed trait ProjectUserRemoved extends ActivityType
  
  @js.native
  sealed trait PullRequestAdded extends ActivityType
  
  @js.native
  sealed trait PullRequestCommented extends ActivityType
  
  @js.native
  sealed trait PullRequestMerged extends ActivityType
  
  @js.native
  sealed trait PullRequestUpdated extends ActivityType
  
  @js.native
  sealed trait SvnCommitted extends ActivityType
  
  @js.native
  sealed trait Undefined extends ActivityType
  
  @js.native
  sealed trait WikiCreated extends ActivityType
  
  @js.native
  sealed trait WikiDeleted extends ActivityType
  
  @js.native
  sealed trait WikiUpdated extends ActivityType
  
  /* 8 */ val FileAdded: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.FileAdded with Double = js.native
  /* 10 */ val FileDeleted: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.FileDeleted with Double = js.native
  /* 9 */ val FileUpdated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.FileUpdated with Double = js.native
  /* 12 */ val GitPushed: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.GitPushed with Double = js.native
  /* 13 */ val GitRepositoryCreated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.GitRepositoryCreated with Double = js.native
  /* 3 */ val IssueCommented: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueCommented with Double = js.native
  /* 1 */ val IssueCreated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueCreated with Double = js.native
  /* 4 */ val IssueDeleted: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueDeleted with Double = js.native
  /* 14 */ val IssueMultiUpdated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueMultiUpdated with Double = js.native
  /* 2 */ val IssueUpdated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueUpdated with Double = js.native
  /* 17 */ val NotifyAdded: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.NotifyAdded with Double = js.native
  /* 15 */ val ProjectUserAdded: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.ProjectUserAdded with Double = js.native
  /* 16 */ val ProjectUserRemoved: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.ProjectUserRemoved with Double = js.native
  /* 18 */ val PullRequestAdded: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestAdded with Double = js.native
  /* 20 */ val PullRequestCommented: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestCommented with Double = js.native
  /* 21 */ val PullRequestMerged: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestMerged with Double = js.native
  /* 19 */ val PullRequestUpdated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestUpdated with Double = js.native
  /* 11 */ val SvnCommitted: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.SvnCommitted with Double = js.native
  /* -1 */ val Undefined: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.Undefined with Double = js.native
  /* 5 */ val WikiCreated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.WikiCreated with Double = js.native
  /* 7 */ val WikiDeleted: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.WikiDeleted with Double = js.native
  /* 6 */ val WikiUpdated: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.ActivityType.WikiUpdated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivityType with Double] = js.native
}

