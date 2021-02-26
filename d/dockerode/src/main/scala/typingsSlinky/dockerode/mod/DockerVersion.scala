package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.Details
import typingsSlinky.dockerode.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerVersion extends StObject {
  
  var ApiVersion: String = js.native
  
  var Arch: String = js.native
  
  var BuildTime: js.Date = js.native
  
  var Components: js.Array[Details] = js.native
  
  var GitCommit: String = js.native
  
  var GoVersion: String = js.native
  
  var KernelVersion: String = js.native
  
  var MinAPIVersion: String = js.native
  
  var Os: String = js.native
  
  var Platform: NameString = js.native
  
  var Version: String = js.native
}
object DockerVersion {
  
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: js.Date,
    Components: js.Array[Details],
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    MinAPIVersion: String,
    Os: String,
    Platform: NameString,
    Version: String
  ): DockerVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Components = Components.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], MinAPIVersion = MinAPIVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerVersion]
  }
  
  @scala.inline
  implicit class DockerVersionMutableBuilder[Self <: DockerVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "ApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArch(value: String): Self = StObject.set(x, "Arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildTime(value: js.Date): Self = StObject.set(x, "BuildTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: js.Array[Details]): Self = StObject.set(x, "Components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: Details*): Self = StObject.set(x, "Components", js.Array(value :_*))
    
    @scala.inline
    def setGitCommit(value: String): Self = StObject.set(x, "GitCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoVersion(value: String): Self = StObject.set(x, "GoVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: String): Self = StObject.set(x, "KernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAPIVersion(value: String): Self = StObject.set(x, "MinAPIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: NameString): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
