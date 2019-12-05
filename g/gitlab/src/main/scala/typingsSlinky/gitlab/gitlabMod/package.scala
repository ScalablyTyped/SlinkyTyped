package typingsSlinky.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gitlabMod {
  import typingsSlinky.gitlab.Anon_BranchesCommitDiscussions
  import typingsSlinky.gitlab.Anon_EpicDiscussionsEpicIssues
  import typingsSlinky.gitlab.Anon_UserCustomAttributes
  import typingsSlinky.gitlab.distTypesCoreInfrastructureUtilsMod.Bundle
  import typingsSlinky.std.InstanceType

  type Gitlab = InstanceType[
    Bundle[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof APIServices */ js.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any
    ]
  ]
  type GroupsBundle = InstanceType[
    Bundle[
      Anon_EpicDiscussionsEpicIssues, 
      typingsSlinky.gitlab.gitlabStrings.Groups | typingsSlinky.gitlab.gitlabStrings.GroupAccessRequests | typingsSlinky.gitlab.gitlabStrings.GroupBadges | typingsSlinky.gitlab.gitlabStrings.GroupCustomAttributes | typingsSlinky.gitlab.gitlabStrings.GroupIssueBoards | typingsSlinky.gitlab.gitlabStrings.GroupMembers | typingsSlinky.gitlab.gitlabStrings.GroupMilestones | typingsSlinky.gitlab.gitlabStrings.GroupProjects | typingsSlinky.gitlab.gitlabStrings.GroupVariables | typingsSlinky.gitlab.gitlabStrings.GroupLabels | typingsSlinky.gitlab.gitlabStrings.Epics | typingsSlinky.gitlab.gitlabStrings.EpicIssues | typingsSlinky.gitlab.gitlabStrings.EpicNotes | typingsSlinky.gitlab.gitlabStrings.EpicDiscussions
    ]
  ]
  type ProjectsBundle = InstanceType[
    Bundle[
      Anon_BranchesCommitDiscussions, 
      typingsSlinky.gitlab.gitlabStrings.Branches | typingsSlinky.gitlab.gitlabStrings.Commits | typingsSlinky.gitlab.gitlabStrings.CommitDiscussions | typingsSlinky.gitlab.gitlabStrings.ContainerRegistry | typingsSlinky.gitlab.gitlabStrings.DeployKeys | typingsSlinky.gitlab.gitlabStrings.Deployments | typingsSlinky.gitlab.gitlabStrings.Environments | typingsSlinky.gitlab.gitlabStrings.Issues | typingsSlinky.gitlab.gitlabStrings.IssuesStatistics | typingsSlinky.gitlab.gitlabStrings.IssueAwardEmojis | typingsSlinky.gitlab.gitlabStrings.IssueNotes | typingsSlinky.gitlab.gitlabStrings.IssueDiscussions | typingsSlinky.gitlab.gitlabStrings.Jobs | typingsSlinky.gitlab.gitlabStrings.Labels | typingsSlinky.gitlab.gitlabStrings.MergeRequests | typingsSlinky.gitlab.gitlabStrings.MergeRequestAwardEmojis | typingsSlinky.gitlab.gitlabStrings.MergeRequestDiscussions | typingsSlinky.gitlab.gitlabStrings.MergeRequestNotes | typingsSlinky.gitlab.gitlabStrings.Packages | typingsSlinky.gitlab.gitlabStrings.Pipelines | typingsSlinky.gitlab.gitlabStrings.PipelineSchedules | typingsSlinky.gitlab.gitlabStrings.PipelineScheduleVariables | typingsSlinky.gitlab.gitlabStrings.Projects | typingsSlinky.gitlab.gitlabStrings.ProjectAccessRequests | typingsSlinky.gitlab.gitlabStrings.ProjectBadges | typingsSlinky.gitlab.gitlabStrings.ProjectCustomAttributes | typingsSlinky.gitlab.gitlabStrings.ProjectImportExport | typingsSlinky.gitlab.gitlabStrings.ProjectIssueBoards | typingsSlinky.gitlab.gitlabStrings.ProjectHooks | typingsSlinky.gitlab.gitlabStrings.ProjectMembers | typingsSlinky.gitlab.gitlabStrings.ProjectMilestones | typingsSlinky.gitlab.gitlabStrings.ProjectSnippets | typingsSlinky.gitlab.gitlabStrings.ProjectSnippetNotes | typingsSlinky.gitlab.gitlabStrings.ProjectSnippetDiscussions | typingsSlinky.gitlab.gitlabStrings.ProjectSnippetAwardEmojis | typingsSlinky.gitlab.gitlabStrings.ProtectedBranches | typingsSlinky.gitlab.gitlabStrings.ProtectedTags | typingsSlinky.gitlab.gitlabStrings.ProjectVariables | typingsSlinky.gitlab.gitlabStrings.PushRules | typingsSlinky.gitlab.gitlabStrings.Releases | typingsSlinky.gitlab.gitlabStrings.ReleaseLinks | typingsSlinky.gitlab.gitlabStrings.Repositories | typingsSlinky.gitlab.gitlabStrings.RepositoryFiles | typingsSlinky.gitlab.gitlabStrings.Runners | typingsSlinky.gitlab.gitlabStrings.Services | typingsSlinky.gitlab.gitlabStrings.Tags | typingsSlinky.gitlab.gitlabStrings.Triggers
    ]
  ]
  type UsersBundle = InstanceType[
    Bundle[
      Anon_UserCustomAttributes, 
      typingsSlinky.gitlab.gitlabStrings.Users | typingsSlinky.gitlab.gitlabStrings.UserCustomAttributes | typingsSlinky.gitlab.gitlabStrings.UserEmails | typingsSlinky.gitlab.gitlabStrings.UserImpersonationTokens | typingsSlinky.gitlab.gitlabStrings.UserKeys | typingsSlinky.gitlab.gitlabStrings.UserGPGKeys
    ]
  ]
}
