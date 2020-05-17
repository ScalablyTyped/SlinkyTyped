package typingsSlinky.gitlab.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.servicesMod.EpicNotes
import typingsSlinky.gitlab.servicesMod.Epics
import typingsSlinky.gitlab.servicesMod.GroupAccessRequests
import typingsSlinky.gitlab.servicesMod.GroupBadges
import typingsSlinky.gitlab.servicesMod.GroupCustomAttributes
import typingsSlinky.gitlab.servicesMod.GroupIssueBoards
import typingsSlinky.gitlab.servicesMod.GroupLabels
import typingsSlinky.gitlab.servicesMod.GroupMembers
import typingsSlinky.gitlab.servicesMod.GroupMilestones
import typingsSlinky.gitlab.servicesMod.GroupProjects
import typingsSlinky.gitlab.servicesMod.GroupVariables
import typingsSlinky.gitlab.servicesMod.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicDiscussions extends js.Object {
  var EpicDiscussions: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.EpicDiscussions
  ] = js.native
  var EpicIssues: Instantiable0[typingsSlinky.gitlab.servicesMod.EpicIssues] = js.native
  var EpicNotes: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.EpicNotes
  ] = js.native
  var Epics: Instantiable0[typingsSlinky.gitlab.servicesMod.Epics] = js.native
  var GroupAccessRequests: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupAccessRequests
  ] = js.native
  var GroupBadges: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupBadges
  ] = js.native
  var GroupCustomAttributes: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupCustomAttributes
  ] = js.native
  var GroupIssueBoards: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupIssueBoards
  ] = js.native
  var GroupLabels: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupLabels
  ] = js.native
  var GroupMembers: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupMembers
  ] = js.native
  var GroupMilestones: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupMilestones
  ] = js.native
  var GroupProjects: Instantiable0[typingsSlinky.gitlab.servicesMod.GroupProjects] = js.native
  var GroupVariables: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.GroupVariables
  ] = js.native
  var Groups: Instantiable0[typingsSlinky.gitlab.servicesMod.Groups] = js.native
}

object EpicDiscussions {
  @scala.inline
  def apply(
    EpicDiscussions: Instantiable1[
      js.UndefOr[/* options */ BaseServiceOptions], 
      typingsSlinky.gitlab.servicesMod.EpicDiscussions
    ],
    EpicIssues: Instantiable0[typingsSlinky.gitlab.servicesMod.EpicIssues],
    EpicNotes: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], EpicNotes],
    Epics: Instantiable0[Epics],
    GroupAccessRequests: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupAccessRequests],
    GroupBadges: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupBadges],
    GroupCustomAttributes: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupCustomAttributes],
    GroupIssueBoards: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupIssueBoards],
    GroupLabels: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupLabels],
    GroupMembers: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupMembers],
    GroupMilestones: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupMilestones],
    GroupProjects: Instantiable0[GroupProjects],
    GroupVariables: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupVariables],
    Groups: Instantiable0[Groups]
  ): EpicDiscussions = {
    val __obj = js.Dynamic.literal(EpicDiscussions = EpicDiscussions.asInstanceOf[js.Any], EpicIssues = EpicIssues.asInstanceOf[js.Any], EpicNotes = EpicNotes.asInstanceOf[js.Any], Epics = Epics.asInstanceOf[js.Any], GroupAccessRequests = GroupAccessRequests.asInstanceOf[js.Any], GroupBadges = GroupBadges.asInstanceOf[js.Any], GroupCustomAttributes = GroupCustomAttributes.asInstanceOf[js.Any], GroupIssueBoards = GroupIssueBoards.asInstanceOf[js.Any], GroupLabels = GroupLabels.asInstanceOf[js.Any], GroupMembers = GroupMembers.asInstanceOf[js.Any], GroupMilestones = GroupMilestones.asInstanceOf[js.Any], GroupProjects = GroupProjects.asInstanceOf[js.Any], GroupVariables = GroupVariables.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpicDiscussions]
  }
  @scala.inline
  implicit class EpicDiscussionsOps[Self <: EpicDiscussions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpicDiscussions(
      value: Instantiable1[
          js.UndefOr[/* options */ BaseServiceOptions], 
          typingsSlinky.gitlab.servicesMod.EpicDiscussions
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EpicDiscussions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpicIssues(value: Instantiable0[typingsSlinky.gitlab.servicesMod.EpicIssues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EpicIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpicNotes(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], EpicNotes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EpicNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpics(value: Instantiable0[Epics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Epics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupAccessRequests(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupAccessRequests]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupAccessRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBadges(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupBadges]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupBadges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupCustomAttributes(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupCustomAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCustomAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupIssueBoards(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupIssueBoards]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIssueBoards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupLabels(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupLabels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupMembers(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupMembers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupMilestones(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupMilestones]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupMilestones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupProjects(value: Instantiable0[GroupProjects]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupProjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupVariables(value: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], GroupVariables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: Instantiable0[Groups]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

