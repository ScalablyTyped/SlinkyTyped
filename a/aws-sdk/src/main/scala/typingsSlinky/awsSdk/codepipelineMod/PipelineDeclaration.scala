package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineDeclaration extends StObject {
  
  /**
    * Represents information about the S3 bucket where artifacts are stored for the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStore: js.UndefOr[ArtifactStore] = js.native
  
  /**
    * A mapping of artifactStore objects and their corresponding AWS Regions. There must be an artifact store for the pipeline Region and for each cross-region action in the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStores: js.UndefOr[ArtifactStoreMap] = js.native
  
  /**
    * The name of the pipeline.
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
  implicit class PipelineDeclarationMutableBuilder[Self <: PipelineDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactStore(value: ArtifactStore): Self = StObject.set(x, "artifactStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactStoreUndefined: Self = StObject.set(x, "artifactStore", js.undefined)
    
    @scala.inline
    def setArtifactStores(value: ArtifactStoreMap): Self = StObject.set(x, "artifactStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactStoresUndefined: Self = StObject.set(x, "artifactStores", js.undefined)
    
    @scala.inline
    def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStages(value: PipelineStageDeclarationList): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStagesVarargs(value: StageDeclaration*): Self = StObject.set(x, "stages", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: PipelineVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
