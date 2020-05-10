package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDeclaration extends js.Object {
  /**
    * Represents information about the S3 bucket where artifacts are stored for the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStore: js.UndefOr[ArtifactStore] = js.native
  /**
    * A mapping of artifactStore objects and their corresponding AWS Regions. There must be an artifact store for the pipeline Region and for each cross-region action in the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStores: js.UndefOr[ArtifactStoreMap] = js.native
  /**
    * The name of the action to be performed.
    */
  var name: PipelineName = js.native
  /**
    * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
    */
  var roleArn: RoleArn = js.native
  /**
    * The stage in which to perform the action.
    */
  var stages: PipelineStageDeclarationList = js.native
  /**
    * The version number of the pipeline. A new pipeline always has a version number of 1. This number is incremented when a pipeline is updated.
    */
  var version: js.UndefOr[PipelineVersion] = js.native
}

object PipelineDeclaration {
  @scala.inline
  def apply(name: PipelineName, roleArn: RoleArn, stages: PipelineStageDeclarationList): PipelineDeclaration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDeclaration]
  }
  @scala.inline
  implicit class PipelineDeclarationOps[Self <: PipelineDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStages(value: PipelineStageDeclarationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactStore(value: ArtifactStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStore")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactStores(value: ArtifactStoreMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStores")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: PipelineVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

