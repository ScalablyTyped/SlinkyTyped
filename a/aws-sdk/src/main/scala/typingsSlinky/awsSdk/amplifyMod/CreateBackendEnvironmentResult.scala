package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackendEnvironmentResult extends js.Object {
  /**
    *  Backend environment structure for an amplify App. 
    */
  var backendEnvironment: BackendEnvironment = js.native
}

object CreateBackendEnvironmentResult {
  @scala.inline
  def apply(backendEnvironment: BackendEnvironment): CreateBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendEnvironmentResult]
  }
  @scala.inline
  implicit class CreateBackendEnvironmentResultOps[Self <: CreateBackendEnvironmentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendEnvironment(value: BackendEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

