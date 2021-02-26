package typingsSlinky.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildTrigger extends StObject {
  
  /** Contents of the build template. */
  var build: js.UndefOr[Build] = js.native
  
  /** Output only. Time when the trigger was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Human-readable description of this trigger. */
  var description: js.UndefOr[String] = js.native
  
  /** If true, the trigger will never automatically execute a build. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** Path, from the source root, to a file whose contents is used for the template. */
  var filename: js.UndefOr[String] = js.native
  
  /** GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`. */
  var github: js.UndefOr[GitHubEventsConfig] = js.native
  
  /** Output only. Unique identifier of the trigger. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files and changed files are both
    * empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If
    * the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of
    * the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If
    * not, then we do not trigger a build.
    */
  var includedFiles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and
    * dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`. */
  var substitutions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.BuildTrigger with TopLevel[js.Any]
  ] = js.native
  
  /** Tags for annotation of a `BuildTrigger` */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that
    * matches that regular expression will trigger a build. Mutually exclusive with `github`.
    */
  var triggerTemplate: js.UndefOr[RepoSource] = js.native
}
object BuildTrigger {
  
  @scala.inline
  def apply(): BuildTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildTrigger]
  }
  
  @scala.inline
  implicit class BuildTriggerMutableBuilder[Self <: BuildTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setGithub(value: GitHubEventsConfig): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIgnoredFiles(value: js.Array[String]): Self = StObject.set(x, "ignoredFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredFilesUndefined: Self = StObject.set(x, "ignoredFiles", js.undefined)
    
    @scala.inline
    def setIgnoredFilesVarargs(value: String*): Self = StObject.set(x, "ignoredFiles", js.Array(value :_*))
    
    @scala.inline
    def setIncludedFiles(value: js.Array[String]): Self = StObject.set(x, "includedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedFilesUndefined: Self = StObject.set(x, "includedFiles", js.undefined)
    
    @scala.inline
    def setIncludedFilesVarargs(value: String*): Self = StObject.set(x, "includedFiles", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubstitutions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.BuildTrigger with TopLevel[js.Any]
    ): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "substitutions", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTriggerTemplate(value: RepoSource): Self = StObject.set(x, "triggerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerTemplateUndefined: Self = StObject.set(x, "triggerTemplate", js.undefined)
  }
}
