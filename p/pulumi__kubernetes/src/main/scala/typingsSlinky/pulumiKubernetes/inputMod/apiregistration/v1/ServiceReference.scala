package typingsSlinky.pulumiKubernetes.inputMod.apiregistration.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
@js.native
trait ServiceReference extends js.Object {
  /**
    * Name is the name of the service
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * Namespace is the namespace of the service
    */
  var namespace: js.UndefOr[Input[String]] = js.native
  /**
    * If specified, the port on the service that hosting webhook. Default to 443 for backward
    * compatibility. `port` should be a valid port number (1-65535, inclusive).
    */
  var port: js.UndefOr[Input[Double]] = js.native
}

object ServiceReference {
  @scala.inline
  def apply(): ServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceReference]
  }
  @scala.inline
  implicit class ServiceReferenceOps[Self <: ServiceReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

