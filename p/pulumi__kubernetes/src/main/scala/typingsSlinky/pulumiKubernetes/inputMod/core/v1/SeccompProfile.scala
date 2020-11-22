package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
  */
@js.native
trait SeccompProfile extends js.Object {
  
  /**
    * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
    */
  var localhostProfile: js.UndefOr[Input[String]] = js.native
  
  /**
    * type indicates which kind of seccomp profile will be applied. Valid options are:
    *
    * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
    */
  var `type`: Input[String] = js.native
}
object SeccompProfile {
  
  @scala.inline
  def apply(`type`: Input[String]): SeccompProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeccompProfile]
  }
  
  @scala.inline
  implicit class SeccompProfileOps[Self <: SeccompProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalhostProfile(value: Input[String]): Self = this.set("localhostProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalhostProfile: Self = this.set("localhostProfile", js.undefined)
  }
}
