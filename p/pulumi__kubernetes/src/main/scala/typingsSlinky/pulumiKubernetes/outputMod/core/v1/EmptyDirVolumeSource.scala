package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
  */
@js.native
trait EmptyDirVolumeSource extends StObject {
  
  /**
    * What type of storage medium should back this directory. The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var medium: String = js.native
  
  /**
    * Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
    */
  var sizeLimit: String = js.native
}
object EmptyDirVolumeSource {
  
  @scala.inline
  def apply(medium: String, sizeLimit: String): EmptyDirVolumeSource = {
    val __obj = js.Dynamic.literal(medium = medium.asInstanceOf[js.Any], sizeLimit = sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyDirVolumeSource]
  }
  
  @scala.inline
  implicit class EmptyDirVolumeSourceMutableBuilder[Self <: EmptyDirVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeLimit(value: String): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
  }
}
