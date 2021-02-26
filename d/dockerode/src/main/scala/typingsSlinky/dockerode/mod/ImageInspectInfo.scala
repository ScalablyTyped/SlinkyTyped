package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.ArgsEscaped
import typingsSlinky.dockerode.anon.AttachStdin
import typingsSlinky.dockerode.anon.BaseLayer
import typingsSlinky.dockerode.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageInspectInfo extends StObject {
  
  var Architecture: String = js.native
  
  var Author: String = js.native
  
  var Comment: String = js.native
  
  var Config: AttachStdin = js.native
  
  var Container: String = js.native
  
  var ContainerConfig: ArgsEscaped = js.native
  
  var Created: String = js.native
  
  var DockerVersion: String = js.native
  
  var GraphDriver: Data = js.native
  
  var Id: String = js.native
  
  var Os: String = js.native
  
  var Parent: String = js.native
  
  var RepoDigests: js.Array[String] = js.native
  
  var RepoTags: js.Array[String] = js.native
  
  var RootFS: BaseLayer = js.native
  
  var Size: Double = js.native
  
  var VirtualSize: Double = js.native
}
object ImageInspectInfo {
  
  @scala.inline
  def apply(
    Architecture: String,
    Author: String,
    Comment: String,
    Config: AttachStdin,
    Container: String,
    ContainerConfig: ArgsEscaped,
    Created: String,
    DockerVersion: String,
    GraphDriver: Data,
    Id: String,
    Os: String,
    Parent: String,
    RepoDigests: js.Array[String],
    RepoTags: js.Array[String],
    RootFS: BaseLayer,
    Size: Double,
    VirtualSize: Double
  ): ImageInspectInfo = {
    val __obj = js.Dynamic.literal(Architecture = Architecture.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Container = Container.asInstanceOf[js.Any], ContainerConfig = ContainerConfig.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], DockerVersion = DockerVersion.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepoDigests = RepoDigests.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any], RootFS = RootFS.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInspectInfo]
  }
  
  @scala.inline
  implicit class ImageInspectInfoMutableBuilder[Self <: ImageInspectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: AttachStdin): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerConfig(value: ArgsEscaped): Self = StObject.set(x, "ContainerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerVersion(value: String): Self = StObject.set(x, "DockerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphDriver(value: Data): Self = StObject.set(x, "GraphDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoDigests(value: js.Array[String]): Self = StObject.set(x, "RepoDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoDigestsVarargs(value: String*): Self = StObject.set(x, "RepoDigests", js.Array(value :_*))
    
    @scala.inline
    def setRepoTags(value: js.Array[String]): Self = StObject.set(x, "RepoTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoTagsVarargs(value: String*): Self = StObject.set(x, "RepoTags", js.Array(value :_*))
    
    @scala.inline
    def setRootFS(value: BaseLayer): Self = StObject.set(x, "RootFS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualSize(value: Double): Self = StObject.set(x, "VirtualSize", value.asInstanceOf[js.Any])
  }
}
