package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined. Deprecated: use AllowedHostPath from policy API Group instead.
  */
@js.native
trait AllowedHostPath extends StObject {
  
  /**
    * pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
    *
    * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
    */
  var pathPrefix: String = js.native
  
  /**
    * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
    */
  var readOnly: Boolean = js.native
}
object AllowedHostPath {
  
  @scala.inline
  def apply(pathPrefix: String, readOnly: Boolean): AllowedHostPath = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedHostPath]
  }
  
  @scala.inline
  implicit class AllowedHostPathMutableBuilder[Self <: AllowedHostPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
