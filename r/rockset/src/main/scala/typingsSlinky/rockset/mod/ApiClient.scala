package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiClient extends js.Object {
  var apiKeys: ApiKeysApi = js.native
  var collections: CollectionsApi = js.native
  var documents: DocumentsApi = js.native
  var integrations: IntegrationsApi = js.native
  var organizations: OrganizationsApi = js.native
  var queries: QueriesApi = js.native
  var users: UsersApi = js.native
  var workspaces: WorkspacesApi = js.native
}

object ApiClient {
  @scala.inline
  def apply(
    apiKeys: ApiKeysApi,
    collections: CollectionsApi,
    documents: DocumentsApi,
    integrations: IntegrationsApi,
    organizations: OrganizationsApi,
    queries: QueriesApi,
    users: UsersApi,
    workspaces: WorkspacesApi
  ): ApiClient = {
    val __obj = js.Dynamic.literal(apiKeys = apiKeys.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], integrations = integrations.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiClient]
  }
  @scala.inline
  implicit class ApiClientOps[Self <: ApiClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKeys(value: ApiKeysApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollections(value: CollectionsApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocuments(value: DocumentsApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrations(value: IntegrationsApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizations(value: OrganizationsApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueries(value: QueriesApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: UsersApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaces(value: WorkspacesApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

