package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Artifacts created by the build pipeline.
  */
@js.native
trait SchemaResults extends js.Object {
  /**
    * Path to the artifact manifest. Only populated when artifacts are
    * uploaded.
    */
  var artifactManifest: js.UndefOr[String] = js.native
  /**
    * Time to push all non-container artifacts.
    */
  var artifactTiming: js.UndefOr[SchemaTimeSpan] = js.native
  /**
    * List of build step digests, in the order corresponding to build step
    * indices.
    */
  var buildStepImages: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of build step outputs, produced by builder images, in the order
    * corresponding to build step indices.  [Cloud
    * Builders](https://cloud.google.com/cloud-build/docs/cloud-builders) can
    * produce this output by writing to `$BUILDER_OUTPUT/output`. Only the
    * first 4KB of data is stored.
    */
  var buildStepOutputs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Container images that were built as a part of the build.
    */
  var images: js.UndefOr[js.Array[SchemaBuiltImage]] = js.native
  /**
    * Number of artifacts uploaded. Only populated when artifacts are uploaded.
    */
  var numArtifacts: js.UndefOr[String] = js.native
}

object SchemaResults {
  @scala.inline
  def apply(): SchemaResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResults]
  }
  @scala.inline
  implicit class SchemaResultsOps[Self <: SchemaResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactManifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactTiming(value: SchemaTimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildStepImages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStepImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildStepImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStepImages")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildStepOutputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStepOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildStepOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStepOutputs")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[SchemaBuiltImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withNumArtifacts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numArtifacts")(js.undefined)
        ret
    }
  }
  
}

