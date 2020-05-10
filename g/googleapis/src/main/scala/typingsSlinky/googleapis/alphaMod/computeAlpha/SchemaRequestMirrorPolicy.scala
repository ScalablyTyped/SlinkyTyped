package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy that specifies how requests intended for the route&#39;s backends
  * are shadowed to a separate mirrored backend service. Loadbalancer does not
  * wait for responses from the shadow service. Prior to sending traffic to the
  * shadow service, the host / authority header is suffixed with -shadow.
  */
@js.native
trait SchemaRequestMirrorPolicy extends js.Object {
  /**
    * The full or partial URL to the BackendService resource being mirrored to.
    */
  var backendService: js.UndefOr[String] = js.native
}

object SchemaRequestMirrorPolicy {
  @scala.inline
  def apply(): SchemaRequestMirrorPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestMirrorPolicy]
  }
  @scala.inline
  implicit class SchemaRequestMirrorPolicyOps[Self <: SchemaRequestMirrorPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendService")(js.undefined)
        ret
    }
  }
  
}

