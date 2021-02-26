package typingsSlinky.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiVersion extends StObject {
  
  var ApiVersion: String = js.native
  
  var Arch: String = js.native
  
  var BuildTime: js.Date = js.native
  
  var Experimental: String = js.native
  
  var GitCommit: String = js.native
  
  var GoVersion: String = js.native
  
  var KernelVersion: String = js.native
  
  var Os: String = js.native
}
object ApiVersion {
  
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: js.Date,
    Experimental: String,
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    Os: String
  ): ApiVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Experimental = Experimental.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
  
  @scala.inline
  implicit class ApiVersionMutableBuilder[Self <: ApiVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "ApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArch(value: String): Self = StObject.set(x, "Arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildTime(value: js.Date): Self = StObject.set(x, "BuildTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimental(value: String): Self = StObject.set(x, "Experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitCommit(value: String): Self = StObject.set(x, "GitCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoVersion(value: String): Self = StObject.set(x, "GoVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: String): Self = StObject.set(x, "KernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
  }
}
