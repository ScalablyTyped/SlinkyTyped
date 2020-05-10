package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provenance of a build. Contains all information needed to verify the full
  * details about the build from source to completion.
  */
@js.native
trait SchemaBuildProvenance extends js.Object {
  /**
    * Special options applied to this build. This is a catch-all field where
    * build providers can enter any desired additional details.
    */
  var buildOptions: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Version string of the builder at the time this build was executed.
    */
  var builderVersion: js.UndefOr[String] = js.native
  /**
    * Output of the build.
    */
  var builtArtifacts: js.UndefOr[js.Array[SchemaArtifact]] = js.native
  /**
    * Commands requested by the build.
    */
  var commands: js.UndefOr[js.Array[SchemaCommand]] = js.native
  /**
    * Time at which the build was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * E-mail address of the user who initiated this build. Note that this was
    * the user&#39;s e-mail address at the time the build was initiated; this
    * address may not represent the same end-user for all time.
    */
  var creator: js.UndefOr[String] = js.native
  /**
    * Time at which execution of the build was finished.
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * Unique identifier of the build.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage bucket where logs were written.
    */
  var logsBucket: js.UndefOr[String] = js.native
  /**
    * ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Details of the Source input to the build.
    */
  var sourceProvenance: js.UndefOr[SchemaSource] = js.native
  /**
    * Time at which execution of the build was started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Trigger identifier if the build was triggered automatically; empty if
    * not.
    */
  var triggerId: js.UndefOr[String] = js.native
}

object SchemaBuildProvenance {
  @scala.inline
  def apply(): SchemaBuildProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildProvenance]
  }
  @scala.inline
  implicit class SchemaBuildProvenanceOps[Self <: SchemaBuildProvenance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builderVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builderVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBuiltArtifacts(value: js.Array[SchemaArtifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withCommands(value: js.Array[SchemaCommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
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
    def withCreator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(js.undefined)
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
    def withLogsBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogsBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceProvenance(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceProvenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenance")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerId")(js.undefined)
        ret
    }
  }
  
}

