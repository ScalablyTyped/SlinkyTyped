package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsCancelImportParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsDeleteArchiveForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsDeleteArchiveForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsDownloadArchiveForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetArchiveForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetArchiveForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetCommitAuthorsParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetCommitAuthorsResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetImportProgressParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetImportProgressResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetLargeFilesParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetLargeFilesResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetStatusForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetStatusForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetStatusForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsGetStatusForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListReposForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListReposForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListReposForUserParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsListReposForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsMapCommitAuthorParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsMapCommitAuthorResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsSetLfsPreferenceParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsSetLfsPreferenceResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsStartForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsStartForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsStartForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsStartForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsStartImportParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsStartImportResponse
import typingsSlinky.octokitRest.mod.Octokit.MigrationsUnlockRepoForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsUnlockRepoForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsUpdateImportParams
import typingsSlinky.octokitRest.mod.Octokit.MigrationsUpdateImportResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelImport extends js.Object {
  /**
    * Stop an import for a repository.
    */
  @JSName("cancelImport")
  var cancelImport_Original: Anon192 = js.native
  /**
    * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://developer.github.com/v3/migrations/users/#list-user-migrations) and [Get the status of a user migration](https://developer.github.com/v3/migrations/users/#get-the-status-of-a-user-migration) endpoints, will continue to be available even after an archive is deleted.
    */
  @JSName("deleteArchiveForAuthenticatedUser")
  var deleteArchiveForAuthenticatedUser_Original: Anon193 = js.native
  /**
    * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  @JSName("deleteArchiveForOrg")
  var deleteArchiveForOrg_Original: Anon194 = js.native
  /**
    * Fetches the URL to a migration archive.
    */
  @JSName("downloadArchiveForOrg")
  var downloadArchiveForOrg_Original: Anon195 = js.native
  /**
    * Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:
    *
    * *   attachments
    * *   bases
    * *   commit\_comments
    * *   issue\_comments
    * *   issue\_events
    * *   issues
    * *   milestones
    * *   organizations
    * *   projects
    * *   protected\_branches
    * *   pull\_request\_reviews
    * *   pull\_requests
    * *   releases
    * *   repositories
    * *   review\_comments
    * *   schema
    * *   users
    *
    * The archive will also contain an `attachments` directory that includes all attachment files uploaded to GitHub.com and a `repositories` directory that contains the repository's Git data.
    */
  @JSName("getArchiveForAuthenticatedUser")
  var getArchiveForAuthenticatedUser_Original: Anon196 = js.native
  /**
    * Fetches the URL to a migration archive.
    *
    *
    * @deprecated octokit.migrations.getArchiveForOrg() has been renamed to octokit.migrations.downloadArchiveForOrg() (2020-01-27)
    */
  @JSName("getArchiveForOrg")
  var getArchiveForOrg_Original: Anon197 = js.native
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This API method and the "Map a commit author" method allow you to provide correct Git author information.
    */
  @JSName("getCommitAuthors")
  var getCommitAuthors_Original: Anon198 = js.native
  /**
    * View the progress of an import.
    *
    * **Import status**
    *
    * This section includes details about the possible values of the `status` field of the Import Progress response.
    *
    * An import that does not have errors will progress through these steps:
    *
    * *   `detecting` - the "detection" step of the import is in progress because the request did not include a `vcs` parameter. The import is identifying the type of source control present at the URL.
    * *   `importing` - the "raw" step of the import is in progress. This is where commit data is fetched from the original repository. The import progress response will include `commit_count` (the total number of raw commits that will be imported) and `percent` (0 - 100, the current progress through the import).
    * *   `mapping` - the "rewrite" step of the import is in progress. This is where SVN branches are converted to Git branches, and where author updates are applied. The import progress response does not include progress information.
    * *   `pushing` - the "push" step of the import is in progress. This is where the importer updates the repository on GitHub. The import progress response will include `push_percent`, which is the percent value reported by `git push` when it is "Writing objects".
    * *   `complete` - the import is complete, and the repository is ready on GitHub.
    *
    * If there are problems, you will see one of these in the `status` field:
    *
    * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an error message. Contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com) for more information.
    * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel the import](https://developer.github.com/v3/migrations/source_imports/#cancel-an-import) and [retry](https://developer.github.com/v3/migrations/source_imports/#start-an-import) with the correct URL.
    * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a `project_choices` field with the possible project choices as values. To update project choice, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    *
    * **The project_choices field**
    *
    * When multiple projects are found at the provided URL, the response hash will include a `project_choices` field, the value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project hashes will differ depending on the version control type.
    *
    * **Git LFS related fields**
    *
    * This section includes details about Git LFS related fields that may be present in the Import Progress response.
    *
    * *   `use_lfs` - describes whether the import has been opted in or out of using Git LFS. The value can be `opt_in`, `opt_out`, or `undecided` if no action has been taken.
    * *   `has_large_files` - the boolean value describing whether files larger than 100MB were found during the `importing` step.
    * *   `large_files_size` - the total size in gigabytes of files larger than 100MB found in the originating repository.
    * *   `large_files_count` - the total number of files larger than 100MB found in the originating repository. To see a list of these files, make a "Get Large Files" request.
    */
  @JSName("getImportProgress")
  var getImportProgress_Original: Anon199 = js.native
  /**
    * List files larger than 100MB found during the import
    */
  @JSName("getLargeFiles")
  var getLargeFiles_Original: Anon200 = js.native
  /**
    * Fetches a single user migration. The response includes the `state` of the migration, which can be one of the following values:
    *
    * *   `pending` - the migration hasn't started yet.
    * *   `exporting` - the migration is in progress.
    * *   `exported` - the migration finished successfully.
    * *   `failed` - the migration failed.
    *
    * Once the migration has been `exported` you can [download the migration archive](https://developer.github.com/v3/migrations/users/#download-a-user-migration-archive).
    */
  @JSName("getStatusForAuthenticatedUser")
  var getStatusForAuthenticatedUser_Original: Anon201 = js.native
  /**
    * Fetches the status of a migration.
    *
    * The `state` of a migration can be one of the following values:
    *
    * *   `pending`, which means the migration hasn't started yet.
    * *   `exporting`, which means the migration is in progress.
    * *   `exported`, which means the migration finished successfully.
    * *   `failed`, which means the migration failed.
    */
  @JSName("getStatusForOrg")
  var getStatusForOrg_Original: Anon202 = js.native
  /**
    * Lists all migrations a user has started.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: Anon203 = js.native
  /**
    * Lists the most recent migrations.
    */
  @JSName("listForOrg")
  var listForOrg_Original: Anon204 = js.native
  /**
    * List all the repositories for this organization migration.
    */
  @JSName("listReposForOrg")
  var listReposForOrg_Original: Anon205 = js.native
  /**
    * Lists all the repositories for this user migration.
    */
  @JSName("listReposForUser")
  var listReposForUser_Original: Anon206 = js.native
  /**
    * Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository.
    */
  @JSName("mapCommitAuthor")
  var mapCommitAuthor_Original: Anon207 = js.native
  /**
    * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://help.github.com/articles/versioning-large-files/).
    */
  @JSName("setLfsPreference")
  var setLfsPreference_Original: Anon208 = js.native
  /**
    * Initiates the generation of a user migration archive.
    */
  @JSName("startForAuthenticatedUser")
  var startForAuthenticatedUser_Original: Anon209 = js.native
  /**
    * Initiates the generation of a migration archive.
    */
  @JSName("startForOrg")
  var startForOrg_Original: Anon210 = js.native
  /**
    * Start a source import to a GitHub repository using GitHub Importer.
    */
  @JSName("startImport")
  var startImport_Original: Anon211 = js.native
  /**
    * Unlocks a repository. You can lock repositories when you [start a user migration](https://developer.github.com/v3/migrations/users/#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://developer.github.com/v3/repos/#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked.
    */
  @JSName("unlockRepoForAuthenticatedUser")
  var unlockRepoForAuthenticatedUser_Original: Anon212 = js.native
  /**
    * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://developer.github.com/v3/repos/#delete-a-repository) when the migration is complete and you no longer need the source data.
    */
  @JSName("unlockRepoForOrg")
  var unlockRepoForOrg_Original: Anon213 = js.native
  /**
    * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API request. If no parameters are provided, the import will be restarted.
    *
    * Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will have the status `detection_found_multiple` and the Import Progress response will include a `project_choices` array. You can select the project to import by providing one of the objects in the `project_choices` array in the update request.
    *
    * The following example demonstrates the workflow for updating an import with "project1" as the project choice. Given a `project_choices` array like such:
    *
    * To restart an import, no parameters are provided in the update request.
    */
  @JSName("updateImport")
  var updateImport_Original: Anon214 = js.native
  /**
    * Stop an import for a repository.
    */
  def cancelImport(): js.Promise[AnyResponse] = js.native
  def cancelImport(params: RequestOptions with MigrationsCancelImportParams): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://developer.github.com/v3/migrations/users/#list-user-migrations) and [Get the status of a user migration](https://developer.github.com/v3/migrations/users/#get-the-status-of-a-user-migration) endpoints, will continue to be available even after an archive is deleted.
    */
  def deleteArchiveForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def deleteArchiveForAuthenticatedUser(params: RequestOptions with MigrationsDeleteArchiveForAuthenticatedUserParams): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  def deleteArchiveForOrg(): js.Promise[AnyResponse] = js.native
  def deleteArchiveForOrg(params: RequestOptions with MigrationsDeleteArchiveForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * Fetches the URL to a migration archive.
    */
  def downloadArchiveForOrg(): js.Promise[AnyResponse] = js.native
  def downloadArchiveForOrg(params: RequestOptions with MigrationsDownloadArchiveForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:
    *
    * *   attachments
    * *   bases
    * *   commit\_comments
    * *   issue\_comments
    * *   issue\_events
    * *   issues
    * *   milestones
    * *   organizations
    * *   projects
    * *   protected\_branches
    * *   pull\_request\_reviews
    * *   pull\_requests
    * *   releases
    * *   repositories
    * *   review\_comments
    * *   schema
    * *   users
    *
    * The archive will also contain an `attachments` directory that includes all attachment files uploaded to GitHub.com and a `repositories` directory that contains the repository's Git data.
    */
  def getArchiveForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def getArchiveForAuthenticatedUser(params: RequestOptions with MigrationsGetArchiveForAuthenticatedUserParams): js.Promise[AnyResponse] = js.native
  /**
    * Fetches the URL to a migration archive.
    *
    *
    * @deprecated octokit.migrations.getArchiveForOrg() has been renamed to octokit.migrations.downloadArchiveForOrg() (2020-01-27)
    */
  def getArchiveForOrg(): js.Promise[AnyResponse] = js.native
  def getArchiveForOrg(params: RequestOptions with MigrationsGetArchiveForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This API method and the "Map a commit author" method allow you to provide correct Git author information.
    */
  def getCommitAuthors(): js.Promise[Response[MigrationsGetCommitAuthorsResponse]] = js.native
  def getCommitAuthors(params: RequestOptions with MigrationsGetCommitAuthorsParams): js.Promise[Response[MigrationsGetCommitAuthorsResponse]] = js.native
  /**
    * View the progress of an import.
    *
    * **Import status**
    *
    * This section includes details about the possible values of the `status` field of the Import Progress response.
    *
    * An import that does not have errors will progress through these steps:
    *
    * *   `detecting` - the "detection" step of the import is in progress because the request did not include a `vcs` parameter. The import is identifying the type of source control present at the URL.
    * *   `importing` - the "raw" step of the import is in progress. This is where commit data is fetched from the original repository. The import progress response will include `commit_count` (the total number of raw commits that will be imported) and `percent` (0 - 100, the current progress through the import).
    * *   `mapping` - the "rewrite" step of the import is in progress. This is where SVN branches are converted to Git branches, and where author updates are applied. The import progress response does not include progress information.
    * *   `pushing` - the "push" step of the import is in progress. This is where the importer updates the repository on GitHub. The import progress response will include `push_percent`, which is the percent value reported by `git push` when it is "Writing objects".
    * *   `complete` - the import is complete, and the repository is ready on GitHub.
    *
    * If there are problems, you will see one of these in the `status` field:
    *
    * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an error message. Contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com) for more information.
    * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel the import](https://developer.github.com/v3/migrations/source_imports/#cancel-an-import) and [retry](https://developer.github.com/v3/migrations/source_imports/#start-an-import) with the correct URL.
    * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a `project_choices` field with the possible project choices as values. To update project choice, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    *
    * **The project_choices field**
    *
    * When multiple projects are found at the provided URL, the response hash will include a `project_choices` field, the value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project hashes will differ depending on the version control type.
    *
    * **Git LFS related fields**
    *
    * This section includes details about Git LFS related fields that may be present in the Import Progress response.
    *
    * *   `use_lfs` - describes whether the import has been opted in or out of using Git LFS. The value can be `opt_in`, `opt_out`, or `undecided` if no action has been taken.
    * *   `has_large_files` - the boolean value describing whether files larger than 100MB were found during the `importing` step.
    * *   `large_files_size` - the total size in gigabytes of files larger than 100MB found in the originating repository.
    * *   `large_files_count` - the total number of files larger than 100MB found in the originating repository. To see a list of these files, make a "Get Large Files" request.
    */
  def getImportProgress(): js.Promise[Response[MigrationsGetImportProgressResponse]] = js.native
  def getImportProgress(params: RequestOptions with MigrationsGetImportProgressParams): js.Promise[Response[MigrationsGetImportProgressResponse]] = js.native
  /**
    * List files larger than 100MB found during the import
    */
  def getLargeFiles(): js.Promise[Response[MigrationsGetLargeFilesResponse]] = js.native
  def getLargeFiles(params: RequestOptions with MigrationsGetLargeFilesParams): js.Promise[Response[MigrationsGetLargeFilesResponse]] = js.native
  /**
    * Fetches a single user migration. The response includes the `state` of the migration, which can be one of the following values:
    *
    * *   `pending` - the migration hasn't started yet.
    * *   `exporting` - the migration is in progress.
    * *   `exported` - the migration finished successfully.
    * *   `failed` - the migration failed.
    *
    * Once the migration has been `exported` you can [download the migration archive](https://developer.github.com/v3/migrations/users/#download-a-user-migration-archive).
    */
  def getStatusForAuthenticatedUser(): js.Promise[Response[MigrationsGetStatusForAuthenticatedUserResponse]] = js.native
  def getStatusForAuthenticatedUser(params: RequestOptions with MigrationsGetStatusForAuthenticatedUserParams): js.Promise[Response[MigrationsGetStatusForAuthenticatedUserResponse]] = js.native
  /**
    * Fetches the status of a migration.
    *
    * The `state` of a migration can be one of the following values:
    *
    * *   `pending`, which means the migration hasn't started yet.
    * *   `exporting`, which means the migration is in progress.
    * *   `exported`, which means the migration finished successfully.
    * *   `failed`, which means the migration failed.
    */
  def getStatusForOrg(): js.Promise[Response[MigrationsGetStatusForOrgResponse]] = js.native
  def getStatusForOrg(params: RequestOptions with MigrationsGetStatusForOrgParams): js.Promise[Response[MigrationsGetStatusForOrgResponse]] = js.native
  /**
    * Lists all migrations a user has started.
    */
  def listForAuthenticatedUser(): js.Promise[Response[MigrationsListForAuthenticatedUserResponse]] = js.native
  def listForAuthenticatedUser(params: RequestOptions with MigrationsListForAuthenticatedUserParams): js.Promise[Response[MigrationsListForAuthenticatedUserResponse]] = js.native
  /**
    * Lists the most recent migrations.
    */
  def listForOrg(): js.Promise[Response[MigrationsListForOrgResponse]] = js.native
  def listForOrg(params: RequestOptions with MigrationsListForOrgParams): js.Promise[Response[MigrationsListForOrgResponse]] = js.native
  /**
    * List all the repositories for this organization migration.
    */
  def listReposForOrg(): js.Promise[Response[MigrationsListReposForOrgResponse]] = js.native
  def listReposForOrg(params: RequestOptions with MigrationsListReposForOrgParams): js.Promise[Response[MigrationsListReposForOrgResponse]] = js.native
  /**
    * Lists all the repositories for this user migration.
    */
  def listReposForUser(): js.Promise[Response[MigrationsListReposForUserResponse]] = js.native
  def listReposForUser(params: RequestOptions with MigrationsListReposForUserParams): js.Promise[Response[MigrationsListReposForUserResponse]] = js.native
  /**
    * Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository.
    */
  def mapCommitAuthor(): js.Promise[Response[MigrationsMapCommitAuthorResponse]] = js.native
  def mapCommitAuthor(params: RequestOptions with MigrationsMapCommitAuthorParams): js.Promise[Response[MigrationsMapCommitAuthorResponse]] = js.native
  /**
    * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://help.github.com/articles/versioning-large-files/).
    */
  def setLfsPreference(): js.Promise[Response[MigrationsSetLfsPreferenceResponse]] = js.native
  def setLfsPreference(params: RequestOptions with MigrationsSetLfsPreferenceParams): js.Promise[Response[MigrationsSetLfsPreferenceResponse]] = js.native
  /**
    * Initiates the generation of a user migration archive.
    */
  def startForAuthenticatedUser(): js.Promise[Response[MigrationsStartForAuthenticatedUserResponse]] = js.native
  def startForAuthenticatedUser(params: RequestOptions with MigrationsStartForAuthenticatedUserParams): js.Promise[Response[MigrationsStartForAuthenticatedUserResponse]] = js.native
  /**
    * Initiates the generation of a migration archive.
    */
  def startForOrg(): js.Promise[Response[MigrationsStartForOrgResponse]] = js.native
  def startForOrg(params: RequestOptions with MigrationsStartForOrgParams): js.Promise[Response[MigrationsStartForOrgResponse]] = js.native
  /**
    * Start a source import to a GitHub repository using GitHub Importer.
    */
  def startImport(): js.Promise[Response[MigrationsStartImportResponse]] = js.native
  def startImport(params: RequestOptions with MigrationsStartImportParams): js.Promise[Response[MigrationsStartImportResponse]] = js.native
  /**
    * Unlocks a repository. You can lock repositories when you [start a user migration](https://developer.github.com/v3/migrations/users/#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://developer.github.com/v3/repos/#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked.
    */
  def unlockRepoForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def unlockRepoForAuthenticatedUser(params: RequestOptions with MigrationsUnlockRepoForAuthenticatedUserParams): js.Promise[AnyResponse] = js.native
  /**
    * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://developer.github.com/v3/repos/#delete-a-repository) when the migration is complete and you no longer need the source data.
    */
  def unlockRepoForOrg(): js.Promise[AnyResponse] = js.native
  def unlockRepoForOrg(params: RequestOptions with MigrationsUnlockRepoForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API request. If no parameters are provided, the import will be restarted.
    *
    * Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will have the status `detection_found_multiple` and the Import Progress response will include a `project_choices` array. You can select the project to import by providing one of the objects in the `project_choices` array in the update request.
    *
    * The following example demonstrates the workflow for updating an import with "project1" as the project choice. Given a `project_choices` array like such:
    *
    * To restart an import, no parameters are provided in the update request.
    */
  def updateImport(): js.Promise[Response[MigrationsUpdateImportResponse]] = js.native
  def updateImport(params: RequestOptions with MigrationsUpdateImportParams): js.Promise[Response[MigrationsUpdateImportResponse]] = js.native
}

