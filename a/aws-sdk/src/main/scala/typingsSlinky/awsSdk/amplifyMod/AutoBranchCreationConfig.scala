package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoBranchCreationConfig extends StObject {
  
  /**
    *  The basic authorization credentials for the autocreated branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  
  /**
    *  The build specification (build spec) for the autocreated branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  
  /**
    *  Enables auto building for the autocreated branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  
  /**
    *  Enables basic authorization for the autocreated branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  
  /**
    * Enables performance mode for the branch. Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to roll out. 
    */
  var enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.native
  
  /**
    *  Enables pull request previews for the autocreated branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  
  /**
    *  The environment variables for the autocreated branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    *  The framework for the autocreated branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  
  /**
    *  Describes the current stage for the autocreated branch. 
    */
  var stage: js.UndefOr[Stage] = js.native
}
object AutoBranchCreationConfig {
  
  @scala.inline
  def apply(): AutoBranchCreationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBranchCreationConfig]
  }
  
  @scala.inline
  implicit class AutoBranchCreationConfigMutableBuilder[Self <: AutoBranchCreationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    @scala.inline
    def setBuildSpec(value: BuildSpec): Self = StObject.set(x, "buildSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildSpecUndefined: Self = StObject.set(x, "buildSpec", js.undefined)
    
    @scala.inline
    def setEnableAutoBuild(value: EnableAutoBuild): Self = StObject.set(x, "enableAutoBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoBuildUndefined: Self = StObject.set(x, "enableAutoBuild", js.undefined)
    
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBasicAuthUndefined: Self = StObject.set(x, "enableBasicAuth", js.undefined)
    
    @scala.inline
    def setEnablePerformanceMode(value: EnablePerformanceMode): Self = StObject.set(x, "enablePerformanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePerformanceModeUndefined: Self = StObject.set(x, "enablePerformanceMode", js.undefined)
    
    @scala.inline
    def setEnablePullRequestPreview(value: EnablePullRequestPreview): Self = StObject.set(x, "enablePullRequestPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePullRequestPreviewUndefined: Self = StObject.set(x, "enablePullRequestPreview", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setFramework(value: Framework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    @scala.inline
    def setPullRequestEnvironmentName(value: PullRequestEnvironmentName): Self = StObject.set(x, "pullRequestEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestEnvironmentNameUndefined: Self = StObject.set(x, "pullRequestEnvironmentName", js.undefined)
    
    @scala.inline
    def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
