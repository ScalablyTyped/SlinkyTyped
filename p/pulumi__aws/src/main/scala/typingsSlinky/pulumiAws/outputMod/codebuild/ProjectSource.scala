package typingsSlinky.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSource extends StObject {
  
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[js.Array[ProjectSourceAuth]] = js.native
  
  /**
    * The build spec declaration to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
    */
  var buildspec: js.UndefOr[String] = js.native
  
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Double] = js.native
  
  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`, `GITHUB` or `GITHUB_ENTERPRISE`.
    */
  var gitSubmodulesConfig: js.UndefOr[ProjectSourceGitSubmodulesConfig] = js.native
  
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Boolean] = js.native
  
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
    */
  var reportBuildStatus: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3` or `NO_SOURCE`.
    */
  var `type`: String = js.native
}
object ProjectSource {
  
  @scala.inline
  def apply(`type`: String): ProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSource]
  }
  
  @scala.inline
  implicit class ProjectSourceMutableBuilder[Self <: ProjectSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuths(value: js.Array[ProjectSourceAuth]): Self = StObject.set(x, "auths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthsUndefined: Self = StObject.set(x, "auths", js.undefined)
    
    @scala.inline
    def setAuthsVarargs(value: ProjectSourceAuth*): Self = StObject.set(x, "auths", js.Array(value :_*))
    
    @scala.inline
    def setBuildspec(value: String): Self = StObject.set(x, "buildspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildspecUndefined: Self = StObject.set(x, "buildspec", js.undefined)
    
    @scala.inline
    def setGitCloneDepth(value: Double): Self = StObject.set(x, "gitCloneDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitCloneDepthUndefined: Self = StObject.set(x, "gitCloneDepth", js.undefined)
    
    @scala.inline
    def setGitSubmodulesConfig(value: ProjectSourceGitSubmodulesConfig): Self = StObject.set(x, "gitSubmodulesConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitSubmodulesConfigUndefined: Self = StObject.set(x, "gitSubmodulesConfig", js.undefined)
    
    @scala.inline
    def setInsecureSsl(value: Boolean): Self = StObject.set(x, "insecureSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsecureSslUndefined: Self = StObject.set(x, "insecureSsl", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setReportBuildStatus(value: Boolean): Self = StObject.set(x, "reportBuildStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportBuildStatusUndefined: Self = StObject.set(x, "reportBuildStatus", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
