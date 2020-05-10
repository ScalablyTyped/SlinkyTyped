package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonFields
import typingsSlinky.gapiClientTagmanager.AnonFingerprint
import typingsSlinky.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesResource extends js.Object {
  var built_in_variables: BuiltInVariablesResource = js.native
  var folders: FoldersResource = js.native
  var proposal: ProposalResource = js.native
  var tags: TagsResource = js.native
  var triggers: TriggersResource = js.native
  var variables: VariablesResource = js.native
  /** Creates a Workspace. */
  def create(request: AnonAlt): Request_[Workspace] = js.native
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
    * version.
    */
  def create_version(request: AnonFields): Request_[CreateContainerVersionResponse] = js.native
  /** Deletes a Workspace. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a Workspace. */
  def get(request: AnonFields): Request_[Workspace] = js.native
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: AnonFields): Request_[WorkspaceProposal] = js.native
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: AnonFields): Request_[GetWorkspaceStatusResponse] = js.native
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: AnonKey): Request_[ListWorkspacesResponse] = js.native
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: AnonFields): Request_[QuickPreviewResponse] = js.native
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: AnonFingerprint): Request_[Unit] = js.native
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: AnonFields): Request_[SyncWorkspaceResponse] = js.native
  /** Updates a Workspace. */
  def update(request: AnonFingerprint): Request_[Workspace] = js.native
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: AnonFields): Request_[WorkspaceProposal] = js.native
}

object WorkspacesResource {
  @scala.inline
  def apply(
    built_in_variables: BuiltInVariablesResource,
    create: AnonAlt => Request_[Workspace],
    create_version: AnonFields => Request_[CreateContainerVersionResponse],
    delete: AnonFields => Request_[Unit],
    folders: FoldersResource,
    get: AnonFields => Request_[Workspace],
    getProposal: AnonFields => Request_[WorkspaceProposal],
    getStatus: AnonFields => Request_[GetWorkspaceStatusResponse],
    list: AnonKey => Request_[ListWorkspacesResponse],
    proposal: ProposalResource,
    quick_preview: AnonFields => Request_[QuickPreviewResponse],
    resolve_conflict: AnonFingerprint => Request_[Unit],
    sync: AnonFields => Request_[SyncWorkspaceResponse],
    tags: TagsResource,
    triggers: TriggersResource,
    update: AnonFingerprint => Request_[Workspace],
    updateProposal: AnonFields => Request_[WorkspaceProposal],
    variables: VariablesResource
  ): WorkspacesResource = {
    val __obj = js.Dynamic.literal(built_in_variables = built_in_variables.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), create_version = js.Any.fromFunction1(create_version), delete = js.Any.fromFunction1(delete), folders = folders.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getProposal = js.Any.fromFunction1(getProposal), getStatus = js.Any.fromFunction1(getStatus), list = js.Any.fromFunction1(list), proposal = proposal.asInstanceOf[js.Any], quick_preview = js.Any.fromFunction1(quick_preview), resolve_conflict = js.Any.fromFunction1(resolve_conflict), sync = js.Any.fromFunction1(sync), tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateProposal = js.Any.fromFunction1(updateProposal), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspacesResource]
  }
  @scala.inline
  implicit class WorkspacesResourceOps[Self <: WorkspacesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilt_in_variables(value: BuiltInVariablesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("built_in_variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Workspace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate_version(value: AnonFields => Request_[CreateContainerVersionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_version")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFolders(value: FoldersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Workspace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProposal(value: AnonFields => Request_[WorkspaceProposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProposal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStatus(value: AnonFields => Request_[GetWorkspaceStatusResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListWorkspacesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProposal(value: ProposalResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuick_preview(value: AnonFields => Request_[QuickPreviewResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quick_preview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve_conflict(value: AnonFingerprint => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve_conflict")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSync(value: AnonFields => Request_[SyncWorkspaceResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTags(value: TagsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: TriggersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[Workspace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateProposal(value: AnonFields => Request_[WorkspaceProposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProposal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVariables(value: VariablesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

