package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildTrigger extends js.Object {
  /** Contents of the build template. */
  var build: js.UndefOr[Build] = js.native
  /**
    * Time when the trigger was created.
    *
    * @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /** Human-readable description of this trigger. */
  var description: js.UndefOr[String] = js.native
  /** If true, the trigger will never result in a build. */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Path, from the source root, to a file whose contents is used for the
    * template.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Unique identifier of the trigger.
    *
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[Record[String, String]] = js.native
  /**
    * Template describing the types of source changes to trigger a build.
    *
    * Branch and tag names in trigger templates are interpreted as regular
    * expressions. Any branch or tag change that matches that regular expression
    * will trigger a build.
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
  implicit class BuildTriggerOps[Self <: BuildTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: Build): Self = {
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
    def withSubstitutions(value: Record[String, String]): Self = {
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
    def withTriggerTemplate(value: RepoSource): Self = {
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

