package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for an automated build in response to source repository
  * changes.
  */
@js.native
trait SchemaBuildTrigger extends js.Object {
  /**
    * Contents of the build template.
    */
  var build: js.UndefOr[SchemaBuild] = js.native
  /**
    * Output only. Time when the trigger was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Human-readable description of this trigger.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If true, the trigger will never result in a build.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Path, from the source root, to a file whose contents is used for the
    * template.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * GitHubEventsConfig describes the configuration of a trigger that creates
    * a build whenever a GitHub event is received.
    */
  var github: js.UndefOr[SchemaGitHubEventsConfig] = js.native
  /**
    * Output only. Unique identifier of the trigger.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * ignored_files and included_files are file glob matches using
    * http://godoc/pkg/path/filepath#Match extended with support for
    * &quot;**&quot;.  If ignored_files and changed files are both empty, then
    * they are not used to determine whether or not to trigger a build.  If
    * ignored_files is not empty, then we ignore any files that match any of
    * the ignored_file globs. If the change has no files that are outside of
    * the ignored_files globs, then we do not trigger a build.
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * If any of the files altered in the commit pass the ignored_files filter
    * and included_files is empty, then as far as this filter is concerned, we
    * should trigger the build.  If any of the files altered in the commit pass
    * the ignored_files filter and included_files is not empty, then we make
    * sure that at least one of those files matches a included_files glob. If
    * not, then we do not trigger a build.
    */
  var includedFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Substitutions data for Build resource.
    */
  var substitutions: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Template describing the types of source changes to trigger a build.
    * Branch and tag names in trigger templates are interpreted as regular
    * expressions. Any branch or tag change that matches that regular
    * expression will trigger a build.
    */
  var triggerTemplate: js.UndefOr[SchemaRepoSource] = js.native
}

object SchemaBuildTrigger {
  @scala.inline
  def apply(): SchemaBuildTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildTrigger]
  }
  @scala.inline
  implicit class SchemaBuildTriggerOps[Self <: SchemaBuildTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: SchemaBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withGithub(value: SchemaGitHubEventsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("github")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGithub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("github")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerTemplate(value: SchemaRepoSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTemplate")(js.undefined)
        ret
    }
  }
  
}

