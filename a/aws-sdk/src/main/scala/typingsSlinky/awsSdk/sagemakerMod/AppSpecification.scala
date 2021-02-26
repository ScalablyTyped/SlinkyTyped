package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSpecification extends StObject {
  
  /**
    * The arguments for a container used to run a processing job.
    */
  var ContainerArguments: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerArguments] = js.native
  
  /**
    * The entrypoint for a container used to run a processing job.
    */
  var ContainerEntrypoint: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerEntrypoint] = js.native
  
  /**
    * The container image to be run by the processing job.
    */
  var ImageUri: typingsSlinky.awsSdk.sagemakerMod.ImageUri = js.native
}
object AppSpecification {
  
  @scala.inline
  def apply(ImageUri: ImageUri): AppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSpecification]
  }
  
  @scala.inline
  implicit class AppSpecificationMutableBuilder[Self <: AppSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerArguments(value: ContainerArguments): Self = StObject.set(x, "ContainerArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerArgumentsUndefined: Self = StObject.set(x, "ContainerArguments", js.undefined)
    
    @scala.inline
    def setContainerArgumentsVarargs(value: ContainerArgument*): Self = StObject.set(x, "ContainerArguments", js.Array(value :_*))
    
    @scala.inline
    def setContainerEntrypoint(value: ContainerEntrypoint): Self = StObject.set(x, "ContainerEntrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerEntrypointUndefined: Self = StObject.set(x, "ContainerEntrypoint", js.undefined)
    
    @scala.inline
    def setContainerEntrypointVarargs(value: ContainerEntrypointString*): Self = StObject.set(x, "ContainerEntrypoint", js.Array(value :_*))
    
    @scala.inline
    def setImageUri(value: ImageUri): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
  }
}
